package mx.com.tde.metrorrey.backend.business;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventEmpleado;
import mx.com.tde.metrorrey.backend.persistence.repository.TelventEmpleadosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ApiEmpleados {

    private final TelventEmpleadosRepo telventEmpleadosRepo;

    @Autowired
    public ApiEmpleados(TelventEmpleadosRepo telventEmpleadosRepo){
        this.telventEmpleadosRepo = telventEmpleadosRepo;
    }

    public TelventEmpleado findByNomina(Integer numEmpleado){
        return telventEmpleadosRepo.findByNomina(numEmpleado);
    }


}
