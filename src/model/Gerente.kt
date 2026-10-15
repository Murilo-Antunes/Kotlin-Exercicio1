package model

open class Gerente : Funcionario() {
    override var salario: Double
        get() = super.salario + (super.salario * 0.2)
        set(value) { super.salario = value }
}