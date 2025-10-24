package com.tnisf.day9.lambdaexpression;

//Program to define generic functional interface Palindrome

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}

