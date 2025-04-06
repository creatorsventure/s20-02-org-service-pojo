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

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@Entity
public class Menu extends GenericEntity implements Serializable {

    @Size(min = 3, max = 250, message = "${core.message.failure.size}")
    private String path;

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 250, message = "${core.message.failure.size}")
    @Column
    private String icon;

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 250, message = "${core.message.failure.size}")
    @Column
    private String iconType;

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 250, message = "${core.message.failure.size}")
    @Column
    private String iconTheme;

    @NotNull(message = "${core.message.failure.null}")
    @Column
    private String rootMenuId;

    @NotNull(message = "${core.message.failure.null}")
    @Column
    private Integer displayPosition;

    @NotNull(message = "${core.message.failure.null}")
    @Column
    private Integer menuType;

    @ManyToMany(mappedBy = "menuList")
    @ToString.Exclude
    private List<Role> roleList;

}
