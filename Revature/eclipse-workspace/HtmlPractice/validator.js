function validate() {

    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    if (username.length == 0) {
        alert("Your Username should not be empty!!!!");
        return false;
    }
    else if (password.length == 0) {
        alert("Your password should not be empty!!!!");
        return false;
    }

    else if (password.length < 6 || password.length > 10) {
        alert("Your password shuld be in between 6 to 10 character!!!");
        return false;
    }

    else {
        alert("Welcome to our page");
        return true;
    }
}
function validate2() {

    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var show = document.getElementById("show");

    if (username.length == 0) {
        show.innerHTML = `<div class="alert alert-danger show" role="alert">
        <u><i> Your Username should not be empty!!!!
		</div>`;
        return false;
    }
    else if (password.length == 0) {
        show.innerHTML = `<div class="alert alert-danger show" role="alert">
        <u><i> Your password should not be empty!!!!
		</div>`;
        return false;
    }

    else if (password.length < 6 || password.length > 10) {
        show.innerHTML = `<div class="alert alert-danger show" role="alert">
        <u><i>Your password shuld be in between 6 to 10 character!!!
		</div>`;
        return false;
    }

    else {
        // alert("Welcome to our page");
    //     show.innerHTML = `<div class="alert alert-success" role="alert">
    //     <i><u>This is a success alert—check it out!
    //   </div>`;
        return true;
    }

}

function validate3() {
    // var allFeilds = document.forms[0].getElementsByTagName
    var myForm = document.getElementById("myForm");
    //Extract Each Element Value
    for (var i = 0; i < myForm.elements.length; i++) {
        // console.log("showing");
        
        if (myForm.elements[i].value == "") {
            alert("All Fields Are Mandatory")
            return false;
            break;
        }

    }
    var options = document.getElementsByName("gender");
    for (var i = 0; i < options.length; i++) {
        if (options[i].checked) {
            // do whatever you want with the checked radio
            var calc = options[i].value;
        }
    }
    var options2 = document.getElementsByName("notification");
    calc1 = [];
    for (var i = 0; i < options2.length; i++) {
        if (options2[i].checked) {
            // do whatever you want with the checked radio
            calc1.push(options2[i].value);

        }
    }
    var pass1 = myForm.elements[1].value;
    var pass2 = myForm.elements[2].value;
    // console.log(pass1, pass2);
    if(pass1.length < 6 || pass1.length > 10){
        alert("Password Shuld be in 6 to 10 character");
        return false;
    }
    else if(pass1 !==pass2){
        alert("Password and Confirm Password Should be same.");
        return false;
    }
    else if(myForm.elements[4].value.length!= 10){
        alert("Phone number should be in 10 digits")
        return false;
    }
    else if(typeof calc == "undefined"){
        alert("Gender is mandatory fields")
        return false;
    }
    else if (calc1.length==0) {
        alert("Please select atleast one option in notification");
        return false;
    }
    else{
        return true;
    }

   

}
function validate4() {
    // var allFeilds = document.forms[0].getElementsByTagName
    var myForm = document.getElementById("myForm");
    //Extract Each Element Value
    for (var i = 0; i < myForm.elements.length; i++) {
        // console.log("showing");
        
        if (myForm.elements[i].value == "") {
            // alert("All Fields Are Mandatory")
            show.innerHTML = `<div class="alert alert-danger show" role="alert">
            <i><u> All Fields Are Mandatory
		</div>`;
            return false;
            break;
        }

    }
    var options = document.getElementsByName("gender");
    for (var i = 0; i < options.length; i++) {
        if (options[i].checked) {
            // do whatever you want with the checked radio
            var calc = options[i].value;
        }
    }
    var options2 = document.getElementsByName("notification");
    calc1 = [];
    for (var i = 0; i < options2.length; i++) {
        if (options2[i].checked) {
            // do whatever you want with the checked radio
            calc1.push(options2[i].value);

        }
    }
    var pass1 = myForm.elements[1].value;
    var pass2 = myForm.elements[2].value;
    // console.log(pass1, pass2);
    if(pass1.length < 6 || pass1.length > 10){
        // alert("Password Shuld be in 6 to 10 character");
        show.innerHTML = `<div class="alert alert-danger show" role="alert">
        <i><u> Password Shuold be in 6 to 10 character		</div>`;
        return false;
    }
    else if(pass1 !==pass2){
        // alert("Password and Confirm Password Should be same.");
        show.innerHTML = `<div class="alert alert-danger show" role="alert">
        <i><u> Password and Confirm Password Should be same.		</div>`;
        return false;
    }
    else if(myForm.elements[4].value.length!= 10){
        // alert("Phone number should be in 10 digits");
        show.innerHTML = `<div class="alert alert-danger show" role="alert">
        <i><u> Phone number should be in 10 digits		</div>`;
        return false;
    }
    else if(typeof calc == "undefined"){
        // alert("Gender is mandatory fields");
        show.innerHTML = `<div class="alert alert-danger show" role="alert">
        <i><u> Gender is mandatory fields
		</div>`;
        return false;
    }
    else if (calc1.length==0) {
        // alert("Please select atleast one option in notification");
        show.innerHTML = `<div class="alert alert-danger show" role="alert">
        <i><u> Please select atleast one option in notification		</div>`;
        return false;
    }
    else{
        return true;
    }

   

}


function validate5() {
    // var allFeilds = document.forms[0].getElementsByTagName
    var myForm = document.getElementById("myform");
    //Extract Each Element Value
    for (var i = 0; i < myForm.elements.length; i++) {
        // console.log("showing");
        
        if (myForm.elements[i].value == "") {
            // alert("All Fields Are Mandatory")
            show.innerHTML = `<div class="alert alert-danger show" role="alert">
            <i><u> All Fields Are Mandatory
		</div>`;
            return false;
            break;
        }

    }
    var options = document.getElementsByName("gender");
    for (var i = 0; i < options.length; i++) {
        if (options[i].checked) {
            // do whatever you want with the checked radio
            var calc = options[i].value;
        }
    }
    var options2 = document.getElementsByName("notification");
    calc1 = [];
    for (var i = 0; i < options2.length; i++) {
        if (options2[i].checked) {
            // do whatever you want with the checked radio
            calc1.push(options2[i].value);

        }
    }
    var pass1 = myForm.elements[1].value;
    var pass2 = myForm.elements[2].value;
    // console.log(pass1, pass2);
    if(pass1.length < 6 || pass1.length > 10){
        // alert("Password Shuld be in 6 to 10 character");
        show.innerHTML = `<div class="alert alert-danger show" role="alert">
        <i><u> Password Shuold be in 6 to 10 character		</div>`;
        return false;
    }
    else if(pass1 !==pass2){
        // alert("Password and Confirm Password Should be same.");
        show.innerHTML = `<div class="alert alert-danger show" role="alert">
        <i><u> Password and Confirm Password Should be same.		</div>`;
        return false;
    }
    else if(myForm.elements[4].value.length!= 10){
        // alert("Phone number should be in 10 digits");
        show.innerHTML = `<div class="alert alert-danger show" role="alert">
        <i><u> Phone number should be in 10 digits		</div>`;
        return false;
    }
    else if(typeof calc == "undefined"){
        // alert("Gender is mandatory fields");
        show.innerHTML = `<div class="alert alert-danger show" role="alert">
        <i><u> Gender is mandatory fields
		</div>`;
        return false;
    }
    else if (calc1.length==0) {
        // alert("Please select atleast one option in notification");
        show.innerHTML = `<div class="alert alert-danger show" role="alert">
        <i><u> Please select atleast one option in notification		</div>`;
        return false;
    }
    else{
        return true;
    }

   

}

