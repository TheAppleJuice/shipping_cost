package se.lexicon.shipping_cost.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.lexicon.shipping_cost.entity.Box;
import se.lexicon.shipping_cost.repository.BoxRepository;

@Controller
@RequestMapping("/shipping")
public class ShippingController {
    /*
    BoxRepository boxRepository;


    @Autowired
    public void setBoxRepository(BoxRepository boxRepository) {
        this.boxRepository = boxRepository;
    }

     */

    @GetMapping("/addBoxForm")
    public String showBoxForm(Model model) {
        Box box = new Box();
        model.addAttribute("box", box);
        return "addBoxForm";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("box") Box box) {
        System.out.println("box = " + box);
        return "addBoxForm";

    }


}
