package model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "employee")
@EqualsAndHashCode(of="id")
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    private String gender;
    private int age;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private City city;
}




