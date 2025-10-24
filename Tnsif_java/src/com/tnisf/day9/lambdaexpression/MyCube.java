package com.tnisf.day9.lambdaexpression;

//Define Functional Interface MyCube

@FunctionalInterface
public interface MyCube {
	int getCube(int no);
	//void show(); not allow more than one abstract method
}