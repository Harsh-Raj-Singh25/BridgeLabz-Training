class CandyCalculator {
	// method that counts the candies and returns the kids with max candies:
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
           int max=Integer.MIN_VALUE;
           ArrayList<Boolean> res=new ArrayList<>();
           for(int candy : candies) max=Math.max(max, candy);
           for(int candy : candies){
            //   if(candy+extraCandies >=max){
            //     res.add(true);
            //   }
            //   else
            //      res.add(false);
                 res.add(candy+extraCandies >=max);
           } 
           return res;
    }
}