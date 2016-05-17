package com.cluster;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
	TreeSet set = new TreeSet();
	set.add(new Integer(10));
	set.add(new Integer(20));
	set.add(new Integer(30));
	set.add(new Integer(40));
	set.add(new Integer(50));
	set.add(new Integer(60));
	set.add(new Integer(70));
	
	System.out.println("Contrents in the Treeset are : "+set);
	
	System.out.println("The siz eof the tree set are "+set.size());
	System.out.println("First elment is : "+set.first());
	System.out.println("Contents if last elment is "+set.last());
	
	//from first to 50 Excludes fifty
	SortedSet hs=set.headSet(new Integer(50));
	System.out.println("Val within 50 are "+hs);
	
	//from 30 to last includes 30
	
	SortedSet ts=set.tailSet(new Integer(30));
    System.out.println("Contents of set "+ts);
    
    //from inclusing 30 till exclusing 70
    
    SortedSet ss=set.subSet(30, 70);
    System.out.println("Contents within 30 to 70 are : "+ss);
    
   TreeSet trrr=new TreeSet<>();
   
   trrr=(TreeSet)set.subSet(30, 70);
   System.out.println("Contents within  trrr 30 to 70 are : "+trrr);
   
  // NavigableSet nn =set.subSet(30, 70);
   
	}

}
