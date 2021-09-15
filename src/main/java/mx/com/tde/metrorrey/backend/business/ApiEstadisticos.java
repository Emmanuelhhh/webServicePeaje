package mx.com.tde.metrorrey.backend.business;

import mx.com.tde.metrorrey.backend.domain.response.BaseResponse;
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

    public BaseResponse setRecaudacion(TelventRecaudacion telventRecaudacion) {
        BaseResponse response = new BaseResponse();
        try {
            telventRecaudacionRepo.save(telventRecaudacion);

            response.setStatus(200);
        } catch (Exception e) {
            response.setStatus(500);
        }
        return response;
    }

    public BaseResponse setBoletos(TelventBoletos telventBoletos) {
        BaseResponse response = new BaseResponse();
        try {
            telventBoletosRepo.save(telventBoletos);
            response.setStatus(200);
        } catch (Exception e) {
            response.setStatus(500);
        }
        return response;
    }

    public BaseResponse setVta(TelventVta telventVta) {
        BaseResponse response = new BaseResponse();
        try {
            telventVtaRepo.save(telventVta);
            response.setStatus(200);
        } catch (Exception e) {
            response.setStatus(500);
        }
        return response;
    }

    public BaseResponse setEntradas(TelventEntradas telventEntradas) {
        BaseResponse response = new BaseResponse();
        try {
            telventEntradasRepo.save(telventEntradas);
            response.setStatus(200);
            response.setDescription("OK");
        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(500);
            response.setDescription(e.getMessage());
        }
        return response;
    }
}