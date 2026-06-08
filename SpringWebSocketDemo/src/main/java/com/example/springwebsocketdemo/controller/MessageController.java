package com.example.springwebsocketdemo.controller;

import com.example.springwebsocketdemo.dto.TextMessageRequest;
import com.example.springwebsocketdemo.dto.TextMessageResponse;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

  @MessageMapping("/message")
  @SendTo("/topic/messages")
  public TextMessageResponse sendMessage(
      @Payload TextMessageRequest request
  ){
    System.out.println(
        "[" + LocalTime.now().withNano(0)
            + "] [MessageController] "
            + "sender=" + request.getSender()
            + ", content=" + request.getContent()
    );

    return new TextMessageResponse(request.getSender(), request.getContent(), LocalDateTime.now().withNano(0).toString());
  }

}
