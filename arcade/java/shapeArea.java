/**
 * @author Gabriel VAsconcelos
 * @version 1.0
 */
 
 public class shapeArea{
   
   //o metodo abaixo resolve a questao shapeArea em Java
   public static int shapeArea(int n) {
    int result = (n * n) + (n - 1) * (n - 1);
    
    return result;
   }

   public static void main(String[] args){
      System.out.println(shapeArea(2));
      System.out.println(shapeArea(3));
      System.out.println(shapeArea(1));
      System.out.println(shapeArea(5));
   }
   
 }//fim class