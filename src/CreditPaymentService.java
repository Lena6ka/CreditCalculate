public class CreditPaymentService {
    public int calculate (int credit, int term, float interestRate) {

        float monthlyInterestRate = interestRate/1200;
        int monthlyPayment = (int) (credit * (monthlyInterestRate + monthlyInterestRate / (Math.pow(1+monthlyInterestRate,term)-1)));

        return monthlyPayment;
    }

}
