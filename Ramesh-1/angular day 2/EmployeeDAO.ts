//Data Access Object (DAO) => insert/update/delete/select 
//create table employees ( name varchar(100));

export class EmployeeDAO{

    private static employees:string[] = []; //db table

    //insert into employees(name) values (?)
    public static save(name:string):void{
        console.log("EmployeeDAO- save" + name);
        this.employees.push(name);
    }

    //select * from employees; returns [] ( 1 or more);
    public static findAll():string[]{
        console.log("EmployeeDAO-findAll");
        return this.employees;
    }

    //select * from employees where id = ?; //returns 1 row
    public static findOne(index:number):string{
        return this.employees[index];
    }

    //update employees set name = ? where id = ?; // 1 row 
    public static update(index:number, name:string):void{
        this.employees[index] = name;
    }

    //delete from employees where id = ?; 1 row
    public static delete(index:number):void{
        this.employees.splice(index, 1);
    }  
    
    public static search(name:string):string[]{
        let results:string[] = [];
        // implement logic
        return results;
    }
}