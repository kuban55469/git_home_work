package classes;

import enums.Gender;

public class Driver {
    private Long id;
    private String name;
    private String surName;
    private Gender gender;
    private String phoneNumber;
    private License license;
    private Taxi taxi;


    public Driver(Long id, String name, String surName, Gender gender, String phoneNumber, License license, Taxi taxi) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.license = license;
        this.taxi = taxi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", gender=" + gender +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", license=" + license +
                ", taxi=" + taxi +
                '}';
    }
}
