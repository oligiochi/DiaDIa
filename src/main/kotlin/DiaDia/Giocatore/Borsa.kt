package DiaDia.Giocatore

import DiaDia.Attrezzi.Attrezzo
import DiaDia.Attrezzi.ComparatorPerPeso

class Borsa(val pesoMax: Int){
    private val attrezzi : MutableList<Attrezzo> = mutableListOf()
    private var peso=0
    companion object {
        val PesoMaxDef=20
    }
    constructor() : this(Companion.PesoMaxDef)
    fun getPeso()=this.peso
    fun ifEmpty()=this.attrezzi.isEmpty()
    fun getContenutoOrdinatoPerNome()=this.attrezzi.sort()
    fun getContenutoOrdinatoPerPeso()=this.attrezzi.sortWith(ComparatorPerPeso())
    fun hasAttrezzi(attrezzo:String)=this.attrezzi.contains(this.getAttrezzo(attrezzo))
    fun addAttrezzo(attrezzo: Attrezzo):Boolean{
        if(this.getPeso()+attrezzo.peso>this.pesoMax) {
            return false
        }
        this.peso=this.getPeso()+attrezzo.peso
        return this.attrezzi.add(attrezzo)
    }
    fun getAttrezzo(attrezzo:String): Attrezzo? {
        val element = Attrezzo(attrezzo, 0)
        if(attrezzi.indexOf(element)!=-1) {
            return this.attrezzi.get(attrezzi.indexOf(element))
        }
        return null
    }
    fun removeAttrezzo(attrezzo:String): Attrezzo? {
        if(getAttrezzo(attrezzo)!=null)
            return this.attrezzi.removeAt(this.attrezzi.indexOf(getAttrezzo(attrezzo)))
        return null
    }

    override fun toString(): String {
        if(!ifEmpty())
        return "Contenuto borsa ($pesoMax Kg/$peso Kg): attrezzi=$attrezzi"
        return "Borsa Vuota"
    }

}