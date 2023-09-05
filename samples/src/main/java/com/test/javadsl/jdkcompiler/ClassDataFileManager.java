package com.test.javadsl.jdkcompiler;

import javax.tools.*;

/**
 * A JavaFileManager that manages the compiled classes by passing
 * them to the {@link #classData} map via a ClassDataOutputStream
 */

public class ClassDataFileManager extends ForwardingJavaFileManager<StandardJavaFileManager> {
    /**
     * Create a new file manager that delegates to the given file manager
     *
     * @param standardJavaFileManager The delegate file manager
     */
    public ClassDataFileManager(StandardJavaFileManager standardJavaFileManager) {
        super(standardJavaFileManager);
    }

    @Override
    public JavaFileObject getJavaFileForOutput(final JavaFileManager.Location location, final String className, JavaFileObject.Kind kind, FileObject sibling) {
        return new JavaClassFileObject(className);
    }
}
