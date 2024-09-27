//Crie uma classe Produto com os atributos nome, preco, quantidade e categoria. 
//Crie uma classe Categoria com os atributos nome e descricao. 
//Estabeleça uma relação de um para muitos entre Produto e Categoria.

//Aluno/AUTOR: Luiz Cesar Lopes Junior
//Aluno: Eduardo Silveira Alves

// Cria a classe ProductCategory e atribui os parâmetros que serão utilizados para exibir informações e registrar os produtos na lista products
class ProductCategory(val name: String, val description: String) {
    // Criar uma lista para armazenar produtos que pertencem a esta categoria
    private val products = mutableListOf<Product>()

    // Método utilizado para adicionar um produto oriundo da classe Product à lista products na classe ProductCategory
    fun addProduct(product: Product) {
        products.add(product)
    }

    // Método utilizado para imprimir as informações registradas entre as classes Product e ProductCategory
    fun showInfo() {
        println("Nome da categoria: $name")
        println("Descrição da categoria: $description")
        println("-----Informações do Produto-----")
        for (product in products) {
            println("Produto: ${product.name}\nPreço: R$${product.price}\nQuantidade: ${product.quantity}")
        }
    }
}