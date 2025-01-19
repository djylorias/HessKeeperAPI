package ludo.bernard.HessKeeperAPI.dto.alteration;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
class Alteration {

    @Id
    private int ano;
    
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

}