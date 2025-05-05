package com.cv.s2002orgservicepojo.dto;

import com.cv.s10coreservice.dto.generic.GenericDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OptionsDto extends GenericDto implements Serializable {


    @Serial
    private static final long serialVersionUID = -2251046723387096809L;

    private boolean makerCheckerMode;
    private boolean masking;
    private boolean captcha;
    private boolean transactionOTP;
    private boolean loginOTP;
    private boolean tokenization;
    private boolean cvvSecurity;

}
