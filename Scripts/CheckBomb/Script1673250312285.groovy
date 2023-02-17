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
Mobile.tap(findTestObject('Object Repository/Sanity Test/내정보/폭탄 확인/android.widget.ImageView'), 0)

'내정보 상세 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/내정보/폭탄 확인/android.widget.TextView -'), 0)

'이메일 로그인 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/내정보/폭탄 확인/android.widget.TextView - (1)'), 0)

'ID 입력'
Mobile.sendKeys(findTestObject('Object Repository/Sanity Test/내정보/폭탄 확인/android.widget.EditText -'), 'paytest01@mailinator.com')

'PW 입력'
Mobile.setEncryptedText(findTestObject('Object Repository/Sanity Test/내정보/폭탄 확인/android.widget.EditText - (1)'), 'YsqIKzHWQwZJ66FfV9vAOw==', 
    0)

'로그인 버튼 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/내정보/폭탄 확인/android.widget.TextView - (2)'), 0)

'마켓팅 팝업에서 확인 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/내정보/폭탄 확인/android.widget.TextView - (3)'), 0)

'상단 보유 폭탄 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/내정보/폭탄 확인/android.widget.TextView - 566'), 0)

'h/w back key 입력'
Mobile.pressBack()

'테이블링 페이 메뉴 탭'
Mobile.tap(findTestObject('Object Repository/Sanity Test/내정보/폭탄 확인/android.widget.TextView - (4)'), 0)

'테이블링페이 > 페이 상요 내역'
Mobile.tap(findTestObject('Object Repository/Sanity Test/내정보/폭탄 확인/android.widget.TextView - (5)'), 0)

'h/w back key 입력'
Mobile.pressBack()

'h/w back key 입력'
Mobile.pressBack()

