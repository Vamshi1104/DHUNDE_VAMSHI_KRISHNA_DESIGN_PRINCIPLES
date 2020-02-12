package task3.cal;

public class Driver {
	
   //function to decide which method of below layer(logic) should be called
   float calculate(float op1,float op2,String op) throws Exception
   {
	   float ans=0;
	   Logic obj=new Logic();
	   switch(op)
	   {
	   case "+":
		   ans=obj.addition(op1, op2);
		   break;
	   case "-":
		   ans=obj.subtraction(op1, op2);
		   break;
	   case "*":
		   ans=obj.multiplication(op1, op2);
		   break;
	   case "/":
		   try
		   {  
			  if(op2==0)
				  throw new Exception("Divide by zero error");
			  ans=obj.division(op1, op2);
		   }
		   catch(Exception e)
		   {
			   throw e;
		   }
		   break;
		default:
			throw new Exception("Not valid operator");
	   }
	   return ans;
	   
   }
}

