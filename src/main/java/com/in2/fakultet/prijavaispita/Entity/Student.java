
package com.in2.fakultet.prijavaispita.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    // da li treba nesto da se radi sa PK posebno?
    @Column
    private int code;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String description;
    @Column
    private String creationDate;
    @Column
    private int createdBy;
    @Column
    private int lastUpdatedBy;
    @Column
    private String lastUpdatedDate;
    @Column
    private String rowStatus;
    
    public Student() {
    }

    public Student(int id, int code, String name, String surname, String description, String creationDate, int createdBy, int lastUpdatedBy, String lastUpdatedDate, String rowStatus) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.surname = surname;
        this.description = description;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdatedDate = lastUpdatedDate;
        this.rowStatus = rowStatus;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(int lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(String rowStatus) {
        this.rowStatus = rowStatus;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", code=" + code + ", name=" + name
                + ", surname=" + surname + ", description=" + description + ", creationDate=" + creationDate 
                + ", createdBy=" + createdBy + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate 
                + ", rowStatus=" + rowStatus + '}';
    }
    
    
    
    
    
}
