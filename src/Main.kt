import model.ContaBancaria
import model.Gerente
import kotlin.reflect.typeOf

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //batataQuente();
    println(newListaImpare(listOf(1,2,3,4,5,6,7,8,9) ))
    println(somaPreco(listOf(20,20,20,7)))
    println(mediaIdade(listOf(1,18,20,22,2,55) ))
    objetoPessoa(mapOf("nome" to "Maria", "idade" to "25", "cidade" to "São Paulo"))
    println(acharProdutoCaro())
    val contaBancaria = ContaBancaria()
    contaBancaria.depositar(1000.0)
    contaBancaria.saca(100.0)
    println(contaBancaria.visualizar())

    val gerente = Gerente()
    print(gerente.salario)

}

fun batataQuente(){
    val numeros = (1 ..100).toList()

    for(numero in numeros){
        println("----------------------------------")
        println(numero)
        if (numero % 3 ==0 && numero % 5 == 0) {
            println("BatataQuente")
        }else if(numero % 5 == 0){
            println("Quente")
        }else if(numero % 3 == 0){
            println("Batata")
        }
    }
}

fun newListaImpare(numeros:List<Int>):List<Int>{
    return numeros.filter{it % 2 == 1}
}

fun somaPreco(numeros:List<Int>): Int{
    return numeros.reduce{acumulador, numero -> acumulador + numero}
}

fun mediaIdade(numeros:List<Int>):Int{
    var acumulador = 0;
    var cont = 0;
    for(numero in numeros){
        if (numero >= 18) {
            acumulador += numero
            cont++
        }
    }
    return acumulador / cont
}

fun objetoPessoa (pessoa:Map<String, String>){
    val nome = pessoa["nome"]
    val idade = pessoa["idade"]
    val cidade = pessoa["cidade"]

    println("$nome tem $idade anos e mora em $cidade")
}

fun acharProdutoCaro(): Int{
    val produtos = listOf(
        mapOf("nome" to "Marreta", "preco" to 25),
        mapOf("nome" to "mouse", "preco" to 100),
        mapOf("nome" to "teclado", "preco" to 125),
        mapOf("nome" to "faca", "preco" to 15),
    )

    var maiorPreco = 0;


    for (produto in produtos){
        if (produto["preco"] as Int > maiorPreco){
            maiorPreco = produto["preco"] as Int
        }
    }

    return maiorPreco
}
