package com.sistema.dsvendas.services;

import com.sistema.dsvendas.dtos.SaleDTO;
import com.sistema.dsvendas.dtos.SaleSuccessDTO;
import com.sistema.dsvendas.dtos.SaleSumDTO;
import com.sistema.dsvendas.entities.Sale;
import com.sistema.dsvendas.repositories.SaleRepository;
import com.sistema.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupBySeller(){
        return repository.amountGroupBySeller();
    }
    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupBySeller(){
        return repository.successGroupBySeller();
    }

}
