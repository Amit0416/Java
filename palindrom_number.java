
class  palindrom_number {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int sum=0;
        int tar=x;
        while(x>0){
            sum=sum*10+x%10;
            x/=10;
        }
        if(sum==tar){
            return true;
        }else{
            return false;
        }
    }
}



