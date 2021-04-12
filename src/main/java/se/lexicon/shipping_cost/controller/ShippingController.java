package se.lexicon.shipping_cost.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShippingController {

    @GetMapping("/")
    public String addBoxForm(){
        return "addBoxForm";
    }

}
