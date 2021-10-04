package mx.com.tde.metrorrey.backend.persistence.entity;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Data
@Entity
@Table(name = "stcl3_cte")
public class TelventRecaudacion implements Serializable {

    @Id
    @Column(name = "Codigo")
    private String codigo;

    @Column(name = "Linea")
    private String linea;

    @Column(name = "Estacion")
    private String estacion;

    @Column(name = "Numero_de_Mera")
    private Integer numeroMera;

    @Column(name = "Fecha")
    private Date fecha;

    @Column(name = "Hora")
    private Integer hora;

    @Column(name = "Cantidad_de_Monedas")
    private Integer  cantidadMonedas;

    @Column(name = "Valor_Moneda")
    private Double valorMoneda;

    @Column(name = "Monto")
    private Double monto;

    @Column(name = "Tipo_de_Moneda")
    private String tipoMoneda;

    @Column(name = "Numero_de_Corte")
    private Integer numeroCorte;

    @Column(name = "Personal")
    private String personal;

    @Column(name = "id")
    private String id;

}
