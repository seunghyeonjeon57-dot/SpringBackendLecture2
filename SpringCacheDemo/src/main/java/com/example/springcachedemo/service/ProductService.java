package com.example.springcachedemo.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
@CacheConfig(cacheNames = "products")
public class ProductService {

  @Cacheable(
      key = "#id",
      condition = "#id > 0",
      unless = "#result.contains('미판매')"
  )
  public String getProduct(Long id) {

    printLog("상품 조회 시작");
    printLog("id = " + id);

    sleep(3000);

    if (id == 999L) {

      return "미판매상품";
    }

    printLog("DB 조회 완료");

    return "상품-" + id;
  }

  @CachePut(key = "#id")
  public String updateProduct(
      Long id,
      String name
  ) {

    printLog("상품 수정");
    printLog("캐시 강제 갱신");

    sleep(2000);

    return name;
  }

  @CacheEvict(
      key = "#id"
  )
  public void evictProduct(Long id) {

    printLog("특정 캐시 삭제");
    printLog("삭제 key = " + id);
  }

  @CacheEvict(
      allEntries = true,
      beforeInvocation = true
  )
  public void evictAllProducts() {

    printLog("전체 캐시 삭제");
    printLog("beforeInvocation = true");
  }

  private void sleep(long millis) {

    try {

      Thread.sleep(millis);

    } catch (InterruptedException e) {

      Thread.currentThread().interrupt();
    }
  }

  private void printLog(String message) {

    System.out.println(
        "[" + LocalTime.now().withNano(0)
            + "] [ProductService] "
            + message
    );
  }
}