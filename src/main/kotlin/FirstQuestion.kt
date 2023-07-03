fun main() {

    val nameList = arrayListOf("Tugce","Elif","Ayse","Mehmet","Ali")
    println("Please enter 3 names using commas!")
    print("Names: ")
    val getName = readLine()
    val userList = getName?.split(",")?.toList()
    if (!userList.isNullOrEmpty()){
        nameList.addAll(userList)
        println(nameList)
    }
    else println("Please enter 3 names!")
}