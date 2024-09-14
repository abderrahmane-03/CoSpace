package org.example.GUI;

import org.example.Repository.IMP.MemberRepositoryIMP;
import org.example.Repository.IMP.OrganizerRepositoryIMP;
import org.example.Repository.IMP.UserRepositoryIMP;
import org.example.Service.IMP.MemberService;
import org.example.Service.IMP.OrganizerService;
import org.example.Service.IMP.UserService;
import org.example.entities.Member;
import org.example.entities.Organizer;
import org.example.entities.User;
import org.example.enums.Role;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI {
    private static final Scanner scanner = new Scanner(System.in);
    private static final UserService userService = new UserService(new UserRepositoryIMP()); // Inject UserRepository
    private static final MemberService memberService = new MemberService(new MemberRepositoryIMP());
    private static final OrganizerService organizerService = new OrganizerService(new OrganizerRepositoryIMP());

    public static void run() {
        while (true) {
            System.out.println("\nWelcome to the Event Management System");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    registerUser();
                    break;
                case "2":
                    loginUser();
                    break;
                case "3":
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void registerUser() {
        System.out.println("\nRegister as: ");
        System.out.println("1. Member");
        System.out.println("2. Organizer");
        System.out.print("Choose an option: ");
        String roleChoice = scanner.nextLine();

        if (roleChoice.equals("1")) {
            System.out.print("Enter your first name: ");
            String first_name = scanner.nextLine();

            System.out.print("Enter your last name: ");
            String last_name = scanner.nextLine();
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();

            System.out.print("Enter your password: ");
            String rawPassword = scanner.nextLine();  // Renamed for clarity

            System.out.print("Enter your address: ");
            String address = scanner.nextLine();

            System.out.print("Enter your membership ID: ");
            int memberId = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter your membership start date (YYYY-MM-DD): ");
            LocalDate membershipStart = LocalDate.parse(scanner.nextLine());

            System.out.print("Enter your membership end date (YYYY-MM-DD): ");
            LocalDate membershipEnd = LocalDate.parse(scanner.nextLine());

            System.out.print("Enter your favorite space: ");
            String favoriteSpace = scanner.nextLine();
            System.out.print("Enter your profile picture URL (or press Enter for default): ");
            String profilePicture = scanner.nextLine();
            if (profilePicture.isEmpty()) {
                profilePicture = "default.png";
            }


            Member member = new Member(
                    0,
                    first_name,
                    last_name,
                    email,
                    address,
                    rawPassword,
                    false,// Pass the raw password
                    Role.MEMBER,
                    memberId,
                    membershipStart,
                    membershipEnd,
                    favoriteSpace,
                    profilePicture
            );


            boolean registered = memberService.createMember(member);
            if (registered) {
                System.out.println("Registration successful!");
            } else {
                System.out.println("Registration failed.");
            }
        }

        else if (roleChoice.equals("2")) {
            // Register as an Organizer
//            System.out.print("Enter your company name: ");
//            String companyName = scanner.nextLine();
//
//            Organizer organizer = new Organizer(
//                    "0",                    // Assuming userId is auto-generated
//                    username,
//                    email,
//                    password,
//                    Role.ORGANIZER,
//                    companyName
//            );
//            boolean registered = organizerService.createOrganizer(organizer);
//            if (registered) {
//                System.out.println("Organizer registered successfully!");
//            } else {
//                System.out.println("Registration failed.");
//            }
        } else {
            System.out.println("Invalid role. Please try again.");
        }
    }

    private static void loginUser() {
        System.out.println("\nLogin");
        System.out.print("Enter your Lastname: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String rawpassword = scanner.nextLine();

        // Ask if the user forgot their password
        System.out.print("Forgot your password? (yes/no): ");
        String forgotPassword = scanner.nextLine();

        if (forgotPassword.equalsIgnoreCase("yes")) {
            // Here you can add the logic to handle password recovery
            System.out.println("Password recovery process initiated.");
            return; // Skip authentication process if recovery initiated
        }

        // Authenticate the user
        User user = userService.authenticate(username, rawpassword);
        if (user != null) {
            System.out.println();
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }
}
