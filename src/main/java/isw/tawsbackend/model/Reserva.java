package isw.tawsbackend.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reserva")
public class Reserva {

    @Id
    @Column(name = "id_reserva")
    private String idReserva;

    @Column(name = "fecha_inicial")
    private java.time.LocalDate fechaInicial;

    @Column(name = "fecha_final")
    private java.time.LocalDate fechaFinal;

    private Integer precio;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Empresa hotel;

}