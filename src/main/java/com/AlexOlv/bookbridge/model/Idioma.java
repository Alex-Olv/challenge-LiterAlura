package com.AlexOlv.bookbridge.model;

public enum Idioma {
    es("Espanhol"),
    en("Inglês"),
    fr("Francês"),
    pt("Português"),
    de("Alemão"),
    it("Italiano");

    private final String nomeCompleto;
    Idioma(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
}

