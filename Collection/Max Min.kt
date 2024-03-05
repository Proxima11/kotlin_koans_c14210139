// Return a customer who has placed the maximum amount of orders
fun Shop.getCustomerWithMaxOrders(): Customer? =
        customers.maxByOrNull { it.orders.size }

// Return the most expensive product that has been ordered by the given customer
fun getMostExpensiveProductBy(customer: Customer): Product? =
        customer.orders
                .flatMap(Order::products)
                .maxByOrNull(Product::price)

//mengembalikan value terbesar (max) atau terkecil (min) dalam sebuah value
//dengan tambahan OrNull, apabila tidak ditemukan maka akan mengembalikan nilai null