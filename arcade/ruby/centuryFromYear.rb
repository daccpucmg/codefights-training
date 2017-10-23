## @author Bruna Cunha
## @version 0.1

def centuryFromYear(year)
    aux = year.to_s 
    
     if aux[-1,1] == '0'
        num = (year/100) 
     else
        num = (year/100) + 1
        
     end
    
    if year == 50
        num = 1
    end

    return num
end
