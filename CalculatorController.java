package com.example.calculator;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    @PostMapping("/add")
    public double add(@RequestBody Map<String, Double> numbers) {
        return numbers.get("a") + numbers.get("b");
    }

    @PostMapping("/subtract")
    public double subtract(@RequestBody Map<String, Double> numbers) {
        return numbers.get("a") - numbers.get("b");
    }

    @PostMapping("/multiply")
    public double multiply(@RequestBody Map<String, Double> numbers) {
        return numbers.get("a") * numbers.get("b");
    }

    @PostMapping("/divide")
    public double divide(@RequestBody Map<String, Double> numbers) {
        double b = numbers.get("b");
        if (b != 0) {
            return numbers.get("a") / b;
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
    }
}
