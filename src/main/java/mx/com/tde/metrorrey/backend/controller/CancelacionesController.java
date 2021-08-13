package mx.com.tde.metrorrey.backend.controller;

import mx.com.tde.metrorrey.backend.business.ApiCancelaciones;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventCancelaciones;
import mx.com.tde.metrorrey.backend.uitls.ApiConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;

@Controller
@RequestMapping(ApiConstants.REST_API_VERSION + ApiConstants.CANCELACIONES_CONTEXT)
@CrossOrigin
public class CancelacionesController {

    private final ApiCancelaciones apiCancelaciones;

    @Autowired
    public CancelacionesController(ApiCancelaciones apiCancelaciones){
        this.apiCancelaciones = apiCancelaciones;
    }

    @GetMapping
    public ResponseEntity<Iterable<TelventCancelaciones>> getAll() {
        Iterable<TelventCancelaciones> iterableResponse = apiCancelaciones.getAll();

        return ResponseEntity.ok(iterableResponse);
    }

    @GetMapping("/{No_Vale}/{fecha}")
    public ResponseEntity<TelventCancelaciones> getByNoVale(@PathVariable Integer No_Vale, @PathVariable String fecha) throws ParseException {
        System.out.println("Entro al controller");
        TelventCancelaciones response = apiCancelaciones.getByNoVale(No_Vale, fecha);

        return ResponseEntity.ok(response);

    }
}
