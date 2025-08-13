package com.AlexOlv.bookbridge.dto;

import com.AlexOlv.bookbridge.model.Idioma;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosLivro(
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<DadosAutor> autores,
        @JsonAlias("languages") List<Idioma> idioma,
        @JsonAlias("download_count") Integer numeroDownloads
) {
}
