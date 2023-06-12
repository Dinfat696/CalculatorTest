package com.example.calctets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcTestController {

    private final CalcTestService calculator;

    public CalcTestController(CalcTestService calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/calculator")
    public String welcome() {
        return "Добро пожаловать в колькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Double num1, @RequestParam Double num2) {
        return num1 + "+" + num2 + "=" + (num1 + num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam Double num1, @RequestParam Double num2) {
        return num1 + "-" + num2 + "=" + (num1 - num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam Double num1, @RequestParam Double num2) {
        return num1 + "*" + num2 + "=" + (num1 * num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Double num1, @RequestParam Double num2) throws ArithmeticZeroException {
        if (num2 == 0) {
            throw new ArithmeticZeroException("На ноль делить нельзя");
        }
        return num1 + "/" + num2 + "=" + (num1 / num2);
    }
}
