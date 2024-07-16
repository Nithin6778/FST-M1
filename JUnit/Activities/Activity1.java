package demos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Activity1 {
	static ArrayList<String> list;
	
	@BeforeEach
	void setUp() {
		list =new ArrayList<String>();
		list.add("alpha");
		list.add("beta");
	}
	@Test
	public void insertTest() {
		assertEquals(2, list.size(), "WRONG SIZE");
		list.add(2, "charile");
		assertEquals(3, list.size(), "Wrong size");
		assertEquals("alpha", list.get(0), "Wrong element");
	    assertEquals("beta", list.get(1), "Wrong element");
	    assertEquals("charile", list.get(2), "Wrong element");
	}
	
	public void replaceTest() {
		list.set(1, "charile");
		assertEquals(2, list.size(), "Wrong size");
		assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
	}

}
