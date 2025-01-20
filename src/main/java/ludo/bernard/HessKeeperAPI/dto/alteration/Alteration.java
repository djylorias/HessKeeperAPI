package ludo.bernard.HessKeeperAPI.dto.alteration;

import java.time.LocalDate;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import ludo.bernard.HessKeeperAPI.dto.User;

@Entity
@Data
class Alteration {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ano;

    @ManyToOne
    @JoinColumn(name = "email")
    private User user;

    private String title;

    private Double amount;

    @ManyToOne
    @JoinColumn(name = "type")
    private AlterationType type;

    @NotNull
    private LocalDate startDate;

    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "regularity")
    private AlterationRegularity regularity;

    @Column(columnDefinition = "TEXT")
    private String description;

    @ColumnDefault("false")
    private boolean outdated = false;

}