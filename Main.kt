const val HERO_NAME = "Lorna"

fun main(){

    println("The Hero announces the presence to the world. People are fearful")
    println(HERO_NAME)
    var playerLevel = 4
    println(playerLevel)

    if(playerLevel == 1) {
        println("")
    } else if(playerLevel <= 5){
        println("")
    }else if(playerLevel == 6){
        println("")
    }else if(playerLevel == 7){
        println("")
    }else if(playerLevel == 8){
        println("")
    }else if(playerLevel == 9){
        println("")
    }

    println("Time Passes...")
    println("The Hero returns from her quest")

    playerLevel += 1
    println(playerLevel)
}
