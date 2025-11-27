package org.iesvdm.eventos.Service;

import org.iesvdm.eventos.Repository.EventoRepository;
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
}
