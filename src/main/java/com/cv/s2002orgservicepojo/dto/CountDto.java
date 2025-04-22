package com.cv.s2002orgservicepojo.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CountDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 4401604047860127971L;

    private String title;
    private String icon;
    private String description;
    private Long count;
}
