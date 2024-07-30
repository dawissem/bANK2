package com.dawissem.bank2.Entity;

import com.dawissem.bank2.Enum.CustomerEnum;
import com.dawissem.bank2.Enum.GenderEnum;
import com.dawissem.bank2.Enum.Legal_Doc_Enum;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID", nullable = false)
    private Integer CUSTOMER_ID;


    private CustomerEnum customerType;

    @Column(name = "shortName", length = 60)
    private String shortName;


    @Column(name = "GENDER")
    private GenderEnum gender;

    @Column(name = "DATE_BIRTH_CREATION")
    private LocalDate dateBirthCreation;

    @Column(name = "ADDRESS", length = 60)
    private String address;

    @Column(name = "POST_CODE")
    private Integer postCode;



    private Legal_Doc_Enum legalDocName;

    @Column(name = "LEGAL_ID", length = 30)
    private String legalId;

    @ManyToOne
    @JoinColumn
    private Country nationality;

    @Column(name = "ACCOUNT_OFFICER")
    private Integer accountOfficer;

    @Column(name = "TEL", length = 20)
    private String tel;

    @Column(name = "MAIL", length = 30)
    private String mail;

    @OneToMany(mappedBy = "customer")
    private Set<Account> accounts = new LinkedHashSet<>();

    public Customer(int accountOfficer, CustomerEnum customerType, String shortName, GenderEnum gender, Date dateBirthCreation, String address, int postCode, Legal_Doc_Enum legalDocName, String legalId, Country nationality, String mail, String tel) {
    }




}