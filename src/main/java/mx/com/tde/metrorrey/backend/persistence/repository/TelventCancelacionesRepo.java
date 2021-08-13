package mx.com.tde.metrorrey.backend.persistence.repository;

import mx.com.tde.metrorrey.backend.persistence.entity.TelventCancelaciones;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface TelventCancelacionesRepo extends CrudRepository<TelventCancelaciones, Integer> {

    @Query(value = "Select * from telvent_cancelaciones where No_Vale = :noVale  AND Fecha = :fecha ", nativeQuery = true)
    TelventCancelaciones findByNoVale(Integer noVale, Date fecha);


}
