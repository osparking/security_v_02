package space.bum.spring_boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  @GetMapping({ "/", "/home", "/index" })
  public String getHomepage() {
    return "top/index";
  }

}
