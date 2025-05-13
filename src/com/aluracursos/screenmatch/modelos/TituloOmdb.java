package com.aluracursos.screenmatch.modelos;


public record TituloOmdb(String title, String year, String runtime) {
    /*
    Un record en Java es una forma rápida y sencilla de crear una clase que solo guarda datos. Es como decir:
    "Nomás quiero una clase para guardar información, sin escribir tanto código."
    Cuando creas un record, Java automáticamente te da:
    ✅ Un constructor
    ✅ Getters (nombre() y edad())
    ✅ toString()
    ✅ equals() y hashCode()
    Todo eso sin que tú lo escribas
    En general, cuando solo necesitas guardar y transportar datos, un record es ideal.
     */
}
