package main

import "fmt"

/**
  * @author João Castro
  * @version 1.0
  */

// O Metodo abaixo resolve o problema adjacent Elements Product (https://codefights.com/arcade/intro/level-2/xzKiBHjhoinnpdh6m)


func adjacentElementsProduct(inputArray []int) int {
    var max int = -99999
    for i := 0; i < len(inputArray)-1; i = i + 1{
        if inputArray[i]*inputArray[i+1] > max{
            max = inputArray[i]*inputArray[i+1]
        }
    }
    return max;
}


func main() {
	inputA := []int {3, 2, 1, -1, 3, 4}
	fmt.Println("Array:", inputA ,"Maior Produto:",adjacentElementsProduct(inputA))
	inputB := []int {2, 3, 5, 7, 11, 13}
	fmt.Println("Array:", inputB ,"Maior Produto:",adjacentElementsProduct(inputB))
	inputC := []int {3, 6, -2, -5, 7, 3}
	fmt.Println("Array:", inputC ,"Maior Produto:",adjacentElementsProduct(inputC))
	inputD := []int {4, 1, 2, 3, 1, 5}
	fmt.Println("Array:", inputD ,"Maior Produto:",adjacentElementsProduct(inputD))
}