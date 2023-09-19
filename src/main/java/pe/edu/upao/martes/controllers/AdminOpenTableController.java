package pe.edu.upao.martes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upao.martes.controllers.serializers.OpenTableSerializer;
import pe.edu.upao.martes.controllers.serializers.SaveTableRequest;
import pe.edu.upao.martes.controllers.serializers.SaveTableResponse;
import pe.edu.upao.martes.models.OpenTable;
import pe.edu.upao.martes.services.OpenTableService;

import java.util.List;

@RestController
@RequestMapping("open-tables")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminOpenTableController {

    @Autowired OpenTableService openTableService;

    @GetMapping("/")
    public List<OpenTableSerializer> listTables() {
        return openTableService.list()
                .stream()
                .map((it) -> new OpenTableSerializer(it.getName(), it.getCapacity()))
                .toList();
    }

    @PostMapping("/")
    public SaveTableResponse saveTable(@RequestBody SaveTableRequest request) {
        openTableService.save(new OpenTable(null, request.getName(), request.getCapacity()));
        return new SaveTableResponse("Guardado!");
    }
}
