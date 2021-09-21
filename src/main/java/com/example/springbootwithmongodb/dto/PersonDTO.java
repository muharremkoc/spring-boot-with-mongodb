package com.example.springbootwithmongodb.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.mongodb.core.index.TextIndexed;

import javax.validation.constraints.Max;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
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
