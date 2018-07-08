package pl.michalgellert.springbootcourse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class WrongIdException extends RuntimeException {
    public WrongIdException(String s) {
        super(s);
    }
}
