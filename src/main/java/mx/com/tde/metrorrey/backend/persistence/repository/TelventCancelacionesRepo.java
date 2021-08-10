package mx.com.tde.metrorrey.backend.persistence.repository;

import mx.com.tde.metrorrey.backend.persistence.entity.TelventCancelaciones;
import org.springframework.data.repository.CrudRepository;

public interface TelventCancelacionesRepo extends CrudRepository<TelventCancelaciones, String> {
    TelventCancelaciones findByCodigo(String code);
}
