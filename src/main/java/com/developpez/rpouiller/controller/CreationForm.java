package com.developpez.rpouiller.controller;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class CreationForm {

    @NotEmpty
    @Pattern( regexp = ".{0,49}" )
    private String libelle;
    @NotEmpty
    @Pattern( regexp = "\\d*" )
    private String quantite;

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle( final String pLibelle ) {
        libelle = pLibelle;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite( final String pQuantite ) {
        quantite = pQuantite;
    }
}