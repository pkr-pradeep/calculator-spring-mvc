package com.pkr.mvc.servlet.impl;

import org.springframework.stereotype.Service;

import com.pkr.mvc.servlet.action.ICalculatorAction;

@Service
public class SubtractAction implements ICalculatorAction{

	public int calculate(int num1, int num2) {
		System.out.println("Subtracting two numbers"+num1+","+num2);
		return num1-num2;
	}
}