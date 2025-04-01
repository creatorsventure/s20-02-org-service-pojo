package com.cv.s2002orgservicepojo.entity;

import com.cv.s10coreservice.entity.generic.GenericEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
public class Role extends GenericEntity implements Serializable {

    @ManyToMany
    @JoinTable(name = "role_organization_mapping",
            joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "organization_id", referencedColumnName = "id")
    )
    @ToString.Exclude
    private List<Organization> organizationList;

    @ManyToMany
    @JoinTable(name = "role_permission_mapping",
            joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id", referencedColumnName = "id")
    )
    @ToString.Exclude
    private List<Permission> permissionList;

    @ManyToMany
    @JoinTable(name = "role_menu_mapping",
            joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "menu_id", referencedColumnName = "id")
    )
    @ToString.Exclude
    private List<Menu> menuList;

    @ManyToMany(mappedBy = "roleList")
    @ToString.Exclude
    private List<UserDetail> userDetailList;

}
