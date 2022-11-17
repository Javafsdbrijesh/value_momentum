export {}

class LoginValidator{

    constructor(){

        console.log("Constructor called");

    }

public validate(email:string,password:string):void {

    let errorMessage:string = "";

    if(email ==""){

        errorMessage = "Email cannot be empty";

    }

    else if(password ==""){

        errorMessage = "Password cannot be empty";

    }

    else{

        errorMessage = "";

    }

    console.log("ErrorMessage:" + errorMessage);

}

}

let loginValidator = new LoginValidator();

loginValidator.validate("@gmail.com","");