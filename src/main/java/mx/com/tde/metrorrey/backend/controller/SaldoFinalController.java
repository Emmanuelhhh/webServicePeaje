package mx.com.tde.metrorrey.backend.controller;

import mx.com.tde.metrorrey.backend.persistence.entity.TelventSaldoFinal;
import mx.com.tde.metrorrey.backend.business.ApiSaldoFinal;
import mx.com.tde.metrorrey.backend.uitls.ApiConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(ApiConstants.REST_API_VERSION + ApiConstants.SALDO_FINAL_CONTEXT)
@CrossOrigin
public class SaldoFinalController {

    private final ApiSaldoFinal apiSaldoFinal;

    @Autowired
    public SaldoFinalController(ApiSaldoFinal apiSaldoFinal){
        this.apiSaldoFinal = apiSaldoFinal;
    }

    @GetMapping
    public ResponseEntity<Iterable<TelventSaldoFinal>> getAll() {
        Iterable<TelventSaldoFinal> iterableResponse = apiSaldoFinal.getAll();

        return ResponseEntity.ok(iterableResponse);
    }
    @GetMapping("/PCN/{pcn}")
    public ResponseEntity<TelventSaldoFinal> getByPcn(@PathVariable String pcn){
        TelventSaldoFinal response = apiSaldoFinal.getByPcn(pcn);

        return ResponseEntity.ok(response);

    }

    @GetMapping("/CSN/{csn}")
    public ResponseEntity<TelventSaldoFinal> getByCsn(@PathVariable String csn){
        TelventSaldoFinal response = apiSaldoFinal.getByCsn(csn);

        return ResponseEntity.ok(response);

    }
}
