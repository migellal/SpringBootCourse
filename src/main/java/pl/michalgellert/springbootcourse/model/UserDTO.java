package pl.michalgellert.springbootcourse.model;

import lombok.Data;

@Data
public class UserDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean author;
    private boolean admin;

}
