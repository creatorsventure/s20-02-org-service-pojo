package com.cv.s2002orgservicepojo.entity;

import com.cv.s10coreservice.entity.generic.GenericEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@Entity
public class UserDetail extends GenericEntity implements Serializable {

    @NotBlank(message = "${app.code.002}")
    @NotNull(message = "${app.code.003}")
    @Size(min = 3, max = 250, message = "${app.code.005}")
    @Column(unique = true)
    private String userId;

    @NotNull(message = "${app.code.003}")
    @NotNull(message = "${app.code.003}")
    @Size(min = 3, max = 25, message = "${app.code.005}")
    @Column
    private String mobileNumber;

    @NotNull(message = "${app.code.003}")
    @NotNull(message = "${app.code.003}")
    @Size(min = 3, max = 25, message = "${app.code.005}")
    @Column
    private String countryCode;

    @NotBlank(message = "${app.code.002}")
    @NotNull(message = "${app.code.003}")
    @Size(min = 3, max = 250, message = "${app.code.005}")
    @Column(unique = true)
    private String email;

    @Column
    private LocalDateTime lastLogin = LocalDateTime.now();

    @ManyToMany
    @JoinTable(name = "user_role_mapping",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    @ToString.Exclude
    private List<Role> roleList;

    @OneToOne(mappedBy = "userDetail", fetch = FetchType.EAGER)
    private Password password;
}
