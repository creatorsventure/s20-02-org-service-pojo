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

    @Size(min = 3, max = 250, message = "${app.code.005}")
    private String path;

    @NotBlank(message = "${app.code.002}")
    @NotNull(message = "${app.code.003}")
    @Size(min = 3, max = 250, message = "${app.code.005}")
    @Column
    private String icon;

    @NotBlank(message = "${app.code.002}")
    @NotNull(message = "${app.code.003}")
    @Size(min = 3, max = 250, message = "${app.code.005}")
    @Column
    private String iconType;

    @NotBlank(message = "${app.code.002}")
    @NotNull(message = "${app.code.003}")
    @Size(min = 3, max = 250, message = "${app.code.005}")
    @Column
    private String iconTheme;

    @NotNull(message = "${app.code.003}")
    @Column
    private String rootMenuId;

    @NotNull(message = "${app.code.003}")
    @Column
    private Integer displayPosition;

    @NotNull(message = "${app.code.003}")
    @Column
    private Integer menuType;

    @ManyToMany(mappedBy = "menuList")
    @ToString.Exclude
    private List<Role> roleList;

}
