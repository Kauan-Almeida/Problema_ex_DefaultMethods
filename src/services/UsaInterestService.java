package services;

import java.security.InvalidParameterException;

public class UsaInterestService {

	public double interestRate;
	
	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	public double payment(double amount, int months) {
		if(months < 1) {
			throw new InvalidParameterException("Months must be greater than zera");
		}
		return amount * Math.pow(1.0 + interestRate / 100, months);
	}
	
	public double getInterestRate() {
		return interestRate;
	}
}
