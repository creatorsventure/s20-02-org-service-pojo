package com.cv.s2002orgservicepojo.dto;

import com.cv.s10coreservice.dto.generic.GenericDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MenuDto extends GenericDto implements Serializable {

    @Size(min = 3, max = 250, message = "${core.message.failure.size}")
    private String path;

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 250, message = "${core.message.failure.size}")
    private String icon;

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 250, message = "${core.message.failure.size}")
    private String iconType;

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 250, message = "${core.message.failure.size}")
    private String iconTheme;

    @NotNull(message = "${core.message.failure.null}")
    private String rootMenuId;

    @NotNull(message = "${core.message.failure.null}")
    private Integer displayPosition;

    @NotNull(message = "${core.message.failure.null}")
    private Integer menuType;

}
