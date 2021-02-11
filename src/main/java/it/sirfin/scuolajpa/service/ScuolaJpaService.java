package it.sirfin.scuolajpa.service;

import it.sirfin.scuolajpa.model.Docente;



public interface ScuolaJpaService {
    
    void svuotaTabellaDocenti();
    
    void inserisciDocente(Docente d);
    
}
