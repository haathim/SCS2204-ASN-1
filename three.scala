object three extends App{
    def totalCost(x:Int):Double = {
        if(x > 50){
            return 24.95*0.6 + 3 + (x-50)*0.75;
        }
        else{
            return 24.95*0.6 + 3;
        }
    }
    println(totalCost(60));
}
