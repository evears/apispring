package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "libros")
@Getter @Setter @NoArgsConstructor 
public class Libro {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "autor")
    private String autor;
    
    @Column(name = "editorial")
    private String editorial;
    
    @Column(name = "anio")
    private int anio;
    
    @Column(name = "fueLeido")
    private boolean fueLeido;
    
    @Column(name = "formato")
    private String formato;

    
    public Libro(String nombre, String autor, String editorial, int anio, boolean fueLeido, String formato) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.anio = anio;
        this.fueLeido = fueLeido;
        this.formato = formato;
    }

    
}
