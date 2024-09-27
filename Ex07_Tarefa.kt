//Crie uma função que converta uma String para um número inteiro. 
//Utilize um try-catch para capturar a exceção NumberFormatException caso a String não possa ser convertida.

//Aluno: Luiz Cesar Lopes Junior
//Aluno/AUTOR: Eduardo Silveira Alves

data class Tarefa(
    val titulo: String,      
    val descricao: String,  
    val prioridade: Prioridade,
    val dataLimite: Data    
    ) : Comparable<Tarefa> {

    // Sobrescrevendo o método compareTo para definir a lógica de ordenação
    override fun compareTo(other: Tarefa): Int {
        // Comparação de prioridade (Alta, Média, Baixa)
        val prioridadeCompare = this.prioridade.compareTo(other.prioridade)
        if (prioridadeCompare != 0) return prioridadeCompare
        
        // Comparação pela data limite em ordem crescente (primeiro a mais próxima)
        val dataCompare = this.dataLimite.compareTo(other.dataLimite)
        if (dataCompare != 0) return dataCompare
        
        // Comparação de título em ordem alfabética se prioridade e data forem iguais
        return this.titulo.compareTo(other.titulo)
    }
}

// Enum para definir as prioridades possíveis (Alta, Média, Baixa)
enum class Prioridade {
    ALTA, MEDIA, BAIXA
}
