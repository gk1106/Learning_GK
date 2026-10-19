var getNumber = function (a:number,b:number,c?:number) {
   
    return a + b + (c ?? 0);
    }

    console.log(getNumber(1,2)); // Output: NaN (since c is undefined)