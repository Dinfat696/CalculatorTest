package com.example.calctets;

import org.springframework.stereotype.Service;

@Service
public class CalcTestService {

    public Double plus(Double num1, Double num2) {
        try {
            checkArgument(num1, num2);

        } catch (NullException e) {
            System.out.println("Введите число");
        }
        return num1 + num2;
    }


    public Double minus(Double num1, Double num2) {
        try {
            checkArgument(num1, num2);

        } catch (NullException e) {
            System.out.println("Введите число");
        }
        return num1 - num2;
    }


    public Double multiply(Double num1, Double num2) {
        try {
            checkArgument(num1, num2);

        } catch (NullException e) {
            System.out.println("Введите число");
        }
        return num1 * num2;
    }

    public Double divide(Double num1, Double num2) {
        try {
            checkArgument(num1, num2);

        } catch (NullException e) {
            System.out.println("Введите число");
        }
        return num1 / num2;
    }

    private void checkArgument(Double num1, Double num2) throws NullException {
        if (num1 == null || num2 == null) {
            throw new NullException("Введите число");
        }
    }

}
