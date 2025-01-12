var isPowerOfTwo = function(n) {
    let x = 0;
    while(true){
        if(Math.pow(2,x) == n){
            return true
        }
        if(Math.pow(2,x)>n){
            return false
        }
        x++;
    }
    return false
};
