// Build a map that stores the customers living in a given city
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> =
        customers.groupBy { it.city }

//memetakan list berdasarkan value dan menggabungkan mereka menjadi satu kelompok