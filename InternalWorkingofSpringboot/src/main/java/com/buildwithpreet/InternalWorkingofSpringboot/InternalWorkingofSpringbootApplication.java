package com.buildwithpreet.InternalWorkingofSpringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternalWorkingofSpringbootApplication implements CommandLineRunner {   //interface implementation commmand line runner

	public static void main(String[] args) {
		SpringApplication.run(InternalWorkingofSpringbootApplication.class, args);
	}
   // @Autowired  //field injection
    private final RazorpayPaymantService paymentService;

    public InternalWorkingofSpringbootApplication(RazorpayPaymantService paymentService) {  //constructor dependency injection
        this.paymentService = paymentService;      //it refers to the current object
    }

    @Override
    public void run(String... args) throws Exception {
       String payment =  paymentService.pay();            //variable payment
        System.out.println("payment done"+payment);
    }
}
