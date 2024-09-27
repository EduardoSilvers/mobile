//Crie uma função que receba um número inteiro e retorne a sequência de Fibonacci até o número informado. 
//Utilize um loop for para calcular os valores da sequência.

//Aluno/AUTOR: Luiz Cesar Lopes Junior
//Aluno: Eduardo Silveira Alves


fun main(){
    
    println("Digite um número para calcular a sequência de Fibonacci")
    val firstNumber = readLine()?.toIntOrNull() ?: 1
    val fibonacciSequence = mutableListOf<Int>() //Declara uma lista mutável de tipo inteiro

    //Checa e adiciona o primeiro e segundo número da sequência para evitar o erro de acessar uma lista vazia
    if (firstNumber >= 1) fibonacciSequence.add(0)
    if (firstNumber >= 2) fibonacciSequence.add(1) 

    //until significa que o loop percorrerá no range de 0 até o valor de input -1
    //A sequência de Fibonacci é uma sequência numérica em que cada termo a partir do terceiro é a soma dos dois termos anteriores. Os dois primeiros termos da sequência são 1 e 1. 
    for(i in 2 until firstNumber){
       val nextResult = fibonacciSequence[i - 1] + fibonacciSequence[i - 2]
       fibonacciSequence.add(nextResult)
    }

    println("A sequencia de Fibonnacci para o número $firstNumber = $fibonacciSequence")
}