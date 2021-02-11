package is.sirfin.scuolajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.sirfin.scuolajpa.service.ScuolaJpaService;

@CrossOrigin("*")
@RestController
public class ScuolaJpaController {
    
    @Autowired
    ScuolaJpaService scuolaJpaService;
    
    @RequestMapping("inizializza")
    public void inizializza(){
        
        scuolaJpaService.svuotaTabellaDocenti();
        
       // Docente d = new  Docente("Mario","Rossi");
        //scuolaJpaService.inserisciDocente(d);
    }

}
