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
public class Option extends GenericEntity implements Serializable {


    @Serial
    private static final long serialVersionUID = 7296698143446469924L;

    @Column
    private boolean captcha;

    @Column
    private boolean otpAuthentication;

    @Column
    private boolean tokenization;

    @Column
    private boolean cvvSecurity;

    @Column
    private boolean makerCheckerMode;

    @Column
    private boolean masking;

}
