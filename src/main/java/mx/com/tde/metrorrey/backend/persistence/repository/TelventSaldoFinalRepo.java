package mx.com.tde.metrorrey.backend.persistence.repository;



import mx.com.tde.metrorrey.backend.persistence.entity.TelventSaldoFinal;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TelventSaldoFinalRepo extends CrudRepository<TelventSaldoFinal, String> {


    TelventSaldoFinal findByPcn(String pcn);
    TelventSaldoFinal findByCsn(String csn);

    Optional<TelventSaldoFinal> findTopByPcnOrCsnIgnoreCaseOrItemOrderByFechaDescHoraDesc(String pcn, String csn, String item);
}
