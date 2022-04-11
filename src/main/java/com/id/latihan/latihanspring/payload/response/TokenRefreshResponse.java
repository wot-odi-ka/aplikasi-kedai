package com.id.latihan.latihanspring.payload.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


import java.util.Date;

@Data
public class TokenRefreshResponse {
  private String accessToken;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
  private Date accessTokenExpDate;
  private String refreshToken;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
  private Date refreshTokenExpDate;
  private String tokenType = "Bearer";

  public TokenRefreshResponse(String accessToken, String refreshToken) {
    this.accessToken = accessToken;
    this.refreshToken = refreshToken;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String token) {
    this.accessToken = token;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

    public Date getAccessTokenExpDate() {
        return accessTokenExpDate;
    }

    public void setAccessTokenExpDate(Date accessTokenExpDate) {
        this.accessTokenExpDate = accessTokenExpDate;
    }

    public Date getRefreshTokenExpDate() {
        return refreshTokenExpDate;
    }

    public void setRefreshTokenExpDate(Date refreshTokenExpDate) {
        this.refreshTokenExpDate = refreshTokenExpDate;
    }
}
