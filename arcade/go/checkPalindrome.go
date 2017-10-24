package main

import "fmt"

/**
  * @author Jorge Luiz
  * @version 1.0
  */
// O Metodo abaixo resolve o problema checkPalindrome em Linguagem go(https://codefights.com/arcade/intro/level-1/s5PbmwxfECC52PWyQ)

func checkPalindrome(inputString string ) bool  {
	var resp bool = true
	y := len(inputString)
	y = y - 1
	for x := 0;x< len(inputString); x++  {
		if inputString[x] != inputString[y]{
			resp = false
		}
		y--
	}
	return  resp

}
func main() {
	fmt.Println("Arara é palindromo ? "  , checkPalindrome("arara"))
	fmt.Println("Jorge é palindromo ? "  , checkPalindrome("jorge"))
}
