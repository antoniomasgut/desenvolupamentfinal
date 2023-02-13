package com.daw.desplegament02;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProductRepository extends JpaRepository<com.daw.desplegament02.Product, Long> {

    public List<Product> findByName(@Param("name") String name);
    
}
