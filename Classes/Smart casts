fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> eval(expr.left) + eval(expr.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

//smart casts dengan is dapat mengklasifikasikan apakah variable atau objek termasuk bertipe null atau tidak dan meneruskan jika sesuai non-nullable
//bisa jadi pengganti if else