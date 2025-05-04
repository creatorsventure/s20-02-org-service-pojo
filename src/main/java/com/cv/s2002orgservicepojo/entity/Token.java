package com.cv.s2002orgservicepojo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Token implements Serializable {

    @Serial
    private static final long serialVersionUID = -2885838288314309305L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    @Column
    private String tokenHash;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    @Column
    private String userId;

    @NotNull(message = "{app.message.failure.blank}")
    @Column
    private LocalDateTime issuedAt;

    @NotNull(message = "{app.message.failure.blank}")
    @Column
    private LocalDateTime expiresAt;

    @Column
    private boolean revoked = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_detail_id", referencedColumnName = "id", nullable = false)
    @ToString.Exclude
    private UserDetail userDetail;
}
