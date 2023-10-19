package com.peopleconnectapp.model;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

@Container(containerName = "posts")
public class Posts {

    @Id
    @GeneratedValue
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String categoryId;
    @PartitionKey
    private String categoryName;
    private String desc;
    private String isActive;


    public Posts(String firstName, String lastName, String email, String categoryId, String categoryName, String desc, String isActive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.desc = desc;
        this.isActive = isActive;
    }

    public Posts() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
}