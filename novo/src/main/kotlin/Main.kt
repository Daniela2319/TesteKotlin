

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

fun main() {
    val pessoal = pessoa("Maria",22)
    val resultado = saudacao(57,56)

    println(pessoal)
    println(resultado)



}