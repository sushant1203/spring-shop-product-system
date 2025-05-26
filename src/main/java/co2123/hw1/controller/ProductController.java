package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Product;
import co2123.hw1.domain.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.ArrayList;

@Controller
public class ProductController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(new ProductValidator());
    }

    @GetMapping("/products")
    public String products(@RequestParam int shop, Model model) {
            for(Shop s : Hw1Application.shops){
                if (s.getId() == shop) {

                    model.addAttribute("products", s.getProducts());
                    model.addAttribute("shopId", shop);
                }

            }

        return "products/list";
    }

    @RequestMapping("/newProduct")
    public String newProduct(@RequestParam int shop, Model model) {
        for (Shop s : Hw1Application.shops){
            if (s.getId() == shop) {
                model.addAttribute("product", new Product());
                model.addAttribute("shop", shop);
            }
        }
        return "products/form";
    }

    @PostMapping("/addProduct")
    public String addProduct(@Valid @ModelAttribute Product product, BindingResult bindingResult, @RequestParam int shop, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("shop", shop);
            return "products/form";
        }
        Shop sh = null;

        for (Shop s : Hw1Application.shops){
            if (s.getId() == shop) {
                sh = s;
                break;
            }
        }
        if(sh.getProducts() == null){
            sh.setProducts(new ArrayList<Product>());
            sh.getProducts().add(product);
        }
        else{
            sh.getProducts().add(product);
        }

        return "redirect:/shops";
    }



    }
