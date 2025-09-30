package com.tnisf.day3.entityclass;
public class ProductDemo {
    public static void main(String[] args) {
        
        Product p1 = new Product();
        p1.setId(201);
        p1.setName("Laptop");
        p1.setPrice(55000.50);
        System.out.println(p1);

        Product p2 = new Product();
        p2.setId(202);
        p2.setName("Smartphone");
        p2.setPrice(25000.00);
        System.out.println(p2);

        Product p3 = new Product();
        p3.setId(203);
        p3.setName("Headphones");
        p3.setPrice(1500.75);
        System.out.println(p3);
    }
}
