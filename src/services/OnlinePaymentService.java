package services;

public interface OnlinePaymentService {
	
	double paymentFee(double amount); //Assinatura do método
	double interest(double amount, int months);
}
