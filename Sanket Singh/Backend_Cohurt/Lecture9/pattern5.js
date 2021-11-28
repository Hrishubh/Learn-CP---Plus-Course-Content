let n = 5;
for(let row = 1; row <= n; row++) {
    let result = "";
    // spaces
    for(let spaces = 1; spaces <= 2*(n - row); spaces++) {
        result = result + " ";
    }
    for(let i = 1; i <= row; i++) {
        result = result + i + " ";
    }
    for(let i = row - 1; i >= 1; i--) {
        result = result + i + " ";
    }
    console.log(result);
}
/*
        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1
*/