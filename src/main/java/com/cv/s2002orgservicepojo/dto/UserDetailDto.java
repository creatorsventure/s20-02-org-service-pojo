package com.cv.s2002orgservicepojo.dto;

import com.cv.s10coreservice.annotation.ValidMobileNumber;
import com.cv.s10coreservice.dto.generic.GenericDto;
import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

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
        message = "${app.message.failure.phone}"
)
public class UserDetailDto extends GenericDto implements Serializable {

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 250, message = "${core.message.failure.size}")
    private String userId;

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

    private LocalDateTime lastLogin;

    @NotEmpty(message = "${core.message.failure.empty}")
    private List<String> selectedRoleIds;

}
