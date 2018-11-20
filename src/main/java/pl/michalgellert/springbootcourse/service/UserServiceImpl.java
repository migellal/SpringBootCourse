package pl.michalgellert.springbootcourse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.michalgellert.springbootcourse.model.UserDTO;
import pl.michalgellert.springbootcourse.persistence.model.User;
import pl.michalgellert.springbootcourse.persistence.repository.UserRepo;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long, UserRepo> implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserRepo getRepository() {
        return userRepo;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User u = save(Mapper.dtoToUser(userDTO));
        return Mapper.userToDTO(u);
    }

    @Override
    public UserDTO editUser(UserDTO userDTO) {
        User u = save(Mapper.dtoToUser(userDTO));
        return Mapper.userToDTO(u);
    }
}
