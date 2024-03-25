package com.example.cclemonauthorization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

  @GetMapping("/")
  public String hello() {
    return "index.html"; // 返回模板文件的名稱，這裡假設模板名稱是 hello.html
  }
}
