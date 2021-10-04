package mx.com.tde.metrorrey.backend.persistence.entity;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Data
@Entity
@Table(name = "stcl3_vta")
public class TelventVta implements Serializable {

    @Id
    @Column(name = "Codigo")
    private String codigo;

    @Column(name = "Linea")
    private String linea ;

    @Column(name = "Estacion")
    private String estacion ;

    @Column(name = "NUMERO_DE_MERA")
    private Short numeroMera;

    @Column(name = "Fecha")
    private Date fecha;

    @Column(name = "Hora")
    private Short hora;

    @Column(name = "Venta_Titulo")
    private Double ventaTitulo;

    @Column(name = "Venta_Saldo_Titulo")
    private Double ventaSaldoTitulo;

    @Column(name = "Recarga_Saldo")
    private Double recargaSaldo;

    @Column(name = "Venta_Total")
    private Double ventaTotal;

    @Column(name = "Saldo_de_Regalo")
    private Double saldoRegalo;

    @Column(name = "Costo_Promedio")
    private Double costoPromedio;

    @Column (name = "id")
    private String id;
}
