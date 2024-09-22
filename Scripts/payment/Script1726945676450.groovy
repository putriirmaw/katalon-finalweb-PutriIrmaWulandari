import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WebUI.openBrowser('')
//
//WebUI.maximizeWindow()
//
//WebUI.navigateToUrl(GlobalVariable.baseUrl)

def login = WebUI.callTestCase(findTestCase('Login-user'), [('username') : findTestData('user'), ('password') : findTestData('user')], 
    FailureHandling.CONTINUE_ON_FAILURE)
//def delay = WebUI.delay(1)
//
if(login == false) {
	WebUI.closeBrowser()
}

WebUI.click(findTestObject('keranjang/btn-keranjang'))

WebUI.click(findTestObject('keranjang/btn-checkout'))

//WebUI.setText(findTestObject('new-acc/unam-payment'), GlobalVariable.username)
//
//WebUI.setText(findTestObject('new-acc/pass-payment'), GlobalVariable.username)
//
//WebUI.click(findTestObject('login/btn-login-payment'))

WebUI.click(findTestObject('keranjang/btn-next-checkout'))

WebUI.click(findTestObject('payment/paymen-mastercard'))

//WebUI.setText(findTestObject('payment/master-card-cc'), '1234567891234567')
//
//WebUI.setText(findTestObject('payment/master-card-cvv'), '123')
//
//WebUI.doubleClick(findTestObject('payment/master-card-expDate-MM'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.doubleClick(findTestObject('payment/master-card-expDate-YYYY'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.setText(findTestObject('payment/master-card-expDate-Name'), 'Dummy')

WebUI.click(findTestObject('payment/pay-now'))

WebUI.closeBrowser()

