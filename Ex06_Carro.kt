//Crie uma interface Colorivel com o método cor(). Crie as classes Carro e Casa., que implementam a interface. 
//Demonstre como usar a interface Colorivel para definir a cor desses objetos.

//Aluno: Luiz Cesar Lopes Junior
//Aluno/AUTOR: Eduardo Silveira Alves

class Carro(private val corCarro: String) : Colorivel {

    //Implementação do método cor() para retornar a cor do carro
    override fun cor(): String {
        return corCarro
    }

    fun detalhes(): String {
        return "Este é um carro de cor ${cor()}."
    }
}