package com.ase.domain;

import javax.persistence.*;


@Entity
@Table(name = "item")
@PrimaryKeyJoinColumn(name = "id")
public class Item extends Base {
    private String name;
    private Double price;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "subCategoryId", nullable = false)
    private SubCategory subCategory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }
}
