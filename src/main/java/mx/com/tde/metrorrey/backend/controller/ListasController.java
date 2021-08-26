package mx.com.tde.metrorrey.backend.controller;

import mx.com.tde.metrorrey.backend.business.ApiListas;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventBlackList;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventWhiteList;
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
@RequestMapping(ApiConstants.REST_API_VERSION + ApiConstants.LISTAS_CONTEXT)
@CrossOrigin
public class ListasController {

    private final ApiListas apiListas;

    @Autowired
    public ListasController(ApiListas apiListas) {
        this.apiListas = apiListas;
    }

    @GetMapping("/blackList/{fechaInicio}/{fechaFin}")
    public ResponseEntity<Iterable<TelventBlackList>> getBlackListByDates(@PathVariable String fechaInicio, @PathVariable String fechaFin) throws ParseException {
        Iterable<TelventBlackList> iterableResponse = apiListas.getBlackListByDates(fechaInicio, fechaFin);

        return ResponseEntity.ok(iterableResponse);
    }

    @GetMapping("/whiteList/{fechaInicio}/{fechaFin}")
    public ResponseEntity<Iterable<TelventWhiteList>> getWhiteListByDates(@PathVariable String fechaInicio, @PathVariable String fechaFin) throws ParseException {
        Iterable<TelventWhiteList> iterableResponse = apiListas.getWhiteListByDates(fechaInicio, fechaFin);

        return ResponseEntity.ok(iterableResponse);
    }


    @GetMapping("/blackList/{csn}")
    public ResponseEntity<TelventBlackList> getBlackListByCsn(@PathVariable String csn) {

        TelventBlackList response = apiListas.getBlackListByCsn(csn);

        return ResponseEntity.ok(response);

    }

    @GetMapping("/whiteList/{csn}")
    public ResponseEntity<TelventWhiteList> getWhiteListByCsn(@PathVariable String csn) {

        TelventWhiteList response = apiListas.getWhiteListByCsn(csn);
         System.out.println(response.toString());
        return ResponseEntity.ok(response);
    }
}