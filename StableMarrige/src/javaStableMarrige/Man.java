package javaStableMarrige;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Man {
	 Deque<Integer> pref ;
	private int index;
	
	public Man(int [] prefIndex, int index){
		pref = new ArrayDeque<Integer>();
		this.index = index;
		for(int i : prefIndex){
			pref.add(i);
		}
	}
	
	public int getNextIndex(){
		return pref.poll();
	}
	public int getSelfIndex(){
		return index;
	}
}
