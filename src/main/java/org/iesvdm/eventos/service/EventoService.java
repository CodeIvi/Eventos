package org.iesvdm.eventos.service;

import org.iesvdm.eventos.repository.EventoRepository;
import org.iesvdm.eventos.model.Evento;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {
    private EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    public List<Evento> getAll(){
        return eventoRepository.getAll();
    }

    public Evento findEventoById(long id){
        return eventoRepository.findEventoById(id);
    }
}
