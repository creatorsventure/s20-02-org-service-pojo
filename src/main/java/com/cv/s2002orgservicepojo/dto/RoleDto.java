package com.cv.s2002orgservicepojo.dto;

import com.cv.s10coreservice.dto.generic.GenericDto;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class RoleDto extends GenericDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 4857081171071795735L;

    @NotEmpty(message = "{app.message.failure.empty}")
    private List<String> selectedOrganizationIds;

    @NotEmpty(message = "{app.message.failure.empty}")
    private List<String> selectedMenuIds;

    @NotEmpty(message = "{app.message.failure.empty}")
    private List<String> selectedPermissionIds;

}
