package DiaDia

class DiaDia(io:IO) {
   /* private val partita: Partita
    private val console: IOConsole
    private val fabbrica: FabbricaDiComandi

    init {
        partita = Partita(LABIRINTO_DEF)
        console = io as IOConsole
        fabbrica = FabbricaDiComandiRiflessiva()
    }
    fun gioca(){
        console.mostraMessaggio(DiaDia.MessaggioDiBenvenuto)
        var comandoCostruito: AbstractComando?
        var istruzione:string?
        do {
            istruzione=console.leggiRiga()
            comandoCostruito = fabbrica.costruisciComando(istruzione)
        }while (!processaIstruzione(comandoCostruito, console) && !partita.isFinita())
        if (partita.getPlayer().getCfu() == 0) {
            console.mostraMessaggio("\nOh no hai perso mi dispiace")
        }
        console.mostraMessaggio("Grazie di aver giocato!")
    }
    private fun processaIstruzione(Comando:AbstractComando?,console:IOConsole):Boolean {
        val stampa = comandoCostruito?.esegui(partita)
        when (stampa) {
            "Che attrezzo vuoi posare?" -> {
                return CambioParametro(console, stampa)
            }

            "Che attrezzo vuoi prendere?" -> {
                return CambioParametro(console, stampa)
            }

            "Dove vuoi andare?" -> {
                return CambioParametro(console, stampa)
            }
            "Su cosa vuoi avere le informazioni?"->{
                return CambioParametro(console, stampa)
            }
            "Grazie di aver giocato!" -> return true
        }
        if (partita.vinta()) {
            io.mostraMessaggio("WOW HAI VINTO!")
            return true
        }
            return false

    }
    companion object {
        private const val MessaggioDiBenvenuto="Ti trovi nell'Universita', ma oggi e' diversa dal solito\n" +
                "Meglio andare al piu' presto in biblioteca a studiare. Ma dov'e'?\\\n" +
                "I locali sono popolati da strani personaggi, alcuni amici, altri... chissa!\n" +
                "Ci sono attrezzi che potrebbero servirti nell'impresa:\n" +
                "puoi raccoglierli, usarli, posarli quando ti sembrano inutili... ma fai attenzione al peso!\n" +
                "puoi anche regalarli se pensi che possano ingraziarti qualcuno\n" +
                "Ti trovi nell'atrio e la tua borsa è vuota, puoi andare nella direzione che vuoi\n" +
                "in fondo alla stanza vedi una lanterna il suo peso è 3kg.\n" +
                "Per conoscere le istruzioni usa il comando 'aiuto'"
    }

    private fun CambioParametro(console: IOConsole,stampa:String): Boolean {
        var parametro: String?
        do {
            console.mostraMessaggio(stampa)
            parametro = console.leggiRiga()
        } while (parametro.isNullOrEmpty())
        comandoCostruito.setParametro(parametro)
        return false
    }*/
}

