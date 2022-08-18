import main.kotlin.Barang

fun main() {

    var barangArrayList = ArrayList<Barang>()
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("test")
    barangArrayList =
        arrayListOf(
            Barang("Omron", "Tensi Digital", "7120", "45000", "5000", "10", "pcs"),
            Barang("Avico", "Tongkat Bangku", "", "95000", "100000", "6", "pcs"),
            Barang("General Care", "USG GEl", "Galon", "75000", "80000", "4", "pcs"),
            Barang("3M", "Kasa Steril ", "pack", "13000", "14000", "10", "pcs"),
            Barang("Dr.p", "Pampers Dewasa", "L", "55000", "60000", "10", "pcs"),
            Barang("Litmann", "Stetoscope", "black", "1750000", "1850000", "10", "pcs")

        )
    //println(barangArrayList)
   barangArrayList[0]
    var sortBarang = arrayListOf<String>()
    var arraysize = barangArrayList.size-1

    var arrayindices = barangArrayList.indices
    println(arraysize)
    println(arrayindices)
    for (pointer in (0..barangArrayList.lastIndex).reversed()){
        sortBarang.add(barangArrayList[pointer].toString())
    }

        var filterArray  =  barangArrayList.filter {
            it.stok=="10"
        }
    for (pointer in filterArray.indices) {
        println(filterArray[pointer])
    }



    val numbers = listOf("one", "two", "three", "four")
    val longerThan3 = numbers.filter { it.length > 3 }
    println(longerThan3)

//    for (pointer in barangArrayList.indices) {
//        sortBarang.add(barangArrayList[pointer].toString())
//    }
    for (pointer in barangArrayList.indices) {
    println(sortBarang[pointer])
    }
//    barangArrayList.sortBy {
//        it.merk
//    }
//    barangArrayList.forEach {
//        println(it)
//    }




    //println(barangArrayList.sortBy {  })

    data class Date(val year: Int, val month: Int, val day: Int) {
    }

        var dates = mutableListOf(
            Date(2020, 4, 3),
            Date(2021, 5, 16),
            Date(2020, 1, 29)
        )

        println("--- ASC ---")
        dates.sortBy { it.year }
        dates.forEach { println(it) }

    var hari =ArrayList<String>()

//    hari= dates.sortBy{dates.indices.last}
//    hari.forEach{
//


}

