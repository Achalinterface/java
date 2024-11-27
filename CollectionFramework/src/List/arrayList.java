package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayList {
	public static void main(String[] args) {
		List<String> Mass_Market = new ArrayList<>();
		Mass_Market.add("Tata");
		Mass_Market.add("Mahindra");
		Mass_Market.add("Honda");
		Mass_Market.add("Hyundai");
		Mass_Market.add("Toyota");
		Mass_Market.add("Nissan");
		Mass_Market.add("Suzuki");
		Mass_Market.add("Ford");

		List<String> Semi_premium = new ArrayList<>();
		Semi_premium.add("Tesla");
		Semi_premium.add("Jeep");
		Semi_premium.add("Mini");
		Semi_premium.add("Lotus");
		Semi_premium.add("Cupra");
		Semi_premium.add("Volkswagen");
		
		List<String> Premium = new ArrayList<>();
		Premium.add("Volvo");
		Premium.add("Audi");
		Premium.add("Jaguar");
		Premium.add("Mercedes-Benz");
		Premium.add("B.M.W");
		Premium.add("Lexus");
		Premium.add("Genesis");
		
		List<String> Luxury = new ArrayList<>();
		Luxury.add("Rolls Royce");
		Luxury.add("Porsche");
		Luxury.add("Maserati");
		
		List<String> Top_of_line = new ArrayList<>();
		Top_of_line.add("Bugatti");
		Top_of_line.add("Mclaren");
		Top_of_line.add("Bentley");
		Top_of_line.add("Ferrari");
		Top_of_line.add("Lamborghini");
		
		List<String> Baap_Level = new ArrayList<>();
		Baap_Level.add("Mk4");
		Baap_Level.add("R35");
		
		List<String> Cars = new ArrayList<>();
		Cars.addAll(Mass_Market);
		Cars.addAll(Semi_premium);
//		Cars.addAll(Premium);
//		Cars.addAll(Luxury);
//		Cars.addAll(Top_of_line);
//		Cars.addAll(Baap_Level);
		Cars.addAll(0, Top_of_line);
	

		System.out.println(Cars);
		
//		Iterator<String> i = Cars.iterator();
//		while(i.hasNext()){
//			System.out.println(i.next());
//		}
	}
}
