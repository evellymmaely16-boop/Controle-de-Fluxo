println("--- 2. O Primeiro Múltiplo Comum ---")
    var numero = 1
    while (true) {
        // Verifica se é divisível por 7 e 13 simultaneamente
        if (numero % 7 == 0 && numero % 13 == 0) {
            println("O primeiro múltiplo comum é: $numero")
            break // Encerra o laço ao encontrar
        }
        numero++
    }
    println()
