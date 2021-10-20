package com.adv.sukla.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner
{

	@Override
	public void run(String... args) throws Exception
	{
		// TODO Auto-generated method stub
		int i=20;
		String s ="Suchitra";
		System.out.println("DONE"+i);
	

	}

}
