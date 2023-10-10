public class Logical {
    public static void main(String[] args) {
        // Logical AND
        // -----------------
        int temprature = 12;
        boolean isWarm = temprature > 20 && temprature < 30;
        System.out.println(isWarm);

        // Logical OR
        // ------------------------
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);
    }
}
