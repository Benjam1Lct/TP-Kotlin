import kotlin.random.Random

fun main() {
	var p1 = Point()
	println(p1)
	// TODO
	var p2 = Point(1, 2)
	println(p2)
	println(p1.getX())
	println(p2.getX())
	p2.setY(3)
	println(p2)
	p2.translater(1, 1)
	println(p2)
	p1.deplacer(2,10)
	println(p1)
	println(p2.distanceOrigine())
	println(p1.distance(p2))
	p2=p1
	println("${p1}, ${p2}")
	p1.translater(2,1)
	println("${p1}, ${p2}")

	var points = arrayOfNulls<Point?>(10)
	points[0] = p1
	afficher(points)
	remplir(points)
	println("------------------------------------------")
	afficher(points)

	var fenetre = Fenetre("Fenetre")
	fenetre.montrer()
	
	for (i in O until points.size) {
		fenetre.ajouter(points[i])
	}

}

fun afficher(point: Array<Point?>) {
	for (p in point) {
		if (p != null) {
			println(p)
		}
	}
}

fun remplir(points: Array<Point?>) {
	for (i in 1 until points.size) {
		val dx = Random.nextInt(1, 11)
		val dy = Random.nextInt(1, 11)
		val prevPoint = points[i-1]
		if (prevPoint != null) {
			points[i] = Point(prevPoint.getX(), prevPoint.getY())
			points[i]?.translater(dx, dy)
		}
	}
}