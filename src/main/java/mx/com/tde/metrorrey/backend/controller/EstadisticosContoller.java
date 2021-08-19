package mx.com.tde.metrorrey.backend.controller;

import mx.com.tde.metrorrey.backend.business.ApiEstadisticos;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventBoletos;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventEntradas;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventRecaudacion;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventVta;
import mx.com.tde.metrorrey.backend.uitls.ApiConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(ApiConstants.REST_API_VERSION + ApiConstants.ESTADISTICOS_CONTEXT)
@CrossOrigin
public class EstadisticosContoller {

    private final ApiEstadisticos apiEstadisticos;

    @Autowired
    public EstadisticosContoller(ApiEstadisticos apiEstadisticos){
        this.apiEstadisticos = apiEstadisticos;
    }


    @PostMapping("/recaudacion")
    public ResponseEntity<TelventRecaudacion> saveRecaudacion(@RequestBody TelventRecaudacion recaudacion) {
        TelventRecaudacion response =  apiEstadisticos.setRecaudacion(recaudacion);
        return ResponseEntity.ok(response);
    }


    @PostMapping("/ventas")
    public ResponseEntity<TelventVta> saveVenta(@RequestBody TelventVta telventVta){
        TelventVta response = apiEstadisticos.setVta(telventVta);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/entradas")
    public ResponseEntity<TelventEntradas> saveEntradas(@RequestBody TelventEntradas telventEntradas){
        TelventEntradas response = apiEstadisticos.setEntradas(telventEntradas);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/boletos")
    public ResponseEntity<TelventBoletos> saveBoleto(@RequestBody TelventBoletos telventBoletos){
        TelventBoletos response = apiEstadisticos.setBoletos(telventBoletos);
        return ResponseEntity.ok(response);
    }

}