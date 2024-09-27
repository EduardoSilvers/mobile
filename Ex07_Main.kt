//Crie uma função que converta uma String para um número inteiro. 
//Utilize um try-catch para capturar a exceção NumberFormatException caso a String não possa ser convertida.

//Aluno: Luiz Cesar Lopes Junior
//Aluno/AUTOR: Eduardo Silveira Alves

// Função main para demonstrar a criação e ordenação de tarefas
fun main() {
    // Criando instâncias de Tarefa com título, descrição, prioridade e data limite
    val tarefa1 = Tarefa(
        titulo = "Estudar Kotlin",
        descricao = "Estudar os conceitos básicos de Kotlin",
        prioridade = Prioridade.ALTA,
        dataLimite = Data(15, 10, 2024)
    )

    val tarefa2 = Tarefa(
        titulo = "Limpar a casa",
        descricao = "Fazer a limpeza geral da casa",
        prioridade = Prioridade.MEDIA,
        dataLimite = Data(10, 9, 2024)
    )

    val tarefa3 = Tarefa(
        titulo = "Fazer compras",
        descricao = "Comprar alimentos para a semana",
        prioridade = Prioridade.BAIXA,
        dataLimite = Data(20, 9, 2024)
    )

    val tarefa4 = Tarefa(
        titulo = "Estudar algoritmos",
        descricao = "Aprofundar no estudo de algoritmos",
        prioridade = Prioridade.ALTA,
        dataLimite = Data(1, 11, 2024)
    )

    // Criando uma lista de tarefas
    val listaTarefas = listOf(tarefa1, tarefa2, tarefa3, tarefa4)

    // Imprimindo a lista de tarefas ordenadas com base nos critérios de comparação
    println("Lista de tarefas ordenadas:")
    listaTarefas.sorted().forEach { tarefa ->
        println("${tarefa.titulo} - Prioridade: ${tarefa.prioridade} - Data limite: ${tarefa.dataLimite}")
    }
}
