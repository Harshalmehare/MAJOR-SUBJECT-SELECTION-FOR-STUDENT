import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class StudentMajorSubjectSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
         
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.println("Choose your year:");
            System.out.println("1. First year");
            System.out.println("2. Second year");
            System.out.println("3. Third year");
            int yearChoice = scanner.nextInt();


            String subject = "";
            switch (yearChoice) {
                case 1:
                    System.out.println("Choose your subject:");
                    System.out.println("1. C Programming");
                    System.out.println("2. C++");
                    int subjectChoiceFirstYear = scanner.nextInt();
                    if (subjectChoiceFirstYear == 1) {
                        subject = "C Programming";
                        try {
                            FileWriter writer = new FileWriter("student_info_1year.txt", true);
                            writer.write("Name: " + name + ", Year: " + yearChoice + ", Subject: " + subject + "\n");
                            writer.close();

                        } catch (IOException e) {
                            System.out.println("An error occurred while writing to the file.");

                        }
                    } else if (subjectChoiceFirstYear == 2) {
                        subject = "C++";
                        try {
                            FileWriter writer = new FileWriter("student_info_1year.txt", true);
                            writer.write("Name: " + name + ", Year: " + yearChoice + ", Subject: " + subject + "\n");
                            writer.close();

                        } catch (IOException e) {
                            System.out.println("An error occurred while writing to the file.");

                        }
                    } else {
                        System.out.println("Invalid choice!");
                        return;
                    }
                    break;
                case 2:
                    System.out.println("Choose your subject:");
                    System.out.println("1. Java");
                    System.out.println("2. Python");
                    int subjectChoiceSecondYear = scanner.nextInt();
                    if (subjectChoiceSecondYear == 1) {
                        subject = "Java";
                        try {
                            FileWriter writer = new FileWriter("student_info_2year.txt", true);
                            writer.write("Name: " + name + ", Year: " + yearChoice + ", Subject: " + subject + "\n");
                            writer.close();

                        } catch (IOException e) {
                            System.out.println("An error occurred while writing to the file.");

                        }
                    } else if (subjectChoiceSecondYear == 2) {
                        subject = "Python";
                        try {
                            FileWriter writer = new FileWriter("student_info_2year.txt", true);
                            writer.write("Name: " + name + ", Year: " + yearChoice + ", Subject: " + subject + "\n");
                            writer.close();

                        } catch (IOException e) {
                            System.out.println("An error occurred while writing to the file.");

                        }
                    } else {
                        System.out.println("Invalid choice!");
                        return;
                    }
                    break;
                case 3:
                    System.out.println("Choose your subject:");
                    System.out.println("1. SQL");
                    System.out.println("2. MONGODB");
                    int subjectChoiceThirdYear = scanner.nextInt();
                    if (subjectChoiceThirdYear == 1) {
                        subject = "SQL";
                        try {
                            FileWriter writer = new FileWriter("student_info_3year.txt", true);
                            writer.write("Name: " + name + ", Year: " + yearChoice + ", Subject: " + subject + "\n");
                            writer.close();

                        } catch (IOException e) {
                            System.out.println("An error occurred while writing to the file.");

                        }
                    } else if (subjectChoiceThirdYear == 2) {
                        subject = "MONGODB";
                        try {
                            FileWriter writer = new FileWriter("student_info_3year.txt", true);
                            writer.write("Name: " + name + ", Year: " + yearChoice + ", Subject: " + subject + "\n");
                            writer.close();

                        } catch (IOException e) {
                            System.out.println("An error occurred while writing to the file.");

                        }
                    } else {
                        System.out.println("Invalid choice!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return;
            }


            
            System.out.println("Dear " + name + ", you have selected " + subject + " as your major subject.");
            System.out.println("Student information saved to file.");
            scanner.nextLine();
        }
    }
}