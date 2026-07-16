
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
        // Mmebuat variable array penampung untuk semua data yang diinsert
        ArrayList<ExpenseClaim> claims = new ArrayList<>();
        // membuat variable menu yang dipilih oleh user
        int selectedMenu;
        int nextClaimNumber = 1;
        // Menampilkan tampilan awal menu
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
                System.out.println("11. Search Claim by Employee Name");
                System.out.println("0. Exit");
                // user memasukkan menu dengan pilihan integer
                selectedMenu = scanner.nextInt();
                scanner.nextLine();

                // MenuCategory menuCategory;
                // menu diubah berdasarkan kondisi yang sesuai

                switch (selectedMenu) {
                    case 1:{
                            // Apabila user memilih menu 1 maka ditampilakn menu CREATE EXPENSE CLAIM
                            System.out.println("===== CREATE EXPENSE CLAIM =====");
                            // User input employee name
                            System.out.println("Employee Name: ");
                            String employeeName = scanner.nextLine();

                            System.out.println();
                            // Menampilkan list kategory yang tersedia
                            System.out.println("Choose Category: ");
                            System.out.println("1. Transportation");
                            System.out.println("2. Meal");
                            System.out.println("3. Accomodation");
                            System.out.println("4. Office Supply");
                            System.out.println("5. Medical");
                            System.out.println("6. Internet");
                            System.out.println("7. Other");
                            System.out.println("Category: ");

                            // user input kategori 
                            int categoryChoice = scanner.nextInt();
                            scanner.nextLine();
                            // membuat variable untuk menampung nilai kategori yang sudah di mapping dari inputan user
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
                            // user input Amount
                            System.out.println("Amount: ");
                            double amount = scanner.nextDouble();
                            scanner.nextLine();
                            // user input description
                            System.out.println("Description: ");
                            String description = scanner.nextLine();
                            

                            // menambahakan format untuk claim ID
                            String claimId = "CLM-" + String.format("%03d", nextClaimNumber);
                            nextClaimNumber++;
                            // membuat data pertama sesuai inputan user dengan paramater, claimID, employeeName, selectedCategory, amount, description
                            ExpenseClaim claim = new ExpenseClaim(
                                claimId,
                                employeeName,
                                selectedCategory,
                                amount,
                                description
                            );
                            // menambahkan satu per satu data yang di create ke dalam variabel array penampung
                            claims.add(claim);

                            System.out.println();
                            System.out.println("Claim successfully created");
                            // menampilkan informasi mengenai data yang sudah di generate
                            claim.displayClaim();
                            break;
                        }
                        
                    case 2:
                        {
                            // apbila user memilih menu ke 2 akan menampilkan semua data 
                            System.out.println("===== SHOW CLAIM =====");
                            // melakukan pengecekan apabila data kosong maka menampilkan tidak ada data
                            // apabila ada maka menampilkan semua informasi data 
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
                        // user memasukkan nilai 3 maka akan menampilkan claim tertentu
                        System.out.println("===== SHOW CLAIM DETAIL =====");
                        // user input claim-id yang ingin dicari
                        System.out.println("Input ClaimId: ");
                        String searchedClaimId = scanner.nextLine().trim();

                        // Inisialisasi variable penampung untuk data yang ditemukan
                        ExpenseClaim foundClaim = null;
                        // dilakukan pengecekan semua data (claim) menggunakan looping untuk mengecek apakah ada data dengan id yang sesuai dengan inputa user
                        for(ExpenseClaim claim : claims){
                            if(claim.getClaimId().equalsIgnoreCase(searchedClaimId)){
                                // ini hanya jika ada maka ditampung ke variable penampung data yang ditemukan
                                foundClaim = claim;
                                break;
                            }
                        }
                        // dilakukan pengecekan hasil, apabila null maka data dengan id tersebut tidak ditemukan
                        // sebaliknya apabila tidak null, maka data tersebut akan ditampilkan
                        if(foundClaim != null){
                            System.out.println("Claim Found");
                            foundClaim.displayClaim();
                        } else {
                            System.out.println("Claim with ID "+ searchedClaimId + " was not found.");
                        }

                        break;
                    }
                    case 4: {
                        // user memasukkan inputan 4 dan akan dimapping untuk menu SUBMIT CLAIM
                        System.out.println("===== SUBMIT CLAIM =====");
                        System.out.println("Input Claim ID: ");
                        // inputan claim Id yang akan dicari dari user
                        String searchedClaimId = scanner.nextLine().trim();

                        // Inisialisasi variable penampung untuk data yang ditemukan
                        ExpenseClaim foundClaim = null;
                        // lakukan pengecekan semua data yang ada (looping) dan sesuaikan dengan parameter input claimID dari user
                        // cocok masuk ke kondisi if dan apabila tidak cocok masuk ke kondisi else
                        for(ExpenseClaim claim : claims){
                            if(claim.getClaimId().equalsIgnoreCase(searchedClaimId)){
                                foundClaim = claim;
                                break;
                            } else {
                                System.out.println("There is no Claim with ID: "+ searchedClaimId);
                            }
                        }
                        // apabila data yang ditemukan tidak null maka masuk ke if dan tidak ada data masuk ke else
                        if(foundClaim != null){
                            // panggil method untuk submit dan dapat balikan true atau false
                            // true akan masuk ke if dan else akan masuk ke else 
                            boolean submitted = foundClaim.submitClaim();
                            if(submitted){
                                System.out.println("Claim "+ foundClaim.getClaimId() + " submitted successfully");
                                foundClaim.displayClaim();
                            } else {
                                System.out.println("Claim  "+ foundClaim.getClaimId() + " cannot be submmited because its curent status is "+ foundClaim.getStatus());
                            }
                            
                            
                        } else {
                            System.out.println("There is no claim data");
                        }
                        break;
                    }
                    case 5:{
                        // apabila user memilih menu 5 maka akan menampilkan menu APPROVE CLAIM
                        System.out.println("===== APPROVE CLAIM =====");
                        System.out.println("Input Claim ID");
                        // inputan dari user untuk Claim ID yang akan dicari
                        String searchedClaimId = scanner.nextLine().trim();

                        // Inisialisasi untuk variabel penampung untuk data yang ditemukan
                        ExpenseClaim foundClaim = null;
                        // lakukan pencarian untuk seluruh data yang sama dengan input claim ID yang diberikan oleh uesr
                        for(ExpenseClaim claim : claims){
                            if(claim.getClaimId().equalsIgnoreCase(searchedClaimId)){
                                foundClaim = claim;
                                break;
                            }
                        }
                        // apabila data ada akan masuk ke if dan apabila tidak ada akan masuk ke else
                        if(foundClaim != null){
                            // lakukan approve
                            boolean approved = foundClaim.approveClaim();
                            // jika berhasil akan mengembalikan menampilkan pesan succes dan menampilkan detail
                            // dan jika gagal maka akan masuk ke else yang cek status claim tersebut tidak sesuai
                            if(approved){
                                System.out.println("Approve "+ foundClaim.getClaimId() + " submitted successfully");
                                // menampilkan data
                                foundClaim.displayClaim();
                            }else {
                                System.out.println("Claim  "+ foundClaim.getClaimId() + " cannot be submmited because its curent status is "+ foundClaim.getStatus());
                            }
                            
                        } else {
                            System.out.println("There is no claim");
                        }

                        break;
                    }
                    case 6: {
                        // apabila user memilih menu 6 akan menampilkan menu REJECT CLAIM
                        System.out.println("===== REJECT CLAIM =====");
                        System.out.println("Input Claim ID");
                        // Inputan user untuk claim ID
                        String searchedClaimId = scanner.nextLine().trim();

                        // Inisialisasi untuk variabel penampung untuk data yang ditemukan
                        ExpenseClaim foundClaim = null;
                        // lakukan pengecekan untuk semua data (looping) berdasarkan inputan yang diberikan oleh user
                        for(ExpenseClaim claim : claims){
                            if(claim.getClaimId().equalsIgnoreCase(searchedClaimId)){
                                foundClaim = claim;
                                break;
                            }
                        }
                        // kalau misalnya datanya ditemukan akan masuk ke if dan tidak ditemukan masuk ke else
                        if(foundClaim != null){
                            System.out.println("Input Reason");
                            // inputan dari user untuk alasan reject
                            String reason = scanner.nextLine().trim();
                            // panggil method untuk reject
                            boolean rejected = foundClaim.rejectClaim(reason);
                            // apabila berhasil maka menampilkan pesan berhasil dan apabila tidak akan menampilkan error penjelasan
                            // menampilkan data apabila tidak ditemukan
                            if(rejected){
                                System.out.println("Claim "+ foundClaim.getClaimId() + " Rejected successfully");
                                foundClaim.displayClaim();
                            }else {
                                System.out.println("Claim  "+ foundClaim.getClaimId() + " cannot be rejected because its curent status is "+ foundClaim.getStatus());
                            }
                            
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
                    case 11: {
                        System.out.println("===== SEARCH CLAIM BY EMPLOYEE NAME =====");
                        if(claims.isEmpty()){
                            System.out.println("No expense claim data.");
                            break;
                        }
                        System.out.println("Insert Employee Name");
                        String searchedEmpName = scanner.nextLine().trim();
                        if(searchedEmpName.isEmpty()){
                            System.out.println("Employee name cannot be empty");
                            break;
                        }
                        
                        int totalFound = 0;
                        for(ExpenseClaim claim : claims){
                            if(claim.getEmployeeName().toLowerCase().contains(searchedEmpName.toLowerCase())){
                                claim.displayClaim();
                                totalFound++;
                            }
                        }
                        if(totalFound == 0){
                            System.out.println("No claim found for emplotyee name: "+searchedEmpName);
                        } else {
                            System.out.println("Total claim founds: "+ totalFound);
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