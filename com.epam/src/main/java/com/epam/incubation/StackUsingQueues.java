package com.epam.incubation;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Stack using queues
 *
 */




class Stack
{
	
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	
	int curr_size =0;

	public void push(int i) {
		
		curr_size++;
		q2.add(i);
		
		while(!q1.isEmpty())
		{
			q2.add(q1.peek());
			q1.remove();
		}
		
		Queue<Integer> q=q1;
		q1=q2;
		q2=q;
		
	}

	public void pop() {
		
		if(q1.isEmpty())
			return;
		q1.remove();
		curr_size--;
		
	}
	
	
	
}
public class StackUsingQueues 
{
    public static void main( String[] args )
    {
    	Stack s= new Stack();
    	s.push(1);
    	s.push(2);
    	System.out.println(s.q1);
    	s.pop();
    	s.pop();
    	System.out.println(s.q1);

    }
}
