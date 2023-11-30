package org.example.App;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String showHelloPage(Model model) {
        model.addAttribute("message", "Hello from Spring Boot!");
        return "hello";
    }
}
