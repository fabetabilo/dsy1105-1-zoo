



class Mamifero (
    // estos atributos vienen de la clase padre Animal
    id : Int,
    nombre : String,
    especie : String,
    edad : Int,

    val dieta : String // este atributo, propio del hijo, SI se declara

) : Animal(id, nombre, especie, edad) { // (: Animal) indica que esta heredando de Clase Animal

    // override + tab
    override fun mostrarDetalles(): String {
        return "[MAMIFERO]\n" + super.mostrarDetalles() + "\nDIETA: $dieta"
    }

}