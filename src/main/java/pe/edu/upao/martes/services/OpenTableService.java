package pe.edu.upao.martes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upao.martes.models.OpenTable;
import pe.edu.upao.martes.repositories.OpenTableRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class OpenTableService {

    @Autowired
    OpenTableRepository openTableRepository;

    public List<OpenTable> list() {
        return openTableRepository.findAll();
    }

    public OpenTable save(OpenTable openTable) {
        return openTableRepository.save(openTable);
    }
}
