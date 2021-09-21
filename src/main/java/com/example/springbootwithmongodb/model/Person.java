package com.example.springbootwithmongodb.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Max;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(value = "personList")
public class Person {

    @Id
            
    int id;

    @TextIndexed
    @NonNull
    @Length(max = 100)
    String firstName;
    @TextIndexed
    @Length(max = 100)
    String lastName;

    @TextIndexed
    @Max(value = 3)
    String gender;
}
