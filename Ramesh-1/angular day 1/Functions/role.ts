export {}



enum Role {

    ADMIN,USER,SUPERADMIN

}



enum Gender {

    MALE, FEMALE

}



let name:string= "Naresh";

let role:Role = Role.SUPERADMIN;

let gender:Gender =  Gender.MALE;



console.log("Name:" + name + ", role:" + role + ", gender=" + gender);