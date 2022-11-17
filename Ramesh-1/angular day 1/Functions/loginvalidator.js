"use strict";
exports.__esModule = true;
var LoginValidator = /** @class */ (function () {
    function LoginValidator() {
        console.log("Constructor called");
    }
    LoginValidator.prototype.validate = function (email, password) {
        var errorMessage = "";
        if (email == "") {
            errorMessage = "Email cannot be empty";
        }
        else if (password == "") {
            errorMessage = "Password cannot be empty";
        }
        else {
            errorMessage = "";
        }
        console.log("ErrorMessage:" + errorMessage);
    };
    return LoginValidator;
}());
var loginValidator = new LoginValidator();
loginValidator.validate("@gmail.com", "");
