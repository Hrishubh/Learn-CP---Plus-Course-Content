let n = 7;

for(let row = 1; row <= 7; row++) {
    // this loop does something for every row
    let result = "";
    for(let col = 1; col <= n; col++) {
        // this loop iterates n more times for each loop of row
        result = result + col + " ";
    }
    console.log(result);
}