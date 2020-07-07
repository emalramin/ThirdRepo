package Topics;

public class TestNGAnnotations {
	
//	Types Of TestNG Annotations
//	In TestNG, there are ten types of annotations:
//
//	@BeforeSuite – The @BeforeSuite method in TestNG runs before the execution of all other test methods.
//	@AfterSuite – The @AfterSuite method in TestNG runs after the execution of all other test methods.
//	@BeforeTest – The @BeforeTest method in TestNG runs before the execution of all the test methods that are inside that folder.
//	@AfterTest – The @AfterTest method in TestNG executes after the execution of all the test methods that are inside that folder.
//	@BeforeClass – The @BeforeClass method in TestNG will run before the first method invokes of the current class.
//	@AfterClass – The @AfterClass method in TestNG will execute after all the test methods of the current class execute.
//	@BeforeMethod – The @BeforeMethod method in TestNG will execute before each test method. 
//	@AfterMethod – The @AfterMethod method in TestNG will run after each test method is executed.
//	@BeforeGroups – The @BeforeGroups method in TestNG run before the test cases of that group execute. It executes just once. 
//	@AfterGroups – The @AfterGroups method in TestNG run after the test cases of that group execute. It executes only once. 

//	
//	Why Use Annotations?
//	TestNG annotations boast the following benefits:
//
//	Easy To Learn – The annotations are very easy to learn and execute. There is no predefined rule or format, and the tester just needs to annotate methods using their judgment.
//	Can Be Parameterized – Annotations can also be parameterized, just like any other method in Java.
//	Strongly Typed– Annotations type strongly, and the errors can be encountered during the run time, which saves time for the testers.
//	No Need To Extend Any Class – While using the annotations, there is no need to extend any Test class like JUnit.

//	Hierarchy In TestNG Annotations
//	TestNG provides many annotations to write good test source code while testing a software. So, how will TestNG figure out which test case to run first and then the next and so on? 
//	The answer is a hierarchy in these annotations. TestNG contains a hierarchy among the annotations. This hierarchy is as follows (top being the highest priority):
//
//	@BeforeSuite
//	@BeforeTest
//	@BeforeClass
//	@BeforeMethod
//	@Test
//	@AfterMethod
//	@AfterClass
//	@AfterTest
//	@AfterSuite
	
//	Multiple Test Case Scenario
//	If there are multiple @Test cases, TestNG runs the test cases in the alphabetical order.
	
//	TestNG Test Case With and Without Priority
//	The test cases without the priority attribute are given the “priority” and executed before the methods with priority
	
	
	
	
	
}
