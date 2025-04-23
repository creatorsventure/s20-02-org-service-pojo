package com.cv.s2002orgservicepojo.entity;

import com.cv.s10coreservice.entity.generic.GenericEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@Entity
public class Unit extends GenericEntity implements Serializable {


    @Serial
    private static final long serialVersionUID = 1884485661070307104L;


    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    @Column(nullable = false, unique = true)
    private String unitCode;

    @NotNull(message = "{app.message.failure.blank}")
    @Column(nullable = false, unique = true)
    private Integer unitId;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    @Column(nullable = false, unique = true)
    private String bankIdentificationCode;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    @Column
    private String type;

    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    @Column
    private String legalName;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    @Column
    private String adminName;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    @Email(message = "{app.message.failure.email}")
    @Column
    private String adminEmail;

    @NotBlank(message = "{app.message.failure.blank}")
    @NotNull(message = "{app.message.failure.blank}")
    @Size(min = 3, max = 250, message = "{app.message.failure.size}")
    @Column
    private String address;

    @ManyToMany
    @JoinTable(name = "unit_action_mapping",
            joinColumns = @JoinColumn(name = "unit_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "action_id", referencedColumnName = "id", nullable = false)
    )
    @ToString.Exclude
    private List<Action> actionList;

    @ManyToMany
    @JoinTable(name = "unit_currency_mapping",
            joinColumns = @JoinColumn(name = "unit_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "currency_id", referencedColumnName = "id", nullable = false)
    )
    @ToString.Exclude
    private List<Currency> currencyList;

    @ManyToMany
    @JoinTable(name = "unit_engine_mapping",
            joinColumns = @JoinColumn(name = "unit_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "engine_id", referencedColumnName = "id", nullable = false)
    )
    @ToString.Exclude
    private List<Engine> engineList;

    @ManyToOne
    @JoinColumn(name = "option_id", referencedColumnName = "id", nullable = false)
    private Options options;
}
