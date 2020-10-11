package in.abvss.naamsuchi.payload;

import javax.validation.constraints.*;
import java.util.Date;

/**
 * Created by ameyjadiye on 03/10/2020.
 */

public class RegistrationRequest {
    @NotBlank
    @Size(min = 1, max = 40)
    private String firstName, middleName, surname;

    private String priviousSurname;

    @NotBlank
    private String birthDate;

    @NotBlank
    private String gender;

    @NotBlank
    private String gotra;

    private String bloodGroup;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String mobileNumber;

    private String education;

    @NotBlank
    private String maritalStatus;

    private String partnerName;

    @NotBlank
    private String fatherFirstName, fatherMiddleName, fatherLastName, fatherPriviousSurname;

    @NotBlank
    private String motherName;

    private Integer numberOfSon, numberOfDaughter, numberOfBrother, numberOfSister;

    private String permHouseNumber, permStreetAddress, permCity, permState, permCountry, permZipCode;

    private String tempHouseNumber, tempStreetAddress, tempCity, tempState, tempCountry, tempZipCode;

    private  String profession, designation, workAddress;

    @NotBlank
    private  String registeredSangh;

    private  String nativePlace;

    private String volunteer, areaOfIntrest;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPriviousSurname() {
        return priviousSurname;
    }

    public void setPriviousSurname(String priviousSurname) {
        this.priviousSurname = priviousSurname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGotra() {
        return gotra;
    }

    public void setGotra(String gotra) {
        this.gotra = gotra;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getFatherFirstName() {
        return fatherFirstName;
    }

    public void setFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    public String getFatherMiddleName() {
        return fatherMiddleName;
    }

    public void setFatherMiddleName(String fatherMiddleName) {
        this.fatherMiddleName = fatherMiddleName;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    public String getFatherPriviousSurname() {
        return fatherPriviousSurname;
    }

    public void setFatherPriviousSurname(String fatherPriviousSurname) {
        this.fatherPriviousSurname = fatherPriviousSurname;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public Integer getNumberOfSon() {
        return numberOfSon;
    }

    public void setNumberOfSon(Integer numberOfSon) {
        this.numberOfSon = numberOfSon;
    }

    public Integer getNumberOfDaughter() {
        return numberOfDaughter;
    }

    public void setNumberOfDaughter(Integer numberOfDaughter) {
        this.numberOfDaughter = numberOfDaughter;
    }

    public Integer getNumberOfBrother() {
        return numberOfBrother;
    }

    public void setNumberOfBrother(Integer numberOfBrother) {
        this.numberOfBrother = numberOfBrother;
    }

    public Integer getNumberOfSister() {
        return numberOfSister;
    }

    public void setNumberOfSister(Integer numberOfSister) {
        this.numberOfSister = numberOfSister;
    }

    public String getPermHouseNumber() {
        return permHouseNumber;
    }

    public void setPermHouseNumber(String permHouseNumber) {
        this.permHouseNumber = permHouseNumber;
    }

    public String getPermStreetAddress() {
        return permStreetAddress;
    }

    public void setPermStreetAddress(String permStreetAddress) {
        this.permStreetAddress = permStreetAddress;
    }

    public String getPermCity() {
        return permCity;
    }

    public void setPermCity(String permCity) {
        this.permCity = permCity;
    }

    public String getPermState() {
        return permState;
    }

    public void setPermState(String permState) {
        this.permState = permState;
    }

    public String getPermCountry() {
        return permCountry;
    }

    public void setPermCountry(String permCountry) {
        this.permCountry = permCountry;
    }

    public String getPermZipCode() {
        return permZipCode;
    }

    public void setPermZipCode(String permZipCode) {
        this.permZipCode = permZipCode;
    }

    public String getTempHouseNumber() {
        return tempHouseNumber;
    }

    public void setTempHouseNumber(String tempHouseNumber) {
        this.tempHouseNumber = tempHouseNumber;
    }

    public String getTempStreetAddress() {
        return tempStreetAddress;
    }

    public void setTempStreetAddress(String tempStreetAddress) {
        this.tempStreetAddress = tempStreetAddress;
    }

    public String getTempCity() {
        return tempCity;
    }

    public void setTempCity(String tempCity) {
        this.tempCity = tempCity;
    }

    public String getTempState() {
        return tempState;
    }

    public void setTempState(String tempState) {
        this.tempState = tempState;
    }

    public String getTempCountry() {
        return tempCountry;
    }

    public void setTempCountry(String tempCountry) {
        this.tempCountry = tempCountry;
    }

    public String getTempZipCode() {
        return tempZipCode;
    }

    public void setTempZipCode(String tempZipCode) {
        this.tempZipCode = tempZipCode;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getRegisteredSangh() {
        return registeredSangh;
    }

    public void setRegisteredSangh(String registeredSangh) {
        this.registeredSangh = registeredSangh;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(String volunteer) {
        this.volunteer = volunteer;
    }

    public String getAreaOfIntrest() {
        return areaOfIntrest;
    }

    public void setAreaOfIntrest(String areaOfIntrest) {
        this.areaOfIntrest = areaOfIntrest;
    }
}