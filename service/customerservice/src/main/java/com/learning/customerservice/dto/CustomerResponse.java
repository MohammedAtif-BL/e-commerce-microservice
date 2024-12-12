package com.learning.customerservice.dto;


import com.learning.customerservice.entity.Address;

public record CustomerResponse(
        Integer id,
        String firstname,
        String lastname,
        String email,
        Address address
) {

}
