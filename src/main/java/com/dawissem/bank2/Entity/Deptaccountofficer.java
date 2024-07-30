package com.dawissem.bank2.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
@Table(name = "deptaccountofficer")
public class Deptaccountofficer {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer ID;

    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

}