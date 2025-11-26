package org.iesvdm.eventos.Service;

import org.iesvdm.eventos.Repository.EventoRepository;
import org.springframework.stereotype.Service;

@Service
public class EventoService {
    private EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }
}
