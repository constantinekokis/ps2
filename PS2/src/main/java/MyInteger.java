
public class MyInteger {
	static int value;

	public int MyInteger(int value){
		this.value = value;
		return value;
	}
    MyInteger(int newValue) {

        value = newValue;

    }

    public int getValue() {

        return value;

    }

    public static boolean isEven() {

        if (value % 2 == 0){
        	return true;
        }
        else
        	return false;
        }

    public static boolean isOdd() {
    	if (value %2==1){
    		return true;
    	}
    	else
    		return false;
    }

    public static boolean isPrime() {

        for (int f = 2; f < value / 2; f++) {

            if (value % f == 0) {

                return false;

            }

        }

        return true;

    }

    public static boolean isEven(int value) {
        if (value % 2 == 0){
        	return true;
        }
        else
        	return false;
    }

    public static boolean isOdd(int value) {
    	if (value %2==1){
    		return true;
    	}
    	else
    		return false;
    }
    
    public static boolean isPrime(int value) {
        for (int f = 2; f < value / 2; f++) {

            if (value % f == 0) {

                return false;

            }

        }

        return true;

    }

    public boolean equals(int n) {


        return (value == n);

    }
}
