import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    // Default constructor
    public Loan() {
        this(2.5, 1, 1000.0);
    }

    // Constructor with specified parameters
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date(); // Automatically sets to current date
    }

    // Accessor methods
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    // Mutator methods
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // Monthly payment calculation: (P * r) / (1 - (1 + r)^(-n))
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        int totalPayments = numberOfYears * 12;
        return (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -totalPayments));
    }

    // Total payment calculation
    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}