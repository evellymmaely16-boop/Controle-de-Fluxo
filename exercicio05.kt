println("--- 5. Detecção de Números Primos ---")
    val alvo = 29
    var ehPrimo = true
    for (i in 2 until alvo) { // Vai de 2 até alvo - 1
        if (alvo % i == 0) {
            ehPrimo = false
            break // Não desperdiça processamento se já encontrou um divisor
        }
    }
    println("O número $alvo ${if (ehPrimo) "é primo" else "não é primo"}.")
    println()
