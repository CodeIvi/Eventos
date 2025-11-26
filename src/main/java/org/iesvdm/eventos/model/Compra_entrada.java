package org.iesvdm.eventos.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Compra_entrada {
private Integer id;
private Integer eventoId;
private String nombreComprador;
private String emailComprador;
private String zona;
private String numeroEntradas;
private BigDecimal precioUnitario;
private BigDecimal precioTotal;
private Date fechaCompra;
}
