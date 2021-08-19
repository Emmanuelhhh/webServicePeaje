package mx.com.tde.metrorrey.backend.business;

import mx.com.tde.metrorrey.backend.persistence.entity.TelventBoletos;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventRecaudacion;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventVta;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventEntradas;
import mx.com.tde.metrorrey.backend.persistence.repository.TelventBoletosRepo;
import mx.com.tde.metrorrey.backend.persistence.repository.TelventEntradasRepo;
import mx.com.tde.metrorrey.backend.persistence.repository.TelventRecaudacionRepo;
import mx.com.tde.metrorrey.backend.persistence.repository.TelventVtaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiEstadisticos {

    private final TelventRecaudacionRepo telventRecaudacionRepo;
    private final TelventBoletosRepo telventBoletosRepo;
    private final TelventVtaRepo telventVtaRepo;
    private final TelventEntradasRepo telventEntradasRepo;

    @Autowired
    public ApiEstadisticos(TelventRecaudacionRepo telventRecaudacionRepo, TelventBoletosRepo telventBoletosRepo, TelventVtaRepo telventVtaRepo, TelventEntradasRepo telventEntradasRepo) {
        this.telventRecaudacionRepo = telventRecaudacionRepo;
        this.telventBoletosRepo = telventBoletosRepo;
        this.telventVtaRepo = telventVtaRepo;
        this.telventEntradasRepo = telventEntradasRepo;

    }

    public TelventRecaudacion setRecaudacion(TelventRecaudacion telventRecaudacion) {
        return telventRecaudacionRepo.save(telventRecaudacion);
    }
    public TelventBoletos setBoletos(TelventBoletos telventBoletos){
        return  telventBoletosRepo.save(telventBoletos);
    }

    }
}