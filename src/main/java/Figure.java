abstract class Figure {

    abstract public double area();
    abstract public double circumference();
    abstract public String output();

    public String roundResult(double result){
        String roundedResult="";
        result=Math.round(result*1000.0)/1000.0;
        roundedResult +=result;

        return roundedResult;
    }

}
