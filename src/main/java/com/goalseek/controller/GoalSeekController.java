package com.goalseek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.goalseek.service.ProduceLoopCheck;
import com.goalseek.service.ProduceResult;

@RestController
public class GoalSeekController {

	@Autowired
	ProduceLoopCheck produceLoopCheck;
	@Autowired
	ProduceResult produceResult;
	@RequestMapping (value ="/goalseek")
     public String goalseek() {
        double OP1 = 100000;
        double NP  = 10;
        double ExpCB = 55000;
        double Guess = OP1/NP;
        double FinalCB = 0.0;
        for (int i = 1 ; i < 100000 ; i++) {
			  
        	Guess = Guess+0.01;
					  System.out.println("-----------------------------------------------"+Guess+"<?>"+FinalCB);
					  FinalCB = produceLoopCheck.M1(OP1,Guess,ExpCB,NP);
		  if(ExpCB >= FinalCB) {
			  System.out.println(i+"---------------------------------------------Break--"+Guess+"<=>"+FinalCB);
			  break;
		  }  if(ExpCB <= FinalCB)  {
			  System.out.println("---Evide Camon-----------------");
		  }
		  System.out.println(i+"-->>>------"+Guess+"<->"+FinalCB);
		 }
	 return produceResult.M1(OP1,Guess,ExpCB,NP).toString();
 }
	
	@RequestMapping (method=RequestMethod.PUT, value="/goalseek")
	public String updateGoalseek() {
		
		return "RequestMethod.PUT";
		
	}
	@RequestMapping (method=RequestMethod.POST, value="/goalseek")
	public String addGoalseek() {
		
		return "RequestMethod.POST";
		
	}
	@RequestMapping (method=RequestMethod.DELETE, value="/goalseek")
	public String delGoalseek() {
		
		return "RequestMethod.DELETE";
		
	}
}
