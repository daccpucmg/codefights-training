
public class AdjacentElementsProduct{

	public int adjacentElementsProduct(int[] inputArray) {
    	int product = inputArray [0] * inputArray [1];
    
    	for(int i = 1; i < inputArray.length-1; i++){
        	int temp = inputArray[i] * inputArray[i+1];
        	if(temp > product){
            	product = temp;
        	}
    	}
    	return product;
	}

	public static void main(String[]args){
		//Adicione os elementos no array
		int [] inputArray = [-1, -2];
		
		System.out.println(adjacentElementsProduct(inputArray));
	}
}