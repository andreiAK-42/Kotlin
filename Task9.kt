fun main() {
    missionOne()
    missionTwo()
    missionThree()
    missionFour()
    missionFive("+7")
    missionSix()
    missionSeven()
}

fun missionOne() {
    val numbers: Array<Int> = arrayOf(1, -5, 3, 150, -24, -3, 5, 1)
    val minusNumbers = numbers.filter { it < 0 }

    println(minusNumbers)
}

fun missionTwo() {
    val numbers: Array<Int> = arrayOf(1, -5, 3, 150, -24, -3, 5, 1)
    val transformNumbers = numbers.map { it * -1 }

    println(transformNumbers)
}

fun missionThree() {
    val numbers: Array<Int> = arrayOf(1, -5, 3, 150, -24, -3, 5, 1)
    val transformNumbers = numbers.map { it * it }

    println(transformNumbers)
}

fun missionFour() {
    val numbers: List<Int> = IntRange(1, 7).toList()

    println("=" + numbers.joinToString(separator = "+") { it.toString() } + "=")
}

fun missionFive(countryCode: String) {
    val phoneBook: Map<String, String> = mapOf(
        "Нея" to "+792340342304", "Дэвид" to "+199213819239",
        "Дуайт" to "+4843182938123", "Кейт" to "+7129039102402", "Эйс" to "+48923546512", "Юи" to "+1293102945631"
    )

    phoneBook.forEach {
        if (it.value.substring(0, 2) == countryCode) {
            println("Имя: ${it.key} Телефон: ${it.value}")
        }
    }
}

fun missionSix() {

}

fun missionSeven(){
    val date: String = "01:20:12"

    val dateSplit: List<String> = date.split(":")
    val seconds: Int = (dateSplit[0].toInt() * 3600) + (dateSplit[1].toInt() * 60) + dateSplit[2].toInt()

    println("Секунд: $seconds")
}


