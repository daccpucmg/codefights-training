/**
 * @author Federico Jansen de Oliveira
 * @version 1.0
 */

class CenturyFromYear{

	/**
	 * O metodo abaixo resolve o exercicio CenturyFromYear https://codefights.com/arcade/intro/level-1/egbueTZRRL5Mm4TXN/ em Java
	 * @param year int - ano a ser calculado o seculo
	 * @return int - seculo do ano recebido
	 */
  public static int centuryFromYear(int year) {

    return ( (year%100) == 0) ? year/100 : year/100 + 1;

  }

  public static void main(String[]args){

    System.out.println(centuryFromYear(1));
    System.out.println(centuryFromYear(100));
    System.out.println(centuryFromYear(101));
    System.out.println(centuryFromYear(200));
    System.out.println(centuryFromYear(2000));
    System.out.println(centuryFromYear(2005));

  }
}
