package com.ncapas.parcial.Domain.Entitie;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    @NotBlank
    private String title;

    @Column(nullable = false)
    @NotBlank
    private String author;

    @Column(nullable = false, unique = true)
    @NotBlank
    private String isbn;

    @Column(nullable = false)
    @NotBlank
    private Integer publicationYear;

    @Column
    private String language;

    @Column(nullable = false)
    @NotBlank
    private Integer pages;

    @Column(nullable = false)
    @NotBlank
    private String genre;
}
