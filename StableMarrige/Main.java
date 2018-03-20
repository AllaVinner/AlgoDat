package javaStableMarrige;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main {

	public static void main(String[] args) {
		int [][] Manpref  = { { 2, 1, 0},
							  { 0, 2, 1},
							  { 2, 1, 0}};
		
		Deque<Man> p = new ArrayDeque<Man>();
		for(int i = 0; i < Manpref.length;i ++){
			p.add(new Man(Manpref[i], i));
		}
		
		int [] [] womanPref = { {2, 0, 1},
								{1, 2, 0},
								{0, 2, 1}};
		
		Man[] currentCouple = new Man [womanPref.length];
	
	Man currentMan;
	int currentWIndex;
	int n =0;
		
		while(p.size() != 0){
			currentMan = p.poll();

			currentWIndex = currentMan.getNextIndex();

		if(currentCouple[currentWIndex] == null) {
				currentCouple[currentWIndex] = currentMan;
			}
			else if( (womanPref[currentWIndex][currentMan.getSelfIndex()]) < 
					(womanPref[currentWIndex][currentCouple[currentWIndex].getSelfIndex()])){
				p.add(currentCouple[currentWIndex]);
				currentCouple[currentWIndex] = currentMan;
			}
			else {
				p.add(currentMan);
			}

			} //End While
		
		for( int i= 0; i < currentCouple.length;i ++){
			System.out.println("Kvinna " + i + " Är gift med Man " + currentCouple[i].getSelfIndex());
		}
				
	}



}
