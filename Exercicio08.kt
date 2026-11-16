println("--- 8. Cofre com Bloqueio Progressivo ---")
    val senhaCorreta = "1234"
    val tentativas = listOf("1111", "2222", "3333", "1234") // Simulação de tentativas
    
    for (tentativaAtual in 1..5) {
        // Pega a senha da simulação (ou uma string vazia se acabarem os itens)
        val senhaDigitada = tentativas.getOrElse(tentativaAtual - 1) { "" } 
        
        if (senhaDigitada == senhaCorreta) {
            println("Acesso concedido!")
            break // Sucesso, encerra as tentativas
        } else {
            println("Tentativa $tentativaAtual incorreta.")
            if (tentativaAtual == 3) {
                println("Cofre travado administrativamente")
                break // Trava no terceiro erro
            }
        }
    }
}
