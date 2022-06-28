package Getsets;

public class Pulsar {
	 
    Enfield enfield;
    SportsBike sportsBike;
    Hayabusa hayabusa; 
    public Hayabusa getHayabusa() {
		return hayabusa;
	}

	public Pulsar(Enfield enfield, SportsBike sportsBike, Hayabusa hayabusa) {
		super();
		this.enfield = enfield;
		this.sportsBike = sportsBike;
		this.hayabusa = hayabusa;
	}


	//Constructor Injection
    public Pulsar(Enfield enfieldConstructor, SportsBike sportsBikeConstructor) {
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
         SportsBike sportsBike = new SportsBike();
        sportsBike.accelerate();
        Hayabusa hayabusa = new Hayabusa();

        Enfield enfield = new Enfield(); 
        enfield.offRoading();
        hayabusa.speed();
 
    }
 
}