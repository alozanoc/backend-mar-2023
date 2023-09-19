package pe.edu.upao.martes.repositories;

import org.springframework.stereotype.Repository;
import pe.edu.upao.martes.models.OpenTable;

import java.util.ArrayList;

// @Repository
public class OpenTableRepositoryArray implements IOpenTableRepository {

    private static ArrayList<OpenTable> tablesList = new ArrayList<>();


    @Override
    public ArrayList<OpenTable> list() {
        return tablesList;
    }

    @Override
    public OpenTable save(OpenTable openTable) {
        tablesList.add(openTable);
        return openTable;
    }
}
