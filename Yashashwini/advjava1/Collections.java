package Assignment35;

public class Collections {

    Enfield enfield;
    SportsBike sportsBike;

    //Constructor Injection
    public Collections(Enfield enfieldConstructor, SportsBike sportsBikeConstructor) {
        this.enfield = enfieldConstructor;
        this.sportsBike = sportsBikeConstructor;
    }

    //Setter Injection
    public void setPulsar(Enfield enfieldSetter, SportsBike sportsBikeSetter) {
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