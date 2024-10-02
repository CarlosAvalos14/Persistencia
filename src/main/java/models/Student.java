package models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "students")
@Getter
@Setter
public class Student {
@Id
    private long id;
    private String name;
    private String program;

}
