package test.org.springdoc.api.v30.app110;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@NotNull
@NotBlank
@Size(max = 10)
@Constraint(validatedBy = {})
@Documented
@Target(FIELD)
@Retention(RUNTIME)
public @interface NonEmptyMax10 {
	String message() default "all validations apply";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
