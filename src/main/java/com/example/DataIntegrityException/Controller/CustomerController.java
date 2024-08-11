package com.example.DataIntegrityException.Controller;

import com.example.DataIntegrityException.Entity.Customer;
import com.example.DataIntegrityException.Repository.CustomerRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerTemplateAvailabilityProvider;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;
    @GetMapping("/test")
    public String test(){
        return "This Is A Test Run";
    }
    @PostMapping("/save")
    public String save(@Valid @RequestBody Customer customer){
        customerRepository.save(customer);
        return "Data Saved";
    }
    @GetMapping("/all")
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
