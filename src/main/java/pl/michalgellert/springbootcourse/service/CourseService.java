package pl.michalgellert.springbootcourse.service;

import pl.michalgellert.springbootcourse.model.CourseDTO;
import pl.michalgellert.springbootcourse.persistence.model.Course;
import pl.michalgellert.springbootcourse.persistence.repository.CourseRepo;

public interface CourseService extends BaseService<Course, Long, CourseRepo> {

    CourseDTO getCourseDtoById(Long id);
}
