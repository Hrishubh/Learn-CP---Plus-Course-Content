let arr = [0,1,1,2,2,1,0,0,2,1,2];

let i = 0, j = 0, k = arr.length - 1;

while(j <= k) {
    if(arr[j] == 1) {
        j = j+1;
    } else if(arr[j] == 2) {
        let temp = arr[k];
        arr[k] = arr[j];
        arr[j] = temp;
        k = k - 1;
    } else {
        let temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i = i + 1;
        j = j + 1;
    }
}

console.log(arr);