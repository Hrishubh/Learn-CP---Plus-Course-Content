// negative zero

let x = -0;

console.log(x);
console.log(typeof x);
console.log(Math.sign(x));

console.log(x > 0);
console.log(x < 0);
console.log(x == 0);

console.log(Object.is(x, -0));
console.log(Object.is(x, 0));