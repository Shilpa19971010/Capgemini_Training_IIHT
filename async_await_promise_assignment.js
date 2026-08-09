const promise1 = Promise.resolve("Hello");
const promise2 = Promise.resolve("You are learning");
const promise3 = Promise.resolve("Javascript");
const promise4 = Promise.reject("Bye");

// Question 1
async function printMessages() {
    console.log(await promise3);
    console.log(await promise1);
    console.log(await promise2);
}

printMessages();

// Question 2(a)
async function doCodeWithPromise2() {
    try {
        const result = await promise2;
        console.log(result);
    } catch (error) {
        console.log(error);
    } finally {
        console.log("Finally block executed");
    }
}

// Question 2(b)
async function doCodeWithPromise4() {
    try {
        const result = await promise4;
        console.log(result);
    } catch (error) {
        console.log(error);
    } finally {
        console.log("Finally block executed");
    }
}

doCodeWithPromise2();
doCodeWithPromise4();