package ee.reneroost.TeloRemo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Varuosa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    double hindArtikkel;
    double hindTeenus;
    int kogus;

    @ManyToOne
    private TelefoniMudel mudel;

    @ManyToOne
    private VaruosaLiik liik;

    @OneToMany
    private List<VaruosaSeis> seisud = new ArrayList<>();

    @ManyToMany(mappedBy = "varuosad")
    private Set<TehtudTooLogi> logid = new HashSet<>();
}
