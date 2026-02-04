package com.lambda.banking;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BankingSystem {
	public static void main(String[] args) {
		Account a1 = new Account("ACC01", 5000.0);
		Account a2 = new Account("ACC02", 3000.0);

		// 1. Min balance rule (Min 1000)
		Predicate<Double> checkMinBal = bal -> bal >= 1000;
		System.out.println("ACC01 meets min balance? " + checkMinBal.test(a1.balance));

		// 2. Simple Interest (P * R * T / 100)
		// Using a custom lambda for 3 variables
		TriFunction<Double, Double, Double, Double> calcSI = (p, r, t) -> (p * r * t) / 100;

		// 3. Validate withdrawal
		BiPredicate<Double, Double> canWithdraw = (bal, amount) -> bal >= amount;
		System.out.println("Can withdraw 2000 from ACC02? " + canWithdraw.test(a2.balance, 2000.0));

		// 4. Print account details
		Consumer<Account> printAcc = acc -> System.out.println("Acc: " + acc.accNum + " | Bal: " + acc.balance);
		printAcc.accept(a1);

		// 5. Compare balances
		BiFunction<Account, Account, String> compareBal = (acc1,
				acc2) -> acc1.balance > acc2.balance ? acc1.accNum + " is richer" : acc2.accNum + " is richer";
		System.out.println(compareBal.apply(a1, a2));
	}
}