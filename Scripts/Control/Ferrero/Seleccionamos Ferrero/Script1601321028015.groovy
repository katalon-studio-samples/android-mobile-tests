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

Mobile.comment('Validar que el app este abierta ')
Mobile.startExistingApplication(GlobalVariable.rc_app)

Mobile.scrollToText(GlobalVariable.company1)
Mobile.tap(findTestObject('Object Repository/control track/Compañias/android.widget.TextView - FERRERO CORPORATIVO'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('control track/Compañias/android.widget.Button - OK'),GlobalVariable.Timer_rc)

Mobile.scrollToText('0210QA4')
Mobile.tap(findTestObject('null'), GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('control track/Compañias/android.widget.Button - OK'),GlobalVariable.Timer_rc)
//Mobile.tap(findTestObject(),GlobalVariable.Timer_rc)

Mobile.tap(findTestObject('Object Repository/control track/Localidades/Ferrero Corp/android.view.ViewGroup'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('control track/Compañias/android.widget.Button - OK'),GlobalVariable.Timer_rc)


//Aqui estoy reutilizando la data
Mobile.tap(findTestObject('Object Repository/control track/Eventos/android.widget.Button - SELECCIONE UN EVENTO'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/control track/Eventos/Transplace/android.widget.TextView - Llegada'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/control track/Eventos/android.widget.Button - REGISTRATE'),GlobalVariable.Timer_rc)

//Mobile.tap(findTestObject('Object Repository/control track/Eventos/Ferrero Corp/Llegada/Obser'),GlobalVariable.Timer_rc)
//Mobile.setText(findTestObject('Object Repository/control track/Eventos/Ferrero Corp/Llegada/Obser'),'Comentarios', GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/control track/Eventos/Ferrero Corp/Llegada/android.widget.Button - GUARDAR'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/rc/event/Llegada/android.widget.Button - OK'),GlobalVariable.Timer_rc)


Mobile.tap(findTestObject('Object Repository/control track/Eventos/android.widget.Button - SELECCIONE UN EVENTO'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/control track/Eventos/Ferrero Corp/Liberacion/android.widget.TextView - Liberacin POD'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/control track/Eventos/android.widget.Button - REGISTRATE'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/control track/Eventos/Ferrero Corp/Liberacion/android.widget.Button - CAPTURAR'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/control track/Eventos/Ferrero Corp/Liberacion/android.widget.ImageView'),100)
Mobile.takeScreenshot()
Mobile.tap(findTestObject('Object Repository/control track/Eventos/Ferrero Corp/Liberacion/android.widget.TextView - GUARDAR'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/control track/Eventos/Ferrero Corp/Liberacion/android.widget.Button - GUARDAR'),GlobalVariable.Timer_rc)

Mobile.tap(findTestObject('Object Repository/rc/event/Llegada/android.widget.Button - OK'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/rc/event/Llegada/android.widget.Button - OK'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/rc/event/Llegada/android.widget.Button - OK'),GlobalVariable.Timer_rc)