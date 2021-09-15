package mx.com.tde.metrorrey.backend.persistence.entity;


import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "telvent_entrada")
public class TelventEntradas implements Serializable {

    @Id
    @Column(name = "Codigo")
    private String codigo;

    @Column(name ="Linea")
    private String linea;

    @Column(name ="Estacion")
    private String estacion;

    @Column(name = "Equipo")
    private String equipo;

    @Column(name = "Tarjeta")
    private String tarjeta;

    @Column(name = "Fecha")
    private Date fecha;

    @Column(name = "Hora")
    private Short hora;

    @Column(name = "Entradas")
    private Integer entradas;

    @Column(name = "id")
    private String id;
}
