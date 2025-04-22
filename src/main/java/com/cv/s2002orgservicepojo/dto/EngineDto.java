package com.cv.s2002orgservicepojo.dto;

import com.cv.s10coreservice.annotation.ValidUrl;
import com.cv.s10coreservice.dto.generic.GenericDto;
import com.cv.s2002orgservicepojo.enm.EngineType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EngineDto extends GenericDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -2543124637299400171L;

    @NotNull(message = "{app.message.failure.blank}")
    private EngineType type;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    @ValidUrl
    private String serviceURL;

    @NotNull(message = "{app.message.failure.blank}")
    private Integer timeout;

    @NotNull(message = "{app.message.failure.blank}")
    private Integer priority;

}
