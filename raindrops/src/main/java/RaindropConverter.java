class RaindropConverter {

    String convert(int number) {
        boolean isFactor = false;
        String message = "";
        for(int i =1;i<=number;i++){
            if(number % i ==0 ){
                if (i == 3) {
                    isFactor = true;
                    message+= "Pling";
                }
                if(i == 5){
                    isFactor = true;
                    message+="Plang";
                }
                if( i== 7){
                    isFactor = true;
                    message+="Plong";
                }
            }
        }
        if(!isFactor){
            message = Integer.toString(number);
        }
        return message;
    }

}
