fun main(){

    val names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")
    names.sort()
    println("Sort: $names")

    println("Please enter 1 name!")
    print("Name: ")
    val getNameFromUser = readLine()
    if (names.contains(getNameFromUser)){
        println("Output: ${getNameFromUser?.uppercase()?.reversed()}")
    }
    else println("This name couldn't find!")
}