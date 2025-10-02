package com.buildwithpreet.InternalWorkingofSpringboot;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Component
//@Service
//@RestController
//@Repository
public class StripePaymentService implements PaymentService {
    @Override
    public String pay() {
        String payment = "Stripe Payment";
        System.out.println("Paying from "+payment);
        return payment;

    }
}
