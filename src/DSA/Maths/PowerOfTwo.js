var isPowerOfThree = function(n) {
     let x = 0;
    while(true){
        if(Math.pow(3,x) == n){
            return true
        }
        if(Math.pow(3,x)>n){
            return false
        }
        x++;
    }
    return false
};
