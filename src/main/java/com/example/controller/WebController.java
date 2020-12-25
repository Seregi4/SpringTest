package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class WebController {
  @GetMapping("/")
    public String home(){
      return "home";
  }
@PostMapping("enter")
  public String enter(@RequestParam String text, Model model){
    model.addAttribute("message",text);
    return "home";
}

}
