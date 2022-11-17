function validateLoginDetails(email, password) {
    var result = "";
    if (email == null || email.trim() == "") {
        result = "Email cannot be empty";
    }
    else if (email.indexOf("@gmail.com") == -1) {
        result = "Invalis email. Mail Id should end with @gmail.com";
    }
    else if (password == null || password.trim() == "") {
        result = "password cannot be empty";
    }
    else if (password.length < 8) {
        result = "password must be minimum 8 characters";
    }
    else {
        result = "SUCCESS";
    }
    return result;
}
// TEST Cases
// console.log("Valid Email/Password , result=" + validateLoginDetails('admin@gmail.com', 'pass1234'));
// console.log("Invalid Email , result=" + validateLoginDetails('', 'pass1234'));
// console.log("Invalid Email , result=" + validateLoginDetails('  ', 'pass1234'));
// console.log("Invalid Email  , result=" + validateLoginDetails('naresh@yahoo.com', 'pass1234'));
// console.log("Invalid Password   , result=" + validateLoginDetails('naresh@gmail.com', ' '));
// console.log(" Password Length Check  , result=" + validateLoginDetails('naresh@gmail.com', 'pass'));
console.log("password length check, result=" + validateLoginDetails('yashashwinicheekuri@gmail.com', 'pass123456'));
