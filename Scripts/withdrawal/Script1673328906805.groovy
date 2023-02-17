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
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.ImageView'), 0)

'테이블링 페이 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.TextView -'), 0)

'인출 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.TextView - (1)'), 0)

'인풋박스에 999입력'
Mobile.sendKeys(findTestObject('Object Repository/Sanity Test/인출/android.widget.EditText -'), '999')

'인출 버튼 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.Button -'), 0)

'얼럿 노출 확인'
Mobile.verifyElementText(findTestObject('Object Repository/Sanity Test/인출/android.widget.TextView - 1,000  10'), '1,000원 이상부터 10원 단위로 인출하실 수 있습니다.')

'팝업에서 확인 버튼 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.TextView - (2)'), 0)

'인풋박스에 99990입력'
Mobile.sendKeys(findTestObject('Object Repository/Sanity Test/인출/android.widget.EditText - 999'), '99990')

'인출 버튼'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.Button -'), 0)

'1'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.TextView - 1'), 0)

'1'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.TextView - 1'), 0)

'1'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.TextView - 1'), 0)

'2'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.TextView - 2'), 0)

'2'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.TextView - 2'), 0)

'2'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.TextView - 2'), 0)

'전액 버튼 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.TextView - (3)'), 0)

'인출 버튼'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.Button -'), 0)

'1'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.TextView - 1'), 0)

'1'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.TextView - 1'), 0)

'1'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.TextView - 1'), 0)

'2'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.TextView - 2'), 0)

'2'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.TextView - 2'), 0)

'2'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.TextView - 2'), 0)

'뒤로가기 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.ImageView (1)'), 0)

'뒤로가기 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.ImageView (1)'), 0)

'홈 버튼 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/인출/android.widget.FrameLayout'), 0)

Mobile.closeApplication()

