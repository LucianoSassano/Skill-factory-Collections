package com.company.excercise6;


import java.util.UUID;

public class ClubMember {

    private String name;
    private UUID id;
    private String phone;
    private Integer age;

    public ClubMember() {
    }

    public ClubMember(String name, UUID id, String phone, Integer age) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " ClubMember " +
                " name = '" + name + '\'' +
                ", id = " + id +
                ", phone = '" + phone + '\'' +
                ", age = " + age;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
