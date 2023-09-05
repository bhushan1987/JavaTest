package com.test.javadsl.jdkcompiler;

/**
 * @Author bhushank
 */

import javax.tools.SimpleJavaFileObject;
import java.io.IOException;
import java.net.URI;

/**
 * In-memory representation of a source JavaFileObject
 */
public class JavaSourceFileObject extends SimpleJavaFileObject {
    /**
     * The source code of the class
     */
    private final String code;

    /**
     * Creates a new in-memory representation of a Java file
     *
     * @param fileName The file name
     * @param code     The source code of the file
     */
    public JavaSourceFileObject(String fileName, String code) {
        super(URI.create("string:///" + fileName), Kind.SOURCE);
        this.code = code;
    }

    @Override
    public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
        return code;
    }
}

