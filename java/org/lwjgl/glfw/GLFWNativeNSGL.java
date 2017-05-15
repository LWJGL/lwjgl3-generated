/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to the GLFW library's NSGL native access functions. */
public class GLFWNativeNSGL {

    protected GLFWNativeNSGL() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetNSGLContext = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetNSGLContext");

    }

    // --- [ glfwGetNSGLContext ] ---

    /**
     * Returns the<code>NSOpenGLContext</code>
     * 
     * <p>of the specified GLFW window.</p>
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window the GLFW window
     *
     * @return The<code>NSOpenGLContext</code>
     *         
     *         <p>of the specified window, or nil if an error occurred.</p>
     *
     * @since version 3.0
     */
    public static long glfwGetNSGLContext(long window) {
        long __functionAddress = Functions.GetNSGLContext;
        if (CHECKS) {
            check(window);
        }
        return invokePP(__functionAddress, window);
    }

}