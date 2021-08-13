package mx.com.tde.metrorrey.backend.persistence.repository;



import mx.com.tde.metrorrey.backend.persistence.entity.TelventSaldoFinal;
import org.springframework.data.repository.CrudRepository;

public interface TelventSaldoFinalRepo extends CrudRepository<TelventSaldoFinal, String> {


    TelventSaldoFinal findByPcn(String pcn);
    TelventSaldoFinal findByCsn(String csn);
}
