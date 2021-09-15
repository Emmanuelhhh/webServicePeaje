package mx.com.tde.metrorrey.backend.domain.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse implements Serializable {
    private Integer code;
    private Integer status;
    private String message;
    private String description;
}
