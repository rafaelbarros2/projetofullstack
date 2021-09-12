package com.sistema.dsvendas.dtos;

import com.sistema.dsvendas.entities.Sale;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaleDTO {

    private Long id;

    private Integer visited;

    private  Integer deals;

    private  Double amount;

    private LocalDate date;

    private  SellerDTO  sellerDTO;

    public SaleDTO(Sale entity){
        id = entity.getId();
        visited = entity.getVisited();
        deals = entity.getDeals();
        amount = entity.getAmount();
        date = entity.getDate();
        sellerDTO = new SellerDTO(entity.getSeller());
    }
}
