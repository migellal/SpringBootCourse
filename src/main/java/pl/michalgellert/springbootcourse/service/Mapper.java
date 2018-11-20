package pl.michalgellert.springbootcourse.service;

import pl.michalgellert.springbootcourse.model.CourseDTO;
import pl.michalgellert.springbootcourse.persistence.model.Course;

public class Mapper {

    public static CourseDTO courseToDTO(Course course) {
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setName(course.getName());
        courseDTO.setId(course.getId());
        return courseDTO;
    }

    public static Course dtoToCourse(CourseDTO courseDTO) {
        Course course = new Course();
        course.setId(courseDTO.getId());
        course.setName(courseDTO.getName());
        return course;
    }
}
