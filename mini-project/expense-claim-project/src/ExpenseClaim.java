
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
    private LocalDateTime cancelledAt;
    private LocalDateTime updatedAt;
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

     public LocalDateTime getCancelledAt(){
      return cancelledAt;
     }

     public LocalDateTime getUpdatedAt(){
      return updatedAt;
     }
     // berfungsi untuk menampilkan informasi claim
     public void displayClaim(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

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

        if(cancelledAt != null){
         System.out.println("Cancelled At : "+ cancelledAt.format(formatter));
        }

        if(updatedAt != null){
         System.out.println("Updated At: "+ updatedAt.format(formatter));
        }
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
         if(status != ClaimStatus.SUBMITTED){
            return false;
         }

         if(reason == null || reason.trim().isEmpty()){
            return false;
         }
         status = ClaimStatus.REJECTED;
         rejectionReason = reason.trim();
         reviewedAt = LocalDateTime.now();

         return true;
     }

     public boolean cancelClaim(){
      if(status == ClaimStatus.DRAFT || status == ClaimStatus.SUBMITTED){
         status = ClaimStatus.CANCELLED;
         cancelledAt = LocalDateTime.now();
         return true;
      } else {
         return false;
      }
     }

     public boolean editClaim(ClaimCategory newCategory, double newAmount, String newDescription){
      if(status != ClaimStatus.DRAFT){
         return false;
      }
      if(amount <= 0 ){
         return false;
      }
      if(description == null || description.trim().isEmpty()){
         return false;
      }
         // apabila kondisi Claim status adalah draft
         category = newCategory;
         amount = newAmount;
         description = newDescription;
         updatedAt = LocalDateTime.now();
         return true;
     }
}