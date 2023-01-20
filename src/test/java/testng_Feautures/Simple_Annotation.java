package testng_Feautures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	@BeforeSuite
	public void agile() {
		System.out.println("Agile");
	}
   @BeforeTest
	public void agile_Methodology() {
		System.out.println("Agile Methodology");
	}
   @BeforeClass
   public void principles() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Agile principles", 4);
		System.out.println(map);
	}
   @BeforeMethod
	public void pillars() {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("Agile pillars", 4);
		System.out.println(map1);
	}
   @Test
	public void devolpment_Lifecycle() {
        String s1 = "Ideation,devolment,testig,deployment,operations";
        System.out.println();
        System.out.println("5 stages of Development Lifecycle:");
		System.out.println(s1);
	}
    @Test
	public void framework() {
		List<String> list1 = new ArrayList<String>();
		System.out.println("Frameworks for Agile:");
		list1.add("DSDM");
		list1.add("FDD");
		list1.add("Crystal");
		System.out.println(list1);
    }
    @Test
	public void example() {
		Set<String> set1 = new TreeSet<String>();
        System.out.println("Agile Process Example:");
		set1.add("Scrum");
		set1.add("eXtreme Programming");
		set1.add("Feature Driven Development");
		set1.add("Dynamic System Devolment Method");
		set1.add("Adaptive Software Devolpment");
		set1.add("Crystal");
		set1.add("Lean Software Development");
		System.out.println(set1);
		}
    @AfterMethod
	public void Scrum() {
        System.out.println("Scrum");
	}
   @AfterClass
   public void advantages() {
        System.out.println("Agile Advantages");
	}
   @AfterTest
	public void disadvantages() {
       System.out.println(" Agiledisadvantages");
	}
   @AfterSuite
	public void qualities() {
       System.out.println("Good qualities an Agile Tester");
	}

}
