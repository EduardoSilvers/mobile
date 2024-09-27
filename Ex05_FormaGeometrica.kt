//CCrie uma classe base FormaGeometrica com os atributos cor e area. 
//Crie subclasses Circulo, Quadrado e Retangulo, adicionando os atributos específicos de cada forma. 
//Implemente um método calcularPerimetro em cada subclasse.

//Aluno/AUTOR: Luiz Cesar Lopes Junior
//Aluno: Eduardo Silveira Alves

open class GeometricShape(val color: String) {
    open fun calculateArea(): Double {
        return 0.0
    }

    // Especifica o tipo de retorno deste método como Double
    open fun calculatePerimeter(): Double {
        return 0.0
    }
}
