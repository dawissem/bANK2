package com.dawissem.bank2.Service.Impl;

import com.dawissem.bank2.Dto.CustomerSaveDTO;
import com.dawissem.bank2.Entity.Customer;
import com.dawissem.bank2.Repo.CustomerRepo;
import com.dawissem.bank2.Service.CustomerService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CustomerServiceImp implements CustomerService {


@Autowired
private CustomerRepo customerRepo;




    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO) {
        Customer customer = new Customer(
            customerSaveDTO.getACCOUNT_OFFICER(),
                customerSaveDTO.getCUSTOMER_TYPE(),
                customerSaveDTO.getSHORT_NAME(),
                customerSaveDTO.getGENDER(),
                customerSaveDTO.getDATE_BIRTH_CREATION(),
                customerSaveDTO.getADDRESS(),
                customerSaveDTO.getPOST_CODE(),
                customerSaveDTO.getLEGAL_DOC_NAME(),
                customerSaveDTO.getLEGAL_ID(),
                customerSaveDTO.getNationality(),
                customerSaveDTO.getMAIL(),
                customerSaveDTO.getTEL()

        );
        customerRepo.save(customer);


        return customer.getShortName();
    }
}
