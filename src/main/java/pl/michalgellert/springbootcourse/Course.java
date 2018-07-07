package pl.michalgellert.springbootcourse;

import lombok.Data;

@Data
public class Course {

    private Long id;
    private String name;
    private int lengthInSecond;

}
