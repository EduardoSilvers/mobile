//Crie uma interface Colorivel com o método cor(). Crie as classes Carro e Casa., que implementam a interface. 
//Demonstre como usar a interface Colorivel para definir a cor desses objetos.

//Aluno: Luiz Cesar Lopes Junior
//Aluno/AUTOR: Eduardo Silveira Alves
fun main() {
    val carro = Carro("Vermelho")
    val casa = Casa("Azul")

    println("A cor do carro é: ${carro.cor()}")
    println("A cor da casa é: ${casa.cor()}")
    
}
