package com.dawissem.bank2.Entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Entity
@Data
@Table(name = "country")
public class Country {
    @Id

    private String id;


    private String name;

    public Country(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonCreator
    public Country(@JsonProperty("id") String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}