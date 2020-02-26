package guru.springframework.jpaonetomany.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="mangers")
public class Manger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
