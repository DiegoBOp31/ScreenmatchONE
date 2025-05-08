package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evaluar(9);
        Serie casaDragon = new Serie("La casa del dragón", 2022);
        casaDragon.evaluar(8);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.evaluar(6);
        var peliculaDeBruno = new Pelicula("Señor de los anillos", 2001);
        peliculaDeBruno.evaluar(4);
        Pelicula p1 = peliculaDeBruno;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peliculaDeBruno);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casaDragon);

        for (Titulo titulo: lista){
            System.out.println(titulo.getNombre());
            /*
            Lo que entendí aquí es que cuando hacemos el instanceof no sólo comprobamos el tipo de dato del objeto,
            sino que también hacemos el casteo de referencia de los objetos. No cambiamos el tipo del objeto, en este caso
            no cambiamos el tipo de los títulos, los títulos siguen siendo de tipo Titulo. Pero sí estamos cambiando la forma
            en la que ahora se ve a partir de su referencia en java. Entonces, los objetos siguen siendo de tipo Titulo,
            pero ahora java los ve como si fueran de tipo Pelicula.
             */
            if (titulo instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String>listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");

        System.out.println("Lista de artistas no ordenada: "+listaDeArtistas);
        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: "+listaDeArtistas);
        Collections.sort(lista);
        System.out.println("Lista de títulos ordenados: "+lista);

    }
}
