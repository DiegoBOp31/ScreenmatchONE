package com.aluracursos.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    @SerializedName("Title")
    private String nombre;
    @SerializedName("Year")
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    /*
    Se le agrega el modificador de acceso al principio de la declaración para delimitar el acceso del atributo.
    En este caso, el usuario no puede acceder a él porque es private, entonces, no puede verla y mucho menos
    modificarla.
     */
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setNombre(String nombre) {
        /*
        A diferencia de get que es para obtener un valor, set nos sirve para darle un valor
        a nuestro atributo de la clase de forma indirecta.
         */
        this.nombre = nombre;
        /*El this indica que nos referimos al atributo de la clase (el nombre que está del lado derecho)
        y el nombre del lado izquierdo es el valor que el usuario va a pasar. */
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    /*
                Este método sirve para obtener información de algún atributo de la clase que sea privado. En este caso, el
                usuario sólo podrá ver el valor, pero sin modificarlo. Y cabe señalar que no se está llamando al atributo
                directamente, sino al método que obtiene el atributo y lo devuelve.
                 */
    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    /*
    La primer palabra reservada indica qué tipo de valor va a regresar el método(función).
    En este caso es void la palabra reservada que se usa, e indica que no se devuelve ningún valor.
     */
    public void muestraFichaTecnica (){
        System.out.println("El nombre de la película es: "+ nombre);
        System.out.println("Su fecha de lanzamiento es: "+ fechaDeLanzamiento);
        System.out.println("Y su duración es de: "+ getDuracionEnMinutos() + " minutos");
        if(incluidoEnElPlan){
            System.out.println("Genial, esta película está incluida en tu plan\n");
        }else{
            System.out.println("Lo sentimos, esta película no está incluida en tu plan\n");
        }
    }

    /*
    Lo que se coloca dentro de los parentesis del método son los parámetros que se van a recibir
    para usarlos de alguna forma. En este caso se tiene que recibir un tipo de dato double que se llama nota
    y dentro del método se usa para sumar las calificaciones de la película.
     */
    public void evaluar(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    /*
    En este caso se usa la palabra reservada double que indica que va a regresar un valor de tipo double
    y se confirma con la palabra reservada return al final del método.
     */
    public double calculaMedia(){
        return sumaDeLasEvaluaciones/totalDeLasEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo){
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' + ", fechaDeLanzamiento=" + fechaDeLanzamiento;
    }
}
