package com.test.javadsl.jdkcompiler;

/**
 * @Author bhushank
 */

import javax.tools.SimpleJavaFileObject;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

/**
 * In-memory representation of a class JavaFileObject
 *
 * @author User
 */
public class JavaClassFileObject extends SimpleJavaFileObject {
    /**
     * The name of the class represented by the file object
     */
    private final String className;

    /**
     * Create a new json file object that represents the specified class
     *
     * @param className THe name of the class
     */
    public JavaClassFileObject(String className) {
        super(URI.create("string:///" + className + ".class"), Kind.CLASS);
        this.className = className;
    }

    @Override
    public OutputStream openOutputStream() throws IOException {
        return new ClassDataOutputStream(className);
    }
}