package Ch4_Control.MakingDifference.EnforcingPrivacyCryptography;

public class SimpleEncryption {
    // digit * 7 % 10
    // swamp 1 with 3 and 2 with 4
    int encrypted;

    public SimpleEncryption() {
    }

    public int encrypting(int fourDigit) {
        int first = fourDigit / 1000 % 10;
        System.out.print(first);
        int secund = fourDigit / 100 % 10;
        System.out.print(secund);
        int third = fourDigit / 10 % 10;
        System.out.print(third);
        int fourth = fourDigit % 10;
        System.out.print(fourth);

        System.out.println();

        first = (first + 7) % 10;
        System.out.print(first);
        secund = (secund + 7) % 10;
        System.out.print(secund);
        third = (third + 7) % 10;
        System.out.print(third);
        fourth = (fourth + 7) % 10;
        System.out.print(fourth);

        System.out.println();

        encrypted = (third * 1000) + (fourth * 100) + (first * 10) + secund;

        return  encrypted;
    }


    public int decrypting() {
        int decrypted = 0;


        int first = encrypted / 1000 % 10;
        System.out.print(first);
        int secund = encrypted / 100 % 10;
        System.out.print(secund);
        int third = encrypted / 10 % 10;
        System.out.print(third);
        int fourth = encrypted % 10;
        System.out.print(fourth);

        System.out.println();


        if(first < 7) {
            first = first - 7 + 10;
        } else {
            first = first - 7;
        }
        if(secund < 7) {
            secund = secund - 7 + 10;
        } else {
            secund = secund - 7;
        }
        if(third < 7) {
            third = third - 7 + 10;
        } else {
            third = third - 7;
        }
        if(fourth < 7) {
            fourth = fourth - 7 + 10;
        } else {
            fourth = fourth - 7;
        }

        decrypted = (third * 1000) + (fourth *100) + (first * 10) + secund;

        return decrypted;
    }
}
