// Solução do exercício AdjacentElementsProduct (Disponível em https://codefights.com/arcade/intro/level-2/xzKiBHjhoinnpdh6m)
fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
    return (1 until inputArray.size)
            .map { inputArray[it -1] * inputArray[it] }
            .max()
            ?: 0
}

fun main(args: Array<String>){
    println(adjacentElementsProduct(mutableListOf(3, 6, -2, -5, 7, 3)))
}
