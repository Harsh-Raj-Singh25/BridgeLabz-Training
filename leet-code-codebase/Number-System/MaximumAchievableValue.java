/* Given two integers, num and t. A number x is achievable if it can become equal to num after 
applying the following operation at most t times:
Increase or decrease x by 1, and simultaneously increase or decrease num by 1.
Return the maximum possible value of x. */

class MaximumAchievableValue {
    public static int theMaximumAchievableX(int num, int t) {
		// using the logic that the t number of operations will be performed by x and number also. so [t*2]
        int x=num+(t*2);
        return x;
    }
	
	public static void main(String [] args){
		// take user input
		int number=4;
		int t=1;
		System.out.println(" maximum achievablenumber is  : "+theMaximumAchievableX(number,t));
	}
	
}