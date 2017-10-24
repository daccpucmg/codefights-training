/**
 * @author Ygor Matheus Lacerda de Melo
 * @version 1.0
 */

func checkPalindrome(inputString: String) -> Bool {
  let inputString = inputString.lowercased().characters.filter{ $0 != " " }
  for (i, character) in inputString.enumerated() {
    if character != inputString[inputString.count-i-1] {
       return false
    }
  }
 return true
}