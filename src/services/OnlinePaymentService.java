package services;

public interface OnlinePaymentService {
	
	double paymentFee(double amount); //Assinatura do m�todo
	double interest(double amount, int months);
}
