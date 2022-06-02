package com.company;

import java.util.Scanner;

class Example{
    private static Example ex = new Example();
    private double x;
    private double y;
    private Example() {
    }
    public void setChisel (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static Example getInstanse(){
        return ex;
    }
    public double counting() {
        return 2 * x + 3 / y;
    }
}

public class Main {
    public static void main(String[] args) {
        Example ex = Example.getInstanse();
        Scanner on = new Scanner(System.in);
        System.out.print("Пример 2*x+3/y \nВведите x= ");
        double x= on.nextDouble();
        System.out.print("Введите y= ");
        double y = on.nextDouble();
        ex.setChisel(x, y);
        System.out.println("Ответ: " + ex.counting());
    }
}