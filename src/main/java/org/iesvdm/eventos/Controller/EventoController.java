package org.iesvdm.eventos.Controller;

import lombok.extern.slf4j.Slf4j;
import org.iesvdm.eventos.Service.EventoService;
import org.iesvdm.eventos.model.Evento;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/evento")
@Slf4j
@SessionAttributes
public class EventoController {
    private EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @GetMapping("/evento/comprar/paso1")
    public String paso1Get(@ModelAttribute("evento") Evento evento){


    }
}
