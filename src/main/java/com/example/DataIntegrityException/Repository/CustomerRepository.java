package com.example.DataIntegrityException.Repository;

import com.example.DataIntegrityException.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
