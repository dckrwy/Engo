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

'Navigate to Engo'
WebUI.navigateToUrl('https://www.engolearn.com/default.aspx')

WebUI.maximizeWindow()

'Close announcement'
WebUI.click(findTestObject('null'))

'Click Sign In'
WebUI.click(findTestObject('Object Repository/Login screen/a_Sign in (1)'))

'Enter email'
WebUI.setText(findTestObject('Object Repository/Login screen/input_Email_ctl00ContentPlaceHolder1txt_Username'), Email)

'Click tab to enter password'
WebUI.sendKeys(findTestObject('Object Repository/Login screen/input_Email_ctl00ContentPlaceHolder1txt_Username'), Keys.chord(
        Keys.TAB))

//WebUI.sendKeys(findTestObject('Input'), Keys.chord('Text String',Keys.ENTER,Keys.TAB))
'Enter password'
WebUI.setText(findTestObject('Object Repository/Login screen/input_Login Password_ctl00ContentPlaceHolde_f25a8a'), Password)

'Click tab to enter security code'
WebUI.sendKeys(findTestObject('Object Repository/Login screen/input_Login Password_ctl00ContentPlaceHolde_f25a8a'), Keys.chord(
        Keys.TAB))

WebUI.delay(5)

'Click Sign In button'
WebUI.click(findTestObject('Object Repository/Login screen/input_Security Code_ctl00ContentPlaceHolder_179091 (1)'))

