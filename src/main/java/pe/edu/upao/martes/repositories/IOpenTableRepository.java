package pe.edu.upao.martes.repositories;

import pe.edu.upao.martes.models.OpenTable;

import java.util.ArrayList;

public interface IOpenTableRepository {
    ArrayList<OpenTable> list();

    OpenTable save(OpenTable openTable);
}
