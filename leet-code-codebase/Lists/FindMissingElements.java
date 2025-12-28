class FindMissingElements {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        for(int i=min;i<=max;i++){
            boolean found=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                res.add(i);
            }
        }
        
        return res;


    }
}