println("--- 6. O Menu Teimoso ---")
    // Array simulando as entradas do usuário para evitar um loop infinito travado na execução
    val entradasSimuladas = listOf(1, 3, 2, 0) 
    for (opcao in entradasSimuladas) {
        println("Opção escolhida: $opcao")
        if (opcao == 1 || opcao == 2) {
            println("Processando...")
        } else if (opcao == 3) {
            println("Módulo em manutenção")
            continue // Volta ao início instantaneamente
        } else if (opcao == 0) {
            println("Encerrando programa...")
            break // Encerra o programa
        }
    }
    println()
