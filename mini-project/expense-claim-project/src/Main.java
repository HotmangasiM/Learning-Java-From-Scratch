
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// Entry point 

public class Main {
    public static void main(String[] args) {
        // membuat object scanner untuk inputan user
        Scanner scanner = new Scanner(System.in);

        // ArrayList yang dibuat di luar loop agar data tidak hilang
        // ketika menu ditampilkan kembali
        ArrayList<ExpenseClaim> claims = new ArrayList<>();
        int selectedMenu;
        int nextClaimNumber = 1;
        
        System.out.println("==========================");
        System.out.println("  HOTMANGASI EXPENSE CLAIM MANAGEMENT SYSTEM   ");
        System.out.println("==========================");
        System.out.println();
            do { 
                

                System.out.println("Choose menu ");
                System.out.println("1. Create Claim");
                System.out.println("2. Show All Claims");
                System.out.println("3. Show Claim Detail");
                System.out.println("4. Submit Claim");
                System.out.println("5. Approve Claim");
                System.out.println("6. Reject Claim");
                System.out.println("7. Cancel Claim");
                System.out.println("8. Edit Claim");
                System.out.println("9. Delete Claim");
                System.out.println("10. Filter Claim by Status");
                System.out.println("0. Exit");

                selectedMenu = scanner.nextInt();
                scanner.nextLine();

                // MenuCategory menuCategory;

                switch (selectedMenu) {
                    case 1:{
                            // menuCategory = MenuCategory.CREATE_CLAIM;
                            System.out.println("===== CREATE EXPENSE CLAIM =====");
                            System.out.println("Employee Name: ");
                            String employeeName = scanner.nextLine();

                            System.out.println();
                            System.out.println("Choose Category: ");
                            System.out.println("1. Transportation");
                            System.out.println("2. Meal");
                            System.out.println("3. Accomodation");
                            System.out.println("4. Office Supply");
                            System.out.println("5. Medical");
                            System.out.println("6. Internet");
                            System.out.println("7. Other");
                            System.out.println("Category: ");

                            int categoryChoice = scanner.nextInt();
                            scanner.nextLine();

                            ClaimCategory selectedCategory;

                            switch (categoryChoice) {
                                case 1:
                                    selectedCategory = ClaimCategory.TRANSPORTATION;
                                    break;
                                case 2:
                                    selectedCategory = ClaimCategory.MEAL;
                                    break;
                                case 3:
                                    selectedCategory = ClaimCategory.ACCOMODATION;
                                    break;
                                case 4:
                                    selectedCategory = ClaimCategory.OFFICE_SUPPLY;
                                    break;
                                case 5:
                                    selectedCategory = ClaimCategory.MEDICAL;
                                    break;
                                case 6:
                                    selectedCategory = ClaimCategory.INTERNET;
                                    break;
                                case 7:
                                    selectedCategory = ClaimCategory.OTHER;
                                    break;
                                default:
                                    selectedCategory = ClaimCategory.OTHER;
                                    // scanner.close();
                                    System.out.println("Invalid Category. Category set to Other");
                            }

                            System.out.println("Amount: ");
                            double amount = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.println("Description: ");
                            String description = scanner.nextLine();
                            

                            // int nextNumber = claims.size() + 1;
                            String claimId = "CLM-" + String.format("%03d", nextClaimNumber);
                            nextClaimNumber++;

                            ExpenseClaim claim = new ExpenseClaim(
                                claimId,
                                employeeName,
                                selectedCategory,
                                amount,
                                description
                            );
                            claims.add(claim);

                            System.out.println();
                            System.out.println("Claim successfully created");
                            claim.displayClaim();
                            break;
                        }
                        
                    case 2:
                        {
                            // menuCategory = MenuCategory.SHOW_CLAIM;
                            System.out.println("===== SHOW CLAIM =====");
                            if(claims.isEmpty()){
                                System.out.println("No expense claim data");
                            } else {
                                for(ExpenseClaim claim: claims){
                                    claim.displayClaim();
                                }
                            }
                            break;
                        }
                    case 3: {
                        // Menu Show Claim Detail
                        System.out.println("===== SHOW CLAIM DETAIL =====");
                        System.out.println("Input ClaimId: ");
                        String searchedClaimId = scanner.nextLine().trim();

                        // Inisialisasi variable penampung
                        ExpenseClaim foundClaim = null;

                        for(ExpenseClaim claim : claims){
                            if(claim.getClaimId().equalsIgnoreCase(searchedClaimId)){
                                foundClaim = claim;
                                break;
                            }
                        }

                        if(foundClaim != null){
                            System.out.println("Claim Found");
                            foundClaim.displayClaim();
                        } else {
                            System.out.println("Claim with ID "+ searchedClaimId + " was not found.");
                        }

                        break;
                    }
                    case 4: {
                        System.out.println("===== SUBMIT CLAIM =====");
                        System.out.println("Input Claim ID: ");
                        String searchedClaimId = scanner.nextLine().trim();

                        // Inisialisasi variable penampung
                        ExpenseClaim foundClaim = null;

                        for(ExpenseClaim claim : claims){
                            if(claim.getClaimId().equalsIgnoreCase(searchedClaimId)){
                                foundClaim = claim;
                                break;
                            }
                        }

                        if(foundClaim != null){
                            boolean submitted = foundClaim.submitClaim();
                            if(submitted){
                                System.out.println("Claim "+ foundClaim.getClaimId() + " submitted successfully");
                            }
                            foundClaim.displayClaim();
                        } else {
                            System.out.println("Claim  "+ foundClaim.getClaimId() + " cannot be submmited because its curent status is "+ foundClaim.getStatus());
                        }
                        break;
                    }
                    case 5:{
                        System.out.println("===== APPROVE CLAIM =====");
                        System.out.println("Input Claim ID");
                        String searchedClaimId = scanner.nextLine().trim();

                        // Inisialisasi untuk variabel penampung
                        ExpenseClaim foundClaim = null;
                        for(ExpenseClaim claim : claims){
                            if(claim.getClaimId().equalsIgnoreCase(searchedClaimId)){
                                foundClaim = claim;
                                break;
                            }
                        }
                        if(foundClaim != null){
                            boolean approved = foundClaim.approveClaim();
                            if(approved){
                                System.out.println("Approve "+ foundClaim.getClaimId() + " submitted successfully");
                            }else {
                                System.out.println("Claim  "+ foundClaim.getClaimId() + " cannot be submmited because its curent status is "+ foundClaim.getStatus());
                            }
                            foundClaim.displayClaim();
                        } else {
                            System.out.println("There is no claim");
                        }

                        break;
                    }
                    case 6: {
                        System.out.println("===== REJECT CLAIM =====");
                        System.out.println("Input Claim ID");
                        String searchedClaimId = scanner.nextLine().trim();

                        // Inisialisasi untuk variabel penampung
                        ExpenseClaim foundClaim = null;
                        for(ExpenseClaim claim : claims){
                            if(claim.getClaimId().equalsIgnoreCase(searchedClaimId)){
                                foundClaim = claim;
                                break;
                            }
                        }
                        if(foundClaim != null){
                            System.out.println("Input Reason");
                            String reason = scanner.nextLine().trim();
                            boolean rejected = foundClaim.rejectClaim(reason);
                            if(rejected){
                                System.out.println("Claim "+ foundClaim.getClaimId() + " Rejected successfully");
                            }else {
                                System.out.println("Claim  "+ foundClaim.getClaimId() + " cannot be rejcted because its curent status is "+ foundClaim.getStatus());
                            }
                            foundClaim.displayClaim();
                        } else {
                            System.out.println("Claim with ID "+ searchedClaimId + " was not found.");
                        }


                        break;
                    }
                    case 7: {
                        System.out.println("===== CANCEL CLAIM =====");
                        System.out.println("Input Claim ID");
                        String searchedClaimId = scanner.nextLine().trim();

                        // Inisialisasi untuk variabel penampung
                        ExpenseClaim foundClaim = null;
                        for(ExpenseClaim claim : claims){
                            if(claim.getClaimId().equalsIgnoreCase(searchedClaimId)){
                                foundClaim = claim;
                                break;
                            }
                        }

                        if(foundClaim != null){
                            boolean cancelled = foundClaim.cancelClaim();
                            if(cancelled){
                                System.out.println("Claim: "+ foundClaim.getClaimId() +" cancelled successfully");
                                foundClaim.displayClaim();
                            } else {
                                System.out.println("Claim: "+ foundClaim.getClaimId() + " cannot be cancelled because status is " +foundClaim.getStatus());
                            }
                        } else {
                            System.out.println("Claim with ID "+ searchedClaimId + " was not found");
                        }
                        break;
                    }
                    case 8:{
                        System.out.println("===== EDIT CLAIM =====");
                        System.out.println("Input Claim ID");
                        String searchedClaimId = scanner.nextLine().trim();

                        // Inisialisasi untuk variabel penampung
                        ExpenseClaim foundClaim = null;
                        for(ExpenseClaim claim : claims){
                            if(claim.getClaimId().equalsIgnoreCase(searchedClaimId)){
                                foundClaim = claim;
                                break;
                            }
                        }
                        if(foundClaim != null){

                            System.out.println("Input New Category");
                            int categoryChoice = scanner.nextInt();
                            scanner.nextLine();

                            ClaimCategory newCategory;

                            switch (categoryChoice) {
                                case 1:
                                    newCategory = ClaimCategory.TRANSPORTATION;
                                    break;
                                case 2:
                                    newCategory = ClaimCategory.MEAL;
                                    break;
                                case 3:
                                    newCategory = ClaimCategory.ACCOMODATION;
                                    break;
                                case 4:
                                    newCategory = ClaimCategory.OFFICE_SUPPLY;
                                    break;
                                case 5:
                                    newCategory = ClaimCategory.MEDICAL;
                                    break;
                                case 6:
                                    newCategory = ClaimCategory.INTERNET;
                                    break;
                                case 7:
                                    newCategory = ClaimCategory.OTHER;
                                    break;
                                default:
                                    newCategory = ClaimCategory.OTHER;
                                    // scanner.close();
                                    System.out.println("Invalid Category. Category set to Other");
                            }

                            System.out.println("Input New Amount");
                            double newAmount = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.println("Input New Description");
                            String newDescription = scanner.nextLine().trim();

                            if(newAmount <= 0){
                                System.out.println("Amount must be greater than zero");
                            }else if(newDescription.isEmpty()){
                                System.out.println("Description cannot be empty");
                            } else {
                                boolean edited = foundClaim.editClaim(newCategory, newAmount, newDescription);
                                if(edited){
                                    System.out.println("Claim with ID "+ foundClaim.getClaimId() +" updated successfully");
                                }else {
                                    System.out.println("Claim with ID" + foundClaim.getClaimId() + " cannot be edited because its current status is "+ foundClaim.getStatus());
                                }
                            }
                        }
                        if((foundClaim == null)){
                            System.out.println("Claim with ID "+ searchedClaimId + " was not found");
                        }
                        break;
                    }
                    case 9:{
                        System.out.println("===== DELETE CLAIM =====");
                        System.out.println("Input Claim ID");
                        String searchedClaimId = scanner.nextLine().trim();
                        ExpenseClaim foundClaim = null;

                        for(ExpenseClaim claim: claims){
                            if(claim.getClaimId().equalsIgnoreCase(searchedClaimId)){
                                foundClaim = claim;
                                break;
                            }
                        }
                        if(foundClaim == null){
                            System.out.println("Claim with ID "+ foundClaim.getClaimId() + " was not found");
                        }

                        if(foundClaim.getStatus() == ClaimStatus.DRAFT){
                            System.out.println("Are you sure to delete this claim " + foundClaim.getClaimId()+ "? Y/N");
                            String confirmation = scanner.nextLine().trim();
                            if(confirmation.equalsIgnoreCase("Y")){
                                Iterator<ExpenseClaim> iterator = claims.iterator();
                                while(iterator.hasNext()){
                                    ExpenseClaim claim = iterator.next();

                                    if(claim.getClaimId().equalsIgnoreCase(searchedClaimId)){
                                        iterator.remove();
                                        break;
                                    }
                                }
                                System.out.println("Success to delete claim");
                            } else {
                                System.out.println("Deleted Operation Cancelled");
                            }
                        } else {
                            System.out.println("Claim with ID "+ foundClaim.getClaimId() + " cannot be deleted because status is "+ foundClaim.getStatus());
                        }
                        break;
                    }
                    case 10:{
                         System.out.println("===== FILTER STATUS CLAIM =====");
                         System.out.println("Insert the status");
                         int statusChoice = scanner.nextInt();
                         scanner.nextLine();
                         int totalFound = 0;

                         ClaimStatus selectedStatus = null;
                         switch (statusChoice) {
                             case 1:{
                                selectedStatus = ClaimStatus.DRAFT;
                                break;
                             }
                             case 2:{
                                selectedStatus = ClaimStatus.SUBMITTED;
                                break;
                             }
                             case 3:{
                                selectedStatus = ClaimStatus.APPROVED;
                                break;
                             }
                             case 4:{
                                selectedStatus = ClaimStatus.REJECTED;
                                break;
                             }
                             case 5:{
                                selectedStatus = ClaimStatus.CANCELLED;
                                break;
                             }
                             default:
                                 System.out.println("Invalid status choice");
                         }

                         boolean claimFound = false;

                         for(ExpenseClaim claim: claims){
                            if(claim.getStatus() == selectedStatus){
                                claim.displayClaim();
                                claimFound = true;
                                totalFound++;
                            }
                         }
                         if(totalFound == 0){
                            System.out.println("There is no match Claim");
                         } else {
                            System.out.println("Total found of claim is: "+ totalFound);
                         }
                         if(!claimFound){
                            System.out.println("Nothing claim with that status");
                         }

                        break;
                    }
                    case 0:{
                                // menuCategory = MenuCategory.EXIT;
                                System.out.println("Logout successfully");
                                break;
                            }
                        
                    default:
                        System.out.println("Invalid Menu");
                }
            } while (selectedMenu != 0);

            scanner.close();
        
    }
}