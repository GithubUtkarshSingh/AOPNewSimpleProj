package com.nt.service;

public class IntrAmtCalculator 
{
	public float calcIntrAmt(float pAmt,float rate,float time)
	{
		System.out.println("TargetClass:Method");
		return (pAmt*rate*time)/100.0f;
	}
}