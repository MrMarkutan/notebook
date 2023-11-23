package gfl.project.notebook.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@Getter
@Setter
@Entity
@Table(name = "person")
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "home_address_id")
    private Address homeAddress;

    @OneToMany(orphanRemoval = true)
    private Set<PhoneNumber> phoneNumbers = new LinkedHashSet<>();

    @OneToMany(orphanRemoval = true)
    private Set<Job> jobs = new LinkedHashSet<>();

    @OneToMany(orphanRemoval = true)
    private Set<Education> education = new LinkedHashSet<>();

    @Column(name = "notes")
    private String notes;

    @OneToMany(orphanRemoval = true)
    private Set<Person> contacts = new LinkedHashSet<>();

}
