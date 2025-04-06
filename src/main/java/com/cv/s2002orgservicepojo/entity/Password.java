package com.cv.s2002orgservicepojo.entity;

import com.cv.s10coreservice.entity.generic.GenericEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@Entity
public class Password extends GenericEntity implements Serializable {


    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Size(min = 3, max = 250, message = "${core.message.failure.size}")
    @Column
    private String hashPassword;

    @NotBlank(message = "${core.message.failure.blank}")
    @NotNull(message = "${core.message.failure.null}")
    @Column(columnDefinition = "TEXT")
    private String encryptedPassword;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_detail_id", referencedColumnName = "id", nullable = false)
    private UserDetail userDetail;


}
