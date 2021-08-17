package mx.com.tde.metrorrey.backend.persistence.entity;


import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Data
@Entity
@Immutable
@Table(name = "telvent_whitelist")
public class TelventWhiteList implements Serializable  {

    @Id
    @Column(name = "item")
    private String item;

    @Column(name = "csn")
    private String csn;


    @Column(name = "pcn")
    private String pcn;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "hora")
    private Integer hora;

    @Column(name = "id_tipo_tarjeta")
    private String idTipoTarjeta;

    @Column(name = "tipo_tarjeta")
    private String tipoTarjeta;
    }
