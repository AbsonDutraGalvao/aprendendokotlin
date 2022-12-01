package praticas

fun main (){
    var praticando = praticandoClasses()

    ForRange()
    ForWhile()
    praticando.testandoClassContato()
}

//Uma classe pode ser criada dentro de outra class
class praticandoClasses {
    class contato {
        var nome = ""
        var idade = 0
        var tamanho = 0.0
    }

    fun testandoClassContato(){
        println("Essa é o print do objeto criado a partir da model contato")
        var contatoAbson = contato()

        contatoAbson.nome = "Abson Dutra Galvão"
        contatoAbson.idade = 18
        contatoAbson.tamanho = 1.75

        println(contatoAbson.nome)
        println(contatoAbson.idade)
        println(contatoAbson.tamanho)
    }
}

///Esse ‘loop’ funciona de acordo com um range
fun ForRange(){
    println("Esse loop funciona de acordo com um range")
    for (i in 1..6){
        println("Hello, World $i")
    }
}

///Esse 'loop funciona caso o var da condicional for True
fun ForWhile(){
    println("Esse loop funciona caso o var da condicional for True")
    var i = 0
    while (i<6){
        i++
        println("$i")
    }
}

/// Teste de condicionais tradicional com If
fun testCondicoesIf (saldo: Double){
    if(saldo > 0){
        println("Sua conta é positiva")
    }else if (saldo < 0){
        println("Seu saldo é negativo")
    }else{
        println("Sua conta está zerada")
    }
}

/// Teste de condicional usando o When, muito parecido com o switch case
fun testCondicoesWhen (saldo: Double){
    when {
        saldo > 0 -> {println("Sua conta é positiva")}
        saldo < 0 -> {println("Sua conta é negativa")}
        else -> {println("Sua conta está sem saldo")}
    }
}