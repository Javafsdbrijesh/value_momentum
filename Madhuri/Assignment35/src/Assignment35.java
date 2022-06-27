public class Assignment35 {
 
    Enfield enfield;
    Sportsbike sportsBike;
 
    //Constructor Injection
    public Assignment35(Enfield enfieldConstructor, Sportsbike sportsBikeConstructor) {
        this.enfield = enfieldConstructor;
        this.sportsBike = sportsBikeConstructor;
    }

    //Setter Injection
    public void setPulsar(Enfield enfieldSetter, Sportsbike sportsBikeSetter) {
        this.enfield = enfieldSetter;
        this.sportsBike = sportsBikeSetter;
    }
 
    public static void main(String[] args) {


          //creating object of SportsBike 
         // SportsBike sportsBike = new SportsBike();
        //  sportsBike.accelerate();

        //  Enfield enfield = new Enfield(); 
        //  enfield.offRoading();
 
    }
 
}