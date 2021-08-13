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
@Table(name = "telvent_saldo_final")
public class TelventSaldoFinal implements Serializable {

    @Id
    @Column(name = "item")
    private String item;

    @Column(name = "tipo_tarjeta")
    private String tipo_tarjeta;

    @Column(name = "pcn")
    private String pcn;

    @Column(name ="csn" )
    private String csn;

    @Column(name = "linea")
    private String linea;

    @Column(name = "estacion")
    private String estacion;

    @Column(name = "equipo")
    private String equipo;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "hora")
    private Short hora;

    @Column(name = "saldo_dinero")
    private Double saldo_dinero;

    @Column(name = "saldo_regalo")
    private Double saldo_regalo;

    @Column(name = "id_estacion")
    private String id_estacion;
}
