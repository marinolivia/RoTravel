package com.ro.travel.RoTravel.controller;

import com.ro.travel.RoTravel.model.Destinatie;
import com.ro.travel.RoTravel.repository.DestinatieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@CrossOrigin(origins="*",maxAge=3600)
@RequestMapping(value = "/api/destinatie")
public class DestinatieController {
    List<Destinatie> destinatii =new ArrayList<Destinatie>();

    @Autowired
    private DestinatieRepository destinatieRepository;

    public DestinatieController()
    {}

    @RequestMapping(method = RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public List<Destinatie> getDestinatii()
    {
        destinatii = destinatieRepository.findAll();
        System.out.println("print destinatii");
        System.out.println(destinatii);
        return this.destinatii;
    }

    @RequestMapping(value = "/{_locatie}", method = RequestMethod.GET)
    @CrossOrigin(origins="http://localhost:4200")
    public Destinatie getDestinatie(@PathVariable("_locatie") String locatie) {
        System.out.println("DEBUG GET DESTINATIE");
        return destinatieRepository.findByLocatie(locatie);
    }
}