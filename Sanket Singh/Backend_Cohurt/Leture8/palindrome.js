let str = "racecar";
let i = 0, j = str.length - 1;

let result = true; // assume that string is a palindrome
while(i <= j) {
  if(str[i] == str[j]) {
    i = i + 1;
    j = j-1;
  } else {
    result = false; // if at any moment in time you hit this else block u r not a palindrome
    break;
  }
}

if(result == false) {
  console.log("Not a palindrome");
} else {
  console.log("yes a palindrome");
}
