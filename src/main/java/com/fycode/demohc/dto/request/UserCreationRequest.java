package com.fycode.demohc.dto.request;

import com.fycode.demohc.validator.DobConstraint;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 4, message = "USERNAME_INVALID")
    String username;

    @Size(min = 6, message = "INVALID_PASSWORD")
    String password;
    String firstName;
    String lastName;

    // Custom Annotation @DobConstraint cho trường ngày sinh
    @DobConstraint(min = 10, message = "INVALID_DOB_MIN") // Custom validation >= 18 tuổi
    LocalDate dob;
}
