package com.example.springbackendtokenjwt;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodingDecoding {
  public static void main(String[] args){
    Encoder encoder = Base64.getEncoder();
    Decoder decoder = Base64.getDecoder();

    Encoder urlEncoder = Base64.getUrlEncoder();
    Decoder urlDecoder= Base64.getUrlDecoder();

    String plainText = "동해물과 백두산이 마르고 닳도록";
    byte[] plainTextToByteArr = plainText.getBytes();

    byte[] encodedArr = encoder.encode(plainTextToByteArr);
    byte[] urlEncodedArr = urlEncoder.encode(plainTextToByteArr);

    String encodedStr = new String(encodedArr);
    String urlEncodedStr = new String(urlEncodedArr);
    System.out.println("인코딩된 애국가(Base64)    = " + encodedStr);
    System.out.println("인코딩된 애국가(Base64URL) = " + urlEncodedStr);

    // 2. decoder 사용해보기 (수신자가 수행)
    // 2-1. Base64 디코딩
    byte[] decodedArr = decoder.decode(encodedStr);
    // 2-2. Base64URL 디코딩
    byte[] urlDecodedArr = urlDecoder.decode(urlEncodedStr);

    // 2-3. 디코딩된 바이트 배열을 문자열로 변환
    String decodedStr = new String(decodedArr);
    String urlDecodedStr = new String(urlDecodedArr);
    System.out.println("다시 디코딩된 애국가            = " + decodedStr);
    System.out.println("다시 디코딩된 애국가(Base64URL) = " + urlDecodedStr);

  }

}
