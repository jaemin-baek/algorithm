package baekjoon

fun main() {

    val str = readln()
    var ans = ""

    str.forEach { char ->
        if (char >= 'A' && char <= 'Z') {
            val count = char - 'A'
            ans += 'a' + count
        } else {
            val count = char - 'a'
            ans += 'A' + count
        }
    }
    println(ans)
}