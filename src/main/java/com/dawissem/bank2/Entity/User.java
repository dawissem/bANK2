package com.dawissem.bank2.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matricule", nullable = false)
    private Integer matricule;

    @Column(name = "Nom", length = 20)
    private String nom;

    @Column(name = "Prenom", length = 20)
    private String prenom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Agence")
    private Deptaccountofficer agence;

    @Column(name = "Mail", length = 30)
    private String mail;

    @Column(name = "password", length = 12)
    private String password;

    public User(Integer matricule, String nom, String prenom, Deptaccountofficer agence, String mail, String password) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.agence = agence;
        this.mail = mail;
        this.password = password;
    }

    public User() {

    }
}