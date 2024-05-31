package com.ty.springpersonvalidate.entity;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class Person {

	
	private Integer id;
	@Size(min = 5, max = 30)
	private String name;
	@Email
	private String email;
	@Min(6000000000l)
	@Max(9999999999l)
	private long phone;
	@Min(13)
	@Max(75)
	private int age;
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])[0-9a-zA-Z!@#$%^&*+]{8,32}$", message = "Password should contain at least one lowercase letter, one uppercase letter, one special character, and be between 8 and 32 characters long")
	private String password;

}
