package br.com.desafio_israel.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity()
@Table(name = "city")
public class AddressEntity {
    @Id()
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "UUID")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(columnDefinition = "VARCHAR(100)", nullable = false)
    private String name;

    @Column(columnDefinition = "CHAR(2)", nullable = false)
    private String sigla;

    @CreatedDate()
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate()
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CityEntity> cityList = new ArrayList<CityEntity>();

}
