package com.sistema.dsvendas.repositories;

import com.sistema.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SaleRepository extends JpaRepository<Sale, Long> {
}
