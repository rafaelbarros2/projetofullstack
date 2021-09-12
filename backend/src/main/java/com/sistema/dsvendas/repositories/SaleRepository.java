package com.sistema.dsvendas.repositories;

import com.sistema.dsvendas.dtos.SaleSuccessDTO;
import com.sistema.dsvendas.dtos.SaleSumDTO;
import com.sistema.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.sistema.dsvendas.dtos.SaleSumDTO(obj.seller, SUM (obj.amount))"
            + "From  Sale  AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupBySeller();

    @Query("SELECT new com.sistema.dsvendas.dtos.SaleSuccessDTO(obj.seller, SUM (obj.visited), SUM (obj.deals))"
            + "From  Sale  AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupBySeller();
}
