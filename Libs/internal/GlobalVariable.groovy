package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object rc_app
     
    /**
     * <p></p>
     */
    public static Object Company
     
    /**
     * <p></p>
     */
    public static Object Username
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object Timer_rc
     
    /**
     * <p></p>
     */
    public static Object Test_
     
    /**
     * <p></p>
     */
    public static Object company1
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            rc_app = selectedVariables['rc_app']
            Company = selectedVariables['Company']
            Username = selectedVariables['Username']
            Password = selectedVariables['Password']
            Timer_rc = selectedVariables['Timer_rc']
            Test_ = selectedVariables['Test_']
            company1 = selectedVariables['company1']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
