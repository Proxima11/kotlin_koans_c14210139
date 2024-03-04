fun joinOptions(options: Collection<String>) =
        options.joinToString(prefix = "[", postfix = "]")

//menambahkan argument dalam function dan joinToString untuk menampilkan array / collection string
//Collection bisa menerima listOf
//joinToString punya prefix dan postfix sehingga menjadi [a,b,c]