package com.goalseek.service;

import org.springframework.stereotype.Service;

@Service
public class ProduceLoopCheck {
	 public double M1(double OP1,double Guess,double ExpCB,double NP) {
        //System.out.println("\n ************************N^1.0 Period calculation****[M1]** \n");
          double   Lfee1 = Guess;
          double IRPer1    = 0.06;
          double MarPer1   = 0.01;
          double TLPPer1   = 0.01;
          double TotMarTLP1= MarPer1+TLPPer1;
          double TotPer1   = IRPer1+MarPer1+TLPPer1;
          double IndexPer1 = 0;
          double TLP1  =
          (OP1-Lfee1)*TLPPer1+TotMarTLP1/(1-TotMarTLP1)*TLPPer1*(OP1-Lfee1);
          double Margin1  =
          (OP1-Lfee1)*MarPer1+TotMarTLP1/(1-TotMarTLP1)*MarPer1*(OP1-Lfee1);
          double IR1  =
          (OP1-Lfee1)*IRPer1+TotMarTLP1/(1-TotMarTLP1)*IRPer1*(OP1-Lfee1);
          double Depre1 = Lfee1-TLP1-Margin1-IR1;
          double CB1 = OP1-Depre1;
          //System.out.println("\n OutPut--Operning Balance-- "   +Math.round(OP1) );
          //System.out.println("\n OutPut--Depreciation-- "   +Math.round(Depre1) );
          //System.out.println("\n OutPut--Closing Blance-- "   +Math.round(CB1) );
          //System.out.println("\n OutPut--IR1-- "   +Math.round(IR1) );
          //System.out.println("\n OutPut--Margin1-- "   +Math.round(Margin1) );
          //System.out.println("\n OutPut--TLP1-- "   +Math.round(TLP1) );
          //System.out.println("\n OutPut--LeaseFee-- "   +Math.round(Lfee1) );
         double FinalCB =  MN(CB1,Guess,ExpCB,NP);
         return FinalCB;
    }
	 static double MN(double OPn,double Guess,double ExpCB,double NP) {
	      double Period =2;
	      double OPN = OPn;
	      double SecLfeeN = 0;
	      double SecOP = 0;
	      double  LfeeN = 0;
	      double CBN = 0;
		       do {
	         //  System.out.println("\n ************************N^"+Period+ " Period calculation****[MN]** \n");
	           double IRPerN    = 0.06;
	           double MarPerN   = 0.01;
	           double TLPPerN   = 0.01;
	           double TotMarTLPN= MarPerN+TLPPerN;
	           double TotPerN   = IRPerN+MarPerN+TLPPerN;
	           double IndexPerN = 0.01;
	            LfeeN = Guess*(1+IndexPerN)*Math.pow((1+IndexPerN),Period-2);
	            double TLPN  =
	           (OPN-LfeeN)*TLPPerN+TotMarTLPN/(1-TotMarTLPN)*TLPPerN*(OPN-LfeeN);
	           double MarginN  =
	           (OPN-LfeeN)*MarPerN+TotMarTLPN/(1-TotMarTLPN)*MarPerN*(OPN-LfeeN);
	           double IRN  =
	           (OPN-LfeeN)*IRPerN+TotMarTLPN/(1-TotMarTLPN)*IRPerN*(OPN-LfeeN);
	           double DepreN = LfeeN-TLPN-MarginN-IRN;
	           CBN = OPN-DepreN;
	           if(Period == 2) {
	        	   SecLfeeN = LfeeN ; 
	        	   SecOP = OPN;
	           }
	           if(Period == 12) {
	           System.out.println("\n OutPut--Operning Balance-- "   +Math.round(OPN) );
	           System.out.println("\n OutPut--Depreciation-- "   +Math.round(DepreN) );
	           System.out.println("\n OutPut--Closing Blance-- "   +Math.round(CBN) );
	           System.out.println("\n OutPut--IR1-- "   +Math.round(IRN) );
	           System.out.println("\n OutPut--Margin1-- "   +Math.round(MarginN) );
	           System.out.println("\n OutPut--TLPN-- "   +Math.round(TLPN) );
	           System.out.println("\n OutPut--LeaseFee-- "   +Math.round(LfeeN) );
	           }
	             Period = Period+1;
	             OPN = CBN;
	        }while(Period <= NP);
		  //   System.out.println("_________________________________________________________EOM (Guess)  ________________________________________________________\n \n");
		    return CBN;
	}
}
