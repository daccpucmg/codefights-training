# @author Bruna Cunha de Oliveira
# @version 0.1

def adjacentElementsProduct(inputArray)
    inputArray.each_cons(2).map {|f, s| f * s }.max
end
