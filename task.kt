fun main() {
    // variabel
    val firstName1 = "Andi"
    val lastName1 = "Budiman"
    val age1= 34

    println(firstName1)
    println(lastName1)
    println(age1)

    val firstName2 = "Rudi"
    val lastName2 = "Setiawan"
    val age2 = 25
    println(firstName2)
    println(lastName2)
    print(age2)

    // array
    val firstName = arrayListOf<String>()
    val lastName = arrayListOf<String>()
    val age = arrayListOf<Int>()

    firstName.add("Andi")
    lastName.add("Setiawan")
    age.add(25)

    for (first in firstName) {
        println(first)
    }
    for (last in lastName) {
        println(last)
    }
    for (a in age) {
        println(a)
    }
}