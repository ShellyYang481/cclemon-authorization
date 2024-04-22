package org.cclemon.cclemonauthorization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

  @GetMapping("/")
  public String getIndex() {
    return "index.html"; // 返回模板文件的名稱，這裡假設模板名稱是 hello.html
  }

  @RequestMapping(value = "/admin/hello", method = RequestMethod.GET)
  public String getAdminHello() {
    return "hello.html"; // 返回模板文件的名稱，這裡假設模板名稱是 hello.html
  }
}
