



// INICIO DE REQUISITOS DEL MAIN
fun main() {

    // Elementos locales, coleccion de datos de tipo List
    val animalesEnZoologico = listOf(
        Mamifero(1, "León", "León Africano", 5, "Carnívoro"),
        Ave(2, "Águila", "Águila Calva", 3, "Vuela alto"),
        Mamifero(3, "Koala", "Koala Gris", 4, "Herbívoro"),
        Ave(4, "Pingüino", "Pingüino Emperador", 6, "No vuela")
    )


    // Analisis del Censo del zoo
    val cantidadTotal = animalesEnZoologico.size
    println("El total de animales en el ZOO es: $cantidadTotal")


    // Cantidad de Aves que no pueden volar
    // Aqui .filter { pajaro -> pajaro is Ave && pajaro.capacidadVuevlo.equals("No vuela" -- Se filtran, "pajaro" es una variable local, Si pajaro ES tipo Ave Y su capacidad de vuelo es igual a No vuela, => Bum
    val avesNoVoladoras = animalesEnZoologico.filter { pajaro -> pajaro is Ave && pajaro.capacidadVuevlo.equals("No vuela", ignoreCase = true) }  // equals tiene una ventaja, puede usarse el ignorecare

    // Luego debemos contarlas, para eso hacemos una variable para contar la misma lista avesNoVoladoras
    val cantidadAvesNoVoladoras = avesNoVoladoras.size
    println("La cantidad total de aves que no vuelan es: $cantidadAvesNoVoladoras")


    // Opcion 2. * Filtrame los instanciados del tipo Ave (o filtrame por instancia de tipo Ave, filterIsIstance<Ave>)-- .count{it.capacidadVuelo} cuentalos, y por su iteracion it.capacidadVuelo (it es una ave)
    val cantAvesNoVuelan2 = animalesEnZoologico.filterIsInstance<Ave>().count{it.capacidadVuevlo.equals("No vuela", ignoreCase = true)}
    println("OP2. Aves que no vuelan en el zoologico son: $cantAvesNoVuelan2")

    // Mostrar todos los animales

    // diferente de: .forEach()
    // FUNCION LAMBDA: .forEach{}
    animalesEnZoologico.forEach{ it.mostrarDetalles() } // it = la iteracion, por cada iteracion -> animalito.mostrarDetalles(), sea Mamifero, ave etc

// HASTA AQUI LOS REQUISITOS DEL MAIN


}