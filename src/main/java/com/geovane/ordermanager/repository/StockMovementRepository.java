package com.geovane.ordermanager.repository;

import com.geovane.ordermanager.entity.StockMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;

@RepositoryRestResource
public interface StockMovementRepository extends JpaRepository<StockMovement, BigInteger> {

    StockMovement findByItemId(BigInteger id);

}
