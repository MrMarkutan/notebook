package gfl.project.notebook.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "specialty", nullable = false, length = 100)
    private String specialty;

    @Column(name = "graduation_date", nullable = false)
    private LocalDate graduationDate;

    @Column(name = "graduation_rate")
    private Integer graduationRate;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "education_institution_id")
    private EducationInstitution educationInstitution;

}