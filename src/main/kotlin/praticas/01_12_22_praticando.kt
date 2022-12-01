package praticas/*
* 1- Classes
* 2- Condicionais If
* 3- Condicionais When
* 4- loops While
* 5- loops Range
* 6- variaveis types
* 7- Concatenação
* 8- Parse
* */

fun main (){

    var bancoBG = Banco()

    var contaBancoBG = Banco.ContaTitular(titular =  "Abson", conta = 1)
    contaBancoBG.depositarDinheiro(100.0)

    var contaBancoRG = Banco.ContaTitular("Alex", 2)
    contaBancoBG.depositarDinheiro(100.0)

    println(contaBancoBG.saldo)
    println(contaBancoRG.saldo)

    if(contaBancoBG.transfere(30.0, contaBancoRG)){
        println("Transferencia bem sucedida")
    }else{
        println("Transferencia não realizada")
    }

    println(contaBancoBG.saldo)
    println(contaBancoRG.saldo)




}

class Banco  {
    class ContaTitular( var titular: String, var conta: Int){
        var saldo = 0.0
           private set

        fun depositarDinheiro (valor: Double,){
            this.saldo += valor
            println("O valor de $valor foi depositado na conta de $titular")
            println("Seu Saldo é $saldo")
        }

        fun sacarDinheiro(valor:Double){
            if(saldo >= valor){
                this.saldo -= valor
            }else{
                println("Sem saldo disponivel")
            }
            println("O valor de $valor foi sacado da conta $titular")
            println("Seu Saldo é $saldo")
        }

        fun transfere(valor: Double, destino: ContaTitular):Boolean{
            if(saldo >= valor){
                saldo -= valor
                destino.saldo += valor
                return true
            }
            return false
        }




//        fun getSaldo():Double{
//            return saldo
//        }
//        fun setSaldo(valor:Double){
//            saldo = valor
//        }
    }


}