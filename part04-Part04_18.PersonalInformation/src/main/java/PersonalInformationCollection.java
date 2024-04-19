import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String[] args) {
        collectPersonalInformation();
    }

    public static void collectPersonalInformation() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> informationList = new ArrayList<>();

        while (true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Identification number: ");
            String idNumber = scanner.nextLine();

            informationList.add(new PersonalInformation(firstName, lastName, idNumber));
        }

        System.out.println("");

        for (PersonalInformation info : informationList) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
    }
}