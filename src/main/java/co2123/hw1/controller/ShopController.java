package co2123.hw1.controller;

import co2123.hw1.Hw1Application;

import co2123.hw1.domain.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShopController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(new ShopValidator());
    }

    @GetMapping("/shops")
    public String getShops(Model model) {
        List<Shop> shops = Hw1Application.shops;
        model.addAttribute("shops", shops);
        return "shops/list";
    }

    @RequestMapping("/newShop")
    public String newShop(Model model) {
        Shop shop = new Shop();
        model.addAttribute("shop", shop);
        return "shops/form";
    }

    @PostMapping("/addShop")
    public String addShop(@Valid @ModelAttribute Shop shop, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "shops/form";
        }
        Hw1Application.shops.add(shop);
        return "redirect:/shops";
    }


}
