println("--- 4. Simulador de Caixa Eletrônico ---")
    var saldo = 1000.00
    val valorSaque = 150.00
    while (true) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque
            println("Saque de R$150,00 realizado. Saldo restante: R$$saldo")
        } else {
            println("Saldo Insuficiente")
            break // Encerra quando não há saldo suficiente
        }
    }
    println()
