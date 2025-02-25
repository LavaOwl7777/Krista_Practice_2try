package ru.krista.example;

import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите выражение: первое число, операция(+, -, *, /), второе число. Между числами и знаком пробел (-2 + 4) -> ");
        String str = in.nextLine();
        
        Calculator calc = new Calculator(str);
        calc.cut();
        calc.calc();
    }
}
