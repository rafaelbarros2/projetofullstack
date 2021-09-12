package com.sistema.dsvendas.dtos;

import com.sistema.dsvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SellerDTO implements Serializable {

    private Long id;
    private String name;


    public SellerDTO(Seller seller) {
        id = seller.getId();
        this.name = seller.getName();
    }
}
