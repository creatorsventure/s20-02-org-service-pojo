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
        message = "${app.code.002}"
)
public class UserDetailDto extends GenericDto implements Serializable {

    @NotBlank(message = "${app.code.002}")
    @NotNull(message = "${app.code.003}")
    @Size(min = 3, max = 250, message = "${app.code.005}")
    private String userId;

    @NotBlank(message = "${app.code.002}")
    @NotNull(message = "${app.code.003}")
    @Size(min = 3, max = 25, message = "${app.code.005}")
    private String mobileNumber;

    @NotBlank(message = "${app.code.002}")
    @NotNull(message = "${app.code.003}")
    @Size(min = 3, max = 25, message = "${app.code.005}")
    private String countryCode;

    @NotBlank(message = "${app.code.002}")
    @NotNull(message = "${app.code.003}")
    @Size(min = 3, max = 250, message = "${app.code.005}")
    @Email(message = "${app.code.007}")
    private String email;

    private LocalDateTime lastLogin;

    @NotEmpty(message = "${app.code.003}")
    private List<String> selectedRoleIds;

}
