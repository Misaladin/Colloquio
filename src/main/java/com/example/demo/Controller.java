package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/datiAnagrafici"})
public class Controller {

    DatiAnagrafici datiAnagrafici;

    @GetMapping({"Codice_fiscale"})
    public DatiAnagrafici richiediCodice(String Codice_fiscale)
    {

        return  datiAnagrafici;
    }


    @PostMapping({"Codice_fiscale"})
    public String createCodice(@RequestBody DatiAnagrafici datiAnagrafici)
    {
        this.datiAnagrafici = datiAnagrafici;


        return "codice Aggiornato!";

    }

}
