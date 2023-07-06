package DiaDia.Ambienti

import DiaDia.Attrezzi.Attrezzo
import DiaDia.Ambienti.Direzioni.Direzioni

class Stanza(private var Nome: String) {

    private val attrezzi : MutableList<Attrezzo> = mutableListOf()
    private val stanzeAdiacenti : MutableMap<Direzioni,Stanza> = mutableMapOf()

    //private val personaggio : Personaggio?=null
    fun impostaStanzaAdiacente(direzione : String , stanza : Stanza){
            try{
                if(!stanzeAdiacenti.containsKey(Direzioni.valueOf(direzione))) {
                    stanzeAdiacenti.put(Direzioni.valueOf(direzione),stanza)
                }
            }catch(_: IllegalArgumentException){println("non esiste nessuna direzione di nome $direzione")}
    }
    fun getStanzaAdiacente(direzione : String) : Stanza? {
        try{        if(stanzeAdiacenti.containsKey(Direzioni.valueOf(direzione)))

            return stanzeAdiacenti.get(Direzioni.valueOf(direzione))
        }catch(_: IllegalArgumentException){println("non esiste nessuna direzione di nome $direzione")}
        return null
    }
    fun getNumeroAttrezzi()=this.attrezzi.size
    fun getNumeroStanzeAdiacenti()=this.stanzeAdiacenti.size
    fun getListaDiAttrezzi()=this.attrezzi
    fun getDirezioni()=this.stanzeAdiacenti.keys
    fun getMapStanzeAdiacenti()=this.stanzeAdiacenti
    override fun toString(): String {
        var costruttore = StringBuilder()
        costruttore.append(this.Nome)
        costruttore.append("\nUscite:\n")
        costruttore.append(this.getDirezioni().toString())
        costruttore.append("\nAttrezzi nella stanza:\n")
        costruttore.append(this.getListaDiAttrezzi().toString())
        costruttore.filter {it.isLetterOrDigit() || it.isWhitespace()}
        return costruttore.toString()
    }

}