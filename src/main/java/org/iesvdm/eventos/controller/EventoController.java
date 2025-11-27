package org.iesvdm.eventos.controller;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.iesvdm.eventos.dto.PostPaso2DTO;
import org.iesvdm.eventos.model.CompraEntrada;
import org.iesvdm.eventos.service.EventoService;
import org.iesvdm.eventos.model.Evento;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/eventos")
@Slf4j
@SessionAttributes({"evento" ,"compraEntrada"})
public class EventoController {
    private EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @GetMapping("/comprar/paso1")
    public String paso1Get(Evento evento, CompraEntrada compraEntrada,  Model model, HttpSession httpSession){


        log.info("evento {}", evento);
        var compraEntradaHttpSession = (CompraEntrada)httpSession.getAttribute("compraEntrada");
        log.info("compraEntrada {}", compraEntradaHttpSession);
        var eventos = eventoService.getAll();
        model.addAttribute("listaEventos",eventos);
        model.addAttribute("eventoAnterior",evento);
        model.addAttribute("numeroEntradas", compraEntrada != null ? compraEntrada.getNumeroEntradas(): "");


        return "evento/comprar/paso1";
    }

    @PostMapping("/comprar/paso2")
    public String postPaso2(@ModelAttribute PostPaso2DTO postPaso2DTO, HttpSession httpSession,Model model){

        log.info("postPaso2 {}",postPaso2DTO);
        Evento evento1 = eventoService.findEventoById(postPaso2DTO.getEventoId());

        //httpSession.setAttribute("evento",evento1);
        CompraEntrada compraEntrada = new CompraEntrada();
        compraEntrada.setNumeroEntradas(postPaso2DTO.getCantidadEntradas());
        //httpSession.setAttribute("compraEntrada", compraEntrada);

        model.addAttribute("evento",evento1);
        model.addAttribute("compraEntrada",compraEntrada);


    return "evento/comprar/paso2";
    }
}
