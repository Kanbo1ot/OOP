import java.time.LocalDate;
import java.time.Period;

public class Studetns {
    String name;
    LocalDate dateOfBirth;
    String phoneNumber;
    String nationality;

    public Studetns() {

    }
    public Studetns(String name, LocalDate dateOfBirth, String phoneNumber, String nationality){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;

    }
    public int getAge(){
        LocalDate currentDete = LocalDate.now();
        Period age = Period.between(currentDete,dateOfBirth);
        return 0;

    }

}
