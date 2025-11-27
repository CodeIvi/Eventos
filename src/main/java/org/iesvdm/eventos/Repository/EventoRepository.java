package org.iesvdm.eventos.Repository;

import lombok.extern.slf4j.Slf4j;
import org.iesvdm.eventos.model.Evento;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Slf4j
@Repository
public class EventoRepository {
    private JdbcTemplate jdbcTemplate;

    public EventoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Evento> getAll() {
        List<Evento> eventos = jdbcTemplate.query("""
                
                        Select * from evento
   
                    """,
                (rs, rowNum)-> new Evento(
                        rs.getLong("id"),
                        rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getDate("fecha_hora"),
                        rs.getString("lugar"),
                        rs.getBigDecimal("precio_base"),
                        rs.getBigDecimal("recargo_grada"),
                        rs.getBigDecimal("recargo_vip"))
        );

        log.info("Devuel tos {} clientes",eventos.size());
        log.debug("Devuel tos {} clientes",eventos.size());
        return eventos;
    }
}
