package com.ase.domain;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;


@Entity
@Table(name = "item_subcategory")
@PrimaryKeyJoinColumn(name = "id")
public class SubCategory extends Base {
    private String name;
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "itemCategoryId", nullable = false)
    private Category category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
