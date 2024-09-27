//CCrie uma classe base FormaGeometrica com os atributos cor e area. 
//Crie subclasses Circulo, Quadrado e Retangulo, adicionando os atributos específicos de cada forma. 
//Implemente um método calcularPerimetro em cada subclasse.

//Aluno/AUTOR: Luiz Cesar Lopes Junior
//Aluno: Eduardo Silveira Alves

class Rectangle(color: String, val width: Double, val height: Double) : GeometricShape(color) {
   
    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}
