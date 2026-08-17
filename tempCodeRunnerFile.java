                do {
                    System.out.println("\nWhat You want to do?");
                    System.out.println("\n1.View Bank Details\n2.View User Details\n3.View Account Details\n4.Check Minimum Balance\n5.Exit");

                    System.out.print("\nEnter your choice: ");
                    userChoice = scan.nextInt();

                } while (userChoice > 5 || userChoice < 1);