package com.cv.s2002orgservicepojo.dto;

import com.cv.s10coreservice.annotation.ValidEmailDomain;
import com.cv.s10coreservice.annotation.ValidMobileNumber;
import com.cv.s10coreservice.dto.generic.GenericDto;
import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@ValidMobileNumber(
        countryCodeField = "countryCode",
        mobileNumberField = "mobileNumber",
        message = "{app.message.failure.phone}"
)
public class UserDetailDto extends GenericDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -6883079267228592744L;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    private String userId;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 25, message = "{app.message.failure.size}")
    private String mobileNumber;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 2, max = 5, message = "{app.message.failure.size}")
    private String countryCode;

    @NotBlank(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    @Pattern(
            regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$",
            message = "{app.message.failure.email}"
    )
    @ValidEmailDomain(message = "{app.message.failure.email}")
    private String email;

    private LocalDateTime lastLogin;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    private String roleId;

}
