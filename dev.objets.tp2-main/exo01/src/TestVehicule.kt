fun main() {
    var maSaxo = Vehicule("Saxo","rouge",4,180.0)
    println(maSaxo)
    // TODO
    maSaxo.demarrer()
    maSaxo.accelerer(50.0)
    println(maSaxo)
    maSaxo.accelerer(40.0)
    println(maSaxo.vitesse())

    var maFerrari = Vehicule("Ferrari","rouge",4,300.0)
    maFerrari.demarrer()
    maFerrari.accelerer(50.0)

    println(maFerrari.vaPlusVite(maSaxo))

    maFerrari.arreter()
    maSaxo.arreter()
}
