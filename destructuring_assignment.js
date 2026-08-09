const fruits = [
    "Apple",
    "Orange",
    "Pear",
    "Kiwi",
    "Banana",
    "Melon",
    "Strawberry",
    "Mango",
    "Chiku",
    "Grapes",
    "Small-grapes"
];

// 1. Even index fruits
console.log("Even Index Fruits:");
fruits.forEach((fruit, index) => {
    if (index % 2 === 0) {
        console.log(fruit);
    }
});

// 2. Odd index fruits
console.log("\nOdd Index Fruits:");
fruits.forEach((fruit, index) => {
    if (index % 2 !== 0) {
        console.log(fruit);
    }
});

// 3. Multiples of 3 index fruits
console.log("\nMultiple of 3 Index Fruits:");
fruits.forEach((fruit, index) => {
    if (index % 3 === 0) {
        console.log(fruit);
    }
});

// 4. 1st, 6th and last fruits
console.log("\n1st, 6th and Last Fruits:");
console.log(fruits[0], fruits[5], fruits[fruits.length - 1]);