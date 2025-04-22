package com.cv.s2002orgservicepojo.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class DashboardDto implements Serializable {


    @Serial
    private static final long serialVersionUID = 5095337819128634762L;
    private List<CountDto> countDtoList;

}
