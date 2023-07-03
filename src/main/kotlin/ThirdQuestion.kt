fun main(){

    val students = arrayListOf(
        Student("Ahmet", 20, "Üniversite A"),
        Student("Ayşe", 27, "Üniversite B"),
        Student("Mehmet", 22, "Üniversite C"),
        Student("Fatma", 28, "Üniversite A"),
        Student("Ali", 29, "Üniversite B"),
        Student("Feyza", 24, "Üniversite A"),
        Student("Berkay", 22, "Üniversite B"),
        Student("Caner", 26, "Üniversite A")
    )

    val ageMax = students.maxBy { it.age }
    val ageMin = students.minBy { it.age }

    val maxIndex = students.indexOf(ageMax)
    val minIndex = students.indexOf(ageMin)

    println("Oldest student name is -> ${ageMax.name} | index is -> $maxIndex")
    println("The youngest student name is -> ${ageMin.name} | index is -> $minIndex")
    println()

    val filterStudent = students.filter { it.school == "Üniversite A"}
    println("Filter School -> ${filterStudent.joinToString("\n-> ")}")
    println()

    println("age > 25 --> ${filterStudent.filter { it.age>25 }}")
    println("age < 25 --> ${filterStudent.filter { it.age<25 }}")
}

data class Student(val name: String, val age: Int, val school: String)