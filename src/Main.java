public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. TIJAABADA LOAN CLASS ===");
        // Tijaabinta constructor-ka default-ka ah
        Loan loan1 = new Loan();
        System.out.println("Amaahda 1 - Lacagta bishii: $" + String.format("%.2f", loan1.getMonthlyPayment()));
        System.out.println("Amaahda 1 - Wadarta guud: $" + String.format("%.2f", loan1.getTotalPayment()));

        // Tijaabinta constructor-ka qiimaha loo cayimay (Interest: 5.5%, Years: 5, Amount: 20000)
        Loan loan2 = new Loan(5.5, 5, 20000);
        System.out.println("Amaahda 2 - Taariikhda: " + loan2.getLoanDate());
        System.out.println("Amaahda 2 - Lacagta bishii: $" + String.format("%.2f", loan2.getMonthlyPayment()));
        System.out.println("Amaahda 2 - Wadarta guud: $" + String.format("%.2f", loan2.getTotalPayment()));

        System.out.println("\n=== 2. TIJAABADA BMI CLASS ===");
        // Tijaabinta BMI (Name, Age, Weight in lbs, Height in inches)
        BMI person1 = new BMI("Ali", 25, 145, 70);
        System.out.println("Magaca: " + person1.getName() + " | BMI: " + person1.getBMI() + " | Xaaladda: " + person1.getStatus());

        // Tijaabinta BMI oo isticmaalaysa default age (20)
        BMI person2 = new BMI("Aisha", 185, 65);
        System.out.println("Magaca: " + person2.getName() + " (Da'da: " + person2.getAge() + ") | BMI: " + person2.getBMI() + " | Xaaladda: " + person2.getStatus());

        System.out.println("\n=== 3. TIJAABADA COURSE CLASS ===");
        Course javaCourse = new Course("Java Programming");

        // Ku darista ardayda
        javaCourse.addStudent("Ahmed");
        javaCourse.addStudent("Fatima");
        javaCourse.addStudent("Hassan");

        System.out.println("Koorsada: " + javaCourse.getCourseName());
        System.out.println("Tirada Ardayda: " + javaCourse.getNumberOfStudents());
        System.out.print("Ardayda diiwaan gashan: ");
        for (String student : javaCourse.getStudents()) {
            System.out.print(student + " ");
        }
        System.out.println();

        // Ka saarista arday
        System.out.println("\n-- Ka saarida 'Fatima' --");
        javaCourse.dropStudent("Fatima");

        System.out.println("Tirada Ardayda ka dib drop-ka: " + javaCourse.getNumberOfStudents());
        System.out.print("Ardayda hartay: ");
        for (String student : javaCourse.getStudents()) {
            System.out.print(student + " ");
        }
        System.out.println();
    }
}