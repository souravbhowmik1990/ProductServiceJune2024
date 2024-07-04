package com.sourav.productservicejune2024.controllerAdvice;

import com.sourav.productservicejune2024.DTOS.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ExceptionDto> handleArithmeticException() {
        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setMessage("ArithmeticException has happened");
        exceptionDto.setMessage("I Don't know, please again");

        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(
                exceptionDto,
                HttpStatus.BAD_REQUEST);

        return response;
    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public ResponseEntity<String> handleArrayIndexOutOfBoundsException () {
        ResponseEntity<String> response = new ResponseEntity<>(
                "Array index Out of Bounds Exception has happened Inside the Controller Advice",
                HttpStatus.NOT_FOUND);

        return response;
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullPointerException () {
        ResponseEntity<String> response = new ResponseEntity<>(
                "NullPointException  has happened",
                HttpStatus.NOT_FOUND);

        return response;
    }
}
