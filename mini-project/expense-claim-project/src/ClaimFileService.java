import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ClaimFileService {
    private static final String FILE_NAME = "claims.txt";

    public void saveClaims(List<ExpenseClaim> claims){
        if(claims.isEmpty()){
            System.out.println("No claim data to save.");
            return;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
           for(ExpenseClaim claim: claims){
                String line =
                    claim.getClaimId() + "|" +
                    claim.getEmployeeName() + "|" +
                    claim.getCategory() + "|" +
                    claim.getAmount() + "|" +
                    claim.getStatus() + "|" +
                    claim.getCreatedAt();
                writer.write(line);
                writer.newLine();
           }
           System.out.println(claims.size()+ " claims saved successfully"); 
        } catch (IOException e) {
            System.out.println("Failed to save claims: "+ e.getMessage());
        }
    }
}
