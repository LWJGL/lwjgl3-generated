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

import org.lwjgl.opengl.GL11;

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
		GLFW_VERSION_REVISION = 0x3;

	/** The key or button was released. */
	public static final int
		GLFW_RELEASE = 0x0;

	/** The key or button was pressed. */
	public static final int
		GLFW_PRESS = 0x1;

	/** The key was held down until it repeated. */
	public static final int
		GLFW_REPEAT = 0x2;

	/** The unknown key. */
	public static final int
		GLFW_KEY_UNKNOWN = 0xFFFFFFFF;

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
		GLFW_KEY_MENU          = 0x15C,
		GLFW_KEY_LAST          = GLFW_KEY_MENU;

	/** Modifier key flags. */
	public static final int
		GLFW_MOD_SHIFT   = 0x1,
		GLFW_MOD_CONTROL = 0x2,
		GLFW_MOD_ALT     = 0x4,
		GLFW_MOD_SUPER   = 0x8;

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
		GLFW_MOUSE_BUTTON_LAST   = GLFW_MOUSE_BUTTON_8,
		GLFW_MOUSE_BUTTON_LEFT   = GLFW_MOUSE_BUTTON_1,
		GLFW_MOUSE_BUTTON_RIGHT  = GLFW_MOUSE_BUTTON_2,
		GLFW_MOUSE_BUTTON_MIDDLE = GLFW_MOUSE_BUTTON_3;

	/** Joysticks. */
	public static final int
		GLFW_JOYSTICK_1    = 0x0,
		GLFW_JOYSTICK_2    = 0x1,
		GLFW_JOYSTICK_3    = 0x2,
		GLFW_JOYSTICK_4    = 0x3,
		GLFW_JOYSTICK_5    = 0x4,
		GLFW_JOYSTICK_6    = 0x5,
		GLFW_JOYSTICK_7    = 0x6,
		GLFW_JOYSTICK_8    = 0x7,
		GLFW_JOYSTICK_9    = 0x8,
		GLFW_JOYSTICK_10   = 0x9,
		GLFW_JOYSTICK_11   = 0xA,
		GLFW_JOYSTICK_12   = 0xB,
		GLFW_JOYSTICK_13   = 0xC,
		GLFW_JOYSTICK_14   = 0xD,
		GLFW_JOYSTICK_15   = 0xE,
		GLFW_JOYSTICK_16   = 0xF,
		GLFW_JOYSTICK_LAST = GLFW_JOYSTICK_16;

	/** GLFW has not been initialized. */
	public static final int
		GLFW_NOT_INITIALIZED = 0x10001;

	/** No context is current for this thread. */
	public static final int
		GLFW_NO_CURRENT_CONTEXT = 0x10002;

	/** One of the enum parameters for the function was given an invalid enum. */
	public static final int
		GLFW_INVALID_ENUM = 0x10003;

	/** One of the parameters for the function was given an invalid value. */
	public static final int
		GLFW_INVALID_VALUE = 0x10004;

	/** A memory allocation failed. */
	public static final int
		GLFW_OUT_OF_MEMORY = 0x10005;

	/** GLFW could not find support for the requested client API on the system. */
	public static final int
		GLFW_API_UNAVAILABLE = 0x10006;

	/** The requested client API version is not available. */
	public static final int
		GLFW_VERSION_UNAVAILABLE = 0x10007;

	/** A platform-specific error occurred that does not match any of the more specific categories. */
	public static final int
		GLFW_PLATFORM_ERROR = 0x10008;

	/** The clipboard did not contain data in the requested format. */
	public static final int
		GLFW_FORMAT_UNAVAILABLE = 0x10009;

	/** Window events. */
	public static final int
		GLFW_FOCUSED   = 0x20001,
		GLFW_ICONIFIED = 0x20002,
		GLFW_RESIZABLE = 0x20003,
		GLFW_VISIBLE   = 0x20004,
		GLFW_DECORATED = 0x20005;

	/** Input options. */
	public static final int
		GLFW_CURSOR               = 0x33001,
		GLFW_STICKY_KEYS          = 0x33002,
		GLFW_STICKY_MOUSE_BUTTONS = 0x33003;

	/** Cursor state. */
	public static final int
		GLFW_CURSOR_NORMAL   = 0x34001,
		GLFW_CURSOR_HIDDEN   = 0x34002,
		GLFW_CURSOR_DISABLED = 0x34003;

	/** Joystick state. */
	public static final int
		GLFW_PRESENT = 0x50001,
		GLFW_AXES    = 0x50002,
		GLFW_BUTTONS = 0x50003;

	/** Monitor events. */
	public static final int
		GLFW_CONNECTED    = 0x40001,
		GLFW_DISCONNECTED = 0x40002;

	/** PixelFormat hints. */
	public static final int
		GLFW_RED_BITS         = 0x21001,
		GLFW_GREEN_BITS       = 0x21002,
		GLFW_BLUE_BITS        = 0x21003,
		GLFW_ALPHA_BITS       = 0x21004,
		GLFW_DEPTH_BITS       = 0x21005,
		GLFW_STENCIL_BITS     = 0x21006,
		GLFW_ACCUM_RED_BITS   = 0x21007,
		GLFW_ACCUM_GREEN_BITS = 0x21008,
		GLFW_ACCUM_BLUE_BITS  = 0x21009,
		GLFW_ACCUM_ALPHA_BITS = 0x2100A,
		GLFW_AUX_BUFFERS      = 0x2100B,
		GLFW_STEREO           = 0x2100C,
		GLFW_SAMPLES          = 0x2100D,
		GLFW_SRGB_CAPABLE     = 0x2100E,
		GLFW_REFRESH_RATE     = 0x2100F;

	/** Client API hints. */
	public static final int
		GLFW_CLIENT_API            = 0x22001,
		GLFW_CONTEXT_VERSION_MAJOR = 0x22002,
		GLFW_CONTEXT_VERSION_MINOR = 0x22003,
		GLFW_CONTEXT_REVISION      = 0x21004,
		GLFW_CONTEXT_ROBUSTNESS    = 0x22005,
		GLFW_OPENGL_FORWARD_COMPAT = 0x22006,
		GLFW_OPENGL_DEBUG_CONTEXT  = 0x22007,
		GLFW_OPENGL_PROFILE        = 0x22008;

	/** Values for the {@link #GLFW_CLIENT_API CLIENT_API} hint. */
	public static final int
		GLFW_OPENGL_API    = 0x30001,
		GLFW_OPENGL_ES_API = 0x30002;

	/** Values for the {@link #GLFW_CONTEXT_ROBUSTNESS CONTEXT_ROBUSTNESS} hint. */
	public static final int
		GLFW_NO_ROBUSTNESS         = 0x0,
		GLFW_NO_RESET_NOTIFICATION = 0x31001,
		GLFW_LOSE_CONTEXT_ON_RESET = 0x31002;

	/** Values for the {@link #GLFW_OPENGL_PROFILE OPENGL_PROFILE} hint. */
	public static final int
		GLFW_OPENGL_ANY_PROFILE    = 0x0,
		GLFW_OPENGL_CORE_PROFILE   = 0x32001,
		GLFW_OPENGL_COMPAT_PROFILE = 0x32002;

	private GLFW() {}

	// --- [ glfwInit ] ---

	/** JNI method for {@link #glfwInit glfwInit} */
	public static native int nglfwInit();

	/**
	 * Initializes the GLFW library. Before most GLFW functions can be used, GLFW must be initialized, and before a program terminates GLFW should be
	 * terminated in order to free any resources allocated during or after initialization.
	 * <p/>
	 * If this function fails, it calls {@link #glfwSetGammaRamp SetGammaRamp} before returning. If it succeeds, you should call {@link #glfwSetGammaRamp SetGammaRamp} before the program
	 * exits.
	 * <p/>
	 * Additional calls to this function after successful initialization but before termination will succeed but will do nothing.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>This function may take several seconds to complete on some systems, while on other systems it may take only a fraction of a second to complete.</li>
	 * <li><strong>Mac OS X</strong>: This function will change the current directory of the application to the `Contents/Resources` subdirectory of the
	 * application's bundle, if present.</li>
	 * </ul>
	 */
	public static int glfwInit() {
		if ( LWJGLUtil.getPlatform() == LWJGLUtil.Platform.MACOSX ) org.lwjgl.system.macosx.EventLoop.initSharedApplication();
		return nglfwInit();
	}

	// --- [ glfwTerminate ] ---

	/** JNI method for {@link #glfwTerminate glfwTerminate} */
	public static native void nglfwTerminate();

	/**
	 * Destroys all remaining windows, frees any allocated resources and sets the library to an uninitialized state. Once this is called, you must again call
	 * {@link #glfwInit glfwInit} successfully before you will be able to use most GLFW functions.
	 * <p/>
	 * If GLFW has been successfully initialized, this function should be called before the program exits. If initialization fails, there is no need to call
	 * this function, as it is called by {@link #glfwInit glfwInit} before it returns failure.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may be called before {@link #glfwInit glfwInit}.</li>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>No window's context may be current on another thread when this function is called.</li>
	 * </ul>
	 */
	public static void glfwTerminate() {
		WindowCallback.clearAll();
		nglfwTerminate();
	}

	// --- [ glfwGetVersion ] ---

	/** JNI method for {@link #glfwGetVersion glfwGetVersion} */
	public static native void nglfwGetVersion(long major, long minor, long rev);

	/**
	 * Retrieves the major, minor and revision numbers of the GLFW library. It is intended for when you are using GLFW as a shared library and want to ensure
	 * that you are using the minimum required version.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may be called before {@link #glfwInit glfwInit}.</li>
	 * <li>This function may be called from any thread.</li>
	 * </ul>
	 *
	 * @param major major version number
	 * @param minor minor version number
	 * @param rev   revision number
	 */
	public static void glfwGetVersion(ByteBuffer major, ByteBuffer minor, ByteBuffer rev) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(major, 1 << 2);
			checkBuffer(minor, 1 << 2);
			checkBuffer(rev, 1 << 2);
		}
		nglfwGetVersion(memAddress(major), memAddress(minor), memAddress(rev));
	}

	/** Alternative version of: {@link #glfwGetVersion glfwGetVersion} */
	public static void glfwGetVersion(IntBuffer major, IntBuffer minor, IntBuffer rev) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(major, 1);
			checkBuffer(minor, 1);
			checkBuffer(rev, 1);
		}
		nglfwGetVersion(memAddress(major), memAddress(minor), memAddress(rev));
	}

	// --- [ glfwGetVersionString ] ---

	/** JNI method for {@link #glfwGetVersionString glfwGetVersionString} */
	public static native long nglfwGetVersionString();

	/**
	 * Returns a static string generated at compile-time according to which configuration macros were defined. This is intended for use when submitting bug
	 * reports, to allow developers to see which code paths are enabled in a binary.
	 * <p/>
	 * The format of the string is as follows:
	 * <ul>
	 * <li>The version of GLFW</li>
	 * <li>The name of the window system API</li>
	 * <li>The name of the context creation API</li>
	 * <li>Any additional options or APIs</li>
	 * </ul>
	 * <p/>
	 * For example, when compiling GLFW 3.0 with MinGW using the Win32 and WGL backends, the version string may look something like this:
	 * <p/>
	 * 3.0.0 Win32 WGL MinGW
	 */
	public static String glfwGetVersionString() {
		long __result = nglfwGetVersionString();
		return memDecodeUTF8(memByteBufferNT1(__result));
	}

	// --- [ glfwSetErrorCallback ] ---

	/** JNI method for {@link #glfwSetErrorCallback glfwSetErrorCallback} */
	public static native long nglfwSetErrorCallback(long cbfun);

	/**
	 * Sets the error callback, which is called with an error code and a human-readable description each time a GLFW error occurs.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may be called before {@link #glfwInit glfwInit}.</li>
	 * <li>The error callback is called by the thread where the error was generated. If you are using GLFW from multiple threads, your error callback needs to
	 * be written accordingly.</li>
	 * <li>Because the description string provided to the callback may have been generated specifically for that error, it is not guaranteed to be valid after
	 * the callback has returned. If you wish to use it after that, you need to make your own copy of it before returning.</li>
	 * </ul>
	 *
	 * @param cbfun the new callback or {@code NULL} if no callback was set or an error occurred
	 */
	public static long glfwSetErrorCallback(long cbfun) {
		return nglfwSetErrorCallback(cbfun);
	}

	/** Alternative version of: {@link #glfwSetErrorCallback glfwSetErrorCallback} */
	public static long glfwSetErrorCallback(ErrorCallback cbfun) {
		return nglfwSetErrorCallback(ErrorCallback.Util.register(cbfun));
	}

	// --- [ glfwGetMonitors ] ---

	/** JNI method for {@link #glfwGetMonitors glfwGetMonitors} */
	public static native long nglfwGetMonitors(long count);

	/**
	 * Returns an array of handles for all currently connected monitors. The returned array is valid only until the monitor configuration changes.
	 * <p/>
	 * See {@link #glfwSetGammaRamp SetGammaRamp} to receive notifications of configuration changes.
	 */
	public static PointerBuffer glfwGetMonitors() {
		APIBuffer __buffer = apiBuffer();
		int count = __buffer.intParam();
		long __result = nglfwGetMonitors(__buffer.address() + count);
		return memPointerBuffer(__result, __buffer.intValue(count));
	}

	// --- [ glfwGetPrimaryMonitor ] ---

	/** Returns the primary monitor. This is usually the monitor where elements like the Windows task bar or the OS X menu bar is located. */
	public static native long glfwGetPrimaryMonitor();

	// --- [ glfwGetMonitorPos ] ---

	/** JNI method for {@link #glfwGetMonitorPos glfwGetMonitorPos} */
	public static native void nglfwGetMonitorPos(long monitor, long xpos, long ypos);

	/**
	 * Returns the position, in screen coordinates, of the upper-left corner of the specified monitor.
	 *
	 * @param monitor monitor to query
	 * @param xpos    where to store the monitor x-coordinate, or {@code NULL}
	 * @param ypos    where to store the monitor y-coordinate, or {@code NULL}
	 */
	public static void glfwGetMonitorPos(long monitor, ByteBuffer xpos, ByteBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			if ( xpos != null ) checkBuffer(xpos, 1 << 2);
			if ( ypos != null ) checkBuffer(ypos, 1 << 2);
		}
		nglfwGetMonitorPos(monitor, memAddressSafe(xpos), memAddressSafe(ypos));
	}

	/** Alternative version of: {@link #glfwGetMonitorPos glfwGetMonitorPos} */
	public static void glfwGetMonitorPos(long monitor, IntBuffer xpos, IntBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			if ( xpos != null ) checkBuffer(xpos, 1);
			if ( ypos != null ) checkBuffer(ypos, 1);
		}
		nglfwGetMonitorPos(monitor, memAddressSafe(xpos), memAddressSafe(ypos));
	}

	// --- [ glfwGetMonitorPhysicalSize ] ---

	/** JNI method for {@link #glfwGetMonitorPhysicalSize glfwGetMonitorPhysicalSize} */
	public static native void nglfwGetMonitorPhysicalSize(long monitor, long width, long height);

	/**
	 * Returns the size, in millimetres, of the display area of the specified monitor.
	 * <p/>
	 * Note: Some operating systems do not provide accurate information, either because the monitor's EDID data is incorrect, or because the driver does not
	 * report it accurately.
	 *
	 * @param monitor monitor to query
	 * @param width   where to store the width, in mm, of the monitor's display area, or {@code NULL}
	 * @param height  where to store the height, in mm, of the monitor's display area, or {@code NULL}
	 */
	public static void glfwGetMonitorPhysicalSize(long monitor, ByteBuffer width, ByteBuffer height) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			if ( width != null ) checkBuffer(width, 1 << 2);
			if ( height != null ) checkBuffer(height, 1 << 2);
		}
		nglfwGetMonitorPhysicalSize(monitor, memAddressSafe(width), memAddressSafe(height));
	}

	/** Alternative version of: {@link #glfwGetMonitorPhysicalSize glfwGetMonitorPhysicalSize} */
	public static void glfwGetMonitorPhysicalSize(long monitor, IntBuffer width, IntBuffer height) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			if ( width != null ) checkBuffer(width, 1);
			if ( height != null ) checkBuffer(height, 1);
		}
		nglfwGetMonitorPhysicalSize(monitor, memAddressSafe(width), memAddressSafe(height));
	}

	// --- [ glfwGetMonitorName ] ---

	/** JNI method for {@link #glfwGetMonitorName glfwGetMonitorName} */
	public static native long nglfwGetMonitorName(long monitor);

	/**
	 * Returns a human-readable name, encoded as UTF-8, of the specified monitor.
	 *
	 * @param monitor monitor to query
	 */
	public static String glfwGetMonitorName(long monitor) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		long __result = nglfwGetMonitorName(monitor);
		return memDecodeUTF8(memByteBufferNT1(__result));
	}

	// --- [ glfwSetMonitorCallback ] ---

	/** JNI method for {@link #glfwSetMonitorCallback glfwSetMonitorCallback} */
	public static native long nglfwSetMonitorCallback(long cbfun);

	/**
	 * Sets the monitor configuration callback, or removes the currently set callback. This is called when a monitor is connected to or disconnected from the
	 * system.
	 * <p/>
	 * <strong>X11</strong>: This callback is not yet called on monitor configuration changes.
	 *
	 * @param cbfun the new callback, or {@code NULL} if no callback was set or an error occurred
	 */
	public static long glfwSetMonitorCallback(long cbfun) {
		return nglfwSetMonitorCallback(cbfun);
	}

	/** Alternative version of: {@link #glfwSetMonitorCallback glfwSetMonitorCallback} */
	public static long glfwSetMonitorCallback(MonitorCallback cbfun) {
		return nglfwSetMonitorCallback(MonitorCallback.Util.register(cbfun));
	}

	// --- [ glfwGetVideoModes ] ---

	/** JNI method for {@link #glfwGetVideoModes glfwGetVideoModes} */
	public static native long nglfwGetVideoModes(long monitor, long count);

	/**
	 * Returns an array of all video modes supported by the specified monitor.
	 *
	 * @param monitor monitor to query
	 */
	public static ByteBuffer glfwGetVideoModes(long monitor, ByteBuffer count) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			checkBuffer(count, 1 << 2);
		}
		long __result = nglfwGetVideoModes(monitor, memAddress(count));
		return memByteBuffer(__result, count.getInt(count.position()) * GLFWvidmode.SIZEOF);
	}

	/** Alternative version of: {@link #glfwGetVideoModes glfwGetVideoModes} */
	public static ByteBuffer glfwGetVideoModes(long monitor, IntBuffer count) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			checkBuffer(count, 1);
		}
		long __result = nglfwGetVideoModes(monitor, memAddress(count));
		return memByteBuffer(__result, count.get(count.position()) * GLFWvidmode.SIZEOF);
	}

	// --- [ glfwGetVideoMode ] ---

	/** JNI method for {@link #glfwGetVideoMode glfwGetVideoMode} */
	public static native long nglfwGetVideoMode(long monitor);

	/**
	 * Returns the current video mode of the specified monitor. if you are using a full screen window, the return value will therefore depend on whether it is
	 * focused.
	 *
	 * @param monitor monitor to query
	 */
	public static ByteBuffer glfwGetVideoMode(long monitor) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		long __result = nglfwGetVideoMode(monitor);
		return memByteBuffer(__result, GLFWvidmode.SIZEOF);
	}

	// --- [ glfwSetGamma ] ---

	/** JNI method for {@link #glfwSetGamma glfwSetGamma} */
	public static native void nglfwSetGamma(long monitor, float gamma);

	/**
	 * Generates a 256-element gamma ramp from the specified exponent and then calls {@link #glfwSetGammaRamp SetGammaRamp} with it.
	 *
	 * @param monitor monitor whose gamma ramp to set
	 * @param gamma   desired exponent
	 */
	public static void glfwSetGamma(long monitor, float gamma) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		nglfwSetGamma(monitor, gamma);
	}

	// --- [ glfwGetGammaRamp ] ---

	/** JNI method for {@link #glfwGetGammaRamp glfwGetGammaRamp} */
	public static native long nglfwGetGammaRamp(long monitor);

	/**
	 * Retrieves the current gamma ramp of the specified monitor.
	 *
	 * @param monitor the monitor to query
	 */
	public static ByteBuffer glfwGetGammaRamp(long monitor) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		long __result = nglfwGetGammaRamp(monitor);
		return memByteBuffer(__result, GLFWgammaramp.SIZEOF);
	}

	// --- [ glfwSetGammaRamp ] ---

	/** JNI method for {@link #glfwSetGammaRamp glfwSetGammaRamp} */
	public static native void nglfwSetGammaRamp(long monitor, long ramp);

	/**
	 * Sets the current gamma ramp for the specified monitor.
	 * <p/>
	 * Note: Gamma ramp sizes other than 256 are not supported by all hardware.
	 *
	 * @param monitor the monitor whose gamma ramp to set
	 * @param ramp    the gamma ramp to use
	 */
	public static void glfwSetGammaRamp(long monitor, ByteBuffer ramp) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			checkBuffer(ramp, GLFWgammaramp.SIZEOF);
		}
		nglfwSetGammaRamp(monitor, memAddress(ramp));
	}

	// --- [ glfwDefaultWindowHints ] ---

	/**
	 * Resets all window hints to their default values.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 */
	public static native void glfwDefaultWindowHints();

	// --- [ glfwWindowHint ] ---

	/**
	 * Sets hints for the next call to {@link #glfwCreateWindow CreateWindow}. The hints, once set, retain their values until changed by a call to glfwWindowHint or
	 * {@link #glfwDefaultWindowHints DefaultWindowHints}, or until the library is terminated with {@link #glfwTerminate Terminate}.
	 * <p/>
	 * Some window hints are hard constraints. These must match the available capabilities <em>exactly</em> for window creation to succeed. Hints that are not
	 * hard constraints are matched as closely as possible, but the resulting window may differ from what these hints requested. To find out the actual
	 * parameters of the created window, use the {@link #glfwGetWindowAttrib GetWindowAttrib} function.
	 * <p/>
	 * Hints that do not apply to a given type of window are ignored.
	 * <p/>
	 * Window hints:
	 * <p/>
	 * The {@link #GLFW_RESIZABLE RESIZABLE} hint specifies whether the window will be resizable by the user. The window will still be resizable using the
	 * {@link #glfwSetWindowSize SetWindowSize} function. This hint is ignored for fullscreen windows.
	 * <p/>
	 * The {@link #GLFW_VISIBLE VISIBLE} hint specifies whether the window will be initially visible. This hint is ignored for fullscreen windows.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 *
	 * @param target The window hint to set
	 * @param hint   new value of the window hint
	 */
	public static native void glfwWindowHint(int target, int hint);

	// --- [ glfwCreateWindow ] ---

	/** JNI method for {@link #glfwCreateWindow glfwCreateWindow} */
	public static native long nglfwCreateWindow(int width, int height, long title, long monitor, long share);

	/**
	 * Creates a window. Most of the options controlling how the window should be created are specified through {@link #glfwWindowHint glfwWindowHint}.
	 * <p/>
	 * Note that the actual properties of the window may differ from what you requested, as not all parameters and hints are hard constraints.
	 * <p/>
	 * To create a full screen window, you need to specify the monitor to use. If no monitor is specified, windowed mode will be used. Unless you have a way
	 * for the user to choose a specific monitor, it is recommended that you pick the primary monitor.
	 * <p/>
	 * To create the window at a specific position, make it initially invisible using the {@link #GLFW_VISIBLE VISIBLE} window hint, set its position and then show it.
	 * <p/>
	 * If a full screen window is active, the screensaver is prohibited from starting.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 *
	 * @param width   desired width, in pixels, of the window
	 * @param height  desired height, in pixels, of the window
	 * @param title   initial, UTF-8 encoded window title
	 * @param monitor monitor to use for fullscreen mode, or {@code NULL} to use windowed mode
	 * @param share   window whose context to share resources with, or {@code NULL} to not share resources
	 */
	public static long glfwCreateWindow(int width, int height, ByteBuffer title, long monitor, long share) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(title);
		long __result = nglfwCreateWindow(width, height, memAddress(title), monitor, share);
		if ( __result != NULL && LWJGLUtil.getPlatform() == LWJGLUtil.Platform.MACOSX )
			WindowCallback.set(__result, new WindowCallbackAdapter());
		return __result;
	}

	/** CharSequence version of: {@link #glfwCreateWindow glfwCreateWindow} */
	public static long glfwCreateWindow(int width, int height, CharSequence title, long monitor, long share) {
		long __result = nglfwCreateWindow(width, height, memAddress(memEncodeUTF8(title)), monitor, share);
		if ( __result != NULL && LWJGLUtil.getPlatform() == LWJGLUtil.Platform.MACOSX )
			WindowCallback.set(__result, new WindowCallbackAdapter());
		return __result;
	}

	// --- [ glfwDestroyWindow ] ---

	/** JNI method for {@link #glfwDestroyWindow glfwDestroyWindow} */
	public static native void nglfwDestroyWindow(long window);

	/**
	 * Destroys the specified window. On calling this function, no further callbacks will be called for that window.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>This function may not be called from a callback.</li>
	 * </ul>
	 *
	 * @param window window to destroy
	 */
	public static void glfwDestroyWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		WindowCallback.set(window, null);
		nglfwDestroyWindow(window);
	}

	// --- [ glfwWindowShouldClose ] ---

	/** JNI method for {@link #glfwWindowShouldClose glfwWindowShouldClose} */
	public static native int nglfwWindowShouldClose(long window);

	/**
	 * Returns the value of the close flag of the specified window.
	 * <p/>
	 * Note: This function may be called from secondary threads.
	 *
	 * @param window window to query
	 */
	public static int glfwWindowShouldClose(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwWindowShouldClose(window);
	}

	// --- [ glfwSetWindowShouldClose ] ---

	/** JNI method for {@link #glfwSetWindowShouldClose glfwSetWindowShouldClose} */
	public static native void nglfwSetWindowShouldClose(long window, int value);

	/**
	 * Sets the value of the close flag of the specified window. This can be used to override the user's attempt to close the window, or to signal that it
	 * should be closed.
	 * <p/>
	 * Note: This function may be called from secondary threads.
	 *
	 * @param window window whose flag to change
	 * @param value  new value
	 */
	public static void glfwSetWindowShouldClose(long window, int value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowShouldClose(window, value);
	}

	// --- [ glfwSetWindowTitle ] ---

	/** JNI method for {@link #glfwSetWindowTitle glfwSetWindowTitle} */
	public static native void nglfwSetWindowTitle(long window, long title);

	/**
	 * Sets the window title, encoded as UTF-8, of the specified window.
	 *
	 * @param window window whose title to change
	 * @param title  UTF-8 encoded window title
	 */
	public static void glfwSetWindowTitle(long window, ByteBuffer title) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkNT1(title);
		}
		nglfwSetWindowTitle(window, memAddress(title));
	}

	/** CharSequence version of: {@link #glfwSetWindowTitle glfwSetWindowTitle} */
	public static void glfwSetWindowTitle(long window, CharSequence title) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowTitle(window, memAddress(memEncodeUTF8(title)));
	}

	// --- [ glfwGetWindowPos ] ---

	/** JNI method for {@link #glfwGetWindowPos glfwGetWindowPos} */
	public static native void nglfwGetWindowPos(long window, long xpos, long ypos);

	/**
	 * Retrieves the position, in screen coordinates, of the upper-left corner of the client area of the specified window.
	 *
	 * @param window window to query
	 * @param xpos   where to store the x-coordinate of the upper-left corner of the client area, or {@code NULL}
	 * @param ypos   where to store the y-coordinate of the upper-left corner of the client area, or {@code NULL}
	 */
	public static void glfwGetWindowPos(long window, ByteBuffer xpos, ByteBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			if ( xpos != null ) checkBuffer(xpos, 1 << 2);
			if ( ypos != null ) checkBuffer(ypos, 1 << 2);
		}
		nglfwGetWindowPos(window, memAddressSafe(xpos), memAddressSafe(ypos));
	}

	/** Alternative version of: {@link #glfwGetWindowPos glfwGetWindowPos} */
	public static void glfwGetWindowPos(long window, IntBuffer xpos, IntBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			if ( xpos != null ) checkBuffer(xpos, 1);
			if ( ypos != null ) checkBuffer(ypos, 1);
		}
		nglfwGetWindowPos(window, memAddressSafe(xpos), memAddressSafe(ypos));
	}

	// --- [ glfwSetWindowPos ] ---

	/** JNI method for {@link #glfwSetWindowPos glfwSetWindowPos} */
	public static native void nglfwSetWindowPos(long window, int xpos, int ypos);

	/**
	 * Sets the position, in screen coordinates, of the upper-left corner of the client area of the window.
	 * <p/>
	 * If the specified window is a full screen window, this function does nothing.
	 * <p/>
	 * If you wish to set an initial window position you should create a hidden window (using {@link #glfwWindowHint glfwWindowHint} and {@link #GLFW_VISIBLE VISIBLE}, set its
	 * position and then show it.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>It is very rarely a good idea to move an already visible window, as it will confuse and annoy the user.</li>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>The window manager may put limits on what positions are allowed.</li>
	 * <li><strong>X11</strong>: Some window managers ignore the set position of hidden (i.e. unmapped) windows, instead placing them where it thinks is
	 * appropriate once they are shown.</li>
	 * </ul>
	 *
	 * @param window window to query
	 * @param xpos   x-coordinate of the upper-left corner of the client area
	 * @param ypos   y-coordinate of the upper-left corner of the client area
	 */
	public static void glfwSetWindowPos(long window, int xpos, int ypos) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowPos(window, xpos, ypos);
	}

	// --- [ glfwGetWindowSize ] ---

	/** JNI method for {@link #glfwGetWindowSize glfwGetWindowSize} */
	public static native void nglfwGetWindowSize(long window, long width, long height);

	/**
	 * Retrieves the size, in screen coordinates, of the client area of the specified window.
	 *
	 * @param window window whose size to retrieve
	 * @param width  where to store the width, in screen coordinates, of the client area, or {@code NULL}
	 * @param height where to store the height, in screen coordinates, of the client area, or {@code NULL}
	 */
	public static void glfwGetWindowSize(long window, ByteBuffer width, ByteBuffer height) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			if ( width != null ) checkBuffer(width, 1 << 2);
			if ( height != null ) checkBuffer(height, 1 << 2);
		}
		nglfwGetWindowSize(window, memAddressSafe(width), memAddressSafe(height));
	}

	/** Alternative version of: {@link #glfwGetWindowSize glfwGetWindowSize} */
	public static void glfwGetWindowSize(long window, IntBuffer width, IntBuffer height) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			if ( width != null ) checkBuffer(width, 1);
			if ( height != null ) checkBuffer(height, 1);
		}
		nglfwGetWindowSize(window, memAddressSafe(width), memAddressSafe(height));
	}

	// --- [ glfwSetWindowSize ] ---

	/** JNI method for {@link #glfwSetWindowSize glfwSetWindowSize} */
	public static native void nglfwSetWindowSize(long window, int width, int height);

	/**
	 * Sets the size, in pixels, of the client area of the specified window.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>The window manager may put limits on what window sizes are allowed.</li>
	 * <li>For fullscreen windows, this function selects and switches to the resolution closest to the specified size, without destroying the window's context.</li>
	 * </ul>
	 *
	 * @param window window to resize
	 * @param width  desired width of the specified window
	 * @param height desired height of the specified window
	 */
	public static void glfwSetWindowSize(long window, int width, int height) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowSize(window, width, height);
	}

	// --- [ glfwGetFramebufferSize ] ---

	/** JNI method for {@link #glfwGetFramebufferSize glfwGetFramebufferSize} */
	public static native void nglfwGetFramebufferSize(long window, long width, long height);

	/**
	 * Retrieves the size, in pixels, of the framebuffer of the specified window.
	 *
	 * @param window the window whose framebuffer to query
	 * @param width  where to store the width, in pixels, of the framebuffer, or {@code NULL}
	 * @param height where to store the height, in pixels, of the framebuffer, or {@code NULL}
	 */
	public static void glfwGetFramebufferSize(long window, ByteBuffer width, ByteBuffer height) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			if ( width != null ) checkBuffer(width, 1 << 2);
			if ( height != null ) checkBuffer(height, 1 << 2);
		}
		nglfwGetFramebufferSize(window, memAddressSafe(width), memAddressSafe(height));
	}

	/** Alternative version of: {@link #glfwGetFramebufferSize glfwGetFramebufferSize} */
	public static void glfwGetFramebufferSize(long window, IntBuffer width, IntBuffer height) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			if ( width != null ) checkBuffer(width, 1);
			if ( height != null ) checkBuffer(height, 1);
		}
		nglfwGetFramebufferSize(window, memAddressSafe(width), memAddressSafe(height));
	}

	// --- [ glfwIconifyWindow ] ---

	/** JNI method for {@link #glfwIconifyWindow glfwIconifyWindow} */
	public static native void nglfwIconifyWindow(long window);

	/**
	 * Iconifies/minimizes the specified window, if it was previously restored. If it is a fullscreen window, the original monitor resolution is restored
	 * until the window is restored. If the window is already iconified, this function does nothing.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 *
	 * @param window window to iconify
	 */
	public static void glfwIconifyWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwIconifyWindow(window);
	}

	// --- [ glfwRestoreWindow ] ---

	/** JNI method for {@link #glfwRestoreWindow glfwRestoreWindow} */
	public static native void nglfwRestoreWindow(long window);

	/**
	 * Restores the specified window, if it was previously iconified/minimized. If the window is already restored, this function does nothing.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 *
	 * @param window window to restore
	 */
	public static void glfwRestoreWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwRestoreWindow(window);
	}

	// --- [ glfwShowWindow ] ---

	/** JNI method for {@link #glfwShowWindow glfwShowWindow} */
	public static native void nglfwShowWindow(long window);

	/**
	 * Makes the specified window visible, if it was previously hidden. If the window is already visible or is in fullscreen mode, this function does nothing.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 *
	 * @param window window to make visible
	 */
	public static void glfwShowWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwShowWindow(window);
	}

	// --- [ glfwHideWindow ] ---

	/** JNI method for {@link #glfwHideWindow glfwHideWindow} */
	public static native void nglfwHideWindow(long window);

	/**
	 * Hides the specified window, if it was previously visible. If the window is already hidden or is in fullscreen mode, this function does nothing.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 *
	 * @param window window to hide
	 */
	public static void glfwHideWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwHideWindow(window);
	}

	// --- [ glfwGetWindowMonitor ] ---

	/** JNI method for {@link #glfwGetWindowMonitor glfwGetWindowMonitor} */
	public static native long nglfwGetWindowMonitor(long window);

	/**
	 * Returns the handle of the monitor that the specified window is in fullscreen on.
	 *
	 * @param window window to query
	 */
	public static long glfwGetWindowMonitor(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetWindowMonitor(window);
	}

	// --- [ glfwGetWindowAttrib ] ---

	/** JNI method for {@link #glfwGetWindowAttrib glfwGetWindowAttrib} */
	public static native int nglfwGetWindowAttrib(long window, int attrib);

	/**
	 * Returns an attribute of the specified window.
	 * <ul>
	 * <li>The {@link #GLFW_FOCUSED FOCUSED} attribute indicates whether the window is focused.</li>
	 * <li>The {@link #GLFW_ICONIFIED ICONIFIED} attribute indicates whether the window is iconified.</li>
	 * <li>The {@link #GLFW_VISIBLE VISIBLE} attribute indicates whether the window is visible.</li>
	 * <li>The {@link #GLFW_RESIZABLE RESIZABLE} attribute indicates whether the window is resizable by the user.</li>
	 * <li>The {@link #GLFW_DECORATED DECORATED} attribute indicates whether the window is decorated.</li>
	 * </ul>
	 *
	 * @param window window to query
	 * @param attrib parameter whose value to return
	 */
	public static int glfwGetWindowAttrib(long window, int attrib) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetWindowAttrib(window, attrib);
	}

	// --- [ glfwSetWindowUserPointer ] ---

	/** JNI method for {@link #glfwSetWindowUserPointer glfwSetWindowUserPointer} */
	public static native void nglfwSetWindowUserPointer(long window, long pointer);

	/**
	 * Sets the user-defined pointer of the specified window. The current value is retained until the window is destroyed. The initial value is {@code NULL}.
	 *
	 * @param window  window whose pointer to set
	 * @param pointer new value
	 */
	public static void glfwSetWindowUserPointer(long window, long pointer) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowUserPointer(window, pointer);
	}

	// --- [ glfwGetWindowUserPointer ] ---

	/** JNI method for {@link #glfwGetWindowUserPointer glfwGetWindowUserPointer} */
	public static native long nglfwGetWindowUserPointer(long window);

	/**
	 * Returns the current value of the user-defined pointer of the specified window. The initial value is {@code NULL}.
	 *
	 * @param window window whose pointer to return
	 */
	public static long glfwGetWindowUserPointer(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetWindowUserPointer(window);
	}

	// --- [ glfwSetWindowPosCallback ] ---

	/** JNI method for {@link #glfwSetWindowPosCallback glfwSetWindowPosCallback} */
	public static native long nglfwSetWindowPosCallback(long window, long cbfun);

	/**
	 * Sets the position callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, java.util.EnumSet) WindowCallback.set}.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} if no callback was set or an error occurred
	 */
	public static long glfwSetWindowPosCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwSetWindowPosCallback(window, cbfun);
	}

	// --- [ glfwSetWindowSizeCallback ] ---

	/** JNI method for {@link #glfwSetWindowSizeCallback glfwSetWindowSizeCallback} */
	public static native long nglfwSetWindowSizeCallback(long window, long cbfun);

	/**
	 * Sets the size callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, java.util.EnumSet) WindowCallback.set}.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} if no callback was set or an error occurred
	 */
	public static long glfwSetWindowSizeCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwSetWindowSizeCallback(window, cbfun);
	}

	// --- [ glfwSetWindowCloseCallback ] ---

	/** JNI method for {@link #glfwSetWindowCloseCallback glfwSetWindowCloseCallback} */
	public static native long nglfwSetWindowCloseCallback(long window, long cbfun);

	/**
	 * Sets the close callback of the specified window, which is called when the user attempts to close the window, for example by clicking the close widget in
	 * the title bar. See {@link WindowCallback#set(long, WindowCallback, java.util.EnumSet) WindowCallback.set}.
	 * <p/>
	 * The close flag is set before this callback is called, but you can modify it at any time with {@link #glfwSetWindowShouldClose SetWindowShouldClose}.
	 * <p/>
	 * The close callback is not triggered by {@link #glfwDestroyWindow glfwDestroyWindow}.
	 * <p/>
	 * <b>Mac OS X:</b> Selecting Quit from the application menu will trigger the close callback for all windows.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} if no callback was set or an error occurred
	 */
	public static long glfwSetWindowCloseCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwSetWindowCloseCallback(window, cbfun);
	}

	// --- [ glfwSetWindowRefreshCallback ] ---

	/** JNI method for {@link #glfwSetWindowRefreshCallback glfwSetWindowRefreshCallback} */
	public static native long nglfwSetWindowRefreshCallback(long window, long cbfun);

	/**
	 * Sets the refresh callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, java.util.EnumSet) WindowCallback.set}.
	 * <p/>
	 * This callback is called when the client area of the window needs to be redrawn, for example if the window has been exposed after having been covered by
	 * another window.
	 * <p/>
	 * On compositing window systems such as Aero, Compiz or Aqua, where the window contents are saved off-screen, this callback may be called only very
	 * infrequently or never at all.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} if no callback was set or an error occurred
	 */
	public static long glfwSetWindowRefreshCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwSetWindowRefreshCallback(window, cbfun);
	}

	// --- [ glfwSetWindowFocusCallback ] ---

	/** JNI method for {@link #glfwSetWindowFocusCallback glfwSetWindowFocusCallback} */
	public static native long nglfwSetWindowFocusCallback(long window, long cbfun);

	/**
	 * Sets the focus callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, java.util.EnumSet) WindowCallback.set}.
	 * <p/>
	 * This callback is called when the window gains or loses focus.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} if no callback was set or an error occurred
	 */
	public static long glfwSetWindowFocusCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwSetWindowFocusCallback(window, cbfun);
	}

	// --- [ glfwSetWindowIconifyCallback ] ---

	/** JNI method for {@link #glfwSetWindowIconifyCallback glfwSetWindowIconifyCallback} */
	public static native long nglfwSetWindowIconifyCallback(long window, long cbfun);

	/**
	 * Sets the iconify callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, java.util.EnumSet) WindowCallback.set}.
	 * <p/>
	 * This callback is called when the window is iconified or restored.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} if no callback was set or an error occurred
	 */
	public static long glfwSetWindowIconifyCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwSetWindowIconifyCallback(window, cbfun);
	}

	// --- [ glfwSetFramebufferSizeCallback ] ---

	/** JNI method for {@link #glfwSetFramebufferSizeCallback glfwSetFramebufferSizeCallback} */
	public static native long nglfwSetFramebufferSizeCallback(long window, long cbfun);

	/**
	 * Sets the framebuffer resize callback of the specified window, which is called when the framebuffer of the specified window is resized.
	 * <p/>
	 * See {@link WindowCallback#set(long, WindowCallback, java.util.EnumSet) WindowCallback.set}
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} if no callback was set or an error occurred
	 */
	public static long glfwSetFramebufferSizeCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwSetFramebufferSizeCallback(window, cbfun);
	}

	// --- [ glfwPollEvents ] ---

	/** JNI method for {@link #glfwPollEvents glfwPollEvents} */
	public static native void nglfwPollEvents();

	/**
	 * Processes only those events that have already been received and then returns immediately. Processing events will cause the window and input callbacks
	 * associated with those events to be called.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function is not required for joystick input to work.</li>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>This function may not be called from a callback.</li>
	 * <li>On some platforms, certain callbacks may be called outside of a call to one of the event processing functions.</li>
	 * </ul>
	 */
	public static void glfwPollEvents() {
		if ( LWJGLUtil.getPlatform() == LWJGLUtil.Platform.MACOSX ) { WindowCallbackMacOSX.pollEvents(); return; }
		nglfwPollEvents();
	}

	// --- [ glfwWaitEvents ] ---

	/** JNI method for {@link #glfwWaitEvents glfwWaitEvents} */
	public static native void nglfwWaitEvents();

	/**
	 * Puts the calling thread to sleep until at least one event has been received. Once one or more events have been received, it behaves as if {@link #glfwPollEvents glfwPollEvents}
	 * was called, i.e. the events are processed and the function then returns immediately. Processing events will cause the window and input callbacks
	 * associated with those events to be called.
	 * <p/>
	 * Since not all events are associated with callbacks, this function may return without a callback having been called even if you are monitoring all
	 * callbacks.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function is not required for joystick input to work.</li>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>This function may not be called from a callback.</li>
	 * <li>On some platforms, certain callbacks may be called outside of a call to one of the event processing functions.</li>
	 * </ul>
	 */
	public static void glfwWaitEvents() {
		if ( LWJGLUtil.getPlatform() == LWJGLUtil.Platform.MACOSX ) { WindowCallbackMacOSX.waitEvents(); return; }
		nglfwWaitEvents();
	}

	// --- [ glfwGetInputMode ] ---

	/** JNI method for {@link #glfwGetInputMode glfwGetInputMode} */
	public static native int nglfwGetInputMode(long window, int mode);

	/**
	 * Returns the value of an input option for the specified window
	 *
	 * @param window window to query
	 * @param mode   One of {@link #GLFW_CURSOR CURSOR}, {@link #GLFW_STICKY_KEYS STICKY_KEYS} or {@link #GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS}
	 */
	public static int glfwGetInputMode(long window, int mode) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetInputMode(window, mode);
	}

	// --- [ glfwSetInputMode ] ---

	/** JNI method for {@link #glfwSetInputMode glfwSetInputMode} */
	public static native void nglfwSetInputMode(long window, int mode, int value);

	/**
	 * Sets an input option for the specified window
	 * <p/>
	 * If mode is {@link #GLFW_CURSOR CURSOR}, the value must be one of the supported input modes:
	 * <ul>
	 * <li>{@link #GLFW_CURSOR_NORMAL CURSOR_NORMAL} makes the cursor visible and behaving normally.</li>
	 * <li>{@link #GLFW_CURSOR_HIDDEN CURSOR_HIDDEN} makes the cursor invisible when it is over the client area of the window.</li>
	 * <li>{@link #GLFW_CURSOR_DISABLED CURSOR_DISABLED} disables the cursor and removes any limitations on cursor movement.</li>
	 * </ul>
	 * <p/>
	 * If mode is {@link #GLFW_STICKY_KEYS STICKY_KEYS}, the value must be either {@link GL11#GL_TRUE TRUE} to enable sticky keys, or {@link GL11#GL_FALSE FALSE} to disable it. If
	 * sticky keys are enabled, a key press will ensure that {@link #glfwGetKey GetKey} returns {@link #GLFW_PRESS PRESS} the next time it is called even if the key had
	 * been released before the call.
	 * <p/>
	 * If mode is {@link #GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS}, the value must be either {@link GL11#GL_TRUE TRUE} to enable sticky mouse buttons, or {@link GL11#GL_FALSE FALSE} to
	 * disable it. If sticky mouse buttons are enabled, a mouse button press will ensure that {@link #glfwGetMouseButton GetMouseButton} returns {@link #GLFW_PRESS PRESS} the next
	 * time it is called even if the mouse button had been released before the call. This is useful when you are only interested in whether mouse buttons have
	 * been pressed but not when or in which order.
	 *
	 * @param window window whose input mode to set
	 * @param mode   One of {@link #GLFW_CURSOR CURSOR}, {@link #GLFW_STICKY_KEYS STICKY_KEYS} or {@link #GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS}
	 * @param value  new value of the specified input mode
	 */
	public static void glfwSetInputMode(long window, int mode, int value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetInputMode(window, mode, value);
	}

	// --- [ glfwGetKey ] ---

	/** JNI method for {@link #glfwGetKey glfwGetKey} */
	public static native int nglfwGetKey(long window, int key);

	/**
	 * Returns the last state reported for the specified key to the specified window. The returned state is one of {@link #GLFW_PRESS PRESS} or
	 * {@link #GLFW_RELEASE RELEASE}. The higher-level state {@link #GLFW_REPEAT REPEAT} is only reported to the key callback.
	 * <p/>
	 * If the {@link #GLFW_STICKY_KEYS STICKY_KEYS} input mode is enabled, this function returns {@link #GLFW_PRESS PRESS} the first time you call this function after a key has
	 * been pressed, even if the key has already been released.
	 * <p/>
	 * The key functions deal with physical keys, with tokens named after their use on the standard US keyboard layout. If you want to input text, use the
	 * Unicode character callback instead.
	 * <p/>
	 * Note: {@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN} is not a valid key for this function.
	 *
	 * @param window desired window
	 * @param key    desired keyboard key
	 */
	public static int glfwGetKey(long window, int key) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetKey(window, key);
	}

	// --- [ glfwGetMouseButton ] ---

	/** JNI method for {@link #glfwGetMouseButton glfwGetMouseButton} */
	public static native int nglfwGetMouseButton(long window, int button);

	/**
	 * Returns the last state reported for the specified mouse button to the specified window.
	 * <p/>
	 * If the {@link #GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS} input mode is enabled, this function
	 * returns {@link #GLFW_PRESS PRESS} the first time you call this function after a mouse
	 * button has been pressed, even if the mouse button has already been released.
	 *
	 * @param window desired window
	 * @param button desired mouse button
	 */
	public static int glfwGetMouseButton(long window, int button) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetMouseButton(window, button);
	}

	// --- [ glfwGetCursorPos ] ---

	/** JNI method for {@link #glfwGetCursorPos glfwGetCursorPos} */
	public static native void nglfwGetCursorPos(long window, long xpos, long ypos);

	/**
	 * Returns the last reported position of the cursor to the specified window.
	 * <p/>
	 * If the cursor is disabled (with {@link #GLFW_CURSOR_DISABLED CURSOR_DISABLED}) then the cursor position is unbounded and limited only by the minimum and maximum values
	 * of a <strong>double</strong>.
	 * <p/>
	 * The coordinate can be converted to their integer equivalents with the {@link Math#floor} function. Casting directly to an integer type works for
	 * positive coordinates, but fails for negative ones.
	 *
	 * @param window desired window
	 * @param xpos   where to store the cursor x-coordinate, relative to the left edge of the client area, or {@code NULL}
	 * @param ypos   where to store the cursor y-coordinate, relative to the to top edge of the client area, or {@code NULL}.
	 */
	public static void glfwGetCursorPos(long window, ByteBuffer xpos, ByteBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			if ( xpos != null ) checkBuffer(xpos, 1 << 3);
			if ( ypos != null ) checkBuffer(ypos, 1 << 3);
		}
		nglfwGetCursorPos(window, memAddressSafe(xpos), memAddressSafe(ypos));
	}

	/** Alternative version of: {@link #glfwGetCursorPos glfwGetCursorPos} */
	public static void glfwGetCursorPos(long window, DoubleBuffer xpos, DoubleBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			if ( xpos != null ) checkBuffer(xpos, 1);
			if ( ypos != null ) checkBuffer(ypos, 1);
		}
		nglfwGetCursorPos(window, memAddressSafe(xpos), memAddressSafe(ypos));
	}

	// --- [ glfwSetCursorPos ] ---

	/** JNI method for {@link #glfwSetCursorPos glfwSetCursorPos} */
	public static native void nglfwSetCursorPos(long window, double xpos, double ypos);

	/**
	 * Sets the position of the cursor. The specified window must be focused. If the window does not have focus when this function is called, it fails
	 * silently.
	 * <p/>
	 * If the cursor is disabled (with {@link #GLFW_CURSOR_DISABLED CURSOR_DISABLED}) then the cursor position is unbounded and limited only by the minimum and maximum values
	 * of a <strong>double</strong>.
	 *
	 * @param window desired window
	 * @param xpos   desired x-coordinate, relative to the left edge of the client area
	 * @param ypos   desired y-coordinate, relative to the top edge of the client area
	 */
	public static void glfwSetCursorPos(long window, double xpos, double ypos) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetCursorPos(window, xpos, ypos);
	}

	// --- [ glfwSetKeyCallback ] ---

	/** JNI method for {@link #glfwSetKeyCallback glfwSetKeyCallback} */
	public static native long nglfwSetKeyCallback(long window, long cbfun);

	/**
	 * Sets the key callback. See {@link WindowCallback#set(long, WindowCallback, java.util.EnumSet) WindowCallback.set}.
	 * <p/>
	 * The key callback deals with physical keys, with key tokens named after their use on the standard US keyboard layout. If you want to input text, use the
	 * Unicode character callback instead.
	 * <p/>
	 * When a window loses focus, it will generate synthetic key release events for all pressed keys. You can tell these events from user-generated events by
	 * the fact that the synthetic ones are generated after the window has lost focus, i.e. {@link #GLFW_FOCUSED FOCUSED} will be false and the focus callback will
	 * have already been called.
	 * <p/>
	 * The scancode of a key is specific to that platform or sometimes even to that machine. Scancodes are intended to allow users to bind keys that don't have
	 * a GLFW key token. Such keys have {@code key} set to {@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN}, their state is not saved and so it cannot be retrieved with
	 * {@link #glfwGetKey GetKey}.
	 * <p/>
	 * Sometimes GLFW needs to generate synthetic key events, in which case the scancode may be zero.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} if no callback was set or an error occurred
	 */
	public static long glfwSetKeyCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwSetKeyCallback(window, cbfun);
	}

	// --- [ glfwSetCharCallback ] ---

	/** JNI method for {@link #glfwSetCharCallback glfwSetCharCallback} */
	public static native long nglfwSetCharCallback(long window, long cbfun);

	/**
	 * Sets the Unicode character callback. See {@link WindowCallback#set(long, WindowCallback, java.util.EnumSet) WindowCallback.set}.
	 * <p/>
	 * The Unicode character callback is for text input. If you want to know whether a specific key was pressed or released, use the key callback.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} if no callback was set or an error occurred
	 */
	public static long glfwSetCharCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwSetCharCallback(window, cbfun);
	}

	// --- [ glfwSetMouseButtonCallback ] ---

	/** JNI method for {@link #glfwSetMouseButtonCallback glfwSetMouseButtonCallback} */
	public static native long nglfwSetMouseButtonCallback(long window, long cbfun);

	/**
	 * Sets the mouse button callback. See {@link WindowCallback#set(long, WindowCallback, java.util.EnumSet) WindowCallback.set}.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} if no callback was set or an error occurred
	 */
	public static long glfwSetMouseButtonCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwSetMouseButtonCallback(window, cbfun);
	}

	// --- [ glfwSetCursorPosCallback ] ---

	/** JNI method for {@link #glfwSetCursorPosCallback glfwSetCursorPosCallback} */
	public static native long nglfwSetCursorPosCallback(long window, long cbfun);

	/**
	 * Sets the cursor position callback. See {@link WindowCallback#set(long, WindowCallback, java.util.EnumSet) WindowCallback.set}.
	 * <p/>
	 * The position is relative to the upper-left corner of the client area of the window.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} if no callback was set or an error occurred
	 */
	public static long glfwSetCursorPosCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwSetCursorPosCallback(window, cbfun);
	}

	// --- [ glfwSetCursorEnterCallback ] ---

	/** JNI method for {@link #glfwSetCursorEnterCallback glfwSetCursorEnterCallback} */
	public static native long nglfwSetCursorEnterCallback(long window, long cbfun);

	/**
	 * Sets the cursor enter/exit callback. See {@link WindowCallback#set(long, WindowCallback, java.util.EnumSet) WindowCallback.set}.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} if no callback was set or an error occurred
	 */
	public static long glfwSetCursorEnterCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwSetCursorEnterCallback(window, cbfun);
	}

	// --- [ glfwSetScrollCallback ] ---

	/** JNI method for {@link #glfwSetScrollCallback glfwSetScrollCallback} */
	public static native long nglfwSetScrollCallback(long window, long cbfun);

	/**
	 * Sets the scroll callback. See {@link WindowCallback#set(long, WindowCallback, java.util.EnumSet) WindowCallback.set}.
	 * <p/>
	 * This receives all scrolling input, like that from a mouse wheel or a touchpad scrolling area.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} if no callback was set or an error occurred
	 */
	public static long glfwSetScrollCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwSetScrollCallback(window, cbfun);
	}

	// --- [ glfwJoystickPresent ] ---

	/**
	 * Returns whether the specified joystick is present.
	 *
	 * @param joy joystick to query
	 */
	public static native int glfwJoystickPresent(int joy);

	// --- [ glfwGetJoystickAxes ] ---

	/** JNI method for {@link #glfwGetJoystickAxes glfwGetJoystickAxes} */
	public static native long nglfwGetJoystickAxes(int joy, long count);

	/**
	 * Returns the values of all axes of the specified joystick.
	 * <p/>
	 * Note: The returned array is valid only until the next call to glfwGetJoystickAxes for that joystick.
	 *
	 * @param joy joystick to query
	 */
	public static FloatBuffer glfwGetJoystickAxes(int joy) {
		APIBuffer __buffer = apiBuffer();
		int count = __buffer.intParam();
		long __result = nglfwGetJoystickAxes(joy, __buffer.address() + count);
		return memFloatBuffer(__result, __buffer.intValue(count));
	}

	// --- [ glfwGetJoystickButtons ] ---

	/** JNI method for {@link #glfwGetJoystickButtons glfwGetJoystickButtons} */
	public static native long nglfwGetJoystickButtons(int joy, long count);

	/**
	 * Returns the state of all buttons of the specified joystick.
	 * <p/>
	 * Note: The returned array is valid only until the next call to glfwGetJoystickButtons for that joystick.
	 *
	 * @param joy joystick to query
	 */
	public static ByteBuffer glfwGetJoystickButtons(int joy) {
		APIBuffer __buffer = apiBuffer();
		int count = __buffer.intParam();
		long __result = nglfwGetJoystickButtons(joy, __buffer.address() + count);
		return memByteBuffer(__result, __buffer.intValue(count));
	}

	// --- [ glfwGetJoystickName ] ---

	/** JNI method for {@link #glfwGetJoystickName glfwGetJoystickName} */
	public static native long nglfwGetJoystickName(int joy);

	/**
	 * Returns the name, encoded as UTF-8, of the specified joystick.
	 *
	 * @param joy joystick to query
	 */
	public static String glfwGetJoystickName(int joy) {
		long __result = nglfwGetJoystickName(joy);
		return memDecodeUTF8(memByteBufferNT1(__result));
	}

	// --- [ glfwSetClipboardString ] ---

	/** JNI method for {@link #glfwSetClipboardString glfwSetClipboardString} */
	public static native void nglfwSetClipboardString(long window, long string);

	/**
	 * Sets the system clipboard to the specified, UTF-8 encoded string. The string is copied before returning, so you don't have to retain it afterwards.
	 *
	 * @param window window that will own the clipboard contents
	 * @param string UTF-8 encoded string
	 */
	public static void glfwSetClipboardString(long window, ByteBuffer string) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkNT1(string);
		}
		nglfwSetClipboardString(window, memAddress(string));
	}

	/** CharSequence version of: {@link #glfwSetClipboardString glfwSetClipboardString} */
	public static void glfwSetClipboardString(long window, CharSequence string) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetClipboardString(window, memAddress(memEncodeUTF8(string)));
	}

	// --- [ glfwGetClipboardString ] ---

	/** JNI method for {@link #glfwGetClipboardString glfwGetClipboardString} */
	public static native long nglfwGetClipboardString(long window);

	/**
	 * Returns the contents of the system clipboard, if it contains or is convertible to a UTF-8 encoded string.
	 *
	 * @param window window that will request the clipboard contents
	 */
	public static String glfwGetClipboardString(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		long __result = nglfwGetClipboardString(window);
		return memDecodeUTF8(memByteBufferNT1(__result));
	}

	// --- [ glfwGetTime ] ---

	/** Returns the value of the GLFW timer. Unless the timer has been set using glfwSetTime, the timer measures time elapsed since GLFW was initialized. */
	public static native double glfwGetTime();

	// --- [ glfwSetTime ] ---

	/**
	 * Sets the value of the GLFW timer. It then continues to count up from that value.
	 *
	 * @param time new value, in seconds
	 */
	public static native void glfwSetTime(double time);

	// --- [ glfwMakeContextCurrent ] ---

	/** JNI method for {@link #glfwMakeContextCurrent glfwMakeContextCurrent} */
	public static native void nglfwMakeContextCurrent(long window);

	/**
	 * Makes the context of the specified window current on the calling thread. A context can only be made current on a single thread at a time and each
	 * thread can have only a single current context at a time.
	 *
	 * @param window the window whose context to make current, or {@code NULL} to detach the current context
	 */
	public static void glfwMakeContextCurrent(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwMakeContextCurrent(window);
	}

	// --- [ glfwGetCurrentContext ] ---

	/** Returns the window whose context is current on the calling thread. */
	public static native long glfwGetCurrentContext();

	// --- [ glfwSwapBuffers ] ---

	/** JNI method for {@link #glfwSwapBuffers glfwSwapBuffers} */
	public static native void nglfwSwapBuffers(long window);

	/**
	 * Swaps the front and back buffers of the specified window. If the swap interval is greater than zero, the GPU driver waits the specified number of
	 * screen updates before swapping the buffers.
	 *
	 * @param window the window whose buffers to swap
	 */
	public static void glfwSwapBuffers(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSwapBuffers(window);
	}

	// --- [ glfwSwapInterval ] ---

	/**
	 * Sets the swap interval for the current context, i.e. the number of screen updates to wait before swapping the buffers of a window and returning from
	 * {@link #glfwSwapBuffers glfwSwapBuffers}. This is sometimes called 'vertical synchronization', 'vertical retrace synchronization' or 'vsync'.
	 * <p/>
	 * Contexts that support either of the {@code WGL_EXT_swap_control_tear} and {@code GLX_EXT_swap_control_tear} extensions also accept negative swap
	 * intervals, which allow the driver to swap even if a frame arrives a little bit late. You can check for the presence of these extensions using
	 * {@link #glfwExtensionSupported ExtensionSupported}. For more information about swap tearing, see the extension specifications.
	 * <p/>
	 * Some GPU drivers do not honor the requested swap interval, either because of user settings that override the request or due to bugs in the driver.
	 * <p/>
	 * Note: This function may be called from secondary threads.
	 *
	 * @param interval the minimum number of screen updates to wait for until the buffers are swapped by {@link #glfwSwapBuffers glfwSwapBuffers}
	 */
	public static native void glfwSwapInterval(int interval);

	// --- [ glfwExtensionSupported ] ---

	/** JNI method for {@link #glfwExtensionSupported glfwExtensionSupported} */
	public static native int nglfwExtensionSupported(long extension);

	/**
	 * Returns whether the specified OpenGL or context creation API extension is supported by the current context. For example, on Windows both the OpenGL and
	 * WGL extension strings are checked.
	 * <p/>
	 * Note: This function may be called from secondary threads.
	 * <p/>
	 * As this functions searches one or more extension strings on each call, it is recommended that you cache its results if it's going to be used frequently.
	 * The extension strings will not change during the lifetime of a context, so there is no danger in doing this.
	 *
	 * @param extension the ASCII encoded name of the extension
	 */
	public static int glfwExtensionSupported(ByteBuffer extension) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(extension);
		return nglfwExtensionSupported(memAddress(extension));
	}

	/** CharSequence version of: {@link #glfwExtensionSupported glfwExtensionSupported} */
	public static int glfwExtensionSupported(CharSequence extension) {
		return nglfwExtensionSupported(memAddress(memEncodeASCII(extension)));
	}

}