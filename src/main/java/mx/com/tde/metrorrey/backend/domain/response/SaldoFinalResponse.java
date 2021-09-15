package mx.com.tde.metrorrey.backend.domain.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import mx.com.tde.metrorrey.backend.persistence.entity.TelventSaldoFinal;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class SaldoFinalResponse extends BaseResponse implements Serializable {
    private TelventSaldoFinal saldoFinal = null;
}
