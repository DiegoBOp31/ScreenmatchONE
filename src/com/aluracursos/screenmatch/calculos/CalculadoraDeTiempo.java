package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal+=titulo.getDuracionEnMinutos();
        /*
        Con el this indicamos que estamos hablando del atributo tiempoTotal de esta
        misma clase CalculadoraDeTiempo
         */
    }


}
