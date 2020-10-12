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

Mobile.startExistingApplication('com.recursoconfiable.tracking')
Mobile.tap(findTestObject('Object Repository/rc/event/android.widget.Button - SELECT AN EVENT'),0)
Mobile.tap(findTestObject('Object Repository/rc/event/android.widget.TextView - Llegada'),0)
Mobile.tap(findTestObject('Object Repository/rc/event/android.widget.Button - REGISTER'),0)

Mobile.tap(findTestObject('Object Repository/rc/event/Llegada/android.widget.Button - SAVE'),0)
Mobile.tap(findTestObject('Object Repository/rc/event/Llegada/android.widget.Button - OK'),5)
/*
Mobile.tap(findTestObject('Object Repository/rc/event/android.widget.Button - SELECT AN EVENT'),0)
Mobile.tap(findTestObject('Object Repository/rc/event/android.widget.TextView - Fin de carga'),5)
Mobile.tap(findTestObject('Object Repository/rc/event/android.widget.Button - REGISTER'),5)
Mobiel.tap(findTestObject('Object Repository/rc/event/Fin de Carga/android.widget.Button - SAVE'),5)
Mobiel.tap(findTestObject('Object Repository/rc/event/Fin de Carga/android.widget.Button - OK'),5)

Mobile.tap(findTestObject('Object Repository/rc/event/android.widget.Button - SELECT AN EVENT'),0)
Mobile.tap(findTestObject('Object Repository/rc/event/android.widget.TextView - Salida'),5)
Mobile.tap(findTestObject('Object Repository/rc/event/Salida/android.widget.Button - SAVE'),5)
Mobile.tap(findTestObject('Object Repository/rc/event/Salida/android.widget.Button - OK'),5)

Mobiel.tap(findTestObject('Object Repository/rc/event/Salida/android.widget.Button - OK'),10)
*/
Mobile.closeApplication()