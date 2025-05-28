package com.example.springcalculatormaven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class CalculatorController {
    @RequestMapping("/show")
    public String calculator() {
        return "index";
    }

    @RequestMapping("/save")
    public String calculator(@RequestParam(value = "num1", required = false) String num1,
                       @RequestParam(value = "num2", required = false) String num2,
                        @RequestParam(value = "action",required = false) String action
                        , Model model) {
        Float result = 0.0f;
        if(action.equals("add")){
            result = Float.valueOf(num1) + Float.valueOf(num2);
        }
        if(action.equals("sub")){
            result = Float.valueOf(num1) - Float.valueOf(num2);
        }
        if(action.equals("mul")){
            result = Float.valueOf(num1) * Float.valueOf(num2);
        }
        if(action.equals("dev")){
            result = Float.valueOf(num1) / Float.valueOf(num2);
        }
        model.addAttribute("result", result);
        return "result";
    }
}
