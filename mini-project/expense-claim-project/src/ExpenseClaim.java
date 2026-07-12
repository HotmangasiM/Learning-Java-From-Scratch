
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExpenseClaim {

    // Setiap object di Expense Claim menyimpan data dan dibuat private untuk implementasi Encapsulation

    private String claimId;
    private String employeeName;
    private ClaimCategory category;
    private double amount;
    private String description;
    private ClaimStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime reviewedAt;
    private String rejectionReason;
    // Ini merupakan constructor yang akan dipanggil ketika menjalankan new ExpenseClaim(...)
    public ExpenseClaim(
        String claimId,
        String employeeName,
        ClaimCategory category,
        double amount,
        String description
     ) {
        this.claimId = claimId;
        this.employeeName = employeeName;
        this.category = category;
        this.amount = amount;
        this.description = description;
        // Default value untuk status yaitu DRAFT dan tanggal pembuatan yaitu saat ini
        this.status = ClaimStatus.DRAFT;
        this.createdAt = LocalDateTime.now();
      //   this.reviewedAt = LocalDateTime.now();
     }
     // getter dibuat untuk mengambil nilai attribute private
     public String getClaimId(){
        return claimId;
     }

     public String getEmployeeName(){
        return employeeName;
     }

     public ClaimCategory getCategory(){
        return category;
     }

     public double getAmount(){
        return amount;
     }

     public String getDescription(){
        return description;
     }

     public ClaimStatus getStatus(){
        return status;
     }

     public LocalDateTime getCreateAt(){
        return createdAt;
     }

     public LocalDateTime getReviewAt(){
        return reviewedAt;
     }

     public String getRejectionReason(){
      return rejectionReason;
     }
     // berfungsi untuk menampilkan informasi claim
     public void displayClaim(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");

        System.out.println();
        System.out.println("===== EXPENSE CLAIM DETAIL =====");
        System.out.println("Claim ID : "+ claimId);
        System.out.println("Employee: "+ employeeName);
        System.out.println("Category: "+ category);
        System.out.println("Amount : "+ amount);
        System.out.println("Description: "+ description);
        System.out.println("Status: "+ status);
        System.out.println("Created At: "+ createdAt.format(formatter));
        if(reviewedAt != null){
         System.out.println("Reviewed At: "+ reviewedAt.format(formatter));
        }
        if(rejectionReason != null){
         System.out.println("Rejection Reason: "+ rejectionReason);
        }
        System.out.println("Claim created by console application");
     }

     public boolean submitClaim(){
        // this.getStatus().equals(ClaimStatus.DRAFT)
        if(status == ClaimStatus.DRAFT){
            status = ClaimStatus.SUBMITTED;
            // System.out.println("Success to change the status");
            return true;
        } else {
            return false;
        }
     }

     public boolean approveClaim(){
        if(status == ClaimStatus.SUBMITTED){
            status = ClaimStatus.APPROVED;
            reviewedAt = LocalDateTime.now();
            return true;
        } else {
            return false;
        }
     }

     public boolean rejectClaim(String reason){
         if(status == ClaimStatus.SUBMITTED){
            status = ClaimStatus.REJECTED;
            if(reason.trim().isEmpty()){
               rejectionReason = reason;
            }
            reviewedAt = LocalDateTime.now();
            return true;
         } else {
            return false;
         }
     }
}