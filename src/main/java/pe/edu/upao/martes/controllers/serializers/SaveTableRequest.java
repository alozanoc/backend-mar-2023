package pe.edu.upao.martes.controllers.serializers;

import lombok.Data;

@Data
public class SaveTableRequest {
    String name;
    Integer capacity;
}
