package dbAccess;
import java.util.ArrayList;
import dbAccess.myUtility;
import org.junit.*;
import junit.framework.TestCase;

public class testTotalPct extends TestCase {
	
	ArrayList<StudentAssessment> obj;
	
	@Before
	public void setUp() throws Exception {
		obj = new ArrayList<StudentAssessment>();		
    	//----------------------------------------------------
    	StudentAssessment zz1 = new StudentAssessment ();
    	zz1.setTrimesterId(2) ;
    	zz1.setStudentId(2150001);
    	zz1.setCourseId(7320);
    	zz1.setAssignmentId(1);
    	zz1.setAssignmentWeightPct(20);
    	zz1.setAssignmentMark(72.50);
    	obj.add(zz1);
    	//----------------------------------
    	StudentAssessment zz2 = new StudentAssessment ();
    	zz2.setTrimesterId(2) ;
    	zz2.setStudentId(2150001);
    	zz2.setCourseId(7320);
    	zz2.setAssignmentId(2);
    	zz2.setAssignmentWeightPct(35);
    	zz2.setAssignmentMark(82);
    	obj.add(zz2);
    	//----------------------------------
    	StudentAssessment zz3 = new StudentAssessment ();
    	zz3.setTrimesterId(2) ;
    	zz3.setStudentId(2150001);
    	zz3.setCourseId(7320);
    	zz3.setAssignmentId(3);
    	zz3.setAssignmentWeightPct(15);
    	zz3.setAssignmentMark(67.50);
    	obj.add(zz3);
    	//----------------------------------
    	StudentAssessment zz4 = new StudentAssessment ();
    	zz4.setTrimesterId(2) ;
    	zz4.setStudentId(2150001);
    	zz4.setCourseId(7320);
    	zz4.setAssignmentId(4);
    	zz4.setAssignmentWeightPct(30);
    	zz4.setAssignmentMark(97.50);
    	obj.add(zz4);				
	}
	@After
	public void tearDown() throws Exception {
		obj=null;
	}

	@Test
	public void test() {
		assertEquals( 82.575, myUtility.getTotalPct(obj)   );
	}
}
