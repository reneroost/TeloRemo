package ee.reneroost.TeloRemo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class TelefoniMudel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nimi;
    private String valjatulekuAeg;
    private double hindAlgne;
    private double hindPraegune;

    @ManyToOne
    private Tootja tootja;

    @OneToMany
    private List<Varuosa> varuosad = new ArrayList<>();
}
