let arr = [1,2,1,3,2,5,3,6,5];
let result = 0;

for(let i = 0; i < arr.length; i++) {
    result = result ^ arr[i];
}

console.log(result);