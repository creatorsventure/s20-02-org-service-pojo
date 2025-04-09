package com.cv.s2002orgservicepojo.dto;

import com.cv.s10coreservice.annotation.ValidPassword;
import com.cv.s10coreservice.dto.generic.GenericDto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@ValidPassword(
        passwordField = "password",
        confirmPasswordField = "confirmPassword",
        message = "{app.message.failure.password}"
)
public class SignupDto extends GenericDto {

    @Serial
    private static final long serialVersionUID = -7192794735191903117L;

    @NotBlank(message = "${app.message.failure.blank}")
    @NotNull(message = "${app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "${app.message.failure.size}")
    private String userId;

    @NotBlank(message = "${app.message.failure.blank}")
    @NotNull(message = "${app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "${app.message.failure.size}")
    private String organizationCode;

    @NotBlank(message = "${app.message.failure.blank}")
    @NotNull(message = "${app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "${app.message.failure.size}")
    private String organizationName;

    @NotBlank(message = "${app.message.failure.blank}")
    @NotNull(message = "${app.message.failure.blank}")
    @Size(min = 3, max = 25, message = "${app.message.failure.size}")
    private String mobileNumber;

    @NotBlank(message = "${app.message.failure.blank}")
    @NotNull(message = "${app.message.failure.blank}")
    @Size(min = 3, max = 5, message = "${app.message.failure.size}")
    private String countryCode;

    @NotBlank(message = "${app.message.failure.blank}")
    @NotNull(message = "${app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "${app.message.failure.size}")
    @Email(message = "${app.message.failure.email}")
    private String email;

    @NotBlank(message = "${app.message.failure.blank}")
    @NotNull(message = "${app.message.failure.blank}")
    private String password;

    @NotBlank(message = "${app.message.failure.blank}")
    @NotNull(message = "${app.message.failure.blank}")
    private String confirmPassword;
}
