//Você recebe uma lista de números em formato String. Converta cada elemento da lista para um número inteiro, 
//exceto aqueles que não podem ser convertidos. Para os números que não puderem ser convertidos, armazene o valor original em uma nova lista de Strings. 
//Ao final, imprima ambas as listas.

//Aluno/AUTOR: Luiz Cesar Lopes Junior
//Aluno: Eduardo Silveira Alves
 
fun main() {
    
    val intList = mutableListOf<Int>()   //Lista para números inteiros
    val strList = mutableListOf<String>() //Lista para strings
    
    //Mantém o programa rodando até que se digite /sair/
    while (true) {
        println("Digite algo para ser adicionado à lista, digite '/sair/' para sair do loop:")

        //Recebe um valor de input e checa se a entrada é nula
        val input = readLine() ?: ""

        when {
            input.lowercase() == "/sair/" -> return //Usa o return para sair do loop se a string /sair/ for digitada
            else -> {
                try {
                    val buffer = input.toInt()
                    intList.add(buffer) //Adiciona número à lista de inteiros
                } catch (e: NumberFormatException) {
                    strList.add(input) //Adiciona string inválida à lista de strings
                }
            }
        }
    }
    
    //Exibe as listas após sair do loop while
    println("\nLista de inteiros: $intList")
    println("Lista de strings: $strList")
}
