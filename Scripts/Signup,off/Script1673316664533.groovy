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

'앱 실행'
Mobile.startExistingApplication('com.mealant.tabling.staging')

'내정보 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.ImageView'), 0)

'내정보 상세 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.TextView -'), 0)

'이메일 회원가입 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.view.ViewGroup'), 0)

'이메일 입력'
Mobile.sendKeys(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.EditText -  tablingmealant.com'), 
    'automantion01@mailinator.com')

'닉네임 입력'
Mobile.sendKeys(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.EditText -   (10 )'), '테스트01')

'패스워드 입력'
Mobile.setEncryptedText(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.EditText - , ,  816'), 'YsqIKzHWQwZJ66FfV9vAOw==', 
    0)

'패스워드 확인 입력'
Mobile.setEncryptedText(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.EditText -'), 'YsqIKzHWQwZJ66FfV9vAOw==', 
    0)

'화면 스크롤'
Mobile.swipe(0, 2100, 0, 0)

'가입 버튼 활성화 체크'
Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.TextView - (1)'), 
    'enabled', 'false', 0)

'약관 체크박스 전체'
Mobile.tap(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.CheckBox -'), 0)

'가입 버튼 활성화 체크'
Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.TextView - (2)'), 
    'enabled', 'true', 0)

'3번째 약관 해제'
Mobile.tap(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.CheckBox - ()  3'), 0)

'가입 버튼 활성화 체크'
Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.TextView - (1)'), 
    'enabled', 'false', 0)

'3번째 약관 체크'
Mobile.tap(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.CheckBox - ()  3 (1)'), 0)

'선택 약관 해제'
Mobile.tap(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.CheckBox - ()'), 0)

'가입 버튼 활성화 체크'
Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.TextView - (2)'), 
    'enabled', 'true', 0)

'가입하기 버튼 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.TextView - (2)'), 0)

'본인인증 화면 X버튼 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.ImageView (1)'), 0)

'마켓팅 팝업 확인 버튼 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.TextView - (3)'), 0)

'내정보 상세 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.TextView - 01'), 0)

'회원탈퇴 버튼 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.TextView - (4)'), 0)

'영구 삭제 버튼 활성화 체크'
Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.TextView - (5)'), 
    'enabled', 'false', 0)

'체크박스 체크'
Mobile.tap(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.TextView - (6)'), 0)

'영구 삭제 버튼 활성화 체크'
Mobile.verifyElementAttributeValue(findTestObject('Sanity Test/회원가입,회원탈퇴/android.widget.TextView - (7)'), 'enabled', 'true', 
    0)

'영구삭제 버튼 탭'
Mobile.tap(findTestObject('Sanity Test/회원가입,회원탈퇴/android.widget.TextView - (7)'), 0)

'팝업에서 취소 버튼 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.TextView - (8)'), 0)

'영구 삭제 버튼 탭'
Mobile.tap(findTestObject('Sanity Test/회원가입,회원탈퇴/android.widget.TextView - (7)'), 0)

'팝업에서 확인 버튼 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.TextView - (9)'), 0)

'메인으로 가기 버튼 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/회원가입,회원탈퇴/android.widget.TextView - (10)'), 0)

