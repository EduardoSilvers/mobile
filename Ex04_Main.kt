//Crie uma classe Produto com os atributos nome, preco, quantidade e categoria. 
//Crie uma classe Categoria com os atributos nome e descricao. 
//Estabeleça uma relação de um para muitos entre Produto e Categoria.

//Aluno/AUTOR: Luiz Cesar Lopes Junior
//Aluno: Eduardo Silveira Alves

fun main() {
    // Instancia a variável que receberá as informações das categorias
    val categoryMilitaryWeapons = ProductCategory("Armas", "Armas voltadas a defesa nacional")
    val categoryMilitaryVehicles = ProductCategory("Veículos", "Veículos militares")

    // Instancia a variável que receberá as informações dos produtos, incluindo a categoria
    val m1a4 = Product("M1A4", 2500.58, 30, categoryMilitaryWeapons)
    val leopard = Product("Leopard 2", 45000.43, 25, categoryMilitaryVehicles)
    val hk415 = Product("HK415", 3500.34, 40, categoryMilitaryWeapons)

    // Adiciona o produto construído à lista "products" na classe ProductCategory
    categoryMilitaryVehicles.addProduct(leopard)
    categoryMilitaryWeapons.addProduct(m1a4)
    categoryMilitaryWeapons.addProduct(hk415)

    // Imprime as informações da lista adicionada a ProductCategory
    categoryMilitaryWeapons.showInfo()
    println() // Linha em branco para separação
    categoryMilitaryVehicles.showInfo()
}
