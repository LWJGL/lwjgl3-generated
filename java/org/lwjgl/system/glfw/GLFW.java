/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.glfw;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the GLFW library.
 * <p/>
 * <b>Note</b>: All OpenGL related functionality has been stripped away.
 */
public final class GLFW {

	/** This is incremented when the API is changed in non-compatible ways. */
	public static final int
		GLFW_VERSION_MAJOR = 0x3;

	/** This is incremented when features are added to the API but it remains backward-compatible. */
	public static final int
		GLFW_VERSION_MINOR = 0x0;

	/** This is incremented when a bug fix release is made that does not contain any API changes. */
	public static final int
		GLFW_VERSION_REVISION = 0x0;

	/** The key or button was released. */
	public static final int
		GLFW_RELEASE = 0x0;

	/** The key or button was pressed. */
	public static final int
		GLFW_PRESS = 0x1;

	/** The key was held down until it repeated. */
	public static final int
		GLFW_REPEAT = 0x2;

	/** Printable keys. */
	public static final int
		GLFW_KEY_SPACE         = 0x20,
		GLFW_KEY_APOSTROPHE    = 0x27,
		GLFW_KEY_COMMA         = 0x2C,
		GLFW_KEY_MINUS         = 0x2D,
		GLFW_KEY_PERIOD        = 0x2E,
		GLFW_KEY_SLASH         = 0x2F,
		GLFW_KEY_0             = 0x30,
		GLFW_KEY_1             = 0x31,
		GLFW_KEY_2             = 0x32,
		GLFW_KEY_3             = 0x33,
		GLFW_KEY_4             = 0x34,
		GLFW_KEY_5             = 0x35,
		GLFW_KEY_6             = 0x36,
		GLFW_KEY_7             = 0x37,
		GLFW_KEY_8             = 0x38,
		GLFW_KEY_9             = 0x39,
		GLFW_KEY_SEMICOLON     = 0x3B,
		GLFW_KEY_EQUAL         = 0x3D,
		GLFW_KEY_A             = 0x41,
		GLFW_KEY_B             = 0x42,
		GLFW_KEY_C             = 0x43,
		GLFW_KEY_D             = 0x44,
		GLFW_KEY_E             = 0x45,
		GLFW_KEY_F             = 0x46,
		GLFW_KEY_G             = 0x47,
		GLFW_KEY_H             = 0x48,
		GLFW_KEY_I             = 0x49,
		GLFW_KEY_J             = 0x4A,
		GLFW_KEY_K             = 0x4B,
		GLFW_KEY_L             = 0x4C,
		GLFW_KEY_M             = 0x4D,
		GLFW_KEY_N             = 0x4E,
		GLFW_KEY_O             = 0x4F,
		GLFW_KEY_P             = 0x50,
		GLFW_KEY_Q             = 0x51,
		GLFW_KEY_R             = 0x52,
		GLFW_KEY_S             = 0x53,
		GLFW_KEY_T             = 0x54,
		GLFW_KEY_U             = 0x55,
		GLFW_KEY_V             = 0x56,
		GLFW_KEY_W             = 0x57,
		GLFW_KEY_X             = 0x58,
		GLFW_KEY_Y             = 0x59,
		GLFW_KEY_Z             = 0x5A,
		GLFW_KEY_LEFT_BRACKET  = 0x5B,
		GLFW_KEY_BACKSLASH     = 0x5C,
		GLFW_KEY_RIGHT_BRACKET = 0x5D,
		GLFW_KEY_GRAVE_ACCENT  = 0x60,
		GLFW_KEY_WORLD_1       = 0xA1,
		GLFW_KEY_WORLD_2       = 0xA2;

	/** Function keys. */
	public static final int
		GLFW_KEY_ESCAPE        = 0x100,
		GLFW_KEY_ENTER         = 0x101,
		GLFW_KEY_TAB           = 0x102,
		GLFW_KEY_BACKSPACE     = 0x103,
		GLFW_KEY_INSERT        = 0x104,
		GLFW_KEY_DELETE        = 0x105,
		GLFW_KEY_RIGHT         = 0x106,
		GLFW_KEY_LEFT          = 0x107,
		GLFW_KEY_DOWN          = 0x108,
		GLFW_KEY_UP            = 0x109,
		GLFW_KEY_PAGE_UP       = 0x10A,
		GLFW_KEY_PAGE_DOWN     = 0x10B,
		GLFW_KEY_HOME          = 0x10C,
		GLFW_KEY_END           = 0x10D,
		GLFW_KEY_CAPS_LOCK     = 0x118,
		GLFW_KEY_SCROLL_LOCK   = 0x119,
		GLFW_KEY_NUM_LOCK      = 0x11A,
		GLFW_KEY_PRINT_SCREEN  = 0x11B,
		GLFW_KEY_PAUSE         = 0x11C,
		GLFW_KEY_F1            = 0x122,
		GLFW_KEY_F2            = 0x123,
		GLFW_KEY_F3            = 0x124,
		GLFW_KEY_F4            = 0x125,
		GLFW_KEY_F5            = 0x126,
		GLFW_KEY_F6            = 0x127,
		GLFW_KEY_F7            = 0x128,
		GLFW_KEY_F8            = 0x129,
		GLFW_KEY_F9            = 0x12A,
		GLFW_KEY_F10           = 0x12B,
		GLFW_KEY_F11           = 0x12C,
		GLFW_KEY_F12           = 0x12D,
		GLFW_KEY_F13           = 0x12E,
		GLFW_KEY_F14           = 0x12F,
		GLFW_KEY_F15           = 0x130,
		GLFW_KEY_F16           = 0x131,
		GLFW_KEY_F17           = 0x132,
		GLFW_KEY_F18           = 0x133,
		GLFW_KEY_F19           = 0x134,
		GLFW_KEY_F20           = 0x135,
		GLFW_KEY_F21           = 0x136,
		GLFW_KEY_F22           = 0x137,
		GLFW_KEY_F23           = 0x138,
		GLFW_KEY_F24           = 0x139,
		GLFW_KEY_F25           = 0x13A,
		GLFW_KEY_KP_0          = 0x140,
		GLFW_KEY_KP_1          = 0x141,
		GLFW_KEY_KP_2          = 0x142,
		GLFW_KEY_KP_3          = 0x143,
		GLFW_KEY_KP_4          = 0x144,
		GLFW_KEY_KP_5          = 0x145,
		GLFW_KEY_KP_6          = 0x146,
		GLFW_KEY_KP_7          = 0x147,
		GLFW_KEY_KP_8          = 0x148,
		GLFW_KEY_KP_9          = 0x149,
		GLFW_KEY_KP_DECIMAL    = 0x14A,
		GLFW_KEY_KP_DIVIDE     = 0x14B,
		GLFW_KEY_KP_MULTIPLY   = 0x14C,
		GLFW_KEY_KP_SUBTRACT   = 0x14D,
		GLFW_KEY_KP_ADD        = 0x14E,
		GLFW_KEY_KP_ENTER      = 0x14F,
		GLFW_KEY_KP_EQUAL      = 0x150,
		GLFW_KEY_LEFT_SHIFT    = 0x154,
		GLFW_KEY_LEFT_CONTROL  = 0x155,
		GLFW_KEY_LEFT_ALT      = 0x156,
		GLFW_KEY_LEFT_SUPER    = 0x157,
		GLFW_KEY_RIGHT_SHIFT   = 0x158,
		GLFW_KEY_RIGHT_CONTROL = 0x159,
		GLFW_KEY_RIGHT_ALT     = 0x15A,
		GLFW_KEY_RIGHT_SUPER   = 0x15B,
		GLFW_KEY_MENU          = 0x15C;

	/** Mouse buttons. */
	public static final int
		GLFW_MOUSE_BUTTON_1      = 0x0,
		GLFW_MOUSE_BUTTON_2      = 0x1,
		GLFW_MOUSE_BUTTON_3      = 0x2,
		GLFW_MOUSE_BUTTON_4      = 0x3,
		GLFW_MOUSE_BUTTON_5      = 0x4,
		GLFW_MOUSE_BUTTON_6      = 0x5,
		GLFW_MOUSE_BUTTON_7      = 0x6,
		GLFW_MOUSE_BUTTON_8      = 0x7,
		GLFW_MOUSE_BUTTON_LEFT   = GLFW_MOUSE_BUTTON_1,
		GLFW_MOUSE_BUTTON_RIGHT  = GLFW_MOUSE_BUTTON_2,
		GLFW_MOUSE_BUTTON_MIDDLE = GLFW_MOUSE_BUTTON_3;

	/**
	 * MOUSE_BUTTON_LAST MOUSE_BUTTON_8 MOUSE_BUTTON_LEFT MOUSE_BUTTON_1 MOUSE_BUTTON_RIGHT MOUSE_BUTTON_2
	 * MOUSE_BUTTON_MIDDLE MOUSE_BUTTON_3 Joysticks.
	 */
	public static final int
		GLFW_JOYSTICK_1  = 0x0,
		GLFW_JOYSTICK_2  = 0x1,
		GLFW_JOYSTICK_3  = 0x2,
		GLFW_JOYSTICK_4  = 0x3,
		GLFW_JOYSTICK_5  = 0x4,
		GLFW_JOYSTICK_6  = 0x5,
		GLFW_JOYSTICK_7  = 0x6,
		GLFW_JOYSTICK_8  = 0x7,
		GLFW_JOYSTICK_9  = 0x8,
		GLFW_JOYSTICK_10 = 0x9,
		GLFW_JOYSTICK_11 = 0xA,
		GLFW_JOYSTICK_12 = 0xB,
		GLFW_JOYSTICK_13 = 0xC,
		GLFW_JOYSTICK_14 = 0xD,
		GLFW_JOYSTICK_15 = 0xE,
		GLFW_JOYSTICK_16 = 0xF;

	/** JOYSTICK_LAST          JOYSTICK_16 No error has occurred. */
	public static final int
		GLFW_NO_ERROR = 0x0;

	/** GLFW has not been initialized. */
	public static final int
		GLFW_NOT_INITIALIZED = 0x70001;

	/** No context is current for this thread. */
	public static final int
		GLFW_NO_CURRENT_CONTEXT = 0x70002;

	/** One of the enum parameters for the function was given an invalid enum. */
	public static final int
		GLFW_INVALID_ENUM = 0x70003;

	/** One of the parameters for the function was given an invalid value. */
	public static final int
		GLFW_INVALID_VALUE = 0x70004;

	/** A memory allocation failed. */
	public static final int
		GLFW_OUT_OF_MEMORY = 0x70005;

	/** GLFW could not find support for the requested client API on the system. */
	public static final int
		GLFW_API_UNAVAILABLE = 0x70006;

	/** The requested client API version is not available. */
	public static final int
		GLFW_VERSION_UNAVAILABLE = 0x70007;

	/** A platform-specific error occurred that does not match any of the more specific categories. */
	public static final int
		GLFW_PLATFORM_ERROR = 0x70008;

	/** The clipboard did not contain data in the requested format. */
	public static final int
		GLFW_FORMAT_UNAVAILABLE = 0x70009;

	/** Window events. */
	public static final int
		GLFW_FOCUSED   = 0x20001,
		GLFW_ICONIFIED = 0x20002,
		GLFW_RESIZABLE = 0x22007,
		GLFW_VISIBLE   = 0x22008;

	/** Input options. */
	public static final int
		GLFW_CURSOR_MODE          = 0x30001,
		GLFW_STICKY_KEYS          = 0x30002,
		GLFW_STICKY_MOUSE_BUTTONS = 0x30003;

	/** Cursor state. */
	public static final int
		GLFW_CURSOR_NORMAL   = 0x40001,
		GLFW_CURSOR_HIDDEN   = 0x40002,
		GLFW_CURSOR_CAPTURED = 0x40003;

	/** Joystick state. */
	public static final int
		GLFW_PRESENT = 0x50001,
		GLFW_AXES    = 0x50002,
		GLFW_BUTTONS = 0x50003;

	/** Gamma ramp size. */
	public static final int
		GLFW_GAMMA_RAMP_SIZE = 0x100;

	/** Monitor events. */
	public static final int
		GLFW_CONNECTED    = 0x61000,
		GLFW_DISCONNECTED = 0x61001;

	private GLFW() {}

	// --- [ glfwInit ] ---

	/**  */
	public static native int glfwInit();

	// --- [ glfwTerminate ] ---

	/** JNI method for {@link #glfwTerminate()} */
	public static native void nglfwTerminate();

	/**  */
	public static void glfwTerminate() {
		WindowCallback.clearAll();
		nglfwTerminate();
	}

	// --- [ glfwGetVersion ] ---

	/** JNI method for {@link #glfwGetVersion(ByteBuffer, ByteBuffer, ByteBuffer)} */
	public static native void nglfwGetVersion(long major, long minor, long rev);

	/**
	 * 
	 *
	 * @param major 
	 * @param minor 
	 * @param rev   
	 */
	public static void glfwGetVersion(ByteBuffer major, ByteBuffer minor, ByteBuffer rev) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(major, 1 << 2);
			checkBuffer(minor, 1 << 2);
			checkBuffer(rev, 1 << 2);
		}
		nglfwGetVersion(memAddress(major), memAddress(minor), memAddress(rev));
	}

	/** Alternative version of: {@link #glfwGetVersion(ByteBuffer, ByteBuffer, ByteBuffer)} */
	public static void glfwGetVersion(IntBuffer major, IntBuffer minor, IntBuffer rev) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(major, 1);
			checkBuffer(minor, 1);
			checkBuffer(rev, 1);
		}
		nglfwGetVersion(memAddress(major), memAddress(minor), memAddress(rev));
	}

	// --- [ glfwGetVersionString ] ---

	/** JNI method for {@link #glfwGetVersionString()} */
	public static native long nglfwGetVersionString();

	/**  */
	public static String glfwGetVersionString() {
		long __result = nglfwGetVersionString();
		return memDecodeUTF8(memByteBufferNT1(__result));
	}

	// --- [ glfwSetErrorCallback ] ---

	/** JNI method for {@link #glfwSetErrorCallback(long)} */
	public static native void nglfwSetErrorCallback(long cbfun);

	/**
	 * Sets the error callback.
	 * <p/>
	 * This function may be called before {@link #glfwInit()}.
	 * <p/>
	 * The error callback is called by the thread where the error was generated.  If you are using GLFW from multiple threads, your error callback needs to be
	 * written accordingly.
	 * <p/>
	 * Because the description string provided to the callback may have been
	 * generated specifically for that error, it is not guaranteed to be valid
	 * after the callback has returned.  If you wish to use it after that, you need
	 * to make your own copy of it before returning.
	 *
	 * @param cbfun the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetErrorCallback(long cbfun) {
		nglfwSetErrorCallback(cbfun);
	}

	/** Alternative version of: {@link #glfwSetErrorCallback(long)} */
	public static void glfwSetErrorCallback(ErrorCallback cbfun) {
		nglfwSetErrorCallback(ErrorCallback.register(cbfun));
	}

	// --- [ glfwGetMonitors ] ---

	/** JNI method for {@link #glfwGetMonitors()} */
	public static native long nglfwGetMonitors(long count);

	/**  */
	public static PointerBuffer glfwGetMonitors() {
		APIBuffer __buffer = apiBuffer();
		int count = __buffer.intParam();
		long __result = nglfwGetMonitors(__buffer.address() + count);
		return memPointerBuffer(__result, __buffer.intValue(count));
	}

	// --- [ glfwGetPrimaryMonitor ] ---

	/**  */
	public static native long glfwGetPrimaryMonitor();

	// --- [ glfwGetMonitorPos ] ---

	/** JNI method for {@link #glfwGetMonitorPos(long, ByteBuffer, ByteBuffer)} */
	public static native void nglfwGetMonitorPos(long monitor, long xpos, long ypos);

	/**
	 * 
	 *
	 * @param monitor 
	 * @param xpos    
	 * @param ypos    
	 */
	public static void glfwGetMonitorPos(long monitor, ByteBuffer xpos, ByteBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			checkBuffer(xpos, 1 << 2);
			checkBuffer(ypos, 1 << 2);
		}
		nglfwGetMonitorPos(monitor, memAddress(xpos), memAddress(ypos));
	}

	/** Alternative version of: {@link #glfwGetMonitorPos(long, ByteBuffer, ByteBuffer)} */
	public static void glfwGetMonitorPos(long monitor, IntBuffer xpos, IntBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			checkBuffer(xpos, 1);
			checkBuffer(ypos, 1);
		}
		nglfwGetMonitorPos(monitor, memAddress(xpos), memAddress(ypos));
	}

	// --- [ glfwGetMonitorPhysicalSize ] ---

	/** JNI method for {@link #glfwGetMonitorPhysicalSize(long, ByteBuffer, ByteBuffer)} */
	public static native void nglfwGetMonitorPhysicalSize(long monitor, long width, long height);

	/**
	 * 
	 *
	 * @param monitor 
	 * @param width   
	 * @param height  
	 */
	public static void glfwGetMonitorPhysicalSize(long monitor, ByteBuffer width, ByteBuffer height) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			checkBuffer(width, 1 << 2);
			checkBuffer(height, 1 << 2);
		}
		nglfwGetMonitorPhysicalSize(monitor, memAddress(width), memAddress(height));
	}

	/** Alternative version of: {@link #glfwGetMonitorPhysicalSize(long, ByteBuffer, ByteBuffer)} */
	public static void glfwGetMonitorPhysicalSize(long monitor, IntBuffer width, IntBuffer height) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			checkBuffer(width, 1);
			checkBuffer(height, 1);
		}
		nglfwGetMonitorPhysicalSize(monitor, memAddress(width), memAddress(height));
	}

	// --- [ glfwGetMonitorName ] ---

	/** JNI method for {@link #glfwGetMonitorName(long)} */
	public static native long nglfwGetMonitorName(long monitor);

	/**
	 * 
	 *
	 * @param monitor 
	 */
	public static String glfwGetMonitorName(long monitor) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		long __result = nglfwGetMonitorName(monitor);
		return memDecodeUTF8(memByteBufferNT1(__result));
	}

	// --- [ glfwSetMonitorCallback ] ---

	/** JNI method for {@link #glfwSetMonitorCallback(long)} */
	public static native void nglfwSetMonitorCallback(long cbfun);

	/**
	 * Sets the monitor configuration callback.
	 *
	 * @param cbfun the new callback, or NULL to remove the currently set callback
	 */
	public static void glfwSetMonitorCallback(long cbfun) {
		nglfwSetMonitorCallback(cbfun);
	}

	/** Alternative version of: {@link #glfwSetMonitorCallback(long)} */
	public static void glfwSetMonitorCallback(MonitorCallback cbfun) {
		nglfwSetMonitorCallback(MonitorCallback.register(cbfun));
	}

	// --- [ glfwGetVideoModes ] ---

	/** JNI method for {@link #glfwGetVideoModes(long)} */
	public static native long nglfwGetVideoModes(long monitor, long count);

	/**
	 * 
	 *
	 * @param monitor 
	 */
	public static PointerBuffer glfwGetVideoModes(long monitor) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		APIBuffer __buffer = apiBuffer();
		int count = __buffer.intParam();
		long __result = nglfwGetVideoModes(monitor, __buffer.address() + count);
		return memPointerBuffer(__result, __buffer.intValue(count));
	}

	// --- [ glfwGetVideoMode ] ---

	/** JNI method for {@link #glfwGetVideoMode(long, ByteBuffer)} */
	public static native void nglfwGetVideoMode(long monitor, long __result);

	/**
	 * 
	 *
	 * @param monitor 
	 */
	public static void glfwGetVideoMode(long monitor, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		nglfwGetVideoMode(monitor, memAddress(__result));
	}

	// --- [ glfwSetGamma ] ---

	/** JNI method for {@link #glfwSetGamma(long, float)} */
	public static native void nglfwSetGamma(long monitor, float gamma);

	/**
	 * 
	 *
	 * @param monitor 
	 * @param gamma   
	 */
	public static void glfwSetGamma(long monitor, float gamma) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		nglfwSetGamma(monitor, gamma);
	}

	// --- [ glfwGetGammaRamp ] ---

	/** JNI method for {@link #glfwGetGammaRamp(long, ByteBuffer)} */
	public static native void nglfwGetGammaRamp(long monitor, long ramp);

	/**
	 * 
	 *
	 * @param monitor 
	 * @param ramp    
	 */
	public static void glfwGetGammaRamp(long monitor, ByteBuffer ramp) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			checkBuffer(ramp, GLFWgammaramp.SIZEOF);
		}
		nglfwGetGammaRamp(monitor, memAddress(ramp));
	}

	// --- [ glfwSetGammaRamp ] ---

	/** JNI method for {@link #glfwSetGammaRamp(long, ByteBuffer)} */
	public static native void nglfwSetGammaRamp(long monitor, long ramp);

	/**
	 * 
	 *
	 * @param monitor 
	 * @param ramp    
	 */
	public static void glfwSetGammaRamp(long monitor, ByteBuffer ramp) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			checkBuffer(ramp, GLFWgammaramp.SIZEOF);
		}
		nglfwSetGammaRamp(monitor, memAddress(ramp));
	}

	// --- [ glfwDefaultWindowHints ] ---

	/**  */
	public static native void glfwDefaultWindowHints();

	// --- [ glfwWindowHint ] ---

	/**
	 * 
	 *
	 * @param target 
	 * @param hint   
	 */
	public static native void glfwWindowHint(int target, int hint);

	// --- [ glfwCreateWindow ] ---

	/** JNI method for {@link #glfwCreateWindow(int, int, ByteBuffer, long, long)} */
	public static native long nglfwCreateWindow(int width, int height, long title, long monitor, long share);

	/**
	 * 
	 *
	 * @param width   
	 * @param height  
	 * @param title   
	 * @param monitor 
	 * @param share   
	 */
	public static long glfwCreateWindow(int width, int height, ByteBuffer title, long monitor, long share) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(title);
		return nglfwCreateWindow(width, height, memAddress(title), monitor, share);
	}

	/** CharSequence version of: {@link #glfwCreateWindow(int, int, ByteBuffer, long, long)} */
	public static long glfwCreateWindow(int width, int height, CharSequence title, long monitor, long share) {
		return nglfwCreateWindow(width, height, memAddress(memEncodeUTF8(title)), monitor, share);
	}

	// --- [ glfwDestroyWindow ] ---

	/** JNI method for {@link #glfwDestroyWindow(long)} */
	public static native void nglfwDestroyWindow(long window);

	/**
	 * 
	 *
	 * @param window 
	 */
	public static void glfwDestroyWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		WindowCallback.set(window, null);
		nglfwDestroyWindow(window);
	}

	// --- [ glfwWindowShouldClose ] ---

	/** JNI method for {@link #glfwWindowShouldClose(long)} */
	public static native int nglfwWindowShouldClose(long window);

	/**
	 * 
	 *
	 * @param window 
	 */
	public static int glfwWindowShouldClose(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwWindowShouldClose(window);
	}

	// --- [ glfwSetWindowShouldClose ] ---

	/** JNI method for {@link #glfwSetWindowShouldClose(long, int)} */
	public static native void nglfwSetWindowShouldClose(long window, int value);

	/**
	 * 
	 *
	 * @param window 
	 * @param value  
	 */
	public static void glfwSetWindowShouldClose(long window, int value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowShouldClose(window, value);
	}

	// --- [ glfwSetWindowTitle ] ---

	/** JNI method for {@link #glfwSetWindowTitle(long, ByteBuffer)} */
	public static native void nglfwSetWindowTitle(long window, long title);

	/**
	 * 
	 *
	 * @param window 
	 * @param title  
	 */
	public static void glfwSetWindowTitle(long window, ByteBuffer title) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkNT1(title);
		}
		nglfwSetWindowTitle(window, memAddress(title));
	}

	/** CharSequence version of: {@link #glfwSetWindowTitle(long, ByteBuffer)} */
	public static void glfwSetWindowTitle(long window, CharSequence title) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowTitle(window, memAddress(memEncodeUTF8(title)));
	}

	// --- [ glfwGetWindowPos ] ---

	/** JNI method for {@link #glfwGetWindowPos(long, ByteBuffer, ByteBuffer)} */
	public static native void nglfwGetWindowPos(long window, long xpos, long ypos);

	/**
	 * 
	 *
	 * @param window 
	 * @param xpos   
	 * @param ypos   
	 */
	public static void glfwGetWindowPos(long window, ByteBuffer xpos, ByteBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkBuffer(xpos, 1 << 2);
			checkBuffer(ypos, 1 << 2);
		}
		nglfwGetWindowPos(window, memAddress(xpos), memAddress(ypos));
	}

	/** Alternative version of: {@link #glfwGetWindowPos(long, ByteBuffer, ByteBuffer)} */
	public static void glfwGetWindowPos(long window, IntBuffer xpos, IntBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkBuffer(xpos, 1);
			checkBuffer(ypos, 1);
		}
		nglfwGetWindowPos(window, memAddress(xpos), memAddress(ypos));
	}

	// --- [ glfwSetWindowPos ] ---

	/** JNI method for {@link #glfwSetWindowPos(long, int, int)} */
	public static native void nglfwSetWindowPos(long window, int xpos, int ypos);

	/**
	 * 
	 *
	 * @param window 
	 * @param xpos   
	 * @param ypos   
	 */
	public static void glfwSetWindowPos(long window, int xpos, int ypos) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowPos(window, xpos, ypos);
	}

	// --- [ glfwGetWindowSize ] ---

	/** JNI method for {@link #glfwGetWindowSize(long, ByteBuffer, ByteBuffer)} */
	public static native void nglfwGetWindowSize(long window, long width, long height);

	/**
	 * 
	 *
	 * @param window 
	 * @param width  
	 * @param height 
	 */
	public static void glfwGetWindowSize(long window, ByteBuffer width, ByteBuffer height) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkBuffer(width, 1 << 2);
			checkBuffer(height, 1 << 2);
		}
		nglfwGetWindowSize(window, memAddress(width), memAddress(height));
	}

	/** Alternative version of: {@link #glfwGetWindowSize(long, ByteBuffer, ByteBuffer)} */
	public static void glfwGetWindowSize(long window, IntBuffer width, IntBuffer height) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkBuffer(width, 1);
			checkBuffer(height, 1);
		}
		nglfwGetWindowSize(window, memAddress(width), memAddress(height));
	}

	// --- [ glfwSetWindowSize ] ---

	/** JNI method for {@link #glfwSetWindowSize(long, int, int)} */
	public static native void nglfwSetWindowSize(long window, int width, int height);

	/**
	 * 
	 *
	 * @param window 
	 * @param width  
	 * @param height 
	 */
	public static void glfwSetWindowSize(long window, int width, int height) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowSize(window, width, height);
	}

	// --- [ glfwIconifyWindow ] ---

	/** JNI method for {@link #glfwIconifyWindow(long)} */
	public static native void nglfwIconifyWindow(long window);

	/**
	 * 
	 *
	 * @param window 
	 */
	public static void glfwIconifyWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwIconifyWindow(window);
	}

	// --- [ glfwRestoreWindow ] ---

	/** JNI method for {@link #glfwRestoreWindow(long)} */
	public static native void nglfwRestoreWindow(long window);

	/**
	 * 
	 *
	 * @param window 
	 */
	public static void glfwRestoreWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwRestoreWindow(window);
	}

	// --- [ glfwShowWindow ] ---

	/** JNI method for {@link #glfwShowWindow(long)} */
	public static native void nglfwShowWindow(long window);

	/**
	 * 
	 *
	 * @param window 
	 */
	public static void glfwShowWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwShowWindow(window);
	}

	// --- [ glfwHideWindow ] ---

	/** JNI method for {@link #glfwHideWindow(long)} */
	public static native void nglfwHideWindow(long window);

	/**
	 * 
	 *
	 * @param window 
	 */
	public static void glfwHideWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwHideWindow(window);
	}

	// --- [ glfwGetWindowMonitor ] ---

	/** JNI method for {@link #glfwGetWindowMonitor(long)} */
	public static native long nglfwGetWindowMonitor(long window);

	/**
	 * 
	 *
	 * @param window 
	 */
	public static long glfwGetWindowMonitor(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetWindowMonitor(window);
	}

	// --- [ glfwGetWindowParam ] ---

	/** JNI method for {@link #glfwGetWindowParam(long, int)} */
	public static native int nglfwGetWindowParam(long window, int param);

	/**
	 * 
	 *
	 * @param window 
	 * @param param  
	 */
	public static int glfwGetWindowParam(long window, int param) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetWindowParam(window, param);
	}

	// --- [ glfwSetWindowUserPointer ] ---

	/** JNI method for {@link #glfwSetWindowUserPointer(long, long)} */
	public static native void nglfwSetWindowUserPointer(long window, long pointer);

	/**
	 * 
	 *
	 * @param window  
	 * @param pointer 
	 */
	public static void glfwSetWindowUserPointer(long window, long pointer) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowUserPointer(window, pointer);
	}

	// --- [ glfwGetWindowUserPointer ] ---

	/** JNI method for {@link #glfwGetWindowUserPointer(long)} */
	public static native long nglfwGetWindowUserPointer(long window);

	/**
	 * 
	 *
	 * @param window 
	 */
	public static long glfwGetWindowUserPointer(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetWindowUserPointer(window);
	}

	// --- [ glfwSetWindowPosCallback ] ---

	/** JNI method for {@link #glfwSetWindowPosCallback(long, long)} */
	public static native void nglfwSetWindowPosCallback(long window, long cbfun);

	/**
	 * Sets the position callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowPosCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowPosCallback(window, cbfun);
	}

	// --- [ glfwSetWindowSizeCallback ] ---

	/** JNI method for {@link #glfwSetWindowSizeCallback(long, long)} */
	public static native void nglfwSetWindowSizeCallback(long window, long cbfun);

	/**
	 * Sets the size callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowSizeCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowSizeCallback(window, cbfun);
	}

	// --- [ glfwSetWindowCloseCallback ] ---

	/** JNI method for {@link #glfwSetWindowCloseCallback(long, long)} */
	public static native void nglfwSetWindowCloseCallback(long window, long cbfun);

	/**
	 * Sets the close callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * This callback is called when the user attempts to close the window, i.e. for example by clicking the window's close widget.  It is called immediately
	 * after the window's close flag has been set.
	 * <p/>
	 * Calling {@link #glfwDestroyWindow(long)} does not cause this callback to be called.
	 * <p/>
	 * <b>Mac OS X:</b> Selecting Quit from the application menu will trigger the close callback for all windows.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowCloseCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowCloseCallback(window, cbfun);
	}

	// --- [ glfwSetWindowRefreshCallback ] ---

	/** JNI method for {@link #glfwSetWindowRefreshCallback(long, long)} */
	public static native void nglfwSetWindowRefreshCallback(long window, long cbfun);

	/**
	 * Sets the refresh callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * This callback is called when the client area of the window needs to be redrawn, for example if the window has been exposed after having been covered by
	 * another window.
	 * <p/>
	 * On compositing window systems such as Aero, Compiz or Aqua, where the window contents are saved off-screen, this callback may be called only very
	 * infrequently or never at all.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowRefreshCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowRefreshCallback(window, cbfun);
	}

	// --- [ glfwSetWindowFocusCallback ] ---

	/** JNI method for {@link #glfwSetWindowFocusCallback(long, long)} */
	public static native void nglfwSetWindowFocusCallback(long window, long cbfun);

	/**
	 * Sets the focus callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * This callback is called when the window gains or loses focus.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowFocusCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowFocusCallback(window, cbfun);
	}

	// --- [ glfwSetWindowIconifyCallback ] ---

	/** JNI method for {@link #glfwSetWindowIconifyCallback(long, long)} */
	public static native void nglfwSetWindowIconifyCallback(long window, long cbfun);

	/**
	 * Sets the iconify callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * This callback is called when the window is iconified or restored.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowIconifyCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowIconifyCallback(window, cbfun);
	}

	// --- [ glfwPollEvents ] ---

	/**  */
	public static native void glfwPollEvents();

	// --- [ glfwWaitEvents ] ---

	/**  */
	public static native void glfwWaitEvents();

	// --- [ glfwGetInputMode ] ---

	/** JNI method for {@link #glfwGetInputMode(long, int)} */
	public static native int nglfwGetInputMode(long window, int mode);

	/**
	 * 
	 *
	 * @param window 
	 * @param mode   
	 */
	public static int glfwGetInputMode(long window, int mode) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetInputMode(window, mode);
	}

	// --- [ glfwSetInputMode ] ---

	/** JNI method for {@link #glfwSetInputMode(long, int, int)} */
	public static native void nglfwSetInputMode(long window, int mode, int value);

	/**
	 * 
	 *
	 * @param window 
	 * @param mode   
	 * @param value  
	 */
	public static void glfwSetInputMode(long window, int mode, int value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetInputMode(window, mode, value);
	}

	// --- [ glfwGetKey ] ---

	/** JNI method for {@link #glfwGetKey(long, int)} */
	public static native int nglfwGetKey(long window, int key);

	/**
	 * 
	 *
	 * @param window 
	 * @param key    
	 */
	public static int glfwGetKey(long window, int key) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetKey(window, key);
	}

	// --- [ glfwGetMouseButton ] ---

	/** JNI method for {@link #glfwGetMouseButton(long, int)} */
	public static native int nglfwGetMouseButton(long window, int button);

	/**
	 * 
	 *
	 * @param window 
	 * @param button 
	 */
	public static int glfwGetMouseButton(long window, int button) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetMouseButton(window, button);
	}

	// --- [ glfwGetCursorPos ] ---

	/** JNI method for {@link #glfwGetCursorPos(long, ByteBuffer, ByteBuffer)} */
	public static native void nglfwGetCursorPos(long window, long xpos, long ypos);

	/**
	 * 
	 *
	 * @param window 
	 * @param xpos   
	 * @param ypos   
	 */
	public static void glfwGetCursorPos(long window, ByteBuffer xpos, ByteBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkBuffer(xpos, 1 << 2);
			checkBuffer(ypos, 1 << 2);
		}
		nglfwGetCursorPos(window, memAddress(xpos), memAddress(ypos));
	}

	/** Alternative version of: {@link #glfwGetCursorPos(long, ByteBuffer, ByteBuffer)} */
	public static void glfwGetCursorPos(long window, IntBuffer xpos, IntBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkBuffer(xpos, 1);
			checkBuffer(ypos, 1);
		}
		nglfwGetCursorPos(window, memAddress(xpos), memAddress(ypos));
	}

	// --- [ glfwSetCursorPos ] ---

	/** JNI method for {@link #glfwSetCursorPos(long, int, int)} */
	public static native void nglfwSetCursorPos(long window, int xpos, int ypos);

	/**
	 * 
	 *
	 * @param window 
	 * @param xpos   
	 * @param ypos   
	 */
	public static void glfwSetCursorPos(long window, int xpos, int ypos) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetCursorPos(window, xpos, ypos);
	}

	// --- [ glfwSetKeyCallback ] ---

	/** JNI method for {@link #glfwSetKeyCallback(long, long)} */
	public static native void nglfwSetKeyCallback(long window, long cbfun);

	/**
	 * Sets the key callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * The key callback deals with physical keys, with key tokens named after their use on the standard US keyboard layout. If you want to input text, use the
	 * Unicode character callback instead.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetKeyCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetKeyCallback(window, cbfun);
	}

	// --- [ glfwSetCharCallback ] ---

	/** JNI method for {@link #glfwSetCharCallback(long, long)} */
	public static native void nglfwSetCharCallback(long window, long cbfun);

	/**
	 * Sets the Unicode character callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * The Unicode character callback is for text input. If you want to know whether a specific key was pressed or released, use the key callback.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetCharCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetCharCallback(window, cbfun);
	}

	// --- [ glfwSetMouseButtonCallback ] ---

	/** JNI method for {@link #glfwSetMouseButtonCallback(long, long)} */
	public static native void nglfwSetMouseButtonCallback(long window, long cbfun);

	/**
	 * Sets the mouse button callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetMouseButtonCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetMouseButtonCallback(window, cbfun);
	}

	// --- [ glfwSetCursorPosCallback ] ---

	/** JNI method for {@link #glfwSetCursorPosCallback(long, long)} */
	public static native void nglfwSetCursorPosCallback(long window, long cbfun);

	/**
	 * Sets the cursor position callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * The position is relative to the upper-left corner of the client area of the window.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetCursorPosCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetCursorPosCallback(window, cbfun);
	}

	// --- [ glfwSetCursorEnterCallback ] ---

	/** JNI method for {@link #glfwSetCursorEnterCallback(long, long)} */
	public static native void nglfwSetCursorEnterCallback(long window, long cbfun);

	/**
	 * Sets the cursor enter/exit callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetCursorEnterCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetCursorEnterCallback(window, cbfun);
	}

	// --- [ glfwSetScrollCallback ] ---

	/** JNI method for {@link #glfwSetScrollCallback(long, long)} */
	public static native void nglfwSetScrollCallback(long window, long cbfun);

	/**
	 * Sets the scroll callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * This receives all scrolling input, like that from a mouse wheel or a touchpad scrolling area.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetScrollCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetScrollCallback(window, cbfun);
	}

	// --- [ glfwGetJoystickParam ] ---

	/**
	 * 
	 *
	 * @param joy   
	 * @param param 
	 */
	public static native int glfwGetJoystickParam(int joy, int param);

	// --- [ glfwGetJoystickAxes ] ---

	/** JNI method for {@link #glfwGetJoystickAxes(int, ByteBuffer, int)} */
	public static native int nglfwGetJoystickAxes(int joy, long axes, int numaxes);

	/**
	 * 
	 *
	 * @param joy     
	 * @param axes    
	 * @param numaxes 
	 */
	public static int glfwGetJoystickAxes(int joy, ByteBuffer axes, int numaxes) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(axes, 1 << 2);
		return nglfwGetJoystickAxes(joy, memAddress(axes), numaxes);
	}

	/** Alternative version of: {@link #glfwGetJoystickAxes(int, ByteBuffer, int)} */
	public static int glfwGetJoystickAxes(int joy, FloatBuffer axes, int numaxes) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(axes, 1);
		return nglfwGetJoystickAxes(joy, memAddress(axes), numaxes);
	}

	// --- [ glfwGetJoystickButtons ] ---

	/** JNI method for {@link #glfwGetJoystickButtons(int, ByteBuffer, int)} */
	public static native int nglfwGetJoystickButtons(int joy, long buttons, int numbuttons);

	/**
	 * 
	 *
	 * @param joy        
	 * @param buttons    
	 * @param numbuttons 
	 */
	public static int glfwGetJoystickButtons(int joy, ByteBuffer buttons, int numbuttons) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(buttons);
		return nglfwGetJoystickButtons(joy, memAddress(buttons), numbuttons);
	}

	/** CharSequence version of: {@link #glfwGetJoystickButtons(int, ByteBuffer, int)} */
	public static int glfwGetJoystickButtons(int joy, CharSequence buttons, int numbuttons) {
		return nglfwGetJoystickButtons(joy, memAddress(memEncodeUTF8(buttons)), numbuttons);
	}

	// --- [ glfwGetJoystickName ] ---

	/** JNI method for {@link #glfwGetJoystickName(int)} */
	public static native long nglfwGetJoystickName(int joy);

	/**
	 * 
	 *
	 * @param joy 
	 */
	public static String glfwGetJoystickName(int joy) {
		long __result = nglfwGetJoystickName(joy);
		return memDecodeUTF8(memByteBufferNT1(__result));
	}

	// --- [ glfwSetClipboardString ] ---

	/** JNI method for {@link #glfwSetClipboardString(long, ByteBuffer)} */
	public static native void nglfwSetClipboardString(long window, long string);

	/**
	 * 
	 *
	 * @param window 
	 * @param string 
	 */
	public static void glfwSetClipboardString(long window, ByteBuffer string) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkNT1(string);
		}
		nglfwSetClipboardString(window, memAddress(string));
	}

	/** CharSequence version of: {@link #glfwSetClipboardString(long, ByteBuffer)} */
	public static void glfwSetClipboardString(long window, CharSequence string) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetClipboardString(window, memAddress(memEncodeUTF8(string)));
	}

	// --- [ glfwGetClipboardString ] ---

	/** JNI method for {@link #glfwGetClipboardString(long)} */
	public static native long nglfwGetClipboardString(long window);

	/**
	 * 
	 *
	 * @param window 
	 */
	public static String glfwGetClipboardString(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		long __result = nglfwGetClipboardString(window);
		return memDecodeUTF8(memByteBufferNT1(__result));
	}

	// --- [ glfwGetTime ] ---

	/**  */
	public static native double glfwGetTime();

	// --- [ glfwSetTime ] ---

	/**
	 * 
	 *
	 * @param time 
	 */
	public static native void glfwSetTime(double time);

}