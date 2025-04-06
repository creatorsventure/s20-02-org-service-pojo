package com.cv.s2002orgservicepojo.dto;

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
public class OrganizationDto extends GenericDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 2819106570149094795L;

    @NotBlank(message = "${app.message.failure.blank}")
    @NotNull(message = "${app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "${app.message.failure.size}")
    private String organizationCode;

}
