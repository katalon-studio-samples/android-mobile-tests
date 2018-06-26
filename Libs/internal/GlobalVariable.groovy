package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object G_NotificationMessage
     
    /**
     * <p></p>
     */
    public static Object G_AndroidApp
     
    /**
     * <p></p>
     */
    public static Object G_ShortTimeOut
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['G_Timeout' : 10, 'G_NotificationMessage' : 'Your message has been sent. View message', 'G_AndroidApp' : 'androidapp/APIDemos.apk', 'G_ShortTimeOut' : 5])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        G_Timeout = selectedVariables['G_Timeout']
        G_NotificationMessage = selectedVariables['G_NotificationMessage']
        G_AndroidApp = selectedVariables['G_AndroidApp']
        G_ShortTimeOut = selectedVariables['G_ShortTimeOut']
        
    }
}
