import java.lang.IllegalArgumentException

fun failWithWrongAge(age: Int?): Nothing {
    throw IllegalArgumentException("Wrong age: $age")
}

fun checkAge(age: Int?) {
    if (age == null || age !in 0..150) failWithWrongAge(age)
    println("Congrats! Next year you'll be ${age + 1}.")
}

fun main() {
    checkAge(10)
}

//agar function tidak berjalan terus menerus dan menjadi throw exception karena nilai age disini null
//jika print tidak menerima variable dengan nilai null, tetapi variable bisa null maka dihentikan prosesnya