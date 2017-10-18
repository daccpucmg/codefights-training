/**
 * @author Ygor Melo
 * @version 1.0
 */

public class checkPalindrome{

	/**
	 * O metodo abaixo resolve o exercicio checkPalindrome https://codefights.com/arcade/intro/level-1/s5PbmwxfECC52PWyQ em Java
	 * @param letra int - pega o tamanho da string e depois decrementa
	 * @return boolean - retorna true se palindromo
	 */
	public boolean checkPalindrome(String inputString) {
		int letra = inputString.length()-1;
   
        for(int x = 0; x < inputString.length(); x++){
    	    if(inputString.charAt(x) != inputString.charAt(letra)){
    		    return false;
            }
            letra--;
        }
        return true;
    }

    public static void main(String[]args){
    	palavra = "arara";
    	
    	System.out.println(checkPalindrome(palavra));
    }
}
