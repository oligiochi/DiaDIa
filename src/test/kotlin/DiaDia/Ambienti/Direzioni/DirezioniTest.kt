package DiaDia.Ambienti.Direzioni

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class DirezioniTest {

    @Test
    fun values() {
        assertArrayEquals(Direzioni.values(), arrayOf(Direzioni.nord,Direzioni.est,Direzioni.sud,Direzioni.ovest))
    }

    @Test
    fun valueOf() {
        assertEquals(Direzioni.nord,Direzioni.valueOf("nord"))
        assertEquals(Direzioni.sud,Direzioni.valueOf("sud"))
        assertEquals(Direzioni.est,Direzioni.valueOf("est"))
        assertEquals(Direzioni.ovest,Direzioni.valueOf("ovest"))
    }
    @Test
    fun GetOpposta(){
        assertEquals(Direzioni.nord,Direzioni.Getopposta(Direzioni.sud))
        assertEquals(Direzioni.sud,Direzioni.Getopposta(Direzioni.nord))
        assertEquals(Direzioni.est,Direzioni.Getopposta(Direzioni.ovest))
        assertEquals(Direzioni.ovest,Direzioni.Getopposta(Direzioni.est))
    }
}