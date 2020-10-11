package in.abvss.naamsuchi.model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String houseNumber;

    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String zipCode;

}
