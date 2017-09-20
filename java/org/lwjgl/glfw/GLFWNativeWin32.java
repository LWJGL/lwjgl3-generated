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
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the GLFW library's Win32 native access functions. */
public class GLFWNativeWin32 {

    protected GLFWNativeWin32() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetWin32Adapter = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWin32Adapter"),
            GetWin32Monitor = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWin32Monitor"),
            GetWin32Window  = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWin32Window");

    }

    // --- [ glfwGetWin32Adapter ] ---

    /** Unsafe version of: {@link #glfwGetWin32Adapter GetWin32Adapter} */
    public static long nglfwGetWin32Adapter(long monitor) {
        long __functionAddress = Functions.GetWin32Adapter;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(__functionAddress, monitor);
    }

    /**
     * Returns the adapter device name of the specified monitor.
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param monitor the GLFW monitor
     *
     * @return The UTF-8 encoded adapter device name (for example `\\.\DISPLAY1`) of the specified monitor, or {@code NULL} if an error occurred.
     *
     * @since version 3.1
     */
    @NativeType("const char *")
    public static String glfwGetWin32Adapter(@NativeType("GLFWmonitor *") long monitor) {
        long __result = nglfwGetWin32Adapter(monitor);
        return memUTF8(__result);
    }

    // --- [ glfwGetWin32Monitor ] ---

    /** Unsafe version of: {@link #glfwGetWin32Monitor GetWin32Monitor} */
    public static long nglfwGetWin32Monitor(long monitor) {
        long __functionAddress = Functions.GetWin32Monitor;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(__functionAddress, monitor);
    }

    /**
     * Returns the display device name of the specified monitor.
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param monitor the GLFW monitor
     *
     * @return The UTF-8 encoded display device name (for example `\\.\DISPLAY1\Monitor0`) of the specified monitor, or {@code NULL} if an error occurred.
     *
     * @since version 3.1
     */
    @NativeType("const char *")
    public static String glfwGetWin32Monitor(@NativeType("GLFWmonitor *") long monitor) {
        long __result = nglfwGetWin32Monitor(monitor);
        return memUTF8(__result);
    }

    // --- [ glfwGetWin32Window ] ---

    /**
     * Returns the {@code HWND} of the specified window.
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window the GLFW window
     *
     * @return The {@code HWND} of the specified window, or {@code NULL} if an error occurred.
     *
     * @since version 3.0
     */
    @NativeType("HWND")
    public static long glfwGetWin32Window(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetWin32Window;
        if (CHECKS) {
            check(window);
        }
        return invokePP(__functionAddress, window);
    }

}