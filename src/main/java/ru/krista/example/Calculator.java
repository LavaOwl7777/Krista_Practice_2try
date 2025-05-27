package ru.krista.example; //comment

import java.util.Scanner;

public class Calculator {

    public String line;
    public String[] slicedLine;
    public double num, num1, num2;
    public boolean isSign;

    public Calculator(String line){
        this.line = line;
        this.isSign = false;
    }

    public void cut(){
        this.slicedLine = this.line.split(" ");
        
        for(int i = 0; i <= 2; i++){

            try{
                this.num = Integer.parseInt(slicedLine[i]);
            } catch(NumberFormatException e){
                this.isSign = true;
            }

            if (this.isSign == true && i == 0 ){
                System.out.println("Ошибка: вместо первого числа введён сторонний символ!");
                this.isSign = false;
                break;
            }
            else if(this.isSign == false && i == 0){
                this.num1 = this.num;
            }

            if (this.isSign == false && i == 1 ){
                System.out.println("Ошибка: вместо знака введён сторонний символ!");
                break;
            }
            else if(this.isSign == true && i == 1){
                this.isSign = false;
            }
            

            if (this.isSign == true && i == 2 ){
                System.out.println("Ошибка: вместо второго числа введён сторонний символ!");
                this.isSign = false;
                break;
            }
            else if(this.isSign == false && i == 2){
                this.num2 = this.num;
            }

        }

    }


    public void calc(){
        switch(this.slicedLine[1]) {
            case "+":
                plus();
                break;

            case "-":
                minus();
                break;

            case "*":
                multyply();
                break;

            case "/":
                if (this.num2 != 0){
                    division();
                    break;
                } else {
                    System.out.println("Ошибка: деление на 0!");
                    break;
                }
            
            default:
            System.out.println("Ошибка: неправильный знак!");
        }
    }

    public void plus(){
        System.out.println(this.num1 + this.num2);
    }

    public void minus(){
        System.out.println(this.num1 - this.num2);
    }

    public void multyply(){
        System.out.println(this.num1 * this.num2);
    }

    public void division(){
        System.out.println(this.num1 / this.num2);
    }

    
    
}
