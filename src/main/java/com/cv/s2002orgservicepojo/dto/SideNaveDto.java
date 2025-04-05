package com.cv.s2002orgservicepojo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class SideNaveDto implements Serializable {

    private String title;
    private String path;
    private String icon;
    private String iconType;
    private String iconTheme;

    @JsonProperty("submenu")
    private List<SideNaveDto> subMenuList;

}
