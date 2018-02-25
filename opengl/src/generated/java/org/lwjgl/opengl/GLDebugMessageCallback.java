/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link GL43#glDebugMessageCallback} and {@link KHRDebug#glDebugMessageCallback} methods.
 * 
 * <h3>Type</h3>
 * 
 * <code><pre>
 * void (*) (
 *     GLenum source,
 *     GLenum type,
 *     GLuint id,
 *     GLenum severity,
 *     GLsizei length,
 *     GLchar const *message,
 *     void const *userParam
 * )</pre></code>
 */
public abstract class GLDebugMessageCallback extends Callback implements GLDebugMessageCallbackI {

    /**
     * Creates a {@code GLDebugMessageCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLDebugMessageCallback}
     */
    public static GLDebugMessageCallback create(long functionPointer) {
        GLDebugMessageCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLDebugMessageCallback
            ? (GLDebugMessageCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static GLDebugMessageCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLDebugMessageCallback} instance that delegates to the specified {@code GLDebugMessageCallbackI} instance. */
    public static GLDebugMessageCallback create(GLDebugMessageCallbackI instance) {
        return instance instanceof GLDebugMessageCallback
            ? (GLDebugMessageCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLDebugMessageCallback() {
        super(SIGNATURE);
    }

    private GLDebugMessageCallback(long functionPointer) {
        super(functionPointer);
    }

    /**
     * Converts the specified {@link GLDebugMessageCallback} arguments to a String.
     *
     * <p>This method may only be used inside a GLDebugMessageCallback invocation.</p>
     *
     * @param length  the GLDebugMessageCallback {@code length} argument
     * @param message the GLDebugMessageCallback {@code message} argument
     *
     * @return the message as a String
     */
    public static String getMessage(int length, long message) {
        return memUTF8(memByteBuffer(message, length));
    }

    private static final class Container extends GLDebugMessageCallback {

        private final GLDebugMessageCallbackI delegate;

        Container(long functionPointer, GLDebugMessageCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
            delegate.invoke(source, type, id, severity, length, message, userParam);
        }

    }

}