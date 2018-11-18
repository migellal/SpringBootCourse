package pl.michalgellert.springbootcourse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.michalgellert.springbootcourse.model.CourseDTO;
import pl.michalgellert.springbootcourse.exception.WrongIdException;
import pl.michalgellert.springbootcourse.persistence.model.Course;
import pl.michalgellert.springbootcourse.persistence.repository.CourseRepo;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

    private List<CourseDTO> cours = new ArrayList<>();

    @Autowired
    CourseRepo courseRepo;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<CourseDTO> createCourse(@RequestBody CourseDTO courseDTO) {
        if(courseDTO.getId()==null|| courseDTO.getId()<0)
            throw new WrongIdException("Zmienna kurs posiada id nullowe lub mniejsze od zera.");
        cours.add(courseDTO);
        System.out.println(courseDTO.getName());
        System.out.println(courseDTO.getLengthInSecond());
        return new ResponseEntity<>(courseDTO, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/available", method = RequestMethod.GET)
    public ResponseEntity<List<CourseDTO>> getAvailableCourses() {
        return new ResponseEntity<>(cours, HttpStatus.OK);
    }

    @RequestMapping(value = "buy/{id}", method = RequestMethod.GET)
    public CourseDTO buyCourse(@PathVariable(value = "id") Long id) {
        System.out.println("buyCourse");
        Course c = courseRepo.getOne(id);
        return new CourseDTO(c.getId(), c.getName(), 560);
    }

    @RequestMapping(value = "buy2", method = RequestMethod.POST)
    public CourseDTO buyCourse2(@RequestParam(value = "id") Long id) {
        System.out.println("buyCourse2");
        return getCourse(id);
    }

    private CourseDTO getCourse(Long id) {
        CourseDTO courseDTO = null;
        for(CourseDTO c : cours) {
            if(c.getId()!=null&&c.getId().equals(id)) {
                courseDTO = c;
                break;
            }
        }
        if(courseDTO ==null) {
            // TODO
        }
        return courseDTO;
    }

//    @RequestMapping(value = "/bought", method = RequestMethod.GET) FIXME
//    public ResponseEntity<List<CourseDTO>> getBoughtCourses() {
//        return new ResponseEntity<>(cours, HttpStatus.OK);
//    }
}
