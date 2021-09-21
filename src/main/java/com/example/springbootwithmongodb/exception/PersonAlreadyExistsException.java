package com.example.springbootwithmongodb.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "Person Already Exists")
public class PersonAlreadyExistsException extends RuntimeException {
}
