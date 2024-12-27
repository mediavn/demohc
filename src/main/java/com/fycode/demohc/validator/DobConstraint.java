package com.fycode.demohc.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;

@Target({ FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { DobValidator.class })
public @interface DobConstraint {

    String message() default "Invalid date of birth";

    int min(); // Giá trị tối thiểu (số tuổi)

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
