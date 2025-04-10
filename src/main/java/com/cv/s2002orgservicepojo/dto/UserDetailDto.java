package com.cv.s2002orgservicepojo.dto;

import com.cv.s10coreservice.annotation.ValidMobileNumber;
import com.cv.s10coreservice.dto.generic.GenericDto;
import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
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
    @Size(min = 3, max = 5, message = "{app.message.failure.size}")
    private String countryCode;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    @Email(message = "{app.message.failure.email}")
    private String email;

    private LocalDateTime lastLogin;

    @NotEmpty(message = "{app.message.failure.empty}")
    private List<String> selectedRoleIds;

}
