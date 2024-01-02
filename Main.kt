const val HERO_NAME = "Lorna"

fun main(){

    var playerLevel = 5
    println("The Hero announces the presence to the world. People are fearful")
    println(HERO_NAME)
    println(playerLevel)
    val hasBefriendedBarbarians = true
    val hasAngeredBarbarians = false
    val playerClass = "paladin"

    val quest: String = when (playerLevel) {
        1 -> "Hello"
        in 2..5 -> {
            val canTalkToBarbarians = !hasAngeredBarbarians && (hasBefriendedBarbarians || playerClass == "barbarian")
            if (canTalkToBarbarians) {
                "Convince the Barbarians to call of invasion"
            } else {
                "Save town from barbarians"
            }
        }
        6 -> "Test"
        7 -> "Test"
        8 -> "Test"
        else -> "Test"
    }

    println("The hero approaches the bounty boar: It Reads...")
    println(quest)

    println("Time Passes...")
    println("The Hero returns from her quest")

    playerLevel += 1
    println(playerLevel)
}
