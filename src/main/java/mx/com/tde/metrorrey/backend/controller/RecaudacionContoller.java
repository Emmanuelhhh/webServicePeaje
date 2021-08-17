package mx.com.tde.metrorrey.backend.controller;

import mx.com.tde.metrorrey.backend.business.ApiRecaudacion;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventRecaudacion;
import mx.com.tde.metrorrey.backend.uitls.ApiConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(ApiConstants.REST_API_VERSION + ApiConstants.RECAUDACION_CONTEXT)
@CrossOrigin
public class RecaudacionContoller {

    private final ApiRecaudacion apiRecaudacion;

    @Autowired
    public RecaudacionContoller(ApiRecaudacion apiRecaudacion){
        this.apiRecaudacion = apiRecaudacion;
    }
    @PostMapping
    public ResponseEntity<TelventRecaudacion> saveRecaudacion(@RequestBody TelventRecaudacion recaudacion) {
        TelventRecaudacion response =  apiRecaudacion.setRecaudacion(recaudacion);
        return ResponseEntity.ok(response);
    }

}