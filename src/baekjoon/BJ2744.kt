package baekjoon

fun main() {

    var ans = ""

    readln().forEach { char ->
        if (char.isUpperCase()) {
            ans += char.lowercase()
        } else {
            ans += char.uppercase()
        }
    }
    print(ans)
}