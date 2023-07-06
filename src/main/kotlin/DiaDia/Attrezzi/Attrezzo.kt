package DiaDia.Attrezzi

import java.util.*

class Attrezzo(val nome:String,val peso:Int) : Comparable<Attrezzo> {
    override fun compareTo(other: Attrezzo): Int {
        return this.nome.compareTo(other.nome)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        val that=other as Attrezzo
        return this.nome.lowercase().equals(that.nome.lowercase())
    }

    override fun hashCode(): Int {
        return this.nome.hashCode()+this.peso
    }

    override fun toString(): String {
        return "$nome ($peso Kg)"
    }

}