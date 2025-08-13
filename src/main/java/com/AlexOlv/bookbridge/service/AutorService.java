package com.AlexOlv.bookbridge.service;

import com.AlexOlv.bookbridge.dto.DadosAutor;
import com.AlexOlv.bookbridge.model.Autor;
import com.AlexOlv.bookbridge.model.Livro;
import com.AlexOlv.bookbridge.repository.AutorRepository;

import java.util.List;
import java.util.Optional;

public class AutorService {
    private AutorRepository repository;

    public AutorService(AutorRepository repository) {
        this.repository = repository;
    }

    public List<Autor> findAll() {
        return repository.findAll();
    }

    public Optional<Autor> find(Long id) {
        return repository.findById(id);
    }

    public Autor criarOuBuscarAutor(DadosAutor dadosAutor) {
        Optional<Autor> optionalAutor = repository.findFirstByNomeContainingIgnoreCase(dadosAutor.nome());

        if (optionalAutor.isPresent()) {
            Autor autor = optionalAutor.get();
            return autor;
        }
        return new Autor(dadosAutor);
    }

    public void salvarAutor(Livro livro) {
        Autor autor = livro.getAutor();
        autor.getLivros().add(livro);
        repository.save(autor);
    }

    public List<Autor> obterAutoresVivosEmDeterninadoAno(Integer ano) {
        return repository.obterAutoresVivosEmDeterninadoAno(ano);
    }
}
