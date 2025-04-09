package com.cv.s2002orgservicepojo.dto;

import com.cv.s10coreservice.annotation.ValidPassword;
import com.cv.s10coreservice.dto.generic.GenericDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

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
public class PasswordDto extends GenericDto implements Serializable {


    @Serial
    private static final long serialVersionUID = 8486963583625485709L;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    private String password;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    private String confirmPassword;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    private String userDetailId;


}
