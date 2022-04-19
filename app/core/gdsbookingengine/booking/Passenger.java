package core.gdsbookingengine.booking;

import core.gdsbookingengine.Gender;
import core.gdsbookingengine.PassengerCode;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String namePrefix;
    private String givenName;
    private String surname;
    private Gender gender;
    private LocalDateTime BirthDate;
    private String phoneLocationType;
    private List<Telephone> telephones;
    private String contactNamePrefix;
    private String contactFirstName;
    private String contactLastName;
    private String contactEmail;
    private String contactPhone;
    private List<String> emails;
    private String countryAccessCode;
    private PassengerCode code;
    private String rph;

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDateTime getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        BirthDate = birthDate;
    }

    public String getPhoneLocationType() {
        phoneLocationType = "HOME";
        return phoneLocationType;
    }

    public List<String> getEmails() {
        if(emails == null) {
            emails = new ArrayList<>();
        }
        return emails;
    }


    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCountryAccessCode() {
        return countryAccessCode;
    }

    public void setCountryAccessCode(String countryAccessCode) {
        this.countryAccessCode = countryAccessCode;
    }

    public PassengerCode getCode() {
        return code;
    }

    public void setCode(PassengerCode code) {
        this.code = code;
    }

    public String getRPH() {
        return rph;
    }

    public void setRPH(String rph) {
        this.rph = rph;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public List<Telephone> getTelephones() {
        if (this.telephones == null) {
            this.telephones = new ArrayList<>();
        }
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones) {
        this.telephones = telephones;
    }

    public String getContactNamePrefix() {
        return contactNamePrefix;
    }

    public void setContactNamePrefix(String contactNamePrefix) {
        this.contactNamePrefix = contactNamePrefix;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}