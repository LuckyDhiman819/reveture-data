var jam = "lucky";
console.log("name is :", jam);
var marks = 500;
console.log("Your marks is", marks);
function addNumber() {
    console.log("Adding Numbers");
}
var Customer = /** @class */ (function () {
    function Customer() {
        this.customerId = 121;
        this.customerName = "Xyz";
    }
    Customer.prototype.displayDeatils = function () {
        console.log("Your customer id is : " + this.customerId);
        console.log("Your name is : " + this.customerName);
    };
    return Customer;
}());
var customer = new Customer();
customer.displayDeatils();
