package com.cv.s2002orgservicepojo.dto;

import com.cv.s10coreservice.annotation.ValidPassword;
import com.cv.s10coreservice.dto.generic.GenericDto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@ValidPassword(
        passwordField = "password",
        confirmPasswordField = "confirmPassword",
        message = "${app.message.failure.password}"
)
public class SignupDto extends GenericDto {

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 250, message = "${core.message.failure.size}")
    private String userId;

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 250, message = "${core.message.failure.size}")
    private String organizationCode;

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 250, message = "${core.message.failure.size}")
    private String organizationName;

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 25, message = "${core.message.failure.size}")
    private String mobileNumber;

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 5, message = "${core.message.failure.size}")
    private String countryCode;

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 250, message = "${core.message.failure.size}")
    @Email(message = "${core.message.failure.email}")
    private String email;

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    private String password;

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    private String confirmPassword;
}
