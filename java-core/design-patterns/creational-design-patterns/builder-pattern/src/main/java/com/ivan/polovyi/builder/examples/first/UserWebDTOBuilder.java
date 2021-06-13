package com.ivan.polovyi.builder.examples.first;

//The concrete builder for UserWebDTO

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;

    @Override public UserDTOBuilder withFirstName(String fname) {
        firstName = fname;
        return this;
    }

    @Override public UserDTOBuilder withLastName(String lname) {
        lastName = lname;
        return this;
    }

    @Override public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override public UserDTOBuilder withAddress(Address address) {
        this.address = String
                .join(", ", address.getHouseNumber(), address.getStreet(), address.getCity(), address.getState(),
                        address.getZipcode());
        return this;
    }

    @Override public UserDTO build() {
        dto = new UserWebDTO(firstName.concat(" ").concat(lastName), address, age);
        return dto;
    }

    @Override public UserDTO getUserDTO() {
        return dto;
    }
}
