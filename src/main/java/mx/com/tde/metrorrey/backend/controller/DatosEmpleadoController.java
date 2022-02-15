package mx.com.tde.metrorrey.backend.controller;

import mx.com.tde.metrorrey.backend.business.ApiEmpleados;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventEmpleado;
import mx.com.tde.metrorrey.backend.uitls.ApiConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.View;

import java.util.List;


@Controller
@RequestMapping(ApiConstants.REST_API_VERSION + ApiConstants.EMPLEADOS_CONTEXT)
@CrossOrigin
public class DatosEmpleadoController {

    private final ApiEmpleados apiEmpleados;

    @Autowired
    public DatosEmpleadoController(ApiEmpleados apiEmpleados){
        this.apiEmpleados = apiEmpleados;
    }

    @GetMapping("/{numEmpleado}")
    public ResponseEntity<TelventEmpleado> getDatosEmpleado(@PathVariable Integer numEmpleado) {
        TelventEmpleado response = apiEmpleados.findByNomina(numEmpleado);
        return ResponseEntity.ok(response);
    }
}
