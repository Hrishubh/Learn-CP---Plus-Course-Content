let n = 5;
for(let row = 1; row <= n; row++) {
    // this loop will do something for each row
    let result = "";
    for(let spaces = 1; spaces <= 2*(n-row); spaces++) {
        result = result + " ";
    }

    for(let stars = 1; stars <= (2*row) - 1; stars++) {
        result = result + "* ";
    }

    console.log(result); // this is the result of current row
}