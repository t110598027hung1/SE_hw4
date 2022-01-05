package grade;

import static org.junit.Assert.*;
import org.junit.Test;
import static grade.LetterGrade.*;

public class LetterGradeTest {
	@Test
	public void Constructor() {
		new LetterGrade();
	}
	@Test
	public void GradeAUpperBound() {
		assertEquals("Score 100 must be equal letterGrade A.", 'A', letterGrade(100));
	}
	@Test
	public void GradeAMiddle() {
		assertEquals("Score 95 must be equal letterGrade A.", 'A', letterGrade(95));
	}
	@Test
	public void GradeALowerBound() {
		assertEquals("Score 90 must be equal letterGrade A.", 'A', letterGrade(90));
	}
	@Test
	public void GradeBUpperBound() {
		assertEquals("Score 89 must be equal letterGrade B.", 'B', letterGrade(89));
	}
	@Test
	public void GradeBMiddle() {
		assertEquals("Score 85 must be equal letterGrade B.", 'B', letterGrade(85));
	}
	@Test
	public void GradeBLowerBound() {
		assertEquals("Score 80 must be equal letterGrade B.", 'B', letterGrade(80));
	}
	@Test
	public void GradeCUpperBound() {
		assertEquals("Score 79 must be equal letterGrade C.", 'C', letterGrade(79));
	}
	@Test
	public void GradeCMiddle() {
		assertEquals("Score 75 must be equal letterGrade C.", 'C', letterGrade(75));
	}
	@Test
	public void GradeCLowerBound() {
		assertEquals("Score 70 must be equal letterGrade C.", 'C', letterGrade(70));
	}
	@Test
	public void GradeDUpperBound() {
		assertEquals("Score 69 must be equal letterGrade D.", 'D', letterGrade(69));
	}
	@Test
	public void GradeDMiddle() {
		assertEquals("Score 65 must be equal letterGrade D.", 'D', letterGrade(65));
	}
	@Test
	public void GradeDLowerBound() {
		assertEquals("Score 60 must be equal letterGrade D.", 'D', letterGrade(60));
	}
	@Test
	public void GradeFUpperBound() {
		assertEquals("Score 59 must be equal letterGrade F.", 'F', letterGrade(59));
	}
	@Test
	public void GradeFMiddle() {
		assertEquals("Score 30 must be equal letterGrade F.", 'F', letterGrade(30));
	}
	@Test
	public void GradeFLowerBound() {
		assertEquals("Score 0 must be equal letterGrade F.", 'F', letterGrade(0));
	}
	@Test
	public void GradeXUpperBound() {
		assertEquals("Score -1 must be equal letterGrade X.", 'X', letterGrade(-1));
	}
	@Test
	public void GradeX() {
		assertEquals("Score 150 must be equal letterGrade X.", 'X', letterGrade(150));
	}
	@Test
	public void GradeXLowerBound() {
		assertEquals("Score 101 must be equal letterGrade X.", 'X', letterGrade(101));
	}
}
