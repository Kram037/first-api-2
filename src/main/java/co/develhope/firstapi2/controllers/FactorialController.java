package co.develhope.firstapi2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController{

    @GetMapping("/factorial/{n}")
    public Integer getFactorial(@PathVariable Integer n){
        int r = 1;
        for(int i = 1; i <=n; i++){
            r *= i;
        }
        return r;
    }
}