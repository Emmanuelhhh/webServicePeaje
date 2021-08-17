package mx.com.tde.metrorrey.backend.persistence.repository;

import mx.com.tde.metrorrey.backend.persistence.entity.TelventBlackList;
import org.springframework.data.repository.CrudRepository;

public interface TelventBlackListRepo extends CrudRepository<TelventBlackList, String>{

    TelventBlackList findByCsn(String csn);

}