package com.mev.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class TeacherDto {

    private Long Id;
    @NotEmpty(message = "FullName field is not empty")
    @Size(min=1, max=255)
    private String FullName;

    @NotEmpty(message = "Email field is not empty")
    @Email(message = "Please enter the 'Email' field correctly")
    private String Email;

    @NotEmpty(message = "Password area is not empty")
    @Size(min=8, max=25, message = "Size must be from 8 to 25")
    private String Password;
}
