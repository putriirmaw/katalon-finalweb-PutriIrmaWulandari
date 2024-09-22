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

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.delay(1)

WebUI.click(findTestObject('new-acc/btn-profile'))
WebUI.verifyTextPresent('CREATE NEW ACCOUNT', false)
WebUI.click(findTestObject('new-acc/btn-create-new-acc'))

WebUI.click(findTestObject('new-acc/input-uname'))
def username = WebUI.setText(findTestObject('new-acc/input-uname'), GlobalVariable.username)

WebUI.click(findTestObject('new-acc/input-email'))
WebUI.setText(findTestObject('new-acc/input-email'), GlobalVariable.email)

WebUI.click(findTestObject('new-acc/input-pass'))
def password = WebUI.setText(findTestObject('new-acc/input-pass'), GlobalVariable.password)
WebUI.click(findTestObject('new-acc/input-confm-pass'))
def confirmpassword = WebUI.setText(findTestObject('new-acc/input-confm-pass'), GlobalVariable.confirmpassword)

// Fungsi untuk membuat akun
def createAccount(String username, String password, String confirmpassword) {
    if (GlobalVariable.password == GlobalVariable.confirmpassword) {
        return "Akun untuk ${username} berhasil dibuat!"
    } else {
        return "Password do not match"
    }	
}
def result = createAccount(username, password, confirmpassword)
println(result)




// Meminta input pengguna
//def username = System.console().readLine("Masukkan username: ")
//def password = System.console().readLine("Masukkan password: ")
//def confirmPassword = System.console().readLine("Konfirmasi password: ")

WebUI.delay(2)

WebUI.click(findTestObject('new-acc/checklis-agree'))

WebUI.delay(3)

WebUI.click(findTestObject('new-acc/btn-register'))

WebUI.delay(3)

WebUI.verifyTextPresent('dvantage DEMO', false)

WebUI.closeBrowser()

