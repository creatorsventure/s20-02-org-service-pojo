package com.cv.s2002orgservicepojo.entity;

import com.cv.s10coreservice.entity.generic.GenericEntity;
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
public class Action extends GenericEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -2348933724146970745L;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 25, message = "{app.message.failure.size}")
    @Column(unique = true)
    private String actionCode;

    @NotNull(message = "{app.message.failure.blank}")
    @Column(unique = true)
    private Integer actionId;

    @Column
    private boolean partial = false;

    @Column
    private boolean permitExcess = false;

    @ManyToMany(mappedBy = "actionList")
    @ToString.Exclude
    private List<Unit> unitList;

}
