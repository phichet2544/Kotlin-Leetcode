class Solution {
    fun reverse(x: Int): Int {
        var n = x.toString().reversed()
        try {
            if(n.substring(n.length-1) == "-"){
                n = n.substring(0,n.length-1)
                n = "-$n"
            }
            return n.toInt()
        } catch (e: NumberFormatException) {
            return 0
            }
    }
}