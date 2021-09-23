package mx.com.tde.metrorrey.backend.business;


import mx.com.tde.metrorrey.backend.domain.response.SaldoFinalResponse;
import mx.com.tde.metrorrey.backend.persistence.repository.TelventSaldoFinalRepo;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventSaldoFinal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApiSaldoFinal {


    private final TelventSaldoFinalRepo telventSaldoFinalRepo;

    @Autowired
    public ApiSaldoFinal(TelventSaldoFinalRepo telventSaldoFinalRepo) {
        this.telventSaldoFinalRepo = telventSaldoFinalRepo;
    }

    public Iterable getAll() {
        return telventSaldoFinalRepo.findAll();
    }

    public SaldoFinalResponse get(String pcn, String csn, String item) {
        SaldoFinalResponse response = new SaldoFinalResponse();
        Optional<TelventSaldoFinal> optionalSaldoFinal
                = telventSaldoFinalRepo.findTopByPcnOrCsnIgnoreCaseOrItemOrderByFechaDescHoraDesc(pcn, csn, item);

        if (optionalSaldoFinal.isEmpty()) {
            response.setStatus(404);
            response.setMessage("ERROR");
            response.setDescription("No se ha encontrado transaccion");
            return response;
        }

        response.setStatus(200);
        response.setMessage("OK");
        response.setDescription("Se ha encontrado una transacccion");
        response.setSaldoFinal(optionalSaldoFinal.get());

        return response;
    }

    public TelventSaldoFinal getByPcn(String pcn) {
        return telventSaldoFinalRepo.findByPcn(pcn);
    }

    public TelventSaldoFinal getByCsn(String csn) {
        return telventSaldoFinalRepo.findByCsn(csn);
    }

}
