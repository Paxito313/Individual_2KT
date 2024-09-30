fun main() {
    var temperatura: Double? = null

    while (temperatura == null) {
        println("Ingrese la temperatura que quiera transformar:")
        val input = readLine()?.toDoubleOrNull()

        if (input != null) {
            temperatura = input
        } else {
            println("Error, Debe ingresar un numero valido para la temperatura.")
        }
    }

    var original: String? = null
    while (original == null) {
        println("Seleccione la escala original (C para Celsius, F para Fahrenheit, K para Kelvin):")
        val input = readLine()?.uppercase()

        if (input == "C" || input == "F" || input == "K") {
            original = input
        } else {
            println("Escala original no válida. Debe seleccionar C, F o K.")
        }
    }

    var transformadas: String? = null
    while (transformadas == null) {
        println("Seleccione la escala que desea transformar (C para Celsius, F para Fahrenheit, K para Kelvin):")
        val input = readLine()?.uppercase()

        if (input == "C" || input == "F" || input == "K") {
            transformadas = input
        } else {
            println("Escala de destino no válida. Debe seleccionar C, F o K.")
        }
    }

    var resultado: Double? = null

    if (original == "C" && transformadas == "F") {
        resultado = (temperatura * 9 / 5) + 32
    } else if (original == "C" && transformadas == "K") {
        resultado = temperatura + 273.15
    } else if (original == "F" && transformadas == "C") {
        resultado = (temperatura - 32) * 5 / 9
    } else if (original == "F" && transformadas == "K") {
        resultado = (temperatura - 32) * 5 / 9 + 273.15
    } else if (original == "K" && transformadas == "C") {
        resultado = temperatura - 273.15
    } else if (original == "K" && transformadas == "F") {
        resultado = (temperatura - 273.15) * 9 / 5 + 32
    } else if (original == transformadas) {
        resultado = temperatura
    } else {
        println("Opcion de conversión no valida.")
    }

    if (resultado != null) {
        println("El resultado es: ${"%.2f".format(resultado)} grados en la escala seleccionada.")
    } else {
        println("Error intente nuevamente.")
    }
}
