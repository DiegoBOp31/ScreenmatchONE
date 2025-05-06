package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

/*
Con la palabra reservada extends después del nombre de la clase, indicamos que nuestra clase
será una hija de la clase Título. Lo que indicará, que la clase Pelicula pasa a tener
o heredar todos los atributos y métodos de la clase padre, en este caso la clase Título.
Además, que mantendrá los atributos y métodos propios.
 */
public class Pelicula extends Titulo implements Clasificacion {
    private String director;

    public Pelicula(String nombre) {
        this.setNombre(nombre);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion(){
        return (int) (calculaMedia()/2);
    }

    @Override
    public String toString() {
        return "Pelicula: "+this.getNombre()+" ("+ this.getFechaDeLanzamiento()+")";
    }
}
