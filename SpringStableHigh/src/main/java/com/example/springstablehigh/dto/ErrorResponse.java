package com.example.springstablehigh.dto;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

@Getter
public class ErrorResponse {
  private final String code;
  private final String message;
  private final LocalDateTime timestamp;
  private final Map<String,Object> details;

  public ErrorResponse(String code, String message,Map<String,Object> details){
    this.code=code;
    this.message=message;
    this.timestamp=LocalDateTime.now();
    this.details = details != null ? details : new HashMap<>();
  }

  public static ErrorResponse of(String code,String message){
    return new ErrorResponse(code,message,null);
  }

  public static ErrorResponse of(String code,String message,Map<String,Object> details){
    return new ErrorResponse(code,message,details);
  }



}
