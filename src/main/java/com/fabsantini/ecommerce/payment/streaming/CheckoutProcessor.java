package com.fabsantini.ecommerce.payment.streaming;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface CheckoutProcessor {

    String OUTPUT = "payment-paid-output";      //Saida de pagamento;
    String INPUT = "checkout-created-input";    //Entrada no checkout;

    /* Canais de mensageria; */

    @Output(OUTPUT)
    MessageChannel output();

    @Input(INPUT)
    SubscribableChannel input();
}
