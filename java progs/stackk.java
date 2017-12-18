package stack;  
 import java.io.*;  
 import java.lang.*;  
 import java.util.logging.Level;  
 import java.util.logging.Logger;  

  class mystack {  
  DataInputStream get=new DataInputStream(System.in);  
  int a[];  
  int i,top=0,n,item,out;  
  void getdata()  
  {  
  try  
   {  
   System.out.println("Enter the limit");  
   n=Integer.parseInt(get.readLine());  
   a=new int[n];  
   }   
  catch(Exception e)  
   {  
   System.out.println(e.getMessage());  
   }  
  }  
  void push(int item)  
  {  
    if(top==n)  
    {  
      System.out.println("STACK IS FULL");  
    }  
    else  
    {  
    a[top]=item;  
    top++;  
    }  
  }  
  void pop()  
  {  
    if(top==0)   
    {  
     System.out.println("STACK EMPTY");   
    }  
    else  
    {  
      top--;  
      out=a[top];  
    }  
    System.out.println(out);  
  }  
  void display()  
  {  
    if(top==0){  
      System.out.println("STACK EMPTY");    
    }  
    else  
   {  
   for(i=top-1;i>=0;i--)  
    System.out.println(+a[i]);  
   }  
  }  
   }  
 class Stack  
 {  
   public static void main(String[]args)  
   {  
      DataInputStream get=new DataInputStream(System.in);  
  int ch = 0,t = 0;  
  mystack obj=new mystack();  
  obj.getdata();  
  System.out.println("1.PUSH 2.POP 3.DISPLAY");  
     try {  
       ch=Integer.parseInt(get.readLine());  
     } catch (IOException ex) {  
       Logger.getLogger(Stack.class.getName()).log(Level.SEVERE, null, ex);  
     }  
     while(ch!=4)  
     {  
       System.out.println("1.PUSH 2.POP 3.DISPLAY");  
  switch(ch)  
  {  
    case 1:  
      try{  
      t=Integer.parseInt(get.readLine());  
      }  
      catch(IOException e)  
      {  
      }  
      System.out.println("value");  
       try {  
       t=Integer.parseInt(get.readLine());  
       obj.push(t);  
     } catch (IOException ex) {  
       Logger.getLogger(Stack.class.getName()).log(Level.SEVERE, null, ex);  
     }  
      break;  
    case 2:  
      obj.pop();  
      break;  
          case 3:obj.display();  
            break;  
  }  
 }  
   }  
 }  
