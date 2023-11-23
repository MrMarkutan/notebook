package gfl.project.notebook.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "country", length = 70)
    private String country;

    @Column(name = "city", length = 70)
    private String city;

    @Column(name = "street", length = 70)
    private String street;

    @Column(name = "apartmentNumber", length = 70)
    private Integer apartmentNumber;

    @Column(name = "zip_code")
    private Integer zipCode;
}