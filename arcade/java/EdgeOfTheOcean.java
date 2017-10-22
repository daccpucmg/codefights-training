public class EdgeOfTheOcean {

    // Solução da questão Edge of the Ocean em Java 
    public static int adjacentElementsProduct(int[] inputArray){
        int max = Integer.MIN_VALUE;
        for (int i=1; i<inputArray.length; i++){
            int temp = inputArray[i -1] * inputArray[i];
            if (temp > max) max = temp;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(adjacentElementsProduct(new int[]{3, 6, -2, -5, 7, 3}));
    }

}
