def adjacentElementsProduct(inputArray)
    inputArray.each_cons(2).map {|f, s| f * s }.max
end
