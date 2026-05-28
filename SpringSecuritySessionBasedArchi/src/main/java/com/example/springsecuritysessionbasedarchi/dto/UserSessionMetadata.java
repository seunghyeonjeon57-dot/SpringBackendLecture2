package com.example.springsecuritysessionbasedarchi.dto;


import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserSessionMetadata {
  private String username;
  private LocalDateTime loginTime;

}
