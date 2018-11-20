package pl.michalgellert.springbootcourse.service;

import pl.michalgellert.springbootcourse.model.UserDTO;
import pl.michalgellert.springbootcourse.persistence.model.User;
import pl.michalgellert.springbootcourse.persistence.repository.UserRepo;

public interface UserService extends BaseService<User, Long, UserRepo> {

    public UserDTO createUser(UserDTO userDTO);

    public UserDTO editUser(UserDTO userDTO);
}
