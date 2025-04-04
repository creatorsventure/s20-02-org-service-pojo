package com.cv.s2002orgservicepojo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Token implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @NotBlank(message = "${app.code.002}")
    @NotNull(message = "${app.code.003}")
    @Column
    private String tokenHash;
    @NotBlank(message = "${app.code.002}")
    @NotNull(message = "${app.code.003}")
    @Column
    private String userId;
    @NotNull(message = "${app.code.003}")
    @Column
    private LocalDateTime issuedAt;
    @NotNull(message = "${app.code.003}")
    @Column
    private LocalDateTime expiresAt;
    @Column
    private boolean revoked = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_detail_id", referencedColumnName = "id", nullable = false)
    private UserDetail userDetail;
}
