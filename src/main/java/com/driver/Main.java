package com.driver;

public class Main {


    public static class Product{

        public int product(int x, int y) {
            return x+y;
        };

        public int product(int x, int y, int z) {
            return x+y+z;
        };
        public double product(double x, double y) {
            return x*y;
        };

    }

    public static void main(String[] args) {
        Product p= new Product();
       int a= p.product(1,2);
       int b=  p.product(1,2,3);
       double c=    p.product(2.4,5.3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}