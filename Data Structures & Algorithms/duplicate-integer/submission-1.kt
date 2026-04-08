class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        
        //Usamos hashset para almacenar los ya pasados y comparar
        val check = mutableSetOf<Int>()

        for(num in nums){
            if(num in check) return true
            //Si no esta, lo agregamos
            check.add(num)
        }

        return false
    }
}
