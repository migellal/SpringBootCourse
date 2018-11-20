package pl.michalgellert.springbootcourse.service;

import pl.michalgellert.springbootcourse.model.CourseDTO;
import pl.michalgellert.springbootcourse.model.UserDTO;
import pl.michalgellert.springbootcourse.persistence.model.Course;
import pl.michalgellert.springbootcourse.persistence.model.User;

public class Mapper {

    public static CourseDTO courseToDTO(Course course) {
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setName(course.getName());
        courseDTO.setId(course.getId());
        return courseDTO;
    }

    public static Course dtoToCourse(CourseDTO courseDTO) {
        Course course = new Course();
        course.setActive(true);
        course.setId(courseDTO.getId());
        course.setName(courseDTO.getName());
        return course;
    }

    public static UserDTO userToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setAdmin(user.isAdmin());
        userDTO.setAuthor(user.isAuthor());
        return userDTO;
    }

    public static User dtoToUser(UserDTO userDTO) {
        User user = new User();
        user.setActive(true);
        user.setId(userDTO.getId());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setAdmin(userDTO.isAdmin());
        user.setAuthor(userDTO.isAuthor());
        return user;
    }
}
