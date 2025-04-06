package com.cv.s2002orgservicepojo.dto;

import com.cv.s10coreservice.dto.generic.GenericDto;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class RoleDto extends GenericDto implements Serializable {

    @NotEmpty(message = "${core.message.failure.empty}")
    private List<String> selectedOrganizationIds;

    @NotEmpty(message = "${core.message.failure.empty}")
    private List<String> selectedMenuIds;

    @NotEmpty(message = "${core.message.failure.empty}")
    private List<String> selectedPermissionIds;

}
