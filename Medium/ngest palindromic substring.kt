class Solution {
    fun longestPalindrome(s: String): String {
        val raw = s.reversed()
        val split1 = mutableListOf<String>()

        val y = generateSubstrings(s)
        val z = generateSubstrings(raw)
        val n = y.intersect(z)

        val maxLength = n.maxOfOrNull { it.length } ?: 0
        val filteredArray = n.filter { it.length == maxLength }.toTypedArray()
        return filteredArray[0]
    }


    fun generateSubstrings(input: String): List<String> {
    val substrings = mutableListOf<String>()
    val length = input.length // วัดขนาด
    for (start in 0 until length) {  // 0 ถึง จำนวน ความยาว String 
        for (end in start + 1..length) { // ข้ามตัวแรก 
            substrings.add(input.substring(start, end))
        }
    }

    return substrings
}
}