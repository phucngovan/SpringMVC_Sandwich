package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller

public class SandwichController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
    @PostMapping("phuc")
    public ModelAndView result(@RequestParam("sandwich") String[] sandwich) {
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("kq",sandwich);
        return modelAndView;
}
}
