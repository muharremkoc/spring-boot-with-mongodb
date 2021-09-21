package com.example.springbootwithmongodb.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Max;
import java.util.UUID;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "personList")
public class Person {

    @Id
    String id;

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
