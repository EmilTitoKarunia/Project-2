fun main(args: Array<String>) {
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    x.forEach { print(it.toString() + ' ') }
    print('\n')
    //nilai array diketahui ada 2 index dengan nilai 1,2,3
    //selanjutnya nilai index 0 diganti dengan index 1 ditambah index 2 dengan hasil 5

    val byteArray = ByteArray(5)
    byteArray.forEach { print(it.toString() + ' ') }
    print('\n')
    //nilai byte 0 dan 1
    //dengan array diketahui 5 maka keluaran program adalah 5 buah nol


    val shortArray = ShortArray(5) { 42 }
    shortArray.forEach { print(it.toString() + ' ') }
    print('\n')
    //array dengan keluaran mengulangi nilai pada range sebanyak nilai yang dimasukkan


    var intArray = IntArray(5) { it * 1 }
    intArray.forEach { print(it.toString() + ' ') }
    print('\n')
    //array dengan keluaran nilai bertambah satu sebanyak nilai yang dimasukkan
}