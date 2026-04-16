class Solution {
    //crea Hashmap de palabra ordenada y posiciones
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val orderedStrings = mutableMapOf<String, MutableList<String>>();

        
        //Llenamos el HashMap
        for ((index,str) in strs.withIndex()){
            //ordenamos el string y agregamos al hashmap con su posicion, si ya hay, se agrega solo nueva posicion a lista
            val orderStr = str.toCharArray().sorted().joinToString("")
            orderedStrings.getOrPut(orderStr) { mutableListOf() }.add(str)
        }

        return orderedStrings.values.toList()

    }
}
