package com.rashika.stack;

import java.util.Stack;

/**
 * @author Rashika
 * Queue build using stack
 *
 */
public class QueueUsingStack<T> {
	private Stack<T> stack1;
	private Stack<T> stack2;
	
	public QueueUsingStack() {
		this.stack1 = new Stack<T>();
		this.stack2 = new Stack<T>();
	}
	
	public void push(T element){
		this.stack1.push(element);
	}
	
	public T pop(){
		if(this.stack2.isEmpty()){
			if(!this.stack1.isEmpty()){
				while(!this.stack1.isEmpty()){
				this.stack2.push(this.stack1.pop());
				}
				return this.stack2.pop();
			}
		}else {
			return this.stack2.pop();
		}
		return null;
	}
	
	public T peek(){
		if(this.stack2.isEmpty()){
			if(!this.stack1.isEmpty()){
				this.stack2.push(this.stack1.pop());
				return this.stack2.peek();
			}
		}else {
			return this.stack2.peek();
		}
		return null;
	}
	
	public Boolean isEmpty(){
		return this.stack1.isEmpty() && this.stack2.isEmpty();
	}
}	
