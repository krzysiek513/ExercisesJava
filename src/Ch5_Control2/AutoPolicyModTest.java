package Ch5_Control2;

public class AutoPolicyModTest {
    public static void main(String[] args) {
        // create two AutoPolicy objects
        AutoPolicyMod policy1 =
                new AutoPolicyMod(11111111, "Toyota Camry", "NJ");
        AutoPolicyMod policy2 =
                new AutoPolicyMod(22222222, "Ford Fusion", "ME");
        policy1.setState("NH");
        policy2.setState("ew");
        // display whether each policy is in a no-fault state
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    // method that displays whether an AutoPolicy
    // is in a state with no-fault auto insurance
    public static void policyInNoFaultState(AutoPolicyMod policy) {
        System.out.println("The auto policy:");
        System.out.printf(
                "Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(),
                policy.getState(),
                (policy.isNoFaultState() ? "is": "is not"));
    }
}
