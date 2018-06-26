import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

Mobile.comment('Story: Verify correct alarm message')

Mobile.comment('Given that user has started an application')

'Get full directory\'s path of android application'
def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_AndroidApp, RunConfiguration.getProjectDir())

Mobile.startApplication(appPath, false)

Mobile.comment('And he navigates the application to Graphics form')

Mobile.tap(findTestObject('Application/android.widget.TextView - Graphics'), GlobalVariable.G_Timeout)

Mobile.comment('When he scroll to Xfermodes text')

Mobile.scrollToText('Xfermodes')

Mobile.comment('Then the current screen should show Xfermodes text after scrolling')

'Get item\'s label'
def itemText = Mobile.getText(findTestObject('Application/Graphics/android.widget.TextView - Xfermodes'), GlobalVariable.G_Timeout)

Mobile.verifyEqual(itemText, 'Xfermodes')

Mobile.closeApplication()

