export{}





const email:string= "a@gmail";



const password:string="12345678";





if(email == null || email== "" || email.trim()==""){



    console.log("Email cannot be empty");



}



else if( email.indexOf("@gmail.com")== -1) {



    console.log("Invalid email. Mail id should end with @gmail.com")



}



else if(password.length<8)



console.log("Password must be minimum 8 characters");



else{



    console.log("Valid login details");



}