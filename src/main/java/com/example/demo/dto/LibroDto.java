package com.example.demo.dto;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class LibroDto implements Serializable {

    @NotBlank
    private String nombre;
    
    @NotBlank
    private String autor;
    
    @NotBlank
    private String editorial;
    
    @NotBlank
    private int anio;
    
    @NotBlank
    private boolean fueLeido;
    
    @NotBlank
    private String formato;
    
    
}
