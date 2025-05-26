package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Shop;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ShopValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Shop.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Shop shop = (Shop) target;
        for(Shop s : Hw1Application.shops){
            if (shop.getId() == s.getId()) {
                errors.rejectValue("id", "", "Shop id already exists");
            }

        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "", "City is required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "founder", "", "Founder name is required");
    }
}
