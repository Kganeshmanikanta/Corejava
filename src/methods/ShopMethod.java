package methods;

import java.util.Scanner;

public class ShopMethod {
	public static class Clothes {
		void mensWareTopWare(String type, int stock, String model) {
			System.out.println("Brand:-" + type);
			System.out.println("Stock:-" + stock);
			System.out.println("Type:-" + model);

		}

		void mensWareBottomWare(String type, int stock, String model) {
			System.out.println("Brand:-" + type);
			System.out.println("Stock:-" + stock);
			System.out.println("Type:-" + model);

		}

		void mensWareSportsWere(String type, int stock, String model) {
			System.out.println("Brand:-" + type);
			System.out.println("Stock:-" + stock);
			System.out.println("Type:-" + model);

		}

		void mensInnerWare(String type, int stock, String model) {
			System.out.println("Brand:-" + type);
			System.out.println("Stock:-" + stock);
			System.out.println("Type:-" + model);
		}

		void mensFootWare(String type, int stock, String model) {
			System.out.println("Brand:-" + type);
			System.out.println("Stock:-" + stock);
			System.out.println("Type:-" + model);
		}
	}

	public static class Electronics {
		void mobiles(String brand, double price, int stock) {
			System.out.println("Mobile Brand:-" + brand);
			System.out.println("Mobile Price:-" + price);
			System.out.println("Stock Available:-" + stock);

		}

		void tabs(String brand, double price, int stock) {
			System.out.println("Tab Brand:-" + brand);
			System.out.println("Tab Price:-" + price);
			System.out.println("Stock Available:-" + stock);
		}

		void laptops(String brand, int storage, double price, int stock) {
			System.out.println("Laptop Brand:-" + brand);
			System.out.println("Laptop Storage:-" + storage);
			System.out.println("Laptop Price:-" + price);
			System.out.println("Stock Available:-" + stock);
		}

		void washingMachine(String brand, double price, int stock) {
			System.out.println("WashingMachine Brand:-" + brand);
			System.out.println("WashingMachine Price:-" + price);
			System.out.println("Stock Available:-" + stock);
		}

		void electricCooker(String brand, double price, int stock) {
			System.out.println("Cooker Brand:-" + brand);
			System.out.println("Cooker Price:-" + price);
			System.out.println("Stock Available:-" + stock);
		}

		void hairDryer(String brand,  double price, int stock) {
			System.out.println("HairDryer Brand:-" + brand);
			System.out.println("HairDryer Price:-" + price);
			System.out.println("Stock Available:-" + stock);
		}

		void airFryer(String brand,  double price, int stock) {
			System.out.println("AirFryer Brand:-" + brand);
			System.out.println("AirFryer Price:-" + price);
			System.out.println("Stock Available:-" + stock);
		}

		void ac(String brand,  double price, int stock) {
			System.out.println("AC Brand:-" + brand);
			System.out.println("Ac Price:-" + price);
			System.out.println("Stock Available:-" + stock);
		}

		void fridge(String brand, double price, int stock) {
			System.out.println("Fridge Brand:-" + brand);
			System.out.println("Fridge Price:-" + price);
			System.out.println("Stock Available:-" + stock);
		}

		void tv(String brand,  double price, int stock) {
			System.out.println("TV Brand:-" + brand);
			System.out.println("TV Price:-" + price);
			System.out.println("Stock Available:-" + stock);
		}

	}

	public class Groceries {
		void fruits(String type, float price) {
			System.out.println("Fruits:" + type);
			System.out.println("Price:" + price);

		}

		void vegitables(String type, float price) {
			System.out.println("Vegitables:" + type);
			System.out.println("Price:" + price);

		}

		void snacks(String type, float price) {
			System.out.println("Snacks:" + type);
			System.out.println("Price:" + price);

		}

		void backeryItems(String type, float price) {
			System.out.println("BackeryItem:" + type);
			System.out.println("Price:" + price);

		}

		void groceries(String type, float price) {
			System.out.println("Grocerie:" + type);
			System.out.println("Price:" + price);

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Clothes c1 = new Clothes();
		System.out.println("Enter the Type of Clothes(Shirts or T-shirts):");
		String type = sc.nextLine();
		int stock = sc.nextInt();
		sc.nextLine();
		String model = sc.nextLine();
		c1.mensWareTopWare(type, stock, model);
		System.out.println("*********************************");

		System.out.println("Enter the Type of Clothes(Pants or Lungies):");
		String type1 = sc.nextLine();
		int stock1 = sc.nextInt();
		sc.nextLine();
		String model1 = sc.nextLine();
		c1.mensWareBottomWare(type1, stock1, model1);

		System.out.println("*********************************");

		System.out.println("Enter the Type of Clothes( shorts or vests):");
		String type2 = sc.nextLine();
		int stock2 = sc.nextInt();
		sc.nextLine();
		String model2 = sc.nextLine();
		c1.mensWareBottomWare(type2, stock2, model2);

		System.out.println("*********************************");

		System.out.println("Enter the Type of Clothes(inners or cuts-vests):");
		String type3 = sc.nextLine();
		int stock3 = sc.nextInt();
		sc.nextLine();
		String model3 = sc.nextLine();
		c1.mensWareBottomWare(type3, stock3, model3);

		System.out.println("*********************************");

		System.out.println("Enter the Type of footware(slippers or shoes):");
		String type4 = sc.nextLine();
		int stock4 = sc.nextInt();
		sc.nextLine();
		String model4 = sc.nextLine();
		c1.mensWareBottomWare(type4, stock4, model4);

		System.out.println("*********************************");

		// 2nd inner class Electronics
		Electronics e1 = new Electronics();
		System.out.println("*********************************");

		System.out.println("Enter the mobile details:");
		System.out.println("Enter the mobile name:");

		String brand = sc.nextLine();
		System.out.println("Enter the mobile stock:");

		int available = sc.nextInt();
		System.out.println("Enter the mobile price:");

		double price = sc.nextDouble();
		e1.mobiles(brand, price, available);

		System.out.println("*********************************");

		System.out.println("Enter the tab details:");
		System.out.println("Enter the tab name:");

		String brand1 = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the tab stock:");

		int available1 = sc.nextInt();

		System.out.println("Enter the tab price:");
		double price1 = sc.nextDouble();
		e1.tabs(brand1, price1, available1);

		System.out.println("*********************************");

		System.out.println("Enter the laptop details:");
		System.out.println("Enter the laptop name:");

		String brand2 = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the laptop stock:");

		int available2 = sc.nextInt();
		System.out.println("Enter the laptop storage:");
		int storage = sc.nextInt();

		System.out.println("Enter the laptop price:");

		double price2 = sc.nextDouble();
		e1.laptops(brand2, storage, price2, available2);

		System.out.println("*********************************");

		System.out.println("Enter the washingMachine  details:");
		System.out.println("Enter the washingMachine name:");

		String brand3 = sc.nextLine();
		System.out.println("Enter the washingMachine stock:");

		int available3 = sc.nextInt();
		System.out.println("Enter the washingMachine price:");

		double price3 = sc.nextDouble();
		e1.washingMachine(brand3, price3, available3);

		System.out.println("*********************************");

		System.out.println("Enter the electricCooker  details:");
		System.out.println("Enter the electricCooker name:");

		String brand4 = sc.nextLine();
		System.out.println("Enter the electricCooker stock:");

		int available4 = sc.nextInt();
		System.out.println("Enter the electricCooker price:");

		double price4 = sc.nextDouble();
		e1.electricCooker(brand4, price4, available4);

		System.out.println("*********************************");

		System.out.println("Enter the hairDryer  details:");
		System.out.println("Enter the hairDryer name:");

		String brand5 = sc.nextLine();
		System.out.println("Enter the hairDryer stock:");

		int available5 = sc.nextInt();
		System.out.println("Enter the hairDryer price:");

		double price5 = sc.nextDouble();
		e1.hairDryer(brand5, price5, available5);

		System.out.println("*********************************");

		System.out.println("Enter the airFryer  details:");
		System.out.println("Enter the airFryer name:");

		String brand6 = sc.nextLine();
		System.out.println("Enter the airFryer stock:");

		int available6 = sc.nextInt();
		System.out.println("Enter the airFryer price:");

		double price6 = sc.nextDouble();
		e1.airFryer(brand6, price6, available6);

		System.out.println("*********************************");

		System.out.println("Enter the ac  details:");
		System.out.println("Enter the ac name:");

		String brand7 = sc.nextLine();
		System.out.println("Enter the ac stock:");

		int available7 = sc.nextInt();
		System.out.println("Enter the ac price:");

		double price7 = sc.nextDouble();
		e1.ac(brand7, price7, available7);

		System.out.println("*********************************");

		System.out.println("Enter the fridge  details:");
		System.out.println("Enter the fridge name:");

		String brand8 = sc.nextLine();
		System.out.println("Enter the fridge stock:");

		int available8 = sc.nextInt();
		System.out.println("Enter the fridge price:");

		double price8 = sc.nextDouble();
		e1.fridge(brand8, price8, available8);

		System.out.println("*********************************");

		System.out.println("Enter the tv  details:");
		System.out.println("Enter the tv name:");

		String brand9 = sc.nextLine();
		System.out.println("Enter the tv stock:");

		int available9 = sc.nextInt();
		System.out.println("Enter the tv price:");

		double price9 = sc.nextDouble();
		sc.nextLine();
		e1.tv(brand9, price9, available9);

		// 3rd inner class
		ShopMethod s1 = new ShopMethod();
		Groceries g1 = s1.new Groceries();
		System.out.println("Enter the groceries:");
		System.out.println("Enter the fruits:");
		String go = sc.nextLine();
		System.out.println("Enter the fruits stock:");
		float c = sc.nextFloat();
		sc.nextLine();
		g1.fruits(go, c);
		System.out.println("************************");

		System.out.println("Enter the vegitables:");
		String go1 = sc.nextLine();
		System.out.println("Enter the vegitables stock:");
		float co1 = sc.nextFloat();
		sc.nextLine();

		g1.vegitables(go1, co1);
		System.out.println("************************");

		System.out.println("Enter the snacks:");
		String go2 = sc.nextLine();
		System.out.println("Enter the snacks stock:");
		float co2 = sc.nextFloat();
		sc.nextLine();

		g1.snacks(go2, co2);
		System.out.println("************************");

		System.out.println("Enter the backeryItems:");
		String go3 = sc.nextLine();
		System.out.println("Enter the backeryItems stock:");
		float co3 = sc.nextFloat();
		sc.nextLine();

		g1.backeryItems(go3, co3);
		System.out.println("************************");

		System.out.println("Enter the groceries:");
		String go4 = sc.nextLine();
		System.out.println("Enter the groceries stock:");
		float co4 = sc.nextFloat();
		g1.groceries(go4, co4);
		System.out.println("************************");

		sc.close();

	}

}
