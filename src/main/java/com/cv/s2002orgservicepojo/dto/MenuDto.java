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

    @Size(min = 3, max = 250, message = "{app.code.005}")
    private String path;

    @NotBlank(message = "{app.code.002}")
    @NotNull(message = "{app.code.003}")
    @Size(min = 3, max = 250, message = "{app.code.005}")
    private String icon;

    @NotBlank(message = "${app.code.002}")
    @NotNull(message = "${app.code.003}")
    @Size(min = 3, max = 250, message = "${app.code.005}")
    private String iconType;

    @NotBlank(message = "${app.code.002}")
    @NotNull(message = "${app.code.003}")
    @Size(min = 3, max = 250, message = "${app.code.005}")
    private String iconTheme;

    @NotNull(message = "{app.code.003}")
    private String rootMenuId;

    @NotNull(message = "{app.code.003}")
    private Integer displayPosition;

    @NotNull(message = "{app.code.003}")
    private Integer menuType;

    @NotNull(message = "{app.code.003}")
    private String moduleId;

}
