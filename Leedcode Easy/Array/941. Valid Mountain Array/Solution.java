class Solution {
    public boolean validMountainArray(int[] arr) {


        int top = -1;
        int countTop = 0;
 

        for (int i = 0; i < arr.length; i++){
            if(arr[i] > top){
                top = arr[i];   //top為最大值
                countTop = i;
            } 
        }
   
        if (countTop == 0 || countTop == arr.length-1){
            return false;
        }
        for (int i = 0; i < countTop; i++){
            if(arr[i] >= arr[i+1]){
                return false;
            }
        }

        for (int i = countTop; i < arr.length-1; i++){
            if(arr[i] <= arr[i+1]){
                return false;
            } 
        }
        return true;
    }
}