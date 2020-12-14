fun main() {

    val dwifa : Human = Human("dwifa rahmadaniah")
    val andi : Human = Human("Andi")

    dwifa.email = "dwifa@gmail.com"
    dwifa.address = "Tanjung Selor, Kalimantan Utara"

    andi.email = "andi@gmail.com"
    andi.address = "Kotagede, Yogyakarta"

    dwifa.talk()
    andi.talk()

    dwifa.introduce()

    println(dwifa.verify("dwifa@gmail.com"))

    println(Rahardi.name)

    val ardi : Rahardi = Rahardi
    println(ardi.nationality)

    println(dwifa)
}