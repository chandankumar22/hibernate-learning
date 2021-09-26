package com.ck.dev.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "profiles")
public class UsersEntity {

    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_hash")
    private String userHash;

    @Column(name = "registered_date")
    private Date registeredDate;

    @Column(name = "user_age")
    private int age;

    public UsersEntity(String userId, String userHash, Date registeredDate, int age) {
        this.userId = userId;
        this.userHash = userHash;
        this.registeredDate = registeredDate;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserHash() {
        return userHash;
    }

    public void setUserHash(String userHash) {
        this.userHash = userHash;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UsersEntity{" +
                "userId='" + userId + '\'' +
                ", userHash='" + userHash + '\'' +
                ", registeredDate='" + registeredDate + '\'' +
                ", age=" + age +
                '}';
    }
}
