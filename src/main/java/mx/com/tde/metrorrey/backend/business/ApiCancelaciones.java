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

    public TelventCancelaciones getByCodigo(String codigo) throws ParseException {
        return telventCancelacionesRepo.findByCodigo(codigo);
    }
}
