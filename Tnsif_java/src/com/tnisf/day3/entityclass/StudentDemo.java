package com.tnisf.day3.entityclass;

public class StudentDemo {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.setId(101);
        s1.setName("Ravi");
        s1.setDept("Computer Science");
        System.out.println(s1);

        Student s2 = new Student();
        s2.setId(102);
        s2.setName("Priya");
        s2.setDept("Electronics");
        System.out.println(s2);

        Student s3 = new Student();
        s3.setId(103);
        s3.setName("Karthik");
        s3.setDept("Mechanical");
        System.out.println(s3);
    }
}

