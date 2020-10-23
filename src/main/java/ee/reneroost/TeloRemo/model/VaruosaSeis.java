package ee.reneroost.TeloRemo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class VaruosaSeis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int hulk;

    @ManyToOne
    private Esindus esindus;

    @ManyToOne
    private Varuosa varuosa;
}
