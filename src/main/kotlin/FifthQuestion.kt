fun main(){

    val workers = arrayListOf(
        Workers("Ahmet Yılmaz", 15000.0),
        Workers("Ayşe Kaya", 32000.0),
        Workers("Mehmet Demir", 29000.0),
        Workers("Fatma Şahin", 18500.0)
    )

    val newList = workers.map {
        val updatedSalaries = it.salary + ((it.salary*35)/100)
        it.name to updatedSalaries
    }
    newList.forEach {(name,salary)->
        println("Worker name is: $name | %35 increase: $salary")
    }
    println()

    println("Sorting from smallest to largest -> ${newList.shuffled().sortedBy { it.second }}")
    println()

    println("Highest salary -> ${newList.maxBy { it.second }}")
    println("Lowest salary -> ${newList.minBy { it.second }}")
    println()

    println("Average salary -> ${newList.sumOf { it.second/4 }}")
}

data class Workers(val name: String, val salary: Double)