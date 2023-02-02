import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.comment('Story: Login to CURA system')

WebUI.comment('Given that the user has the valid login information')

WebUI.openBrowser(GlobalVariable.G_SiteURL)

WebUI.click(findTestObject('Web Browser/btn_MakeAppointment'))

WebUI.setText(findTestObject('Web Browser/txt_Username'), Username)

WebUI.setEncryptedText(findTestObject('Web Browser/txt_Password'), Password)

WebUI.comment('When he logins to CURA system')

WebUI.click(findTestObject('Web Browser/btn_Login'))

WebUI.comment('Then he should be able to login successfully')

WebUI.verifyTextPresent('Make Appointment', false)

WebUI.closeBrowser()

