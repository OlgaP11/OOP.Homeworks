package homework2.vetClinic;

import homework2.parents.Illable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doctor implements Illable {

    private String lastName;
    private String firstName;

    public Doctor(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public void startWork() {
        System.out.printf("%s %s started working.\n",
                this.lastName, this.firstName);
    }

    public void finishWork() {
        System.out.printf("%s %s finished working.\n", this.lastName, this.firstName);
    }

    public void admission() {
        System.out.printf("%s %s is admitting patients.\n",
                this.lastName, this.firstName);
    }

    public void record() {
        System.out.printf("%s %s is recording information into database.\n",
                this.lastName, this.firstName);
    }

    public void writePrescription() {
        System.out.printf("%s %s is writing a prescription.\n", this.lastName, this.firstName);
    }

    public void haveLunch() {
        System.out.printf("%s %s has lunch.\n", this.lastName, this.firstName);
    }

    public void work() {
        startWork();
        admission();
        record();
        finishWork();

    }

    @Override
    public void getIll() {
        System.out.printf("%s %s got ill.\n", this.lastName, this.firstName);

    }


}
