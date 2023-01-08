// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel() { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(var nome: String){}

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel){}

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario): String {
        inscritos.add(usuario)
        return "Usuario " + usuario.nome + " matriculado com sucesso!"
    }
    
    fun listarInscritos() {
        inscritos.forEach{println(it.nome)}
    }
    
    fun getNumeroDeInscritos(): Int{
        return inscritos.size
    }
}

fun main() {

    var conteudoList: List<ConteudoEducacional> = listOf(ConteudoEducacional("Princípios Software", 20, Nivel.BASICO), 
                                                         ConteudoEducacional("Dominando a Linguagem", 40, Nivel.INTERMEDIARIO),
                                                        ConteudoEducacional("Refinando sua técnica", 80, Nivel.DIFICIL))
    
    val formacao: Formacao = Formacao("Kotlin Experience", conteudoList)
    
    val godofredo: Usuario = Usuario("Godofredo");
    val jucelina: Usuario = Usuario("Jucelina");
    val benzedino: Usuario = Usuario("Benzedino");
    val carlota: Usuario = Usuario("Carlota");
    
    println(formacao.matricular(godofredo))
    println(formacao.matricular(jucelina))
    println(formacao.matricular(benzedino))
    println(formacao.matricular(carlota))
    println()
    println("Quantidade de inscritos: ")
    println(formacao.getNumeroDeInscritos())
    println()
    println("Lista de alunos inscritos: ")
    formacao.listarInscritos()
  
    
    
}
