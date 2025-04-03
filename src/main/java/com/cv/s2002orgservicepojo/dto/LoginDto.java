package com.cv.s2002orgservicepojo.dto;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class LoginDto implements Serializable {

    private String username;
    private String password;
}
