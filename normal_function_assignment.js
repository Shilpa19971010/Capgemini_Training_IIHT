const P = 10000;
const R = 5;
const T = 2;

// Normal Function
function simpleInterest1(P, R, T) {
    return (P * R * T) / 100;
}

// Function Expression
const simpleInterest2 = function(P, R, T) {
    return (P * R * T) / 100;
};

// Arrow Function
const simpleInterest3 = (P, R, T) => (P * R * T) / 100;

console.log("Normal Function:", simpleInterest1(P, R, T));
console.log("Function Expression:", simpleInterest2(P, R, T));
console.log("Arrow Function:", simpleInterest3(P, R, T));