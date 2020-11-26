package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : aplicacion que el IDE buscara durante la ejecucion de pruebas </p>
     */
    public static Object rc_app
     
    /**
     * <p>Profile default : Usuario usado durante el set de pruebas</p>
     */
    public static Object Username
     
    /**
     * <p>Profile default : Contrase&ntilde;a usada durante el set de pruebas </p>
     */
    public static Object Password
     
    /**
     * <p>Profile default : Tiempo por default para cambio de objeto </p>
     */
    public static Object Timer_rc
     
    /**
     * <p>Profile default : Tiempo estimado para que pueda tomar evidencia con la camara </p>
     */
    public static Object timer_photo
     
    /**
     * <p>Profile default : Viaje Existente dentro de la planeacion de Transplace</p>
     */
    public static Object T1
     
    /**
     * <p>Profile default : Viaje Existente dentro de la planeacion de Transplace</p>
     */
    public static Object T2
     
    /**
     * <p>Profile default : Viaje Existente dentro de la planeacion de Transplace</p>
     */
    public static Object T3
     
    /**
     * <p>Profile default : Viaje Existente dentro de la planeacion de Transplace</p>
     */
    public static Object T4
     
    /**
     * <p>Profile default : Viaje Existente dentro de la planeacion de Transplace</p>
     */
    public static Object T5
     
    /**
     * <p>Profile default : Viaje Existente dentro de la planeacion de Ferrero Corp</p>
     */
    public static Object F1
     
    /**
     * <p>Profile default : Viaje Existente dentro de la planeacion de Ferrero Corp</p>
     */
    public static Object F2
     
    /**
     * <p>Profile default : Viaje Existente dentro de la planeacion de Ferrero Corp</p>
     */
    public static Object F3
     
    /**
     * <p>Profile default : Viaje Existente dentro de la planeacion de Ferrero Corp</p>
     */
    public static Object F4
     
    /**
     * <p>Profile default : Viaje Existente dentro de la planeacion de Ferrero Corp</p>
     */
    public static Object F5
     
    /**
     * <p></p>
     */
    public static Object HM01
     
    /**
     * <p></p>
     */
    public static Object HM02
     
    /**
     * <p></p>
     */
    public static Object HM03
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            rc_app = selectedVariables['rc_app']
            Username = selectedVariables['Username']
            Password = selectedVariables['Password']
            Timer_rc = selectedVariables['Timer_rc']
            timer_photo = selectedVariables['timer_photo']
            T1 = selectedVariables['T1']
            T2 = selectedVariables['T2']
            T3 = selectedVariables['T3']
            T4 = selectedVariables['T4']
            T5 = selectedVariables['T5']
            F1 = selectedVariables['F1']
            F2 = selectedVariables['F2']
            F3 = selectedVariables['F3']
            F4 = selectedVariables['F4']
            F5 = selectedVariables['F5']
            HM01 = selectedVariables['HM01']
            HM02 = selectedVariables['HM02']
            HM03 = selectedVariables['HM03']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
