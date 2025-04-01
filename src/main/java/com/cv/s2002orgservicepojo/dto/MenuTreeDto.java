package com.cv.s2002orgservicepojo.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class MenuTreeDto {

    private String title;
    private String key;
    private boolean expanded;
    private List<MenuTreeDto> children;
    private boolean isLeaf;
    private boolean checked;
    private boolean selected;
}
