package com.AlexOlv.bookbridge.repository;

import com.AlexOlv.bookbridge.model.Autor;
import com.AlexOlv.bookbridge.model.Idioma;
import com.AlexOlv.bookbridge.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    @Query("SELECT a FROM Livro l JOIN l.autor a WHERE a.nome ILIKE %:nome% GROUP BY a.id")
    List<Autor> obterAutorPeloNome(String nome);

    @Query("SELECT l FROM Livro l WHERE l.idioma = :idioma ORDER BY l.titulo ASC")
    List<Livro> obterLivrosPeloIdioma(Idioma idioma);
}
