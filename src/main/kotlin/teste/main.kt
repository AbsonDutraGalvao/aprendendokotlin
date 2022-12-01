package teste

fun main() {

    val alex = Funcionario(cpf = "078.816.565-81", nome = "Abson", salario = 1000.0)
    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("${alex.nome} bonificação: ${alex.bonificacao()}")

    val leandro = Gerente(cpf = "318.836.345-32", nome = "Leandro", salario = 2000.0, senha = 12345)
    println("Nome: ${leandro.nome}")
    println("CPF: ${leandro.cpf}")
    println("Salário: ${leandro.salario}")
    println("${leandro.nome} bonificação: ${leandro.bonificacaoGerente()}")

    val Owserd = Diretor(cpf = "978.416.312-21", nome = "Owserd", salario = 3000.0, senha = 12345)
    println("Nome: ${Owserd.nome}")
    println("CPF: ${Owserd.cpf}")
    println("Salário: ${Owserd.salario}")
    println("${Owserd.nome} bonificação: ${Owserd.bonificacaoDiretor()}")

}
