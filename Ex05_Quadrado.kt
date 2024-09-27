//CCrie uma classe base FormaGeometrica com os atributos cor e area. 
//Crie subclasses Circulo, Quadrado e Retangulo, adicionando os atributos específicos de cada forma. 
//Implemente um método calcularPerimetro em cada subclasse.

//Aluno/AUTOR: Luiz Cesar Lopes Junior
//Aluno: Eduardo Silveira Alves

class Square(color: String, val side: Double) : GeometricShape(color) {

    //Sobrescreve o método declarado na classe GeometricShape
    override fun calculateArea(): Double {
        return side * side
    }

    //Sobrescreve o método declarado na classe GeometricShape
    override fun calculatePerimeter(): Double {
        return 4 * side
    }
}
