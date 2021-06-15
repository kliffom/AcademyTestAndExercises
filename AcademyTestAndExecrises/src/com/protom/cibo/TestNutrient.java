package com.protom.cibo;

public class TestNutrient {

	public static void main(String[] args) {
		
		NutrInfo x = new NutrInfo("pane pizza", 500);
		x.setNutrient(Nutrient.GRASSI, 12.0);
		x.setNutrient(Nutrient.CARBOIDRATI, 20.0);
		x.setNutrient(Nutrient.PROTEINE, 15.0);
		
		
		System.out.println(x);
		
		NutrInfoHash y = new NutrInfoHash("LevlUp", 8);
		y.setNutrient(Nutrient.GRASSI, 0.5);
		y.setNutrient(Nutrient.CARBOIDRATI, 0.8);
		y.setNutrient(Nutrient.PROTEINE, 25);
		y.setNutrient(Nutrient.FIBRE, 0.0);
		
		System.out.println(y);

	}

}
