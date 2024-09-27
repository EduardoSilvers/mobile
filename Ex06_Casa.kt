//Crie uma interface Colorivel com o método cor(). Crie as classes Carro e Casa., que implementam a interface. 
//Demonstre como usar a interface Colorivel para definir a cor desses objetos.

//Aluno: Luiz Cesar Lopes Junior
//Aluno/AUTOR: Eduardo Silveira Alves

class Casa(private val corDaCasa: String) : Colorivel {
    override fun cor(): String {
        return corDaCasa
    }
}
