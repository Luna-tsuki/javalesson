package leetCode;

public class Code1603 {

	public static void main(String[] args) {
		ParkingSystem obj = new ParkingSystem(1, 1, 0);
		boolean param_1 = obj.addCar(1);
		boolean param_2 = obj.addCar(2);
		boolean param_3 = obj.addCar(3);
		boolean param_4 = obj.addCar(1);
		System.out.println(param_1);
		System.out.println(param_2);
		System.out.println(param_3);
		System.out.println(param_4);
	}

}

class ParkingSystem {
	int big;
	int medium;
	int small;

	public ParkingSystem(int big, int medium, int small) {
		this.big = big;
		this.medium = medium;
		this.small = small;

	}

	public boolean addCar(int carType) {

		if (carType == 1) {
			--big;
			if (big >= 0) {
				return true;
			} else {
				return false;
			}
		} else if (carType == 2) {
			--medium;
			if (medium >= 0) {
				return true;
			} else {
				return false;
			}
		} else if (carType == 3) {
			--small;
			if (small >= 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}
}