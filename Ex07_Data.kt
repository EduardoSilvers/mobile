//Crie uma função que converta uma String para um número inteiro. 
//Utilize um try-catch para capturar a exceção NumberFormatException caso a String não possa ser convertida.

//Aluno: Luiz Cesar Lopes Junior
//Aluno/AUTOR: Eduardo Silveira Alves

data class Data(val dia: Int, val mes: Int, val ano: Int) : Comparable<Data> {

    // Sobrescrevendo o método compareTo para comparar as datas
    override fun compareTo(other: Data): Int {
        if (this.ano != other.ano) return this.ano - other.ano // Comparação por ano
        if (this.mes != other.mes) return this.mes - other.mes // Comparação por mês
        return this.dia - other.dia // Comparação por dia
    }

    // Sobrescrevendo toString para formatar a data
    override fun toString(): String {
        return "$dia/$mes/$ano"
    }
}
