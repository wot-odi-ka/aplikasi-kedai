package com.id.latihan.latihanspring.controller;

import com.id.latihan.latihanspring.common.util.FileUploadUtil;
import com.id.latihan.latihanspring.model.aplikasiKasir.Product;
import com.id.latihan.latihanspring.payload.response.MessageResponse;
import com.id.latihan.latihanspring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "https://aplikasi-kedaii.herokuapp.com")
@RestController
@RequestMapping("/api/product")
public class ProductController  {
    @Autowired
    private ProductService productService;

    @CrossOrigin(origins = "https://aplikasi-kedaii.herokuapp.com")
    @PostMapping("/addProduct")
    public ResponseEntity<MessageResponse> addProduct(@RequestBody Product product){
         productService.productSave(product);
        return ResponseEntity.ok(new MessageResponse("success insert to databse"));
    }

    @CrossOrigin(origins = "https://aplikasi-kedaii.herokuapp.com")
    @GetMapping("/product/{product_id}")
    public Product findByIdProduct (@PathVariable Long product_id){
        return productService.findByidProduct(product_id);
    }

    @CrossOrigin(origins = "https://aplikasi-kedaii.herokuapp.com")
    @DeleteMapping("/product/{product_id}")
    public ResponseEntity<MessageResponse> delletByidProduct (@PathVariable Long product_id){
          productService.deletByIdProduct(product_id);
        return ResponseEntity.ok(new MessageResponse("success delete data id" + product_id));
    }

    @CrossOrigin(origins = "https://aplikasi-kedaii.herokuapp.com")
    @GetMapping("/getAllProduct")
    public List<Product> findAllProduct(){
        return productService.getAllProduct();
    }

    @CrossOrigin(origins = "https://aplikasi-kedaii.herokuapp.com")
    @PutMapping("/updateProduct")
    public ResponseEntity<MessageResponse> updateDataProduct(@RequestBody  Product product){
         productService.updateProductById(product);
        return ResponseEntity.ok(new MessageResponse("success update to database"));

    }
    @PostMapping("/uploadImageProduct")
    public ResponseEntity<MessageResponse>uploadImageProduct(Product product,@RequestParam("image") MultipartFile multipartFile) throws IOException {

        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        product.setImageProduct(fileName);

        Product saveProduct = productService.updateProductById(product);

        String uploadDir = "user-photos/" + saveProduct.getProduct_id();

        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);

        return ResponseEntity.ok(new MessageResponse("success upload images"));

       
    }
    @GetMapping("getAll")
    public List<Product> getAllDList() {

        return productService.getAllData();
        
    }
}
