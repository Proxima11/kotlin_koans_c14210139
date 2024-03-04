fun Int.r(): RationalNumber = RationalNumber(this, 1)

fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

data class RationalNumber(val numerator: Int, val denominator: Int)

//menggunakan this untuk menggunakan variable yang ada di class tersebut agar sesuai dengan isi class
//menggunakan extension untuk mengconvert tipe data