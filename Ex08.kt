//Crie uma função que converta uma String para um número inteiro. 
//Utilize um try-catch para capturar a exceção NumberFormatException caso a String não possa ser convertida.

//Aluno: Luiz Cesar Lopes Junior
//Aluno/AUTOR: Eduardo Silveira Alves

fun converterParaInteiro(str: String): Int? {
    return try {
        //Se a conversão for bem-sucedida, a função retorna o valor convertido como Int
        str.toInt()
    } catch (e: NumberFormatException) {
        //Se ocorrer uma exceção NumberFormatException (quando a string não pode ser convertida),
        println("Erro: '${str}' não é um número válido.")
        null
    }
}

fun main() {
    val numeroValido = converterParaInteiro("123")
    println("Número convertido: $numeroValido")

    val numeroInvalido = converterParaInteiro("abc")
    println("Número convertido: $numeroInvalido")
}
