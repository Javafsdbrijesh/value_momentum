package collections;

public class Assignment35 {
	Enfield enfield;
    SportsBike sportsBike;
 
    //Constructor Injection
    public Assignment35(Enfield enfieldConstructor, SportsBike sportsBikeConstructor) {
        this.enfield = enfieldConstructor;
        this.sportsBike = sportsBikeConstructor;
    }

    //Setter Injection
    public void setAssignment35(Enfield enfieldSetter, SportsBike sportsBikeSetter) {
        this.enfield = enfieldSetter;
        this.sportsBike = sportsBikeSetter;
    }
 
    public static void main(String[] args) {


          //creating object of SportsBike 
          SportsBike sportsBike = new SportsBike();
          sportsBike.accelerate();

          Enfield enfield = new Enfield(); 
          enfield.offRoading();
    	
    	
    }

}