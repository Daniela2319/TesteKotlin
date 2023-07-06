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
fun main() {
    val carro = Carro("Uno","Fiat", 2018)

    carro.locomover(2,0)
    println("Carro: ${carro.nome}, Modelo: ${carro.modelo}, Fabricação: ${carro.fabricacao}")
}
