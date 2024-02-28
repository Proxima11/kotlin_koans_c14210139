class Invokable {
    var numberOfInvocations: Int = 0
        private set

    operator fun invoke(): Invokable {
        numberOfInvocations++
        return this

    }
}

fun invokeTwice(invokable: Invokable) = invokable()()

//bisa membuat sebuah kelas dipanggil seperti sebuah function dan membuatnya lebih ringkas