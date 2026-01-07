package parkEase;

//INTERFACE: Standardizes how vehicles are charged
interface IPayable {
	double calculateCharges(int hours);
}