package mx.com.tde.metrorrey.backend.persistence.entity;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Immutable
@Table(name = "telvent_cancelaciones")
public class TelventCancelaciones implements Serializable {

    @Id
    @Column(name = "Codigo")
    private String codigo;

    @Column(name = "Linea")
    private String linea;

    @Column(name = "Estacion")
    private String estacion;

    @Column(name = "Numero_de_Mera")
    private Short numeroMera;

    @Column(name = "Fecha")
    private Date fecha;

    @Column(name = "Hora")
    private Short hora;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "No_Vale")
    private Integer noVale;

    @Column(name = "Tipo")
    private String tipo;

    @Column(name = "Monto")
    private Double monto;

    @Column(name = "Id")
    private String id;
}
