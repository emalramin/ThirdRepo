package Topics;

public class TestNGDependentTests {
	
//	How To Use dependsOn attribute in TestNG?
//			TestNG allows you to specify dependencies in the following two ways:
//
//			Using attributes dependsOnMethods in @Test annotations
//			  @Test (dependsOnMethods = { "OpenBrowser" })
//			  public void SignIn() {
//			  }
//			  @Test
//			  public void OpenBrowser() {
//			  }
	
//	Using attributes dependsOnGroups in @Test annotations.
//	The dependsOnGroups attribute lets us make a test depend on a whole group rather than a single test. 
//	For example, see the code below:
//		 @Test(dependsOnGroups = { "SignIn" })
//    public void ViewAcc() {
//        System.out.println("SignIn Successful");
//    }
// 
//    @Test(groups = { "SignIn" })
//    public void LogIn() {
//        System.out.println("Logging In Success");
//    }
	
//	Single Dependent Test Methods In TestNG
//	A single dependent test in TestNG is declared when a single test depends on another test. 
//	It is similar to the example we saw above. We use dependsOnMethods for the same purpose.
//
//	Take a look over the below example:
//		public class DependsOnTest {
//		  @Test (dependsOnMethods = { "OpenBrowser" })
//		  public void SignIn() {
//		  }
//		  @Test
//		  public void OpenBrowser() {
//		  }
//		  @Test (dependsOnMethods = { "SignIn" })
//		  public void LogOut() {
//		  }
	
//	Multiple Dependent Tests In TestNG
//	A single test depends on multiple tests in TestNG. We make use of defining various dependencies 
//	for the same. Observe the code below:
//		public class DependsOnTest 
//		{
//		    @Test
//		    public void OpenBrowser() {
//		    }
//		    @Test(dependsOnMethods = { "SignIn", "OpenBrowser" })
//		    public void LogOut() {
//		    }
//		    @Test
//		    public void SignIn() {
//		    }
	
//	Inherited Dependent Test Methods In TestNG
//	Inheritance is a popular concept in object-oriented programming paradigms, and especially 
//	if you have worked in Java, you must have heard and used it a lot. In the previously used 
//	methods, we used all the tests of the same class in TestNG. In inherited dependent test 
//	methods in TestNG, we create dependency among the methods that belong to different classes, 
//	and one of the classes inherits the functionalities of another class.
//	
//	class SuperClass
//	{
//	    @Test
//	    public void OpenBrowser() {
//	    }
//	}
//	public class InheritedDependencyTest extends SuperClass
//	{
//	    @Test(dependsOnMethods = { "OpenBrowser" })
//	    public void LogIn() {
//	    }
	
//	What Are Group Dependent Test?
//			public class GroupDependency
//			{
//			    @Test(dependsOnGroups = { "SignIn" })
//			    public void ViewAcc() {
//			    }
//			 
//			    @Test(groups = { "SignIn" })
//			    public void OpenBrowser() {
//			    }
//			 
//			    @Test(groups = { "SignIn" })
//			    public void LogIn() {
//			    }
//	In the above code, we created a group called SignIn and a test method ViewAcc 
//	that depends on that group.
//	The group SignIn contains two tests under it called OpenBrowser (describing the successful 
//	event of opening a browser) and LogIn (describing the successful login event).
//	Run the file to see that the ViewAcc will run in the last.
	
//	TestNG Dependent Test In XML Suite
//	All that we discussed in the above sections of this tutorial was somehow related to the 
//	changes done in the TestNG test case file. In this section, we will move our dependency 
//	commands over to the XML file.
//	TestNG lets you create dependencies between groups in the XML file. So, if you have 
//	multiple groups in the TestNG file, you can create the dependent tests in between them 
//	in the XML file.
//	Let’s create multiple groups in our TestNG test case file first before jumping to the XML file.
//	public class GroupDependency
//	{
//	    @Test(groups = { "viewacc" })
//	    public void ViewAcc() {
//	    }
//	    @Test(groups = { "openbrowser" })
//	    public void OpenBrowser() {
//	    }
//	    @Test(groups = { "login" })
//	    public void LogIn() {
//	    }
//	    @Test(groups = {"logout"})
//	    public void CloseAccount() {
//	    }
//	In the above code, I have created four groups and declared one method in each of them. 
//	Notice that there are no dependencies in this file so the file will currently run the methods 
//	in the alphabetical order as follow:
//	
//	Let’s hop on to the XML file and create some dependencies.
//	<suite name="TestNG XML Dependency Suite" >
//	   <test name="ToolsQA" >
//	   <groups>
//	   <dependencies>
//	   <group depends-on= "openbrowser" name= "login"></group>
//	   <group depends-on= "login" name= "viewaccount"></group>
//	   <group depends-on= "viewaccount" name= "logout"></group>
//	   </dependencies>
//	   </groups>
//	       <classes> 
//	          <class name="GroupDependency" />
//	       </classes>
//	   </test>
//	In the “dependencies” tag, I have created the flow of groups that I want to execute. 
//	There are a total of three components in each dependency that I have created.
//	<group> – The tag you need to specify to tell XML that we are talking about the groups.
//	depends-on –  The name of the group on which you want this group to depend.
//	name- Name of the group that you want to depend on.
//	<group depends-on = “openbrowser” name = “login”></group>
//	The above code states that the group named “login” should depend upon the group with 
//	the name “openbrowser.”
//	Similarly, you can analyze the other two dependencies in the above XML code.
		  
		  
		  

}
