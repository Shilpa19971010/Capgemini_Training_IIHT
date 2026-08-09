const product = {
    productName: "Laptop",
    price: 50000,
    colors: ["black", "white"],
    brandName: "Dell",
    licenseNo: "LIC01AB",
    discount: "10%",
    distributor: [
        { name: "ABC", code: 100 },
        { name: "ABC1", code: 101 },
        { name: "ABC2", code: 102 }
    ],
    platforms: ["Amazon", "Flipkart", "eBay"],
    country: "India"
};

// 1. Print product name with price and color separately
const { productName, price, colors } = product;

console.log("Product Name:", productName);
console.log("Price:", price);
console.log("Colors:", colors[0], colors[1]);

// 2. Print distributor details along with license number
const { distributor, licenseNo } = product;

distributor.forEach((dist) => {
    console.log(
        `${dist.name} with code ${dist.code} is having license number ${licenseNo}`
    );
});

// 3. Print product name with platform, color and price
const { platforms } = product;

platforms.forEach((platform) => {
    console.log(
        `${productName} is promoted on ${platform} with color ${colors.join(
            ", "
        )} and price ${price}`
    );
});

// 4. Print remaining details using Rest Operator
const { productName: pn, price: pr, colors: cl, ...restDetails } = product;

console.log("Remaining Details:");
console.log(restDetails);