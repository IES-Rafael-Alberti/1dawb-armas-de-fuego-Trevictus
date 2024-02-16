

class Pistola(municion: Int, tipoDeMunicion: String, danio: Int, radio: TipoRadio): ArmaDeFuego("Pistola", municion, 1, tipoDeMunicion) {

    override var danio: Int = danio
        set(value) {
            requireDanio(value)
            field = value
        }
    override var radio: TipoRadio = radio
        set(value) {
            requireRadio(value)
            field = value
        }
    init{
        requireDanio(danio)
        requireRadio(radio)
    }
    private fun requireDanio(danio:Int){
        require(danio in 1..5){"Error en el daño."}
    }
    private fun requireRadio(radio: TipoRadio){
        require(radio == TipoRadio.REDUCIDO){"Error en el radio."}
    }
}