package com.example.Product.error;

import org.apache.http.HttpStatus;
import org.springframework.stereotype.Controller;	

@Controller
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorMessage> productNotFoundException(ProductNotFoundException productNotFoundException,
            WebRequest request) {
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, productNotFoundException.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }
}