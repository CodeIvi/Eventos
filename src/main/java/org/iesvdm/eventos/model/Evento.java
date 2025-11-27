package org.iesvdm.eventos.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Evento {
    private long id;
    private String nombre;
    private String descripcion;
    private LocalDateTime fecha_hora;
    private String lugar;
    private BigDecimal precio_base;
    private BigDecimal recargo_grada;
    private BigDecimal recargo_vip;

}
