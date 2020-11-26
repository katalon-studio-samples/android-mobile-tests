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
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.rc_app)

Mobile.takeScreenshot()
Mobile.tap(findTestObject('control track/Login/Iniciar/android.widget.EditText - Username'),GlobalVariable.Timer_rc)
Mobile.setText(findTestObject('control track/Login/Iniciar/android.widget.EditText - Username'), '1082394', GlobalVariable.Timer_rc)


Mobile.tap(findTestObject('control track/Login/Iniciar/android.widget.EditText - Password'),GlobalVariable.Timer_rc)
Mobile.setText(findTestObject('control track/Login/Iniciar/android.widget.EditText - Password'), 'Lmartinez108', GlobalVariable.Timer_rc)

Mobile.takeScreenshot()
Mobile.tap(findTestObject('Object Repository/control track/Login/Iniciar/INICIAR SESIN'),GlobalVariable.Timer_rc)