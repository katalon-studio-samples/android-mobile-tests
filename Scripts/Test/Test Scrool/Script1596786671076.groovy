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
import com.kms.katalon.core.testobject.MobileTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable


if (Mobile.callTestCase(findTestCase('null'),[:], FailureHandling.OPTIONAL)== true){
	Mobile.callTestCase(findTestCase('null'),[:], FailureHandling.OPTIONAL)
}
else {
	Mobile.closeApplication()
}

/*new oUiSelector().className("android.widget.TextView").text(GlobalVariable.Company).packageName("com.recursoconfiable.tracking").enabled(true).clickable(false).longClickable(false).checkable(false).checked(false).focusable(false).focused(false).scrollable(false).selected(false).index(0)
Mobile.tap(findTestObject(company),0)

def itemText = Mobile.getText(findTestObject('Object Repository/Test/Grap/android.widget.TextView0 - Fanasa'), GlobalVariable.G_Timeout)

Mobile.verifyEqual(itemText, 'Fanasa')
Mobile.tap(findTestObject('Object Repository/Test/Grap/android.widget.TextView0 - Fanasa'),0)

if (Mobile.verifyElementExist(findTestObject('Object Repository/Test/Grap/android.widget.TextView - Fanasa')>0, 0)
	{
	Mobile.tap(findTestObject('Object Repository/Test/Grap/android.widget.TextView - Fanasa'),0)
} */
 

