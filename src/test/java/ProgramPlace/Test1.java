package ProgramPlace;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {

    //2package
    //1 core code
    //2 Own package -> 1st calss- All my locators
    //2nd class ICDS common utils-> Create object for first class
    //extend main call
    //Main packages  - 1Test case 1class @Test annotation
    //passing data - We are using data provider
    //Extentspark report


    //Cucumber
    //1st package - all main class
    //2nd package - Locators and methods
    //3rd packages - Step definition
    //4th package  - TestRunner file
    //Feature file  - Resource folder

    //Test Runner file - package name
    //Tags Annotation to call the specific test

    @ReadColumns({"browser","url","data1"})
    @SheetName("ICDS_TESTDATA")
    @DataProvider("dataProvider")
    @Test
    public void testcase1(String browser,String url,String data1){

        obj.initialization(browser);
        obj.navigation(url);
        obj.dictionaryData(data1);


        //login website
        //check car is empty


        @Given("^user_is_navigated_to$"){
            public void userIsNavigatedto(String url){
                obj.navigation(url);
            }
        }

        @When("^user_enters_credentials_such_as$"){
            public void userEntersCredentialsSuchAs(String userName,String password){
                obj.userCred(userName);
                obj.userPas(password);
            }

            @Then("^User_click_Login_button$")
                    public void userClicksLogin(){
                obj.clicks
            }
            @Then("^User_verifies_emptyCarMessage$"){
                public void UserverifiesCartMessage(){
                    obj.cartVerification();
                }
            }
        }





    }
}
