


// open class, para la Clase que heredara, de aqui saldran hijos Mamifero y Ave
open class Animal (
    val id : Int,       // el id no debiese variar (val)
    val nombre : String,
    val especie : String,
    var edad : Int
){
    open fun mostrarDetalles() : String {
        // Al ser una funcion utilizada por los hijos (herencia), DEBE de retornar algo (return)
        return "ID: $id \nNOMBRE: $nombre \nESPECIE: $especie \nEDAD: $edad Años"
    }

}