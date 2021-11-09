public class Main {
    public static void main(String[] args) {
        CreditPaymentService credit = new CreditPaymentService();
        int monthlyPayment = credit.calculate(1_000_000,36,9.99F);

        System.out.println("Ежемесячный платеж " + monthlyPayment);

    }
}
