package mx.com.tde.metrorrey.backend.controller;

import mx.com.tde.metrorrey.backend.business.ApiEstadisticos;
import mx.com.tde.metrorrey.backend.domain.response.BaseResponse;
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
    public ResponseEntity<BaseResponse> saveRecaudacion(@RequestBody TelventRecaudacion recaudacion) {
        BaseResponse response =  apiEstadisticos.setRecaudacion(recaudacion);
        return ResponseEntity.ok(response);
    }

    /**
     * Utiliza guarda ventas y recargas
     * @param telventVta
     * @return
     */
    @PostMapping("/ventas")
    public ResponseEntity<BaseResponse> saveVenta(@RequestBody TelventVta telventVta){
        BaseResponse response = apiEstadisticos.setVta(telventVta);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/entradas")
    public ResponseEntity<BaseResponse> saveEntradas(@RequestBody TelventEntradas telventEntradas){
        BaseResponse response = apiEstadisticos.setEntradas(telventEntradas);
        return ResponseEntity.ok(response);
    }


    @PostMapping("/boletos")
    public ResponseEntity<BaseResponse> saveBoleto(@RequestBody TelventBoletos telventBoletos){
        BaseResponse response = apiEstadisticos.setBoletos(telventBoletos);
        return ResponseEntity.ok(response);
    }

}