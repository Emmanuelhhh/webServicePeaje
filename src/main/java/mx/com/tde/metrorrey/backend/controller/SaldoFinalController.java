package mx.com.tde.metrorrey.backend.controller;

import mx.com.tde.metrorrey.backend.domain.response.SaldoFinalResponse;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventSaldoFinal;
import mx.com.tde.metrorrey.backend.business.ApiSaldoFinal;
import mx.com.tde.metrorrey.backend.uitls.ApiConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(ApiConstants.REST_API_VERSION + ApiConstants.SALDO_FINAL_CONTEXT)
@CrossOrigin
public class SaldoFinalController {

    private final ApiSaldoFinal apiSaldoFinal;

    @Autowired
    public SaldoFinalController(ApiSaldoFinal apiSaldoFinal) {
        this.apiSaldoFinal = apiSaldoFinal;
    }

    @GetMapping("/all")
    public ResponseEntity<Iterable<TelventSaldoFinal>> getAll() {
        Iterable<TelventSaldoFinal> iterableResponse = apiSaldoFinal.getAll();

        return ResponseEntity.ok(iterableResponse);
    }

    @GetMapping
    public ResponseEntity<SaldoFinalResponse> get(@RequestParam Optional<String> pcn, @RequestParam Optional<String> csn, @RequestParam Optional<String> item) {
        SaldoFinalResponse response = apiSaldoFinal.get(pcn.orElse(null), csn.orElse(null), item.orElse(null));

        return ResponseEntity.ok(response);

    }
}
