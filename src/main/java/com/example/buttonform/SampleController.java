package com.example.buttonform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SampleController {

  @GetMapping("/sample")
  public String getSample() {
    return "sample/index";
  }

  @PostMapping("/sample")
  public String postSample(
    @ModelAttribute("sampleData") SampleData sampleData
  ) {
    System.out.println(sampleData.toString());

    return "sample/index";
  }
}
