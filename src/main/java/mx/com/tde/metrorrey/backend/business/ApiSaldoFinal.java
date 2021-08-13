package mx.com.tde.metrorrey.backend.business;


import mx.com.tde.metrorrey.backend.persistence.repository.TelventSaldoFinalRepo;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventSaldoFinal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiSaldoFinal {


    private final TelventSaldoFinalRepo telventSaldoFinalRepo;

    @Autowired
    public ApiSaldoFinal( TelventSaldoFinalRepo  telventSaldoFinalRepo ) {
        this.telventSaldoFinalRepo = telventSaldoFinalRepo;
    }
    public Iterable getAll() {    return telventSaldoFinalRepo.findAll();      }
    public TelventSaldoFinal getByPcn(String pcn) {    return telventSaldoFinalRepo.findByPcn(pcn);      }

    public TelventSaldoFinal getByCsn(String csn){return telventSaldoFinalRepo.findByCsn(csn);            }

}
