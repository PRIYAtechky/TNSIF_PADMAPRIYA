package com.tnisf.day2;

public class BreakDemo {
	public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // exit the loop completely
            }
            System.out.println(i);
        }
	}
}
