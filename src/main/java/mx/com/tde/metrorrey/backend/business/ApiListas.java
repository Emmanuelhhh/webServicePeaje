package mx.com.tde.metrorrey.backend.business;

import mx.com.tde.metrorrey.backend.persistence.entity.TelventBlackList;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventWhiteList;
import mx.com.tde.metrorrey.backend.persistence.repository.TelventBlackListRepo;
import mx.com.tde.metrorrey.backend.persistence.repository.TelventWhiteListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class ApiListas {

    private final TelventWhiteListRepo telventWhiteListRepo;
    private final TelventBlackListRepo telventBlackListRepo;

    @Autowired
    public ApiListas(TelventBlackListRepo telventBlackListRepo, TelventWhiteListRepo telventWhiteListRepo){
        this.telventBlackListRepo = telventBlackListRepo;
        this.telventWhiteListRepo = telventWhiteListRepo;
    }

    public Iterable<TelventBlackList> getBlackListByDates(String  dFrom, String dTo) throws ParseException {
        Date from=new SimpleDateFormat("yyyy-MM-dd").parse(dFrom);
        Date to=new SimpleDateFormat("yyyy-MM-dd").parse(dTo);

        return telventBlackListRepo.findByTimeCustomQuery(from, to);
    }


    public Iterable<TelventWhiteList> getWhiteListByDates(String  dFrom, String dTo) throws ParseException  {
        Date from=new SimpleDateFormat("yyyy-MM-dd").parse(dFrom);
        Date to=new SimpleDateFormat("yyyy-MM-dd").parse(dTo);
        return telventWhiteListRepo.findByTimeCustomQuery(from, to);
    }



    public TelventBlackList getBlackListByCsn(String csn) {
          return telventBlackListRepo.findByCsn(csn);
    }
    public TelventWhiteList getWhiteListByCsn(String csn)  {
               return telventWhiteListRepo.findByCsn(csn);
    }
}
