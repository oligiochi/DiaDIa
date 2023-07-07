package DiaDia.Attrezzi

class ComparatorPerPeso():Comparator<Attrezzo> {
    override fun compare(o1: Attrezzo?, o2: Attrezzo?): Int {
        if (o2 != null && o1 != null) {
            if (o1.peso - o2.peso != 0){
                return o1.peso-o2.peso
            }else{
                return o1.compareTo(o2)
            }
        }
        return 0
    }
}