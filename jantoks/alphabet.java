package jantoks;
import java.util.*;

/**
 *
 * @author Lenov G5030
 */
public class alphabet {
    public static void main(String[]args){
	PriorityQueue<String> stacks = new PriorityQueue<String>();
	stack<String> que = new stack<String>();
	String words[] = {"the","quick","brown","fox","jump","over","lazy","dog"};
	for(String x: words);
	for(String x: words)
		System.out.printf("%s ",x);
		System.out.println();
		
	System.out.println("\n-0-0-0-0-0-");	
	
	for(String x: words)
	{stacks.offer(x);
	System.out.println(stacks +" top");}
	
	System.out.println("\n-0-0-0-0-0-");
	for(String x: words)
	{que.push(x);
	System.out.println(que+"top");}
	
	System.out.println("\n-0-0-0-0-0-");	
	stacks.poll();
	System.out.println(stacks);
	
	System.out.println("\n-0-0-0-0-0-");
	que.pop();
	System.out.println(que);
	//System.out.printf("\n");
	System.out.println("\n-0-0-0-0-0-");
	System.out.printf("%s ",que.peek());
	System.out.printf("%s \n",stacks.peek());
	
	
	for(int count=4;count>0;count--)
	que.pop();
	System.out.printf("%s ",que.peek());
	
	for(int count=2;count>0;count--);
	for(int count=2;count>0;count--)
	{stacks.poll();
	System.out.printf("%s ",stacks.peek());}
	
	for(int count=2;count>0;count--)
	stacks.poll();
	System.out.printf("%s ",stacks.peek());
	
    }
}
