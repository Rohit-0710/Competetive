package main;

import java.util.ArrayList;

import model.Interval;

public class MergeArraylist {
	
	public static void main(String[] args) {
		Interval in = new Interval(2, 5);
		Interval in2 = new Interval(6, 10);
		ArrayList<Interval> list = new ArrayList<Interval>();
		list.add(in);
		list.add(in2);
		Interval merge = new Interval(3, 11);
	ArrayList<Interval> ans =	insert(list, merge);
	
	System.out.println(ans);
	}
	
	public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        Interval current = newInterval;
        int i = 0;
        while(i < intervals.size()){
            Interval in = intervals.get(i);
            if(in.end < current.start){
                i++;
            }else if(in.start > current.end){
                intervals.add(i, current);
                break;
            }else{
                current.start = Math.min(in.start, current.start);
                current.end = Math.max(in.end, current.end);
                intervals.remove(i);
            }
        }
        if(i == intervals.size()){
            intervals.add(current);
        }
        return intervals;

    }

}
