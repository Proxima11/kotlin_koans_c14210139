// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> =customers.map(Customer::getOrderedProducts).reduce { orderedByAll, customer ->
        orderedByAll.intersect(customer)
    }

fun Customer.getOrderedProducts(): Set<Product> =
    orders.flatMap(Order::products).toSet()

//Fungsi fold() digunakan untuk menghasilkan nilai tunggal dari koleksi
//reduce = memggunakan akumulator dimulai dengan elemen pertama dalam koleksi, bukan nilai awal yang diteruskan sebagai argumen