class RotateStringToGoal {
    public boolean rotateString(String s, String goal) {
        char [] arr=s.toCharArray();
        int n=arr.length;
        for(int r=0;r<n;r++){
            char first=arr[0];
            for(int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=first;
            String str=new String(arr);
            if(str.equals(goal)) {
                return true;
            }    
        }
        return false;
    }
}