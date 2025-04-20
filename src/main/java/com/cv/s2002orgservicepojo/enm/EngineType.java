package com.cv.s2002orgservicepojo.enm;

import lombok.Getter;

@Getter
public enum EngineType {
    SERVICE(0),
    SWITCH(1);

    private final int code;

    EngineType(int code) {
        this.code = code;
    }

    public static EngineType fromCode(int code) {
        for (EngineType type : EngineType.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid NotificationType code: " + code);
    }
}
