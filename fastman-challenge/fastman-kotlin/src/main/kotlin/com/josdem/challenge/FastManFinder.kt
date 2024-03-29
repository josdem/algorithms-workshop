package com.josdem.challenge

class FastManFinder {
    private val dictionary = arrayOf("fast", "fat", "man", "strong")
    private val result: MutableList<String> = ArrayList()
    private var string: String = ""

    fun find(keyword: String): String {
        this.string = keyword
        (0..string.length).forEach { index: Int -> evaluateWord(0, index) }
        reverseFind()
        return result.joinToString(" ")
    }

    private fun reverseFind() {
        (0..string.length).map { 0 - it + string.length }.forEach { index: Int ->
            evaluateWord(
                index,
                string.length
            )
        }
    }

    private fun evaluateWord(from: Int, to: Int) {
        val word = string.substring(from, to)
        if (dictionary.contains(word)) {
            result.add(word)
        }
    }

}
