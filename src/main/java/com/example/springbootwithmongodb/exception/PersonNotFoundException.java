package com.example.springbootwithmongodb.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "Person NotFound Exception")
public class PersonNotFoundException extends RuntimeException {
}
