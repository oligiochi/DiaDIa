package DiaDia.Ambienti.Direzioni

enum class Direzioni {
    nord, sud, east, ovest;

    companion object {
        fun Getopposta(a : Direzioni): Direzioni{
            return Direzioni.values()[(a.ordinal+2)%4]
        }
    }
}