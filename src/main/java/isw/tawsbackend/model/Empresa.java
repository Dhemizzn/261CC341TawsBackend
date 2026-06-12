import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "empresa")
public class Empresa {

    @Id
    @Column(name = "id_empresa")
    private String idEmpresa;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "direccion")
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "ruc")
    private Ruc ruc;

    @OneToMany(mappedBy = "proveedor")
    private List<Turismo> turismos;

}