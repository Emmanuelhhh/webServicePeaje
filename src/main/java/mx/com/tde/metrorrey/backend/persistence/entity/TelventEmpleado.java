package mx.com.tde.metrorrey.backend.persistence.entity;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Data
@Entity
@Immutable
@Table(name = "telvent_view_datos_empleados")
public class TelventEmpleado implements Serializable {


    @Id
    @Column(name = "nomina")
    private Integer nomina;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "curp")
    private String curp;

    @Column(name = "IMSS")
    private String imss;

    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;

    @Column(name = "tel_casa")
    private String numTel;

    @Column(name = "contacto")
    private String contacto;

    @Column(name = "tel_contacto")
    private String numContacto;

}
