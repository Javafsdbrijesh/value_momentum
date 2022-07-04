class FullStackTraining extends Training{



String getName(){
return "Java Class";
}
void getNumberOfParticipants(){
System.out.println( getName() );
System.out.println( "Each group has 36 participants in " + getName() );
}
}