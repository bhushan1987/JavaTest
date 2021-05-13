package com.test.javadsl.jdkcompiler;

/**
 * A class loader that will look up classes in the {@link #classData}
 */
public class MapClassLoader extends ClassLoader {

    @Override
    public Class<?> findClass(String name) {
        byte[] b = RuntimeCompiler.classData.get(name);
        return defineClass(name, b, 0, b.length);
    }
}
