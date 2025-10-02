package com.buildwithpreet.InternalWorkingofSpringboot;

import org.springframework.stereotype.Component;

@Component                                         // bean creation annotation
public class RazorpayPaymantService implements PaymentService {


    @Override
    public String pay(){                  //method
        String payment = "Razorpay Payment Successful";  //variable= payment
        System.out.println(payment);

        return payment;
    }
}
