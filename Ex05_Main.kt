//CCrie uma classe base FormaGeometrica com os atributos cor e area. 
//Crie subclasses Circulo, Quadrado e Retangulo, adicionando os atributos específicos de cada forma. 
//Implemente um método calcularPerimetro em cada subclasse.

//Aluno/AUTOR: Luiz Cesar Lopes Junior
//Aluno: Eduardo Silveira Alves

fun main() {
    
    val square = Square("Azul", 14.0)
    val rectangle = Rectangle("Roxo", 35.5, 66.2)
    val circle = Circle("Preto", 5.0)
    
    println("Cor do circulo: ${circle.color}\nÁrea: ${circle.calculateArea()}\nPerímetro: ${circle.calculatePerimeter()}\n__________")
    println("Cor do quadrado: ${square.color}\nÁrea: ${square.calculateArea()}\nPerímetro: ${square.calculatePerimeter()}\n__________")
    println("Cor do retângulo: ${rectangle.color}\nÁrea: ${rectangle.calculateArea()}\nPerímetro: ${rectangle.calculatePerimeter()}\n__________")
}
