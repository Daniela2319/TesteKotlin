

fun pessoa(nome: String, idade: Int): String {
    return "Nome: $nome e idade: $idade"
}

fun saudacao(nome: Int, carteira: Int): Int{

    if (nome < carteira){
        println("Maior de idade")
    }else{
        println("Menor de idade: Não entra!")
    }
    return nome


}
  fun olaMundo(){
      println("Olá Mundo!")
  }

val frutas: List<String> = listOf("Maça", "Pera", "Uva", "Mamão")

fun main() {
    val pessoal = pessoa("Maria",22)
    val resultado = saudacao(57,56)

    println(pessoal)
    println(resultado)

    for ((index: Int, fruta: String) in frutas.withIndex()){
        println("$index: $fruta")
    }
    frutas.forEachIndexed{index, fruta -> // maneira mais simplificada para rodar uma lista
        println("$index: $fruta")
    }

    olaMundo()


}