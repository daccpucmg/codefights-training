package main

import "fmt"

/**
  * @author João Castro
  * @version 1.0
  */

// O Metodo abaixo resolve o problema century from year (https://codefights.com/arcade/intro/level-1/egbueTZRRL5Mm4TXN)

func centuryFromYear(year int) int {
    var resposta int
    if year % 100 == 0 {
     resposta = year/100
    }else{
        resposta = (year/100) + 1
    }
    return resposta
}

func main(){
	fmt.Println("Ano 1 Século: "  , centuryFromYear(1));
	fmt.Println("Ano 1700 Século: " , centuryFromYear(1700));
	fmt.Println("Ano 1997 Século: " , centuryFromYear(1997));
	fmt.Println("Ano 2000 Século: " , centuryFromYear(2000));
	fmt.Println("Ano 2001 Século: " , centuryFromYear(2001));
}
