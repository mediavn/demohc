package com.fycode.demohc.dto.request;

import com.fycode.demohc.validator.DobConstraint;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequest {
    String password;
    String firstName;
    String lastName;

    // Custom Annotation @DobConstraint cho truong ngay sinh de validation
    //@NotNull(message = "INVALID_DOB_NULL")
    @DobConstraint(min = 18, message = "INVALID_DOB_MIN")
    LocalDate dob;

    List<String> roles;
}
