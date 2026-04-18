class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        
        //cuenta hash y y lista de frecuencia como posicion con lista de numeros
        val count = HashMap<Int, Int>()
        val freq = List(nums.size + 1) { mutableListOf<Int>() }

        //contamos
        for (num in nums){
            count[num] = count.getOrDefault(num, 0) + 1
        }

        //armamos bucket
        for ((num, cnt) in count) {
            freq[cnt].add(num)
        }

        //doble recorrido de bucket con lista hasta armar el arreglo res
        val res = mutableListOf<Int>()
        for (i in freq.size - 1 downTo 1) {
            for ( num in freq[i]){
                res.add(num)
                if(res.size == k){
                    return res.toIntArray()
                }
            }
        }
        return res.toIntArray()
    }
}
