package funções

class Carro (val nome: String, val modelo: String, val fabricacao: Int){

    fun locomover(ligar: Int, desligar: Int) {
        if (ligar > desligar) {
            println("O carro liga")
        } else {
            println("O carro esta parado")
        }
    }
}

    fun String.eNumero()= all { it.isDigit() } // Essa função para chegar se uma string é um numero ou não
fun main() {
    val carro = Carro("Uno","Fiat", 2018)

    carro.locomover(2,0)
    println("Carro: ${carro.nome}, Modelo: ${carro.modelo}, Fabricação: ${carro.fabricacao}")

    println("10".eNumero())
    println("abracadabra".eNumero())
}
