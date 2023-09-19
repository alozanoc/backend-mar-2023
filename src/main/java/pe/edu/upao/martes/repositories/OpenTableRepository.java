package pe.edu.upao.martes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upao.martes.models.OpenTable;

import java.util.ArrayList;

@Repository
public interface OpenTableRepository extends JpaRepository<OpenTable, Long> {


}
