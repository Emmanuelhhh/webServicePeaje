package mx.com.tde.metrorrey.backend.persistence.repository;

import mx.com.tde.metrorrey.backend.persistence.entity.TelventWhiteList;
import org.springframework.data.repository.CrudRepository;

public interface TelventWhiteListRepo extends CrudRepository<TelventWhiteList, String> {

    TelventWhiteList findByCsn(String csn);
}