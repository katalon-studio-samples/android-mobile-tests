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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as Global

Mobile.startExistingApplication(Global.rc_app)

Mobile.tap(findTestObject('Object Repository/control track/Login/Iniciar/EditText - Usuario'),50)
Mobile.setText(findTestObject('Object Repository/rc/Login/android.widget.EditText - Username'), Global.Username, 50)
Mobile.takeScreenshot()
Mobile.tap(findTestObject('Object Repository/rc/Login/android.widget.EditText - Password'),50)
Mobile.setText(findTestObject('Object Repository/rc/Login/android.widget.EditText - Password'),Global.Password,50)
Mobile.takeScreenshot()
Mobile.tap(findTestObject('Object Repository/control track/Login/Iniciar/Button - INICIAR SESIN'),50)