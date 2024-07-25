package baekjoon

import java.time.LocalDate
import java.time.ZoneId
import java.time.format.DateTimeFormatter

fun main() {
    // 서울의 타임존을 설정합니다.
    val seoulZoneId = ZoneId.of("Asia/Seoul")

    // 현재 날짜를 서울 타임존에 맞춰 가져옵니다.
    val todayInSeoul = LocalDate.now(seoulZoneId)

    // 날짜를 원하는 형식으로 포맷합니다.
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    val formattedDate = todayInSeoul.format(formatter)

    // 결과를 출력합니다.
    println(formattedDate)
}