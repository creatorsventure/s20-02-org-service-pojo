package com.cv.s2002orgservicepojo.entity;

import com.cv.s10coreservice.entity.generic.GenericEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
public class Options extends GenericEntity implements Serializable {


    @Serial
    private static final long serialVersionUID = 7296698143446469924L;

    @Column
    private boolean captcha = false;

    @Column
    private boolean transactionOTP = false;

    @Column
    private boolean loginOTP = false;

    @Column
    private boolean tokenization = false;

    @Column
    private boolean cvvSecurity = false;

    @Column
    private boolean makerCheckerMode = false;

    @Column
    private boolean masking = false;

    @OneToMany(mappedBy = "options")
    @ToString.Exclude
    private List<Unit> unitList;

}
