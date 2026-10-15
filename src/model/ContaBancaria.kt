package model

class ContaBancaria {
    private var nomeTitular: String = ""

    private var saldo: Double = 0.0

    open fun depositar(valor: Double) {
        saldo += valor
    }

    open fun saca(valor: Double) {
        saldo -= valor
    }

    open fun visualizar(): Double{
        return saldo
    }
}

