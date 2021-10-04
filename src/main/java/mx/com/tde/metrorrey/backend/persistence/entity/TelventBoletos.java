package mx.com.tde.metrorrey.backend.persistence.entity;


import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Immutable
@Table(name = "stcl3_boletos")
public class TelventBoletos  implements Serializable{

    @Id
    @Column(name = "Codigo")
    private String codigo;

    @Column(name ="Linea")
    private String linea;

    @Column(name = "Estacion")
    private String estacion;

    @Column(name = "Fecha")
    private Date fecha;

    @Column(name = "Hora")
    private short hora;

    @Column(name = "Tarjeta")
    private String tarjeta;

    @Column(name = "Tarjetas_Con_Costo")
    private Integer tarjetaConCosto;

    @Column(name = "Tarjetas_Sin_Costo")
    private Integer tarjetaSinCosto;

    @Column(name = "id")
    private String id;

}
