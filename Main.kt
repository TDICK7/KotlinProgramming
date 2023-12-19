const val HERO_NAME = "Lorna"

fun main(){

    var playerLevel = 5
    println("The Hero announces the presence to the world. People are fearful")
    println(HERO_NAME)
    println(playerLevel)
    val hasBefriendedBarbarians = true
    val hasAngeredBarbarians = false
    val playerClass = "paladin"

    val quest: String = if(playerLevel == 1) {
        "Test"
    } else if (playerLevel <= 5) {
        val canTalkToBarbarians = !hasAngeredBarbarians && (hasBefriendedBarbarians || playerClass == "barbarian")
       if(canTalkToBarbarians) {
          "Convince the Barbarians to call of invasion"
        } else {
           "Save town from barbarians"
       }
    } else if(playerLevel == 6) {
        "Test"
    } else if(playerLevel == 7) {
        "Test"
    } else if(playerLevel == 8) {
        "Test"
    } else {
        "Test"
    }
    println("The hero approaches the bounty boar: It Reads...")
    println(quest)

    println("Time Passes...")
    println("The Hero returns from her quest")

    playerLevel += 1
    println(playerLevel)
}
