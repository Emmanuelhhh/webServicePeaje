package mx.com.tde.metrorrey.backend.business;

import mx.com.tde.metrorrey.backend.persistence.entity.TelventBlackList;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventWhiteList;
import mx.com.tde.metrorrey.backend.persistence.repository.TelventBlackListRepo;
import mx.com.tde.metrorrey.backend.persistence.repository.TelventWhiteListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ApiListas {

    private final TelventWhiteListRepo telventWhiteListRepo;
    private final TelventBlackListRepo telventBlackListRepo;

    @Autowired
    public ApiListas(TelventBlackListRepo telventBlackListRepo, TelventWhiteListRepo telventWhiteListRepo){
        this.telventBlackListRepo = telventBlackListRepo;
        this.telventWhiteListRepo = telventWhiteListRepo;
    }
    public Iterable<TelventBlackList> getAllBlackList() {
        return telventBlackListRepo.findAll();
    }
    public Iterable<TelventWhiteList> getAllWhiteList() {
        return telventWhiteListRepo.findAll();
    }

    public TelventBlackList getBlackListByCsn(String csn) {
          return telventBlackListRepo.findByCsn(csn);
    }
    public TelventWhiteList getWhiteListByCsn(String csn)  {
               return telventWhiteListRepo.findByCsn(csn);
    }
}
