package mx.com.tde.metrorrey.backend.persistence.repository;

import mx.com.tde.metrorrey.backend.persistence.entity.TelventWhiteList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface TelventWhiteListRepo extends CrudRepository<TelventWhiteList, String> {

    TelventWhiteList findByCsn(String csn);
    @Query(value ="select * from telvent_whitelist where fecha >= :dFrom and fecha <= :dTo ORDER BY fecha desc", nativeQuery = true)
    Iterable<TelventWhiteList> findByTimeCustomQuery(Date dFrom, Date dTo);
}