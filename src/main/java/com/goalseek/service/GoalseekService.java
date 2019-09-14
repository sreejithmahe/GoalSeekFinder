package com.goalseek.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.goalseek.dao.GoalSeekDao;

/**
 * @author sreejith.kizhakkayil
 *
 */
@Service
public class GoalseekService {
	@Autowired
	private ProduceLoopCheck produceLoopCheck;
	@Autowired
	private ProduceResult produceResult;
	
	private List<GoalSeekDao> goalseekList = new ArrayList<GoalSeekDao>();
	
	public String getGoalseek(GoalSeekDao gs) {
        double OP1 = gs.getOperningBalance();
        double NP  = gs.getTotalNoPeriod();
        double ExpCB = gs.getExpectedClosingBalance();
        double Guess = OP1/NP;
        double FinalCB = 0.0;
        boolean flag = false;
        FinalCB = produceLoopCheck.M1(OP1,Guess,ExpCB,NP);
    	if (ExpCB < FinalCB) {
    		flag = true; // ++
    	} else 	{
    		flag = false; //--
    	}
        for (int i = 1 ; i < 100000 ; i++) {
        	if(flag) {
		          Guess = Guess+0.1;
				 // System.out.println("-----------------------------------------------"+Guess+"<?>"+FinalCB);
				  FinalCB = produceLoopCheck.M1(OP1,Guess,ExpCB,NP);
				  		if(ExpCB >= Math.round(FinalCB)) {
				  		//	System.out.println(i+"---------------------------------------------Break--"+Guess+"<=>"+FinalCB);
				  			break;
				  		}  
				  	//		System.out.println(i+"-->>>------"+Guess+"<->"+FinalCB);
	            } else {
  		       Guess = Guess-0.1;
			       //System.out.println("-----------------------------------------------"+Guess+"<?>"+FinalCB);
			       FinalCB = produceLoopCheck.M1(OP1,Guess,ExpCB,NP);
                       if(ExpCB <= Math.round(FinalCB)) {
	                         //  System.out.println(i+"---------------------------------------------Break--"+Guess+"<=>"+FinalCB);
	                         break;
                     }
                  //  System.out.println(i+"-->>>------"+Guess+"<->"+FinalCB);
  	          }//else
		 }
	 return produceResult.M1(OP1,Guess,ExpCB,NP).toString();
	}
	
	public void updateGoalseek(GoalSeekDao gs) {
		GoalSeekDao goalSeek;
		for(int i=0;i<goalseekList.size();i++) {
			 goalSeek = goalseekList.get(i);
			goalSeek.setExpectedClosingBalance(40000);
		}
		
	}

	public List<GoalSeekDao> getResult(GoalSeekDao gs) {
		for(int i=0;i<goalseekList.size();i++) {
			GoalSeekDao goalSeek = goalseekList.get(i);
			goalSeek.setExpectedClosingBalance(50000);
		}
		gs.setExpectedClosingBalance(90000);
		return goalseekList;
	}
}
