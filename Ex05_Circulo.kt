//CCrie uma classe base FormaGeometrica com os atributos cor e area. 
//Crie subclasses Circulo, Quadrado e Retangulo, adicionando os atributos específicos de cada forma. 
//Implemente um método calcularPerimetro em cada subclasse.

//Aluno/AUTOR: Luiz Cesar Lopes Junior
//Aluno: Eduardo Silveira Alves

import kotlin.math.PI

class Circle(color: String, val radius: Double) : GeometricShape(color) {
    
    // Sobrescreve o método já declarado na classe GeometricShape
    override fun calculateArea(): Double {
        return PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }
}
