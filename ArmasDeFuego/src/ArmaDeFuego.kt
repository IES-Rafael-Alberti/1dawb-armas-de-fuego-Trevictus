import kotlin.random.Random


abstract class ArmaDeFuego(private val nombre:String, private var municion: Int, private val municionARestar: Int, private val tipoDeMunicion:String) {
    abstract val danio: Int
    abstract val radio: TipoRadio

    companion object {
        val cantidadMunicionExtra = Random.nextInt(1, 16)
    }


    fun dispara(){
        if(municion >= municionARestar){
            municion -= municionARestar
            println("Se ha disparado el arma ${nombre} y quedan ${municion} proyectiles.")
        }
        else{
            if (cantidadMunicionExtra > 0){
                recarga()
                dispara()
            }
            else{
                println("No queda munición.")
            }
        }
    }
    fun recarga(){

    }
    fun mostrarInfo(){
        println("Nombre: ${nombre}/ Munición: ${municion}/ Tipo de Municion: ${tipoDeMunicion}/ Daño: ${danio}/ Radio de accion: ${radio}")
    }
}