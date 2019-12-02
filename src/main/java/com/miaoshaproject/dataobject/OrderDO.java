package com.miaoshaproject.dataobject;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderDO {

    private String id;

    private Integer userId;

    private Integer itemId;

    private BigDecimal itemPrice;

    private Integer amount;

    private BigDecimal orderPrice;

    private Integer promoId;

}