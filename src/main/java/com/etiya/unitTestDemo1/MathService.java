package com.etiya.unitTestDemo1;

public class MathService {
    public int add(int number1, int number2){
        return number1+number2;
    }

    public int subtract(int number1, int number2){
        return number1-number2;
    }

    public int multiply(int number1, int number2){
        return number1*number2;
    }

    public double divide(double number1, double number2){
        if(number2==0){
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return number1/number2;
    }
}

//palindrom kodunu class'a taşıyınız
//unit test yazınız
//metinde */-+ karakterleri varsa hata vermeli. Bu karakterler kullanılamaz.