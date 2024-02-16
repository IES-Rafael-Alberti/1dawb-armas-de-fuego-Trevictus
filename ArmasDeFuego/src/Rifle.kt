class Rifle(municion: Int, tipoDeMunicion: String, danio: Int, radio: TipoRadio): ArmaDeFuego("Rifle", municion, 2, tipoDeMunicion) {
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
        require(danio in 5..10){"Error en el daño."}
    }
    private fun requireRadio(radio: TipoRadio){
        require(radio in TipoRadio.CORTO..TipoRadio.INTERMEDIO){"Error en el radio."}
    }
}