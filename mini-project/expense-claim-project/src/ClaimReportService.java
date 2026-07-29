import java.util.List;

public class ClaimReportService {
    public void displaySummaryReport(List<ExpenseClaim> claims){
                            System.out.println("=== CLAIM SUMMARY REPORT ===");
                            if(claims.isEmpty()){
                                System.out.println("No Expense claim data.");
                                return;
                            }

                            int draftCount = 0;
                            int submittedCount = 0;
                            int approvedCount = 0;
                            int rejectedCount = 0;
                            int cancelledCount = 0;

                            double totalAmount = 0;
                            double highestAmount = claims.get(0).getAmount();
                            double lowestAmount = claims.get(0).getAmount();
                            double totalApprovedAmount = 0;

                            for(ExpenseClaim claim: claims){
                                double amount = claim.getAmount();
                                totalAmount += claim.getAmount();
                                switch (claim.getStatus()) {
                                    case DRAFT:
                                        draftCount++;
                                        break;
                                    case SUBMITTED:
                                        submittedCount++;
                                        break;
                                    case APPROVED:
                                        approvedCount++;
                                        totalApprovedAmount += claim.getAmount();
                                        break;
                                    case REJECTED:
                                        rejectedCount++;
                                        break;
                                    case CANCELLED:
                                        cancelledCount++;
                                        break;
                                }

                                if(claim.getAmount() > highestAmount){
                                    highestAmount = amount;
                                }

                                if(claim.getAmount() < lowestAmount){
                                    lowestAmount = amount;
                                }

                            }
                            double averageAmount = totalAmount / claims.size();

                            System.out.println("Total Claims: "+ claims.size());
                            System.out.println("Draft Claims : "+ draftCount);
                            System.out.println("Submitted Claims : "+ submittedCount);
                            System.out.println("Approved Claims: "+ approvedCount);
                            System.out.println("Rejected Claims: "+ rejectedCount);
                            System.out.println("Cancelled Claims: "+ cancelledCount);

                            System.out.printf("Total Amount: %.2f%n", totalAmount);
                            System.out.printf("Average Amount: %.2f%n", averageAmount);
                            System.out.printf("Highest Amount: %.2f%n", highestAmount);
                            System.out.printf("Lowest Amount: %.2f%n", lowestAmount);
                            System.out.printf("Total Approved Amount: %.2f%n", totalApprovedAmount);
    }
}
