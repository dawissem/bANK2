package com.dawissem.bank2.Dto;

import com.dawissem.bank2.Entity.Country;
import com.dawissem.bank2.Enum.CustomerEnum;
import com.dawissem.bank2.Enum.GenderEnum;
import com.dawissem.bank2.Enum.Legal_Doc_Enum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerUpdateDTO {

    private int CUSTOMER_ID;
    private CustomerEnum CUSTOMER_TYPE ;
    private String SHORT_NAME;
    private GenderEnum GENDER;
    private String ADDRESS;
    private int POST_CODE;
    private Date DATE_BIRTH_CREATION;
    private Legal_Doc_Enum LEGAL_DOC_NAME;

    private String LEGAL_ID;
    private int ACCOUNT_OFFICER;
    private String  TEL;
    private String  MAIL;
    private Country nationality;
}
