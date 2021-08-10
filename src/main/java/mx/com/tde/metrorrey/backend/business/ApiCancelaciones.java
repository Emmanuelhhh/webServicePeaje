package mx.com.tde.metrorrey.backend.business;

import mx.com.tde.metrorrey.backend.persistence.entity.TelventCancelaciones;
import mx.com.tde.metrorrey.backend.persistence.repository.TelventCancelacionesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public TelventCancelaciones getByCode(String code) {
        return telventCancelacionesRepo.findByCodigo(code);
    }
}
