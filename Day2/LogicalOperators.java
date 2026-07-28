public class LogicalOperators {

    public static void main(String[] args) {

        int age = 22;
        boolean hasVoterID = true;

        System.out.println("========== Logical Operators ==========");

        System.out.println("Age          : " + age);
        System.out.println("Has Voter ID : " + hasVoterID);

        System.out.println();

        System.out.println("AND (&&) : " + (age >= 18 && hasVoterID));
        System.out.println("OR (||)  : " + (age >= 18 || hasVoterID));
        System.out.println("NOT (!)  : " + (!hasVoterID));

        System.out.println("========================================");
    }
}