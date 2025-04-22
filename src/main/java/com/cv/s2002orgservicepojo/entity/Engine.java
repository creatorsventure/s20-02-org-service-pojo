package com.cv.s2002orgservicepojo.entity;

import com.cv.s10coreservice.entity.generic.GenericEntity;
import com.cv.s2002orgservicepojo.enm.EngineType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
@Entity
public class Engine extends GenericEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -2348933724146970745L;

    @NotNull(message = "{app.message.failure.blank}")
    @Column
    private EngineType type;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    @Column
    private String serviceURL;

    @NotNull(message = "{app.message.failure.blank}")
    @Column
    private Integer timeout;

    @NotNull(message = "{app.message.failure.blank}")
    @Column
    private Integer priority;

    @ManyToMany(mappedBy = "engineList")
    @ToString.Exclude
    private List<Unit> unitList;

}
