import java.util.Date

interface Imprimivel {
    fun imprimir()
}

class Endereco(
    val rua: String,
    val numero: Int,
    val cep: String,
    val cidade: String,
    val estado: String
) : Imprimivel {
    override fun imprimir() {
        println("Endereço: $rua, $numero - $cep, $cidade/$estado")
    }
}

open class Contato(
    val nome: String,
    val idade: Int,
    val altura: Float,
    val genero: Char,
    val email: String,
    val endereco: Endereco,
) : Imprimivel {
    override fun imprimir() {
        println("Contato - Nome: $nome, Idade: $idade, Altura: $altura, Genero: $genero, Email: $email")
    }

    class Amigo(
        nome: String,
        idade: Int,
        altura: Float,
        genero: Char,
        email: String,
        endereco: Endereco,
        val conhecidoEm: Date
    ) : Contato(nome,idade,altura,genero,email) {
        override fun imprimir() {
            super.imprimir()
            println("Conhecido em: $conhecidoEm")
        }
    }

    class Parente(
        nome: String,
        idade: Int,
        altura: Float,
        genero: Char,
        email: String,
        endereco: Endereco,
        val parentesco: String
    ) : Contato(nome,idade,altura,genero,email) {
        override fun imprimir() {
            super.imprimir()
            println("Parentesco: $parentesco ")
        }
    }
}

fun main(){

    val endereco1 = Endereco("Rua Centenario", 01, "83601000", "Campo Largo", "Paraná")
    val endereco2 = Endereco("Rua Gonçalves Dias",02,"83601130","Campo Largo","Paraná")
    val endereco3 = Endereco("Rua Augusto Fabris",03,"83606580","Campo Largo","Paraná")
    val endereco4 = Endereco("Av. Orestes Clemente Serra",04,"95555000","Capão da Canoa","Rio Grande do Sul")

    val amigo1 = Amigo("Brian",25,1.77,"M","brian@gmail.com",endereco1,"01/06/2014")
    val amigo2 = Amigo("Carlos",25,1.80,"M","carlos@gmail.com",endereco2,"01/08/2018")

    val parente1 = Parente("Geosani",50,1.74,"F","geo@gmail.com",endereco3,"Mãe")
    val parente2 = Parente("Andreia",52,1.70,"F","andreia@gmail.com",endereco4,"Madrinha")

    val contatos: List<Imprimivel> = listOf(amigo1,amigo2,parente1,parente2)
    for(contato : contatos) {
        contato.imprimir()
        println("-")
    }
}