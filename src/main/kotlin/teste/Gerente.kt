package teste

open class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha : Int
): Funcionario(nome, cpf, salario) {

    fun bonificacaoGerente():Double{
        return salario * 0.2
    }

    fun authenticacaoGerente(senha:Int): Boolean {
        if(this.senha == senha){
            return  true
        }
        return false
    }
}