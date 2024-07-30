package com.dawissem.bank2.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ACCOUNT_OFFICER", nullable = false)
    private Deptaccountofficer accountOfficer;

    @Column(name = "ACCOUNT_TITLE", length = 60)
    private String accountTitle;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CURRENCY" )
    private Currency currency;

    @Column(name = "CATEGORY", length = 20)
    private String category;

    @ColumnDefault("0.0000")
    @Column(name = "WORKING_BALANCE", precision = 10, scale = 4)
    private BigDecimal workingBalance;

    @Column(name = "OPENING_DATE")
    private LocalDate openingDate;

    @Column(name = "CLOSURE_DATE")
    private LocalDate closureDate;

}