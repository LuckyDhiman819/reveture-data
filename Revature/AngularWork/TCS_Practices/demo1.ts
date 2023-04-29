var jam:String = "lucky";
console.log("name is :", jam);

var marks:number = 500;
console.log("Your marks is", marks);

function addNumber(){
    console.log("Adding Numbers");
}

class Customer
{
    private customerId:number;
    private customerName:string;

    constructor()
    {
        this.customerId = 121;
        this.customerName = "Xyz";
    }

    displayDeatils()
    {
        console.log("Your customer id is : "+this.customerId);
        console.log("Your name is : "+this.customerName);
    }
    
}

var customer = new Customer();
customer.displayDeatils();