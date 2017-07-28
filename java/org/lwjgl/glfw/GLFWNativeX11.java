/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to the GLFW library's X11 native access functions. */
public class GLFWNativeX11 {

    protected GLFWNativeX11() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetX11Display = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetX11Display"),
            GetX11Adapter = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetX11Adapter"),
            GetX11Monitor = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetX11Monitor"),
            GetX11Window  = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetX11Window");

    }

    // --- [ glfwGetX11Display ] ---

    /**
     * Returns the<code>Display</code>
     * 
     * <p>used by GLFW.</p>
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @return The<code>Display</code>
     *         
     *         <p>used by GLFW, or {@code NULL} if an error occurred.</p>
     *
     * @since version 3.0
     */
    @NativeType("Display *")
    public static long glfwGetX11Display() {
        long __functionAddress = Functions.GetX11Display;
        return invokeP(__functionAddress);
    }

    // --- [ glfwGetX11Adapter ] ---

    /**
     * Returns the<code>RRCrtc</code>
     * 
     * <p>of the specified monitor.</p>
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param monitor the GLFW monitor
     *
     * @return The<code>RRCrtc</code>
     *         
     *         <p>of the specified monitor, or {@code None} if an error occurred.</p>
     *
     * @since version 3.1
     */
    @NativeType("RRCrtc")
    public static long glfwGetX11Adapter(@NativeType("GLFWmonitor *") long monitor) {
        long __functionAddress = Functions.GetX11Adapter;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(__functionAddress, monitor);
    }

    // --- [ glfwGetX11Monitor ] ---

    /**
     * Returns the<code>RROutput</code>
     * 
     * <p>of the specified monitor.</p>
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param monitor the GLFW monitor
     *
     * @return The<code>RROutput</code>
     *         
     *         <p>of the specified monitor, or {@code None} if an error occurred.</p>
     *
     * @since version 3.1
     */
    @NativeType("RROutput")
    public static long glfwGetX11Monitor(@NativeType("GLFWmonitor *") long monitor) {
        long __functionAddress = Functions.GetX11Monitor;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(__functionAddress, monitor);
    }

    // --- [ glfwGetX11Window ] ---

    /**
     * Returns the<code>Window</code>
     * 
     * <p>of the specified window.</p>
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window a GLFW window
     *
     * @return The<code>Window</code>
     *         
     *         <p>of the specified window, or {@code None} if an error occurred.</p>
     *
     * @since version 3.0
     */
    @NativeType("Window")
    public static long glfwGetX11Window(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetX11Window;
        if (CHECKS) {
            check(window);
        }
        return invokePP(__functionAddress, window);
    }

}