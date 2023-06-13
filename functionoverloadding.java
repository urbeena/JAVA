 class functionoverloadding {
     int s1, s2, s3;
     functionoverloadding(int s1, int s2, int s3){
       s1 = s2 =s3;
     }
     functionoverloadding( int s3){
         s1= s1*s2;
     }

    

    public static void main(String args[]){

        functionoverloadding obj1 = new functionoverloadding();
        
        functionoverloadding(1);