package ee.reneroost.TeloRemo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class TehtudTooLogi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int kogus;
    private double hindTeenus;
    private String kuupaevKell;

    @ManyToMany
    @JoinTable(name = "logi_varuosa",
    joinColumns = { @JoinColumn(name = "fk_logi") },
    inverseJoinColumns = { @JoinColumn(name = "fk_varuosa") })
    private Set<Varuosa> varosad = new HashSet<>();

    public void addVaruosa(Varuosa v) {
        this.varosad.add(v);
        v.getLogid().add(this);
    }

    public void removeVaruosa(Varuosa v) {
        this.varosad.remove(v);
        v.getLogid().remove(this);
    }
}
