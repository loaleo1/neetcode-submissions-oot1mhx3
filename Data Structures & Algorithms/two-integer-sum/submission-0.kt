class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
         val hashIndices = HashMap<Int,Int>();


        //Recorrer arreglo original y comparar con complemento con target , si no coincide, agregar al hash
        //nums.withIndex() regresa secuencia de pares indice,valor
        for ((indice, valor) in nums.withIndex()) {
            val comp = target - valor
                //exista y no sea el actual , se invierte el arreglo a regresar porque siempre vas a estar en el segundo par, debiste pasar por el primero para que exista en el hash
            if(hashIndices.containsKey(comp) && hashIndices[comp] != indice){
                return intArrayOf(hashIndices[comp]!!,indice)
            }
            else{
                hashIndices[valor] = indice
            }
        }
        return intArrayOf()
    }
    
}
