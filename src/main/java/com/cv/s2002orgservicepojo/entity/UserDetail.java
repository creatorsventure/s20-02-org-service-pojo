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

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 250, message = "${core.message.failure.size}")
    @Column(unique = true)
    private String userId;

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 25, message = "${core.message.failure.size}")
    @Column
    private String mobileNumber;

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 5, message = "${core.message.failure.size}")
    @Column
    private String countryCode;

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 250, message = "${core.message.failure.size}")
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

    @OneToMany(mappedBy = "userDetail", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Token> tokenList;
}
