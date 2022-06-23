package trainings;

	class Training{
	    String getName(){
	        return "Generic Training";
	    }
	    void getNumberOfParticipants(){
	        System.out.println( "Each group has n participants  in " + getName() );
	    }
	}
	class FullStackTraining extends Training{
	    @Override
	    String getName(){
	        return "Java Class";
	    }
	}
