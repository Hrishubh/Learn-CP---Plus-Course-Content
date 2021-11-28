let n = 7;

for(let row = 1; row <= 7; row++) {
    // this loop does something for every row
    let result = "";
    for(let col = 1; col <= row; col++) {
        // this loop iterates n more times for each loop of row
        result = result + col + " ";
    }
    console.log(result);
}

/*  1 
    1 2 
    1 2 3 
    1 2 3 4 
    1 2 3 4 5 
    1 2 3 4 5 6 
    1 2 3 4 5 6 7 
*/