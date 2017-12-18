class Stackdemo
{
	public static void main(String a[])
	{
		Stack std=new Stack();
		int max=5,top=-1,item=2,i;
		int stack[]=new int [5];
		char ch,ch1;
		System.out.println(std.top);
		
		System.out.println("Enter the choice");
		System.out.println("Enter 1 to push");
		System.out.println("Enter 2 to pop");
		System.out.println("Enter 3 to print");
		System.out.println("Enter 4 to exit");
		System.out.flush();

		try
		{
		do{	switch(ch=(char)System.in.read())
			{

				case '1':
						System.out.println("push");
						//std.push(top,max,9);
						break;

				case '2':
						System.out.println("pop");
						std.pop(7);
						break;
				case '3':
						System.out.println("Print");
						std.print();						
						break;

			}
			
			}while((ch1=(char)System.in.read())!='4');
		}
		catch(Exception e)
		{
		}


				
	}

}


class Stack
{
	int top=-1;
	int max=5;
	char stack[]=new char[5];
	Stack(){}

			int push(int top,int max,int u)
			{
				if(top==max)
				{
					System.out.println("stack over flow");
					return -1;
				}
				else
				{
					System.out.println("enter element");
					top=top+1;
					try{
					stack[top]=(char)System.in.read();}
					catch(Exception e){}
					return 0;
				}
			}

			void pop(int item)
			{
				if(top==-1)
				{
					System.out.println("stack empty");
				}
				else
					{
						item=stack[top];
						top=top-1;
					}
			}

			void print()
			{
				if(top==-1)
				{
					System.out.println("EMPTY");
				}
				else
				{
					for(int i=0;i<=top;i++)
					{
						System.out.println(stack[i]);
					}
				}
			}
}