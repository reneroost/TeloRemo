package ee.reneroost.TeloRemo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Esindus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nimi;
    private String linn;
    private String aadress;

    @OneToMany
    private List<VaruosaSeis> varuosiEsindustes = new ArrayList<>();
}
