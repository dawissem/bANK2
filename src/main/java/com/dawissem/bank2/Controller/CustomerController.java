package com.dawissem.bank2.Controller;

import com.dawissem.bank2.Dto.CustomerSaveDTO;
import com.dawissem.bank2.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("user/showcustomer")
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO)
    {
        String ShortName = customerService.addCustomer(customerSaveDTO);
        return ShortName;
    }
}
