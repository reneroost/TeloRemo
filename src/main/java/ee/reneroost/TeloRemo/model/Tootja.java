package ee.reneroost.TeloRemo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Tootja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nimi;
    private String riik;
    private String OS;
    private String lyhitutvustus;

    @OneToMany
    private List<TelefoniMudel> mudelid = new ArrayList<>();

}
