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
public class Menu extends GenericEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 4372555353217285432L;

    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    private String path;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    @Column
    private String icon;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    @Column
    private String iconType;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    @Column
    private String iconTheme;

    @NotNull(message = "{app.message.failure.blank}")
    @Column
    private String rootMenuId;

    @NotNull(message = "{app.message.failure.blank}")
    @Column
    private Integer displayPosition;

    @NotNull(message = "{app.message.failure.blank}")
    @Column
    private Integer menuType;

    @Column
    private boolean dashboardCountCard = false;

    @ManyToMany(mappedBy = "menuList")
    @ToString.Exclude
    private List<Role> roleList;

}
