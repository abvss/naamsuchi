package in.abvss.naamsuchi.model;

import in.abvss.naamsuchi.model.audit.DateAudit;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_detail")
public class UserDetail extends DateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName, middleName, surname;

    private String priviousSurname;

    private Date birthDate;

    private String gender;

    private String gotra;

    private String bloodGroup;

    private String email;

    private String mobileNumber;

    private String education;

    private String maritalStatus;

    private String spouseFirstName, spouseMiddleName, spouseLastName;

    private String fatherFirstName, fatherMiddleName, fatherLastName, fatherPriviousSurname;

    private String motherFirstName, motherMiddleName, motherLastName;

    private Integer numberOfSon, numberOfDaughter, numberOfBrother, numberOfSister;

    @ManyToOne(fetch = FetchType.LAZY)
    private Address permAddress;

    @ManyToOne(fetch = FetchType.LAZY)
    private Address tempAddress;

    private String profession, designation, workAddress;

    private String registeredSangh;

    private String nativePlace;

    private String volunteer, areaOfIntrest;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
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

    public String getSpouseFirstName() {
        return spouseFirstName;
    }

    public void setSpouseFirstName(String spouseFirstName) {
        this.spouseFirstName = spouseFirstName;
    }

    public String getSpouseMiddleName() {
        return spouseMiddleName;
    }

    public void setSpouseMiddleName(String spouseMiddleName) {
        this.spouseMiddleName = spouseMiddleName;
    }

    public String getSpouseLastName() {
        return spouseLastName;
    }

    public void setSpouseLastName(String spouseLastName) {
        this.spouseLastName = spouseLastName;
    }

    public String getMotherMiddleName() {
        return motherMiddleName;
    }

    public void setMotherMiddleName(String motherMiddleName) {
        this.motherMiddleName = motherMiddleName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
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

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
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

    public Address getPermAddress() {
        return permAddress;
    }

    public void setPermAddress(Address permAddress) {
        this.permAddress = permAddress;
    }

    public Address getTempAddress() {
        return tempAddress;
    }

    public void setTempAddress(Address tempAddress) {
        this.tempAddress = tempAddress;
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
