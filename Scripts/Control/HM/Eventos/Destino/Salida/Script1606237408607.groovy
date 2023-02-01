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


Mobile.comment('')

Mobile.startExistingApplication(GlobalVariable.rc_app, FailureHandling.CONTINUE_ON_FAILURE)


Mobile.takeScreenshot()

// Seleccionamos el evento de salida del menu
Mobile.tap(findTestObject('control track/Eventos/android.widget.Button - REGISTRATE'),GlobalVariable.Timer_rc)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/control track/Eventos/Transplace/Destino/Llegada/android.widget.Button - GUARDAR'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/rc/event/Llegada/android.widget.Button - OK'),GlobalVariable.Timer_rc)

Mobile.tap(findTestObject('Object Repository/rc/event/Llegada/android.widget.Button - OK'),GlobalVariable.Timer_rc)

Mobile.tap(findTestObject('Object Repository/rc/event/Llegada/android.widget.Button - OK'),GlobalVariable.Timer_rc)