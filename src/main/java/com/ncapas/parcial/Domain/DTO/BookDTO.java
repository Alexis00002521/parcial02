package com.ncapas.parcial.Domain.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BookDTO {

    private String id;

    @JsonProperty("name")
    private String author;

    @JsonProperty("title")
    private String title;

    @JsonProperty("isbn")//fitar isbn
    @Length(min = 13, max = 13)
    private String isbn;

    @JsonProperty("publication_year")
    @Min(1990)
    @Max(2025)
    private Integer publicationYear;

    @JsonProperty("language")
    private String language;

    @JsonProperty("pages")
    @Length(min = 10)
    private Integer pages;

    @JsonProperty("genre")
    private String genres;



}


