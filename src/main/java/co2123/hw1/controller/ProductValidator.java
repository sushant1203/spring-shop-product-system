package co2123.hw1.controller;

import co2123.hw1.domain.Product;
import jakarta.validation.Validation;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ProductValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Product.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Product product = (Product) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "packaging", "", "Product name is required");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "supplier", "", "Supplier name is required");

        if (product.getWares() == null || product.getWares().isEmpty()) {
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "wares", "", "Wares is required and must be either Water, Juice, or Smoothies");
        } else {
            if (!(product.getWares().equals("Water") || product.getWares().equals("Juice") || product.getWares().equals("Smoothies"))) {
                errors.rejectValue("wares", "", "Wares must be either Water, Juice, or Smoothies");
            }
        }


        if(product.getPrice()<1 || product.getPrice()>70) {
            errors.rejectValue("price", "", "Price must be between 1 and 70");
        }

    }
}
