public class bank {
    public void compound(double num, double num2, int num3){
    	double ans = 0;
    	ans = num*Math.pow(1+num2,num3);
    	if (ans<=1500000)
    	System.out.println("year "+ num3+" amount is "+ans+" round-up "+Math.ceil(ans)+" round down "+Math.floor(ans));
   
	}
}
