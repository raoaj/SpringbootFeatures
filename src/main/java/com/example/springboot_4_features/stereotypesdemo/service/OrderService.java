package com.example.springboot_4_features.stereotypesdemo.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import com.example.springboot_4_features.stereotypesdemo.client.PaymentClient;
import static java.lang.IO.print;

@Component
public class OrderService {

   // private final PaymentClient paymentClient;


    //Constructor injection
   /* public OrderService(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }*/

    public void  placeOrder(){

   /*following object is managed by us and its not manage any lifecycle like GC etc
    This bean is not managed by IOC.if other service needs paymentClient then again we need to create an object in the
    respective class
    */

     //   PaymentClient paymentClient =new PaymentClient();
        print("Placing Order....");
       // paymentClient.pay();
    }
}
