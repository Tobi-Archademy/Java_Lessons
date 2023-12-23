public class Main {

    public static void main(String[] args) {
        UserStatus active = UserStatus.ACTIVE;
        System.out.println(active.name());  // ACTIVE

        UserStatus blocked = UserStatus.valueOf("BLOCKED");
        System.out.println(blocked); // BLOCKED

        UserStatus blockeD = UserStatus.valueOf("blocked"); // IllegalArgumentException, valueOf is case-sensitive


        // to get all the constants of the enum class in an array
        UserStatus[] statuses = UserStatus.values(); // [PENDING, ACTIVE, BLOCKED
        for (UserStatus status : statuses) {
            System.out.println(status);
        }

        System.out.println(active.ordinal()); // 0 (starting with 0)
        System.out.println(UserStatus.BLOCKED.ordinal()); // 2


        // Although enum is a reference type but the == operator works perfectly with it.
        System.out.println(active.equals(UserStatus.ACTIVE)); // true
        System.out.println(active == UserStatus.ACTIVE); // true


        // Works well with the switch statement/switch expression as well.
        // What is printed out depends on the status parsed.
        UserStatus status = ... // some status

        switch (status) {
            case PENDING:
                System.out.println("You need to wait a little.");
                break;
            case ACTIVE:
                System.out.println("No problems, you may pass here.");
                break;
            case BLOCKED:
                System.out.println("Stop! You can't pass here.");
                break;
            default:
                System.out.println("Unsupported enum constant.");
        }


        // List of methods you can use on the enum instance:

        // name()
        // values()
        // valueOf()
        // ordinal()
        // equals()

    }
}
