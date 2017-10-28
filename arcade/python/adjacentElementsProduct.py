
# @author Pedro Campos Miranda
# @version 1.0

def adjacentElementsProduct(inputArray):
    product = []
    for i in range(len(inputArray)-1):
        product.append(inputArray[i]*inputArray[i+1])
    return max(product)
