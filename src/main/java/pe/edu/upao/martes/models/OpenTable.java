package pe.edu.upao.martes.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "open_table")
@Entity
public class OpenTable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;

    String name;
    int capacity;
}
