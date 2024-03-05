class LazyProperty(val initializer: () -> Int) {
    var value: Int? = null
    val lazy: Int
        get() {
            if (value == null) {
                value = initializer()
            }
            return value!!
        }
}

//lazy berarti property tersebut menjadi lebih tidak dipakai fungsi maksimalnya dengan adanya function