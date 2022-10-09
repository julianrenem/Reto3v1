package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "costume")
public class Costume  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column(length = 45)
    private String name;
    @Column(length = 45)
    private String brand;
    private String description;
    private Integer año;
    public Integer getId() {
        return Id;
    }

    //relacion category costume
    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("costume")
    private Category category;
    //---------------------------




    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }
}
