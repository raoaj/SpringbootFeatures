package com.example.springboot_4_features.stereotypesdemo.client;

import org.springframework.stereotype.Component;

//import static java.lang.IO.print;

//@Component
public class PaymentClient {
   //Parameter 0 of constructor in com.example.springboot_4_features.stereotypesdemo.client.PaymentClient required a bean of type 'java.lang.String' that could not be found.
    /*Spring will try to find the bean of String and int. All the instance variable to be satisfied with instance.
    Spring doesn't know the what the value of these variables but we wknow that its a "UPI", and 2400
      Hence Component scan fails while creating a bean as it doesn't know what value to be set.
      Hence Create bean with the help of @Component. Hence we need to go with @Bean . Remove @Component
    */

    private final String provider;
    private final int timeout;


    public PaymentClient(String provider, int timeout) {
        this.provider = provider;
        this.timeout = timeout;
    }


    public void pay(){
       // print("Paying using "+provider+ " with timeout"+timeout);
    }
}
