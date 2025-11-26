package org.iesvdm.eventos.Repository;

import org.iesvdm.eventos.model.Evento;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EventoRepository {
    private JdbcTemplate jdbcTemplate;

    public EventoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Evento> getAll() {
        List<Evento> clientes = jdbcTemplate.query("""
                
                        Select * from 
   
                    """,
                (rs, rowNum)-> new Client(
                        rs.getLong("id"),
                        rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getString("telefono"),
                        rs.getString("fecha_nacimiento"))
        );

        log.info("Devuel tos {} clientes",clientes.size());
        log.debug("Devuel tos {} clientes",clientes.size());
        return clientes;
    }
}
