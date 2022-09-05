package com.microservices.currencyexchangeservice.model;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyExchange {

    private long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private String environment;
}
