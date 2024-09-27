//Crie uma função que receba um dia, mes e ano e retorne uma String indicando se a data é válida. 
//Utilize a expressão when para verificar os meses com 31 dias, 30 dias, fevereiro e os anos bissextos.

//Aluno/AUTOR: Luiz Cesar Lopes Junior
//Aluno: Eduardo Silveira Alves

fun main(){

    println("Digite o dia:")
    val inputDay = readLine()?.toIntOrNull() ?: 0 //Converte para inteiro e faz a excessão de nulos
    println("Digite o mês")
    val inputMounth = readLine()?.toIntOrNull() ?: 0
    println("Digite o ano")
    val inputYear = readLine()?.toIntOrNull() ?: 0

   when {
    //Verifica se input mounth está no range entre 1 e 12 se for diferente deste range, retorna inválido
    inputMounth !in 1..12 -> println("O mês digitado é inválido")
    else -> {
        val maxMounthDays = when(inputMounth){
            1,3,5,7,8,10,12 -> 31 //verifica se os números de inputMount são x se sim atribui 31 dias como máximo
            2 -> 28
            else -> 30
        }
        //Verifica se o inputDay está no Range entre 1 e o máximo de dias verificados no when acima
        if(inputDay in 1..maxMounthDays){
            println("Data Válida $inputDay/$inputMounth/$inputYear")
        }else{
            println("Data inválida")
        }
    }
   }
}