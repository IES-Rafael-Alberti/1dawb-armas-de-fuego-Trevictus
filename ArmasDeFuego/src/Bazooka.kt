class Bazooka (municion: Int, tipoDeMunicion: String, danio: Int, radio: TipoRadio): ArmaDeFuego("Bazooka", municion, 3, tipoDeMunicion){
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
        require(danio in 10..30){"Error en el daño."}
    }
    private fun requireRadio(radio: TipoRadio){
        require(radio in TipoRadio.INTERMEDIO..TipoRadio.ENORME){"Error en el radio."}
    }
}