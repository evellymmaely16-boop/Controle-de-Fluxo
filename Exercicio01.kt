fun main() {
    println("--- 1. O Filtro de Vogais ---")
    val palavra = "Universidade"
    for (char in palavra) {
        val lowerChar = char.lowercaseChar()
        // Se for vogal, ignora e pula para a próxima iteração
        if (lowerChar in listOf('a', 'e', 'i', 'o', 'u')) {
            continue 
        }
        print(char) // Imprime apenas consoantes
    }
    println("\n")
