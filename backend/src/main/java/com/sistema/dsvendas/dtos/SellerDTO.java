package com.sistema.dsvendas.dtos;

import com.sistema.dsvendas.entities.Seller;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@NoArgsConstructor
public class SellerDTO implements Serializable {

    private Long id;
    private String name;


    public SellerDTO(Seller seller) {
        id = seller.getId();
        this.name = seller.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
