


fun main (){
    TestaClasse()
}

//Cria um class
class Conta (){
    var titular = ""
    var conta = 0
    var saldo = 0.0



}

fun testaCopiasEReferencias (){

    val numeroX = 10
    var numeroY = numeroX

    println(numeroX)
    println(numeroY )

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println(contaJoao.titular)
    println(contaMaria.titular)

    /* Perceba que ele retornará "Maria" 2 Vezes isso ocorre, pois
    contaJoao se trata de uma refência e não uma cópia, ou seja, são
    duas váriaveis, mas apenas um objeto!
    * */

}



fun TestaClasse (){

    println("Bem vindo ao Bytebank")

    // Cria uma instancia de um Objeto Conta
   var contaAbson = Conta()
    //Inseri valor da conta
    contaAbson.titular = "Abson"
    contaAbson.conta = 0
    contaAbson.saldo = 1.023

    println(contaAbson.titular)
    println(contaAbson.conta)
    println(contaAbson.saldo)
    depositar(contaAbson, 70.3)

    var contaAlex = Conta()

    //Inseri valor da conta
    contaAlex .titular = "Abson"
    contaAlex .conta = 0
    contaAlex .saldo = 1.023

    depositar(contaAlex, 20.0)

    println(contaAlex .titular)
    println(contaAlex .conta)
    println(contaAlex .saldo)


}

fun depositar(conta: Conta, valor: Double){
    conta.saldo += valor
}



//Oque estamos utilizando nesse parte do código é um paradigma procedural
fun For () {
    println("Olá, seja bem vindo ao ByteBank")

    var i = 0
    //O while funciona com condicionais, enquanto for true ele irá realizar o for
    while (i < 6){
        // "break" Faz com que o for loop seja parado
        i++
        if(i == 6){
            break
        }

        // val para uma variavel que não muda
        val nomeTitular = "Abson $i"
        val contaTitular = 1000 + i
        // var para uma variavel que muda
        var saldoTitular = i + 20

        //saldoTitular -= 2000
        //saldoTitular++

        println("Titular $nomeTitular")
        println("Saldo da conta $saldoTitular")
    }

//    for(i in 1..5) {
//
//        // "break" Faz com que o for loop seja parado
//        if(i == 4){
//            break
//        }
//
//        // val para uma variavel que não muda
//        val nomeTitular = "Abson $i"
//        val contaTitular = 1000 + i
//        // var para uma variavel que muda
//        var saldoTitular = i + 20
//
//        //saldoTitular -= 2000
//        //saldoTitular++
//
//        println("Titular $nomeTitular")
//        println("Saldo da conta $saldoTitular")
//    }

}

 //Função que verifica se o estado do saldo
fun testaCondicoes (saldo: Double){

    //Condicional utilizando if tradicional

    /* if(saldoTitular > 0){
        println("Sua conta é positiva")
    }else if(saldoTitular < 0){
        println("Sua conta é negativa")
    }else{
        print("Sua conta está zerada")
    } */

    //Condicional com o When, é muito similar ao Switch Case que existe no Dart
    when{
        saldo > 0 -> { println("Sua conta é positiva")}
        saldo < 0 -> { println("Conta é neutra")}
        else -> { print("Sua conta está zerada")}
    }
}