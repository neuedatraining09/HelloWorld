public class Conditions1 {

    public static void main(String[] args) {
        int testScore = 60;
        if (testScore > 50) {
            System.out.println("Congratulations - you passed the test");
        } else if (testScore == 50) {
            System.out.println("We are not sure if you passed");
        } else {
            System.out.println("Sorry you failed");
        }
        switch (testScore) {
            case 0:
                System.out.println("Did you even take the test?");
                break;
            case 100:
                System.out.println("You got top marks!");
                break;
            default:
                System.out.println("You didn't do anything special");
                break;
        }
        int maxScore = 100;
        if (testScore > 50 && testScore < maxScore) {
            System.out.println("You passed but didn't get full marks");
        }
        if (testScore < 10 || testScore > 90) {
            System.out.println("You are at the boundary");
        }
        if (testScore < 10 || testScore > 90) {
            System.out.println("You are at the boundary");
        }
    }
}
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