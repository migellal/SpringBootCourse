package pl.michalgellert.springbootcourse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Long> createCourse(@RequestBody Course course) {
        System.out.println(course.getName());
        System.out.println(course.getLengthInSecond());
        return new ResponseEntity<>(0L, HttpStatus.CREATED);
    }
}
