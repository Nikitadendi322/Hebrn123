package model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode(of = "city id")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int city_id;
    private String city_name;
    @OneToMany(mappedBy = "city",cascade = CascadeType.ALL)
    private List<Employee>employees;


    public Collection<?> getEmployees(List<Employee> employee1) {
        return null;
    }
}
