package com.ly.firstrpc.api;

import java.io.Serializable;

/**
 * @Description:
 * @Date 2018-08-07 14:16
 * @Author ly
 */
public class User implements Serializable {

    private static final long serialVersionUID = -2558154276591570011L;
    private String name;
    private Integer age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
