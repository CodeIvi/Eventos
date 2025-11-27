package org.iesvdm.eventos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostPaso2DTO {
    private long eventoId;
    private int cantidadEntradas;
}
