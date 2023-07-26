package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.Contexto;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.visitor.ExpressionVisitor;

/**
 *
 * @author giova
 */
public class TgExpression implements Expression{
    private Expression expressao;


    public TgExpression(Expression expressao) {
        this.expressao = expressao;
    }

    @Override
    public double interpret(Contexto contexto) {
        double valor = expressao.interpret(contexto);

        return Math.sin(valor);
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
        expressao.accept(visitor);
    }
}
