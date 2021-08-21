#!/usr/bin/env node

var argv = require('minimist')(process.argv.slice(2), {
    boolean: ["help"]
});

console.log("hello world");

var args = process.argv.splice(2);

console.log(argv)