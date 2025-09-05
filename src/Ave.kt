



class Ave (
    id: Int,
    nombre: String,
    especie: String,
    edad: Int,

    var capacidadVuevlo : String

) : Animal(id, nombre, especie, edad){

    // "polimorfismo", el metodo mostrarDetalles que viene del padre se modifica y funciona diferente en la clase hijo Ave
    // En este ejemplo no cambia mucho mas que la cadena de String, pero es el concepto c: (sobreescribir un metodo)
    override fun mostrarDetalles(): String {
        return "[AVE]\n" + super.mostrarDetalles() + "\nCAPACIDAD VUELO: $capacidadVuevlo"
    }

}