package pl.michalgellert.springbootcourse.service;

import pl.michalgellert.springbootcourse.model.CourseDTO;
import pl.michalgellert.springbootcourse.persistence.model.Course;
import pl.michalgellert.springbootcourse.persistence.repository.CourseRepo;

import java.util.List;

public interface CourseService extends BaseService<Course, Long, CourseRepo> {

    CourseDTO getCourseDtoById(Long id);

    CourseDTO createCourse(CourseDTO courseDTO);

    List<CourseDTO> getAllCourses();
}
