package org.javalearning.program.java;
// above package would be name of your package and usually added automatically
import static org.junit.Assert.*; // this line could be added automatically
import org.junit.Test; // this line could be added automatically
//import org.javalearning.program.SampleJava;
import com.myexample.add.*;

public class SampleJavaTest {
//@Test
//public void multiplyTest() {
//	
//	Addition s = new Addition();
//// highlighted name would be name of your java program name
//assertEquals(4, s.(2,2));
//}
@Test
public void addTest() {
	Addition s = new Addition();
	
	assertEquals(4, s.add(2,2));
}
}