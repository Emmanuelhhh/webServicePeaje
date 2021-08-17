package mx.com.tde.metrorrey.backend.persistence.entity;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Data
@Entity
@Immutable
@Table(name = "telvent_blacklist")
public class TelventBlackList  implements Serializable {

    @Id
    @Column(name = "item")
    private String item;

    @Column(name = "id_tipo_tarjeta")
    private String idTipoTarjeta;

    @Column(name = "tipo_tarjeta")
    private String tarjeta;

    @Column(name = "csn") //por este se realizan las busquedas
    private String csn;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "hora")
    private Short  hora;

    @Column(name = "id_razon")
    private String idRazon;

    @Column(name = "razon")
    private String razon;
}
