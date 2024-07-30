package com.dawissem.bank2.Service;

import com.dawissem.bank2.Dto.CustomerSaveDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);
}
