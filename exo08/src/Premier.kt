    /*
La fonction estPremier doit indiquer par un booléen si un nombre est premier
ou pas  

@author init.dev (L.Jezequel)

@ n un nombre entier
@return un booléen indiquant si n est premier ou pas
*/
import kotlin.math.sqrt
import kotlin.math.ceil

fun estPremier(n : Int) : Boolean {
    if (n <= 1) {
        // Les nombres négatifs, zéro et un ne sont pas premiers
        return false
    }

    for (i in 2 until (sqrt(n.toDouble()).toInt() + 1)) {
        if (n % i == 0) {
            return false
        }
    }

    return true
}
