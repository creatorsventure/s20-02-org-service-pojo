package com.cv.s2002orgservicepojo.enm;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum EngineType {
    SERVICE(0),
    SWITCH(1);

    private final int code;

    EngineType(int code) {
        this.code = code;
    }

    @JsonValue
    public int toValue() {
        return code;
    }

    @JsonCreator
    public static EngineType fromValue(int code) {
        for (EngineType type : EngineType.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid NotificationType code: " + code);
    }
}
