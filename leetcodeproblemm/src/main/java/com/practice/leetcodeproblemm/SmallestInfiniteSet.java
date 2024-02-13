package com.practice.leetcodeproblemm;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SmallestInfiniteSet {
    int curr;
    Set<Integer>s;

    public SmallestInfiniteSet() {
        curr = 1;
        s = new HashSet<>();
    }
    
    public int popSmallest() {
        if(!s.isEmpty())
        {
            int res = Collections.min(s);
            s.remove(res);
            return res;
        }
        else
        {
            curr++;
            return curr-1;
        }
    }
    
    public void addBack(int num) {
        if(num<curr)
        {
            s.add(num);
        }
    }
    public static void main(String[] args) {
		SmallestInfiniteSet set = new SmallestInfiniteSet();
		System.out.println(set.popSmallest()); 
        set.addBack(2);
        System.out.println(set.popSmallest()); 
        System.out.println(set.popSmallest());
        System.out.println(set.popSmallest()); 
        set.addBack(1);
        System.out.println(set.popSmallest()); 
        System.out.println(set.popSmallest()); 
	}
}
