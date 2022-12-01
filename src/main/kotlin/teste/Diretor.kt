package teste

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : Gerente(
    nome,
    cpf,
    salario,
    senha)
{
    fun bonificacaoDiretor():Double{
        return salario * 0.3
    }
}