package mx.com.tde.metrorrey.backend.persistence.repository;

import mx.com.tde.metrorrey.backend.persistence.entity.TelventBlackList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface TelventBlackListRepo extends CrudRepository<TelventBlackList, String>{

    TelventBlackList findByCsn(String csn);

         @Query(value = "select * from telvent_blacklist where fecha >= :dFrom AND fecha <= :dTo", nativeQuery = true)
        Iterable<TelventBlackList> findByTimeCustomQuery(Date dFrom, Date dTo);

}