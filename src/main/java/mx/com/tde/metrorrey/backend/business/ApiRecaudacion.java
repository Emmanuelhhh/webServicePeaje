package mx.com.tde.metrorrey.backend.business;

import mx.com.tde.metrorrey.backend.persistence.entity.TelventRecaudacion;
import mx.com.tde.metrorrey.backend.persistence.repository.TelventRecaudacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiRecaudacion {

    private final TelventRecaudacionRepo telventRecaudacionRepo;

    @Autowired
    public ApiRecaudacion(TelventRecaudacionRepo telventRecaudacionRepo) {
        this.telventRecaudacionRepo = telventRecaudacionRepo;
    }

    public TelventRecaudacion setRecaudacion(TelventRecaudacion telventRecaudacion) {
        return telventRecaudacionRepo.save(telventRecaudacion);

    }
}