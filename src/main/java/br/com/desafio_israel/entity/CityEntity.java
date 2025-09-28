package br.com.desafio_israel.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity()
@Table(name = "city")
public class CityEntity {
    @Id()
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "UUID")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(columnDefinition = "VARCHAR(100)")
    private String name;

    @CreatedDate()
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate()
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id", nullable = false)
    private AddressEntity address;

}
