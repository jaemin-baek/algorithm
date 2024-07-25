package baekjoon

fun main() {

    val a = readln().toCharArray()
    val b = readln().toCharArray()

    val countArrayA = IntArray(26)
    val countArrayB = IntArray(26)

    var sum = 0

    for (i in a) {
        val index = i - 'a'
        countArrayA[index] += 1
    }

    for (i in b) {
        val index = i - 'a'
        countArrayB[index] += 1
    }

    for (i in 0..25) {
        val count = Math.abs(countArrayA[i] - countArrayB[i])
        sum += count
    }

    println(sum)
}