package com.ivan.polovyi.builder.examples.first;

import java.time.LocalDate;

//This is our client which also works as "director"
public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO userDTO = directBuild(builder, user);
        System.out.println("userDTO = " + userDTO);
    }

    // Director
    private static UserDTO directBuild(UserDTOBuilder userDTOBuilder, User user) {
        return userDTOBuilder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
    }

    /**
     * Returns a sample user.
     */
    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1960, 5, 6));
        user.setFirstName("Ivan");
        user.setLastName("Polovyi");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State Street");
        address.setCity("Jaguariuna");
        address.setState("SP");
        address.setZipcode("13914108");
        user.setAddress(address);
        return user;
    }
}
