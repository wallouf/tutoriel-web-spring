package com.developpez.rpouiller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping( "/bonjour/{personne}/{test}" )
public class BonjourController {

    @RequestMapping( method = RequestMethod.GET )
    public String afficherBonjour( final ModelMap pModel,
            @PathVariable( value = "personne" ) final String pPersonne,
            @PathVariable( value = "test" ) final String pTest ) {

        pModel.addAttribute( "personne", pPersonne );
        pModel.addAttribute( "test", pTest );
        return "bonjour";
    }
}