package Ch4_Control.MakingDifference.EnforcingPrivacyCryptography;

public class Test {
    public static void main(String[] args) {
        SimpleEncryption simpleEncryption = new SimpleEncryption();
        simpleEncryption.encrypting(1234);
        System.out.println(simpleEncryption.encrypted + "<-- test szyfrowania");
        System.out.println(simpleEncryption.decrypting() + "<-- test deszyfrowania");
    }
}
