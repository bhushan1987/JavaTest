package com.test.javadsl.bsh;

import java.util.Map;

/**
 * Add the Java doc here
 *
 * @author : bhushan.karmarkar@1eq.com
 * @Project : Security service
 * @Date : 05-12-2019
 * @since :
 */

public interface Script {
    /**
     * Executes the given DSL script.
     * Default implementation will be replaced by the User defined DSL.
     * @return Map containing script specific key-values
     */
    default Map execute() {
        return null;
    }
}
