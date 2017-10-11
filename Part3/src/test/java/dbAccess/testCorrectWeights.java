package dbAccess;
import java.util.ArrayList;
import dbAccess.myUtility;
import org.junit.*;
import junit.framework.TestCase;

public class testCorrectWeights extends TestCase {
	
	ArrayList<StudentAssessment> obj;
	
	@Before
	public void setUp() throws Exception {
		obj = new ArrayList<StudentAssessment>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals( 100, myUtility.verify100pctWeight(obj )   );
	}
}
