class LazyProperty(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}

//implemetasi value yang dideclare dan dimasukkan ke library dan memanggilnya lewat library