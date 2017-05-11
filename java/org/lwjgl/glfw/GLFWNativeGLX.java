/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to the GLFW library's GLX native access functions. */
public class GLFWNativeGLX {

    protected GLFWNativeGLX() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetGLXContext = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetGLXContext"),
            GetGLXWindow  = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetGLXWindow");

    }

    // --- [ glfwGetGLXContext ] ---

    /**
     * Returns the {@code GLXContext} of the specified window.
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window a GLFW window
     *
     * @return the {@code GLXContext} of the specified window, or {@code NULL} if an error occurred.
     *
     * @since version 3.0
     */
    public static long glfwGetGLXContext(long window) {
        long __functionAddress = Functions.GetGLXContext;
        if (CHECKS) {
            check(window);
        }
        return invokePP(__functionAddress, window);
    }

    // --- [ glfwGetGLXWindow ] ---

    /**
     * Returns the {@code GLXWindow} of the specified window.
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window a GLFW window
     *
     * @return the {@code GLXWindow} of the specified window, or {@code None} if an error occurred.
     *
     * @since version 3.2
     */
    public static long glfwGetGLXWindow(long window) {
        long __functionAddress = Functions.GetGLXWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePP(__functionAddress, window);
    }

}