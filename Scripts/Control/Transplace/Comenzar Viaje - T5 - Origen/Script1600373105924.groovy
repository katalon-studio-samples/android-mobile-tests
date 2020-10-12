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

//Se busca que el app este abierto
Mobile.comment('Validar que el app este abierta ')
Mobile.startExistingApplication(GlobalVariable.rc_app)

// Se hace busqueda del Viaje
Mobile.comment('170920T5')
Mobile.scrollToText('170920T5')

Mobile.takeScreenshot()

// Seleccionamos la compañia con un tap para poder acceder a ella
Mobile.tap(findTestObject('null'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/rc/Company/android.widget.Button - OK'),GlobalVariable.Timer_rc)

Mobile.takeScreenshot()

// Seleccionamos Localidad de Origen
Mobile.tap(findTestObject('Object Repository/control track/Localidades/Transplace/android.widget.TextView - Transplace Mexico'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/rc/Company/android.widget.Button - OK'),GlobalVariable.Timer_rc)

// Seleccionamos el evento de llegada del menu 
Mobile.tap(findTestObject('control track/Eventos/android.widget.Button - SELECCIONE UN EVENTO'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/control track/Eventos/Transplace/android.widget.TextView - Llegada'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('control track/Eventos/android.widget.Button - REGISTRATE'),GlobalVariable.Timer_rc)

//Guardamos el Evento de llegada
Mobile.tap(findTestObject('Object Repository/control track/Eventos/Transplace/Destino/Llegada/android.widget.Button - GUARDAR'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/rc/event/Llegada/android.widget.Button - OK'),GlobalVariable.Timer_rc)


Mobile.takeScreenshot()

// seleccionamos el evento de Fin de Carga 
Mobile.tap(findTestObject('control track/Eventos/android.widget.Button - SELECCIONE UN EVENTO'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/control track/Eventos/Transplace/android.widget.TextView - Fin de carga'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('control track/Eventos/android.widget.Button - REGISTRATE'),GlobalVariable.Timer_rc)

Mobile.takeScreenshot()

//Guaramos el evento de Fin de Carga
Mobile.tap(findTestObject('Object Repository/control track/Eventos/Transplace/Destino/Llegada/android.widget.Button - GUARDAR'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/rc/event/Llegada/android.widget.Button - OK'),GlobalVariable.Timer_rc)


Mobile.takeScreenshot()

// Seleccionamos el evenot de Salida 
Mobile.tap(findTestObject('control track/Eventos/android.widget.Button - SELECCIONE UN EVENTO'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/control track/Eventos/Transplace/android.widget.TextView - Salida'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('control track/Eventos/android.widget.Button - REGISTRATE'),GlobalVariable.Timer_rc)

Mobile.takeScreenshot()

//Guardamos El evento  de Salida 
Mobile.tap(findTestObject('Object Repository/control track/Eventos/Transplace/Destino/Llegada/android.widget.Button - GUARDAR'),GlobalVariable.Timer_rc)
Mobile.tap(findTestObject('Object Repository/rc/event/Llegada/android.widget.Button - OK'),GlobalVariable.Timer_rc)

// Ultimo Boton de Ok 
Mobile.tap(findTestObject('Object Repository/rc/event/Llegada/android.widget.Button - OK'),GlobalVariable.Timer_rc)

// Aqui mostramos la pantalla con los destinos... 


// Regresamos a los viajes 
Mobile.tap(findTestObject('Object Repository/control track/Generico/android.widget.ImageButton - Atras'),GlobalVariable.Timer_rc)