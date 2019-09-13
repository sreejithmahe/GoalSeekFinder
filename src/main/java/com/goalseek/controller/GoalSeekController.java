package com.goalseek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goalseek.service.ProduceLoopCheck;

@RestController
public class GoalSeekController {

	@Autowired
	ProduceLoopCheck produceLoopCheck;


	@RequestMapping (value ="/hello")
 public String hello() {
        System.out.println("Welcome *********\n ");
        double OP1 = 100000;
        double NP  = 12;
        double ExpCB = 75000;
        double Guess = OP1/NP;
        double FinalCB = 0.0;
        
        
        
        
		  for (double i = 1 ; i < 100 ; i++) {
			  FinalCB = produceLoopCheck.M1(OP1,Guess,ExpCB,NP);
			  System.out.println(
					  "=========================================================>"+ExpCB);
					  System.out.println(
					  "=========================================================>"+FinalCB +"-"+Guess++);
					  
					  Guess = Guess+0.01;
					  
		  // 75487.76463243358  - >5
		  //75053.67563390953   ->25
		  //74945.15338427859   -35
		  
		  if(ExpCB+10 >= FinalCB) {
			  System.out.println("==============Hello Break============================"+i);
			  break;
			  
		  }
		 }
	 return "hello"+FinalCB;
 }
}
