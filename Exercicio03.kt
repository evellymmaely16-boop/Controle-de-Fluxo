println("--- 3. Somador com Limite de Carga ---")
    var total = 0
    for (i in 1..100) {
        // Ignora múltiplos de 10
        if (i % 10 == 0) continue 
        
        total += i
        // Interrompe se o total ultrapassar 500
        if (total > 500) {
            println("Limite de carga excedido no número $i. Total final: $total")
            break
        }
    }
    println()
