package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.CompareModel;

public class Compare {
	
	public static void main(String[] args) {
		
		List<CompareModel> listCompare = new ArrayList<CompareModel>();
		
		CompareModel comp1 = new CompareModel("2001", "Test1");
		CompareModel comp2 = new CompareModel("2002", "Test2");
		CompareModel comp3 = new CompareModel("1689", "Test3");
		CompareModel comp4 = new CompareModel("345", "Test4");
		
		listCompare.add(comp1);
		listCompare.add(comp2);
		listCompare.add(comp3);
		listCompare.add(comp4);
		
		listCompare.sort(new Comparator<CompareModel>() {

			@Override
			public int compare(CompareModel o1, CompareModel o2) {
				return o1.getStart().compareTo(o2.getStart());
			}
		});
		
	for(int i=0; i<listCompare.size(); i++)
	{
		System.out.println("Index ==========>" + i);
		System.out.println(listCompare.get(i).getStart());
		System.out.println(listCompare.get(i).getTest());
	}
	}
	
	
	

}
