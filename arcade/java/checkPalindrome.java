/**
 * @authors Ygor Melo, Paulo H. Souza
 * @version 1.0
 */

public class checkPalindrome{

	/**
	 * O metodo abaixo resolve o exercicio checkPalindrome https://codefights.com/arcade/intro/level-1/s5PbmwxfECC52PWyQ em Java
	 * @param letra int - pega o tamanho da string e depois decrementa
	 * @return boolean - retorna true se palindromo
	 */
	public static boolean checkPalindrome(String inputString) {
		int letra = inputString.length()-1;
   
        for(int x = 0; x < inputString.length(); x++){
    	    if(inputString.charAt(x) != inputString.charAt(letra)){
    		    return false;
            }
            letra--;
        }
        return true;
    }
		
  /**
	 * O metodo abaixo resolve o exercicio checkPalindrome https://codefights.com/arcade/intro/level-1/s5PbmwxfECC52PWyQ em Java
	 * @param letra int - pega o tamanho da string e depois decrementa
	 * @return boolean - retorna true se palindromo
	 */
		public static boolean checkPalindrome_newSolution(String inputString) {
		    boolean isPalindrome = true;

				for (int i = 0; i < inputString.length()/2; ++i) {
				    isPalindrome &= inputString.charAt(i) == inputString.charAt(inputString.length()-1-i);
				}
				return isPalindrome;
		}



    public static void main(String[]args){
    	String palavra = "arara";
    	
    	System.out.println(checkPalindrome(palavra));
			System.out.println(checkPalindrome_newSolution(palavra));
    }
}
