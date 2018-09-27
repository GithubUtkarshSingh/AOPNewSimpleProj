package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IntrAmtCalculator;

public class ClientApp {

	public static void main(String[] args)
	{
		ApplicationContext ctx=null;
		IntrAmtCalculator pfb=null;
		float InterestAmount=0.0f;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
		pfb=ctx.getBean("proxy",IntrAmtCalculator.class);
		pfb.calcIntrAmt(1000,2,5);
		((AbstractApplicationContext) ctx).close();
		
		// TODO Auto-generated method stub

	}

}
