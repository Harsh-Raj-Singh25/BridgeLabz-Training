package EWalletApplication;

public class Main {
    public static void main(String[] args) {
        // Step 1: Initialize wallets with referral bonuses (Constructors)
        Wallet personal = new PersonalWallet(1000, 50); // 1000 load + 50 bonus
        Wallet business = new BusinessWallet(5000, 0);  // 5000 load, 0 bonus

        // Step 2: Register Users
        User harsh = new User("Harsh (Personal)", personal);
        User namrata = new User("Namrata (Business)", business);

        System.out.println("======= FAST-PAY E-WALLET SYSTEM =======");
        System.out.println(harsh.getName() + " Initial Balance: Rs. " + harsh.getWallet().getBalance());
        System.out.println(namrata.getName() + " Initial Balance: Rs. " + namrata.getWallet().getBalance());

        // Step 3: Demonstrate Polymorphism and Transfer (Personal to Business)
        harsh.transferTo(namrata, 200);

        // Step 4: Demonstrate Business Logic (Taxed transfer)
        namrata.transferTo(harsh, 1000);

        System.out.println("\n======= FINAL STATUS =======");
        System.out.println(harsh.getName() + " Final Balance: Rs. " + harsh.getWallet().getBalance());
        System.out.println(namrata.getName() + " Final Balance: Rs. " + namrata.getWallet().getBalance());

        // Step 5: Transaction History (Abstraction)
        System.out.println();
        harsh.getWallet().viewHistory();
    }
}