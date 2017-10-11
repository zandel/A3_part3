package dbAccess;
import java.util.ArrayList;

public class myUtility {
	
	public static int verify100pctWeight( ArrayList<StudentAssessment >  zzz   ) {    	
    	return 100;
    }
	
	public static double getTotalPct( ArrayList<StudentAssessment >  myTrimester   ) {
		
	 double courseMark = 0.0;
	 for ( StudentAssessment  qq  : myTrimester ) {		
		
		int courseId = qq.getCourseId()      ;
		int assessmentId = qq.getAssignmentId()      ;
		int aWeight = qq.getAssignmentWeightPct();
		double aMark = qq.getAssignmentMark();   		
	    
		System.out.println ( "***************");
	    System.out.println ( courseId );
	    System.out.println ( assessmentId );
	    System.out.println ( aWeight + "%");
	    System.out.println ( aMark + "%");
	    //
	    System.out.println ( (aWeight * aMark)/100 );
	    //
	    courseMark = courseMark + ( (aWeight * aMark)/100 );
	    //
	    System.out.println ( "***************");    	
	 }  // end of for
	
	 System.out.printf("Total course mark: %.2f",  courseMark  );
	 // courseMark = courseMark * 1.1; //intentional error
	 return courseMark ;
	}

}
