package com.pkr.mvc.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pkr.mvc.servlet.impl.AddAction;
import com.pkr.mvc.servlet.impl.DivideAction;
import com.pkr.mvc.servlet.impl.MultiplyAction;
import com.pkr.mvc.servlet.impl.SubtractAction;

@Controller
public class Calculator {

	@Autowired
	AddAction addaction;
	@Autowired
	MultiplyAction multiplyAction;
	@Autowired
	SubtractAction subtractAction;
	@Autowired
	DivideAction divideAction;
	
	/*
	 * @RequestMapping("/") public ModelAndView init() {
	 * System.out.println("initialized"); int result = 0; ModelAndView model = new
	 * ModelAndView(); model.addObject("result", result);
	 * model.setViewName("index.jsp"); return model; }
	 */
	@RequestMapping("/calc")
	public ModelAndView calculate(final HttpServletRequest request, final HttpServletResponse response) {
		int result, i = 0 , j = 0;
		String operation = null ;
		try {
			i = Integer.parseInt(request.getParameter("firstNum"));
			j = Integer.parseInt(request.getParameter("secondNum"));
			operation = request.getParameter("operation");
			result = getResult(operation, i, j);
		} catch(Exception e) {
			result  = 0;
		}
		System.out.println("result:"+result);
		ModelAndView model = new ModelAndView();
		model.addObject("result", result);
		model.setViewName("index.jsp");
		return model;
	}

	private int getResult(String operation, int i, int j) {
		int result = 0;
		switch (null == operation?"":operation) {
		case "add":
			result = addaction.calculate(i, j);
			break;
		case "subtract":
			result = subtractAction.calculate(i, j);
			break;
		case "multiply":
			result = multiplyAction.calculate(i, j);
			break;
		case "divide":
			result = divideAction.calculate(i, j);
			break;
		default:
			System.out.println("No Result");
			break;
		}
		return result;
	}
}