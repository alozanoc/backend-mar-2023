package pe.edu.upao.martes.controllers.serializers;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OpenTableSerializer {
    String name;
    Integer capacity;
}
