package pl.michalgellert.springbootcourse.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CourseDTO {

    private Long id;
    private String name;
    private int lengthInSecond;

}
