
package it.sirfin.scuolajpa.service.scuolajpaserviceimpl;

import it.sirfin.scuolajpa.model.Docente;
import it.sirfin.scuolajpa.repository.DocenteRepository;
import it.sirfin.scuolajpa.service.ScuolaJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ScuolaJpaServiceImpl implements ScuolaJpaService{
    
    @Autowired
    DocenteRepository docenteRepository;
    
    @Override
    public void svuotaTabellaDocenti() {
        docenteRepository.deleteAllInBatch();
    }

    @Override
    public void inserisciDocente(Docente d) {
        docenteRepository.save(d);
    }
    
    
}
