let n = 7;
let row = 0;
while(row <= Math.floor(n/2)) { // 7/2 -> 3.123 == 3
  let result = "";
  let spaces = 0;
  
  while(spaces < (n - (2*row + 1))) {
    result = result + " ";
    spaces = spaces + 1;
  }
  
  let stars = 0;
  
  while(stars < 2*row + 1) {
    result = result + "* ";
    stars = stars + 1;
  }
  console.log(result);
  row = row + 1;
}

while(row <= n) {
  let result = "";
  let spaces = 0;
  let count_of_stars = 2*(n - row) - 1;
  while(spaces < (n - count_of_stars)) {
        result = result + " ";
        spaces  = spaces + 1;
  }
  let stars = 0;
  while(stars < count_of_stars) {
    result = result + "* ";
    stars = stars + 1;
  }
  console.log(result);
  row = row + 1;
}

