package com.abhinav;

import org.springframework.stereotype.Component;

@Component("B")
public class Bus implements Vehicle {

	@Override
	public void drive() {
		System.out.println("Bus Drive");
	}

}
