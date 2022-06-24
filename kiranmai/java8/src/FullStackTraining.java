class Training {
String getName() {
return "Generic Training";
}
void getNumberOfParticipants() {
System.out.println("Each group has n participants in " + getName());
}
}
class FullStackTraining1 extends Training {
@Override
String getName() {
return "Java Class";
}
void getNumberOfParticipants() {
System.out.println("Each group has 36 participants in " + getName());
}
}
public class FullStackTraining {



public static void main(String[] args) {
Training tt = new Training();
Training ttt = new FullStackTraining1();
System.out.println(tt.getName());
tt.getNumberOfParticipants();
System.out.println(ttt.getName());
ttt.getNumberOfParticipants();
}
}