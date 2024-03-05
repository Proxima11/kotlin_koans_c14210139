// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> = customers.filter {
    val (delivered, undelivered) = it.orders.partition { it.isDelivered }
    undelivered.size > delivered.size
}.toSet()

//mengklasifikasikan berdasarkan fungsi dengan parameter tertentu dibandingkan dengan parameter lain pada suatu list