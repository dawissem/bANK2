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
@Table(name = "currency")
public class Currency {
    @Id
    @Column(name = "ID", nullable = false, length = 3)
    private String ID;

    @Column(name = "NAME", nullable = false, length = 10)
    private String name;

}