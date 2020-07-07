package Topics;

public class TestNGGroups {
	
//	What Are TestNG Groups?
//	Groups in TestNG denotes the process of grouping different tests together 
//	into a straightforward group and running these tests together by just running the group in a single command. 
//	It does not even matter if they belong to different classes
	
//	<suite>
//	   <groups>  
//	      <run>  
//	         <include name="UI Test"/>  
//	      </run>  
//	   </groups>  
//	  <test name="Check Login Page">  
//	     <classes>  
//	         <class name="com.demoqa.Check_Login_Page"/>  
//	         </classes>  
//	     </test>  
//	     <test name="Response Status">  
//	    <classes>  
//	       <class name="com.demoqa.Response_Status"/>  
//	    </classes>  
//	    </test>  
//	    </suite>
	
//	How To Create Groups?
//			public class TestNG { 
//		 WebDriver driver;
//		    // Saving the expected title of the Webpage
//		    String title = "ToolsQA - Demo Website For Automation";
//			    @Test
//		    public void starting_point(){
//		    	System.out.println("This is the starting point of the test");
//		    }	    
//		    @Test(groups = { "demo" }) 
//		    public void checkTitle() { 
//		    } 
//		    
//		    @Test(groups = { "demo" }) 
//		    public void click_element() { 
//		    }
	
//	TestNG Groups Inside Groups
//	TestNG provides the flexibility of providing groups inside another group and running them 
//	according to your needs. We can term them “nested groups,” but this is no official term. 
//	Let’s create a group inside a group in our XML file.
//	</suite>   
//	<test name="ToolsQA" >
//	   <groups>
//	   <define name = "SuperGroup">
//	   <include name = "demo"></include>
//	   </define>
//	   <run>
//	   <include name = "SuperGroup"></include>
//	   </run>
//	   </groups>
//	       <classes> 
//	          <class name="TestNG" />
//	       </classes>
//	   </test>
//	   </suite>
	
//	How To Ignore (Exclude) a group in TestNG?
//	Till now, to run the groups, we have included them inside the “include” tag, 
//	which is quite obvious since we want to “include” them in our test run. Similar to this, 
//	we can ignore the groups by putting them under the “exclude” tag. This minor tweak can be 
//	seen in the XML file below.
//	<suite name="Test-Suite" >
//	   <test name="ToolsQA" >
//	   <groups>
//	   <run>
//	   <exclude name = "demo">
//	   </exclude>
//	   </run>
//	   </groups>
//	       <classes> 
//	          <class name="TestNG" />
//	       </classes>
//	   </test>
//	   </suite>
	
	
//	How To Use Regular Expressions With TestNG Groups?
//	TestNG Groups gives us the freedom to include regular expressions inside the include/exclude tag. 
//	By this, we can just define a generalised pattern which is there inside more than one groups so 
//	that we do not need to write the complete group names. To find this, we have changed the group 
//	name to demo1 and demo2 for checkTitle() and click_element() methods respectively.
//	public class TestNG { 
//		 WebDriver driver;
//		    // Saving the expected title of the Webpage
//		    String title = "ToolsQA - Demo Website For Automation";
//		    @Test
//		    public void starting_point(){
//		    	System.out.println("This is the starting point of the test");
//			}
//		    @Test(groups = { "demo1" }) 
//		    public void checkTitle() { 
//		    } 
//		    
//		    @Test(groups = { "demo2" }) 
//		    public void click_element() { 
//		    }
	
	
	

}
