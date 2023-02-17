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

'내정보 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/로그인/Facebook_login/android.widget.FrameLayout'), 0)

'내정보 상세 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/로그인/Facebook_login/android.widget.TextView -'), 0)

'페이스북 로그인 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/로그인/Facebook_login/android.view.ViewGroup'), 0)

'계속 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/로그인/Facebook_login/android.view.View'), 0)

'본인인증 X버튼 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/로그인/Facebook_login/android.widget.ImageView'), 0)

'마켓팅 팝업 확인 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/로그인/Facebook_login/android.widget.TextView - (1)'), 0)

'내정보 상세 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/로그인/Facebook_login/android.widget.TextView - (2)'), 0)

'페이스북 로그인 체크'
Mobile.verifyElementText(findTestObject('Object Repository/Sanity Test/로그인/Facebook_login/android.widget.TextView - (3)'), '페이스북')

'로그아웃 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/로그인/Facebook_login/android.widget.TextView - (4)'), 0)

'로그아웃 확인 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/로그인/Facebook_login/android.widget.TextView - (5)'), 0)

'홈 화면 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/로그인/Facebook_login/android.widget.FrameLayout (1)'), 0)

