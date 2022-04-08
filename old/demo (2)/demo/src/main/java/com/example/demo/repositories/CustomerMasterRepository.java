package com.example.demo.repositories;

import com.example.demo.entities.CustomerMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMasterRepository extends JpaRepository<CustomerMaster, Number> {
}
