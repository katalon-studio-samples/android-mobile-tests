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
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.ImageView'), 0)

'테이블링페이 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView -'), 0)

'충전 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView - (1)'), 0)

'충전 금액 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView - 30,000'), 0)

'바텀시트 스크롤'
Mobile.swipe(0, 2400, 0, 1200)

'90만원 선택'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.LinearLayout'), 0)

'충전 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.Button -'), 0)

'1'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView - 1'), 0)

'1'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView - 1'), 0)

'1'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView - 1'), 0)

'2'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView - 2'), 0)

'2'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView - 2'), 0)

'2'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView - 2'), 0)

'충전 금액 문구 확'
Mobile.verifyElementText(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView -   .  900,000'), 
    '테이블링페이 충전이 완료되었습니다.\n\n충전금액 : 900,000원')

'확인 버튼 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView - (2)'), 0)

'충전금액 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView - 900,000'), 0)

'2만원 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.LinearLayout (1)'), 0)

'충전 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.Button -'), 0)

'1'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView - 1'), 0)

'1'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView - 1'), 0)

'1'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView - 1'), 0)

'2'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView - 2'), 0)

'2'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView - 2'), 0)

'2'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView - 2'), 0)

'충전금액 텍스트 확인'
Mobile.verifyElementText(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView -   .  20,000'), 
    '테이블링페이 충전이 완료되었습니다.\n\n충전금액 : 20,000원')

'확인 버튼 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.TextView - (2)'), 0)

'h/w back key'
Mobile.pressBack()

'h/w back key'
Mobile.pressBack()

' 버튼 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/충전/android.widget.ImageView (1)'), 0)

