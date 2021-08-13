package mx.com.tde.metrorrey.backend.business;

import mx.com.tde.metrorrey.backend.persistence.entity.TelventCancelaciones;
import mx.com.tde.metrorrey.backend.persistence.repository.TelventCancelacionesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
@Service
public class ApiCancelaciones {

    private final TelventCancelacionesRepo telventCancelacionesRepo;

    @Autowired
    public ApiCancelaciones(TelventCancelacionesRepo telventCancelacionesRepo) {
        this.telventCancelacionesRepo = telventCancelacionesRepo;
    }

    public Iterable<TelventCancelaciones> getAll() {
        return telventCancelacionesRepo.findAll();
    }

    public TelventCancelaciones getByNoVale(Integer noVale, String fecha) throws ParseException {
        Date date=new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
        System.out.println("Entro al app" +date.toString());
        return telventCancelacionesRepo.findByNoVale(noVale, date);
    }
}
