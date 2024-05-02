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

WebUI.navigateToUrl('https://www.engolearn.com/default.aspx')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Object Repository/Login screen/Ads_Img'))

WebUI.click(findTestObject('Object Repository/Login screen/button_Announcement_btn-close'))

'Click Sign In'
WebUI.click(findTestObject('Object Repository/Login screen/a_Sign in'))

'Verify Welcome Back'
WebUI.verifyElementText(findTestObject('Object Repository/Login screen/h2_Welcome Back'), 'Welcome Back!')

'Verify Sign in to continue'
WebUI.verifyElementText(findTestObject('Object Repository/Login screen/p_Sign in to continue'), 'Sign in to continue')

'Verify email field'
WebUI.verifyElementVisible(findTestObject('Object Repository/Login screen/div_Email'))

'Verify password field'
WebUI.verifyElementVisible(findTestObject('Object Repository/Login screen/Password field'))

'Verify security code field'
WebUI.verifyElementVisible(findTestObject('Object Repository/Login screen/div_Security Code'))

'Verify captcha number'
WebUI.verifyElementVisible(findTestObject('Object Repository/Login screen/div_Security Code_ContentPlaceHolder1_UpdatePanel2'))

'Verify forgot passwprrd clickable'
WebUI.verifyElementClickable(findTestObject('Object Repository/Login screen/a_Forgot password'))

'verify'
WebUI.verifyElementVisible(findTestObject('Object Repository/Login screen/Don have an account'))

'Verify Sign Up clickable'
WebUI.verifyElementClickable(findTestObject('Object Repository/Login screen/SignUphref'))

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

