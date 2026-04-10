class Solution {
    ///Ordenar y comparar si son iguales
    fun isAnagram(s: String, t: String): Boolean {
        
        if (s.length != t.length) {
            return false
        }

        //Se cambia a arreglo caracteres y se ordena , luego se comparan
        return s.toCharArray().sorted() == t.toCharArray().sorted()
    
    }
}
