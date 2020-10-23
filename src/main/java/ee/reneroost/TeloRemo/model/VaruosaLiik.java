package ee.reneroost.TeloRemo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class VaruosaLiik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nimetusVaruosa;
    private String nimetusTeenus;

    @OneToMany
    private List<Varuosa> varuosad = new ArrayList<>();

}
