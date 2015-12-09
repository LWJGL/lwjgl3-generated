/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.glfw.org/docs/latest/">GLFW</a> library.
 * 
 * <p>GLFW is a free, Open Source, multi-platform library for opening a window, creating an OpenGL context and managing input. It is easy to integrate into
 * existing applications and does not lay claim to the main loop.</p>
 */
public class GLFW {

	/** The major version number of the GLFW library. This is incremented when the API is changed in non-compatible ways. */
	public static final int GLFW_VERSION_MAJOR = 3;

	/** The minor version number of the GLFW library. This is incremented when features are added to the API but it remains backward-compatible. */
	public static final int GLFW_VERSION_MINOR = 2;

	/** The revision number of the GLFW library. This is incremented when a bug fix release is made that does not contain any API changes. */
	public static final int GLFW_VERSION_REVISION = 0;

	/** Boolean values. */
	public static final int
		GLFW_TRUE  = 0x1,
		GLFW_FALSE = 0x0;

	/** The key or button was released. */
	public static final int GLFW_RELEASE = 0x0;

	/** The key or button was pressed. */
	public static final int GLFW_PRESS = 0x1;

	/** The key was held down until it repeated. */
	public static final int GLFW_REPEAT = 0x2;

	/** The unknown key. */
	public static final int GLFW_KEY_UNKNOWN = 0xFFFFFFFF;

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

	/** If this bit is set one or more Shift keys were held down. */
	public static final int GLFW_MOD_SHIFT = 0x1;

	/** If this bit is set one or more Control keys were held down. */
	public static final int GLFW_MOD_CONTROL = 0x2;

	/** If this bit is set one or more Alt keys were held down. */
	public static final int GLFW_MOD_ALT = 0x4;

	/** If this bit is set one or more Super keys were held down. */
	public static final int GLFW_MOD_SUPER = 0x8;

	/** Mouse buttons. See <a href="http://www.glfw.org/docs/latest/input.html#input_mouse_button">mouse button input</a> for how these are used. */
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

	/** Joysticks. See <a href="http://www.glfw.org/docs/latest/input.html#joystick">joystick input</a> for how these are used. */
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

	/**
	 * GLFW has not been initialized.
	 * 
	 * <p>This occurs if a GLFW function was called that may not be called unless the library is initialized.</p>
	 */
	public static final int GLFW_NOT_INITIALIZED = 0x10001;

	/**
	 * No context is current for this thread.
	 * 
	 * <p>This occurs if a GLFW function was called that needs and operates on the current OpenGL or OpenGL ES context but no context is current on the calling
	 * thread. One such function is {@link #glfwSwapInterval SwapInterval}.</p>
	 */
	public static final int GLFW_NO_CURRENT_CONTEXT = 0x10002;

	/**
	 * One of the arguments to the function was an invalid enum value.
	 * 
	 * <p>One of the arguments to the function was an invalid enum value, for example requesting {@link #GLFW_RED_BITS RED_BITS} with {@link #glfwGetWindowAttrib GetWindowAttrib}.</p>
	 */
	public static final int GLFW_INVALID_ENUM = 0x10003;

	/**
	 * One of the arguments to the function was an invalid value.
	 * 
	 * <p>One of the arguments to the function was an invalid value, for example requesting a non-existent OpenGL or OpenGL ES version like 2.7.</p>
	 * 
	 * <p>Requesting a valid but unavailable OpenGL or OpenGL ES version will instead result in a {@link #GLFW_VERSION_UNAVAILABLE VERSION_UNAVAILABLE} error.</p>
	 */
	public static final int GLFW_INVALID_VALUE = 0x10004;

	/**
	 * A memory allocation failed.
	 * 
	 * <p>A bug in GLFW or the underlying operating system. Report the bug to our <a href="https://github.com/glfw/glfw/issues">issue tracker</a>.</p>
	 */
	public static final int GLFW_OUT_OF_MEMORY = 0x10005;

	/**
	 * GLFW could not find support for the requested client API on the system. If emitted by functions other than {@link #glfwCreateWindow CreateWindow}, no supported client API was
	 * found.
	 * 
	 * <p>The installed graphics driver does not support the requested client API, or does not support it via the chosen context creation backend. Below are a
	 * few examples:</p>
	 * 
	 * <p>Some pre-installed Windows graphics drivers do not support OpenGL. AMD only supports OpenGL ES via EGL, while Nvidia and Intel only support it via a
	 * WGL or GLX extension. OS X does not provide OpenGL ES at all. The Mesa EGL, OpenGL and OpenGL ES libraries do not interface with the Nvidia binary
	 * driver.</p>
	 */
	public static final int GLFW_API_UNAVAILABLE = 0x10006;

	/**
	 * The requested OpenGL or OpenGL ES version (including any requested context or framebuffer hints) is not available on this machine.
	 * 
	 * <p>The machine does not support your requirements. If your application is sufficiently flexible, downgrade your requirements and try again. Otherwise,
	 * inform the user that their machine does not match your requirements.</p>
	 * 
	 * <p>Future invalid OpenGL and OpenGL ES versions, for example OpenGL 4.8 if 5.0 comes out before the 4.x series gets that far, also fail with this error and
	 * not {@link #GLFW_INVALID_VALUE INVALID_VALUE}, because GLFW cannot know what future versions will exist.</p>
	 */
	public static final int GLFW_VERSION_UNAVAILABLE = 0x10007;

	/**
	 * A platform-specific error occurred that does not match any of the more specific categories.
	 * 
	 * <p>A bug or configuration error in GLFW, the underlying operating system or its drivers, or a lack of required resources. Report the issue to our
	 * <a href="https://github.com/glfw/glfw/issues">issue tracker</a>.</p>
	 */
	public static final int GLFW_PLATFORM_ERROR = 0x10008;

	/**
	 * The requested format is not supported or available.
	 * 
	 * <p>If emitted during window creation, one or more hard constraints did not match any of the available pixel formats. If your application is sufficiently
	 * flexible, downgrade your requirements and try again. Otherwise, inform the user that their machine does not match your requirements.</p>
	 * 
	 * <p>If emitted when querying the clipboard, ignore the error or report it to the user, as appropriate.</p>
	 */
	public static final int GLFW_FORMAT_UNAVAILABLE = 0x10009;

	/**
	 * The specified window does not have an OpenGL or OpenGL ES context.
	 * 
	 * <p>A window that does not have an OpenGL or OpenGL ES context was passed to a function that requires it to have one.</p>
	 * 
	 * <p>Application programmer error. Fix the offending call.</p>
	 */
	public static final int GLFW_NO_WINDOW_CONTEXT = 0x1000A;

	/** Window attributes. */
	public static final int
		GLFW_FOCUSED      = 0x20001,
		GLFW_ICONIFIED    = 0x20002,
		GLFW_RESIZABLE    = 0x20003,
		GLFW_VISIBLE      = 0x20004,
		GLFW_DECORATED    = 0x20005,
		GLFW_AUTO_ICONIFY = 0x20006,
		GLFW_FLOATING     = 0x20007;

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

	/** Standard cursor shapes. See <a href="http://www.glfw.org/docs/latest/input.html#cursor_standard">standard cursor creation</a> for how these are used. */
	public static final int
		GLFW_ARROW_CURSOR     = 0x36001,
		GLFW_IBEAM_CURSOR     = 0x36002,
		GLFW_CROSSHAIR_CURSOR = 0x36003,
		GLFW_HAND_CURSOR      = 0x36004,
		GLFW_HRESIZE_CURSOR   = 0x36005,
		GLFW_VRESIZE_CURSOR   = 0x36006;

	/** Monitor events. */
	public static final int
		GLFW_CONNECTED    = 0x40001,
		GLFW_DISCONNECTED = 0x40002;

	/** Don't care value. */
	public static final int GLFW_DONT_CARE = 0xFFFFFFFF;

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
		GLFW_REFRESH_RATE     = 0x2100F,
		GLFW_DOUBLE_BUFFER    = 0x21010;

	/** Client API hints. */
	public static final int
		GLFW_CLIENT_API               = 0x22001,
		GLFW_CONTEXT_VERSION_MAJOR    = 0x22002,
		GLFW_CONTEXT_VERSION_MINOR    = 0x22003,
		GLFW_CONTEXT_REVISION         = 0x22004,
		GLFW_CONTEXT_ROBUSTNESS       = 0x22005,
		GLFW_OPENGL_FORWARD_COMPAT    = 0x22006,
		GLFW_OPENGL_DEBUG_CONTEXT     = 0x22007,
		GLFW_OPENGL_PROFILE           = 0x22008,
		GLFW_CONTEXT_RELEASE_BEHAVIOR = 0x22009,
		GLFW_CONTEXT_NO_ERROR         = 0x2200A;

	/** Values for the {@link #GLFW_CLIENT_API CLIENT_API} hint. */
	public static final int
		GLFW_NO_API        = 0x0,
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

	/** Values for the {@link #GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR} hint. */
	public static final int
		GLFW_ANY_RELEASE_BEHAVIOR   = 0x0,
		GLFW_RELEASE_BEHAVIOR_FLUSH = 0x35001,
		GLFW_RELEASE_BEHAVIOR_NONE  = 0x35002;

	/** Function address. */
	@JavadocExclude
	public final long
		Init,
		Terminate,
		GetVersion,
		GetVersionString,
		SetErrorCallback,
		GetMonitors,
		GetPrimaryMonitor,
		GetMonitorPos,
		GetMonitorPhysicalSize,
		GetMonitorName,
		SetMonitorCallback,
		GetVideoModes,
		GetVideoMode,
		SetGamma,
		GetGammaRamp,
		SetGammaRamp,
		DefaultWindowHints,
		WindowHint,
		CreateWindow,
		DestroyWindow,
		WindowShouldClose,
		SetWindowShouldClose,
		SetWindowTitle,
		GetWindowPos,
		SetWindowPos,
		GetWindowSize,
		SetWindowSizeLimits,
		SetWindowAspectRatio,
		SetWindowSize,
		GetFramebufferSize,
		GetWindowFrameSize,
		IconifyWindow,
		RestoreWindow,
		ShowWindow,
		HideWindow,
		GetWindowMonitor,
		GetWindowAttrib,
		SetWindowUserPointer,
		GetWindowUserPointer,
		SetWindowPosCallback,
		SetWindowSizeCallback,
		SetWindowCloseCallback,
		SetWindowRefreshCallback,
		SetWindowFocusCallback,
		SetWindowIconifyCallback,
		SetFramebufferSizeCallback,
		PollEvents,
		WaitEvents,
		PostEmptyEvent,
		GetInputMode,
		SetInputMode,
		GetKeyName,
		GetKey,
		GetMouseButton,
		GetCursorPos,
		SetCursorPos,
		CreateCursor,
		CreateStandardCursor,
		DestroyCursor,
		SetCursor,
		SetKeyCallback,
		SetCharCallback,
		SetCharModsCallback,
		SetMouseButtonCallback,
		SetCursorPosCallback,
		SetCursorEnterCallback,
		SetScrollCallback,
		SetDropCallback,
		JoystickPresent,
		GetJoystickAxes,
		GetJoystickButtons,
		GetJoystickName,
		SetClipboardString,
		GetClipboardString,
		GetTime,
		SetTime,
		MakeContextCurrent,
		GetCurrentContext,
		SwapBuffers,
		SwapInterval,
		ExtensionSupported,
		GetProcAddress;

	@JavadocExclude
	protected GLFW() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public GLFW(FunctionProvider provider) {
		Init = checkFunctionAddress(provider.getFunctionAddress("glfwInit"));
		Terminate = checkFunctionAddress(provider.getFunctionAddress("glfwTerminate"));
		GetVersion = checkFunctionAddress(provider.getFunctionAddress("glfwGetVersion"));
		GetVersionString = checkFunctionAddress(provider.getFunctionAddress("glfwGetVersionString"));
		SetErrorCallback = checkFunctionAddress(provider.getFunctionAddress("glfwSetErrorCallback"));
		GetMonitors = checkFunctionAddress(provider.getFunctionAddress("glfwGetMonitors"));
		GetPrimaryMonitor = checkFunctionAddress(provider.getFunctionAddress("glfwGetPrimaryMonitor"));
		GetMonitorPos = checkFunctionAddress(provider.getFunctionAddress("glfwGetMonitorPos"));
		GetMonitorPhysicalSize = checkFunctionAddress(provider.getFunctionAddress("glfwGetMonitorPhysicalSize"));
		GetMonitorName = checkFunctionAddress(provider.getFunctionAddress("glfwGetMonitorName"));
		SetMonitorCallback = checkFunctionAddress(provider.getFunctionAddress("glfwSetMonitorCallback"));
		GetVideoModes = checkFunctionAddress(provider.getFunctionAddress("glfwGetVideoModes"));
		GetVideoMode = checkFunctionAddress(provider.getFunctionAddress("glfwGetVideoMode"));
		SetGamma = checkFunctionAddress(provider.getFunctionAddress("glfwSetGamma"));
		GetGammaRamp = checkFunctionAddress(provider.getFunctionAddress("glfwGetGammaRamp"));
		SetGammaRamp = checkFunctionAddress(provider.getFunctionAddress("glfwSetGammaRamp"));
		DefaultWindowHints = checkFunctionAddress(provider.getFunctionAddress("glfwDefaultWindowHints"));
		WindowHint = checkFunctionAddress(provider.getFunctionAddress("glfwWindowHint"));
		CreateWindow = checkFunctionAddress(provider.getFunctionAddress("glfwCreateWindow"));
		DestroyWindow = checkFunctionAddress(provider.getFunctionAddress("glfwDestroyWindow"));
		WindowShouldClose = checkFunctionAddress(provider.getFunctionAddress("glfwWindowShouldClose"));
		SetWindowShouldClose = checkFunctionAddress(provider.getFunctionAddress("glfwSetWindowShouldClose"));
		SetWindowTitle = checkFunctionAddress(provider.getFunctionAddress("glfwSetWindowTitle"));
		GetWindowPos = checkFunctionAddress(provider.getFunctionAddress("glfwGetWindowPos"));
		SetWindowPos = checkFunctionAddress(provider.getFunctionAddress("glfwSetWindowPos"));
		GetWindowSize = checkFunctionAddress(provider.getFunctionAddress("glfwGetWindowSize"));
		SetWindowSizeLimits = checkFunctionAddress(provider.getFunctionAddress("glfwSetWindowSizeLimits"));
		SetWindowAspectRatio = checkFunctionAddress(provider.getFunctionAddress("glfwSetWindowAspectRatio"));
		SetWindowSize = checkFunctionAddress(provider.getFunctionAddress("glfwSetWindowSize"));
		GetFramebufferSize = checkFunctionAddress(provider.getFunctionAddress("glfwGetFramebufferSize"));
		GetWindowFrameSize = checkFunctionAddress(provider.getFunctionAddress("glfwGetWindowFrameSize"));
		IconifyWindow = checkFunctionAddress(provider.getFunctionAddress("glfwIconifyWindow"));
		RestoreWindow = checkFunctionAddress(provider.getFunctionAddress("glfwRestoreWindow"));
		ShowWindow = checkFunctionAddress(provider.getFunctionAddress("glfwShowWindow"));
		HideWindow = checkFunctionAddress(provider.getFunctionAddress("glfwHideWindow"));
		GetWindowMonitor = checkFunctionAddress(provider.getFunctionAddress("glfwGetWindowMonitor"));
		GetWindowAttrib = checkFunctionAddress(provider.getFunctionAddress("glfwGetWindowAttrib"));
		SetWindowUserPointer = checkFunctionAddress(provider.getFunctionAddress("glfwSetWindowUserPointer"));
		GetWindowUserPointer = checkFunctionAddress(provider.getFunctionAddress("glfwGetWindowUserPointer"));
		SetWindowPosCallback = checkFunctionAddress(provider.getFunctionAddress("glfwSetWindowPosCallback"));
		SetWindowSizeCallback = checkFunctionAddress(provider.getFunctionAddress("glfwSetWindowSizeCallback"));
		SetWindowCloseCallback = checkFunctionAddress(provider.getFunctionAddress("glfwSetWindowCloseCallback"));
		SetWindowRefreshCallback = checkFunctionAddress(provider.getFunctionAddress("glfwSetWindowRefreshCallback"));
		SetWindowFocusCallback = checkFunctionAddress(provider.getFunctionAddress("glfwSetWindowFocusCallback"));
		SetWindowIconifyCallback = checkFunctionAddress(provider.getFunctionAddress("glfwSetWindowIconifyCallback"));
		SetFramebufferSizeCallback = checkFunctionAddress(provider.getFunctionAddress("glfwSetFramebufferSizeCallback"));
		PollEvents = checkFunctionAddress(provider.getFunctionAddress("glfwPollEvents"));
		WaitEvents = checkFunctionAddress(provider.getFunctionAddress("glfwWaitEvents"));
		PostEmptyEvent = checkFunctionAddress(provider.getFunctionAddress("glfwPostEmptyEvent"));
		GetInputMode = checkFunctionAddress(provider.getFunctionAddress("glfwGetInputMode"));
		SetInputMode = checkFunctionAddress(provider.getFunctionAddress("glfwSetInputMode"));
		GetKeyName = checkFunctionAddress(provider.getFunctionAddress("glfwGetKeyName"));
		GetKey = checkFunctionAddress(provider.getFunctionAddress("glfwGetKey"));
		GetMouseButton = checkFunctionAddress(provider.getFunctionAddress("glfwGetMouseButton"));
		GetCursorPos = checkFunctionAddress(provider.getFunctionAddress("glfwGetCursorPos"));
		SetCursorPos = checkFunctionAddress(provider.getFunctionAddress("glfwSetCursorPos"));
		CreateCursor = checkFunctionAddress(provider.getFunctionAddress("glfwCreateCursor"));
		CreateStandardCursor = checkFunctionAddress(provider.getFunctionAddress("glfwCreateStandardCursor"));
		DestroyCursor = checkFunctionAddress(provider.getFunctionAddress("glfwDestroyCursor"));
		SetCursor = checkFunctionAddress(provider.getFunctionAddress("glfwSetCursor"));
		SetKeyCallback = checkFunctionAddress(provider.getFunctionAddress("glfwSetKeyCallback"));
		SetCharCallback = checkFunctionAddress(provider.getFunctionAddress("glfwSetCharCallback"));
		SetCharModsCallback = checkFunctionAddress(provider.getFunctionAddress("glfwSetCharModsCallback"));
		SetMouseButtonCallback = checkFunctionAddress(provider.getFunctionAddress("glfwSetMouseButtonCallback"));
		SetCursorPosCallback = checkFunctionAddress(provider.getFunctionAddress("glfwSetCursorPosCallback"));
		SetCursorEnterCallback = checkFunctionAddress(provider.getFunctionAddress("glfwSetCursorEnterCallback"));
		SetScrollCallback = checkFunctionAddress(provider.getFunctionAddress("glfwSetScrollCallback"));
		SetDropCallback = checkFunctionAddress(provider.getFunctionAddress("glfwSetDropCallback"));
		JoystickPresent = checkFunctionAddress(provider.getFunctionAddress("glfwJoystickPresent"));
		GetJoystickAxes = checkFunctionAddress(provider.getFunctionAddress("glfwGetJoystickAxes"));
		GetJoystickButtons = checkFunctionAddress(provider.getFunctionAddress("glfwGetJoystickButtons"));
		GetJoystickName = checkFunctionAddress(provider.getFunctionAddress("glfwGetJoystickName"));
		SetClipboardString = checkFunctionAddress(provider.getFunctionAddress("glfwSetClipboardString"));
		GetClipboardString = checkFunctionAddress(provider.getFunctionAddress("glfwGetClipboardString"));
		GetTime = checkFunctionAddress(provider.getFunctionAddress("glfwGetTime"));
		SetTime = checkFunctionAddress(provider.getFunctionAddress("glfwSetTime"));
		MakeContextCurrent = checkFunctionAddress(provider.getFunctionAddress("glfwMakeContextCurrent"));
		GetCurrentContext = checkFunctionAddress(provider.getFunctionAddress("glfwGetCurrentContext"));
		SwapBuffers = checkFunctionAddress(provider.getFunctionAddress("glfwSwapBuffers"));
		SwapInterval = checkFunctionAddress(provider.getFunctionAddress("glfwSwapInterval"));
		ExtensionSupported = checkFunctionAddress(provider.getFunctionAddress("glfwExtensionSupported"));
		GetProcAddress = checkFunctionAddress(provider.getFunctionAddress("glfwGetProcAddress"));
	}

	// --- [ Function Addresses ] ---

	private static final SharedLibrary GLFW;

	private static final GLFW instance;

	static {
		GLFW = Library.loadNative(Configuration.LIBRARY_NAME_GLFW.get(Pointer.BITS64 ? "glfw" : "glfw32"));
		instance = new GLFW(GLFW);
	}

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return GLFW;
	}

	/** Returns the {@link GLFW} instance. */
	public static GLFW getInstance() {
		return instance;
	}

	// --- [ glfwInit ] ---

	/**
	 * Initializes the GLFW library. Before most GLFW functions can be used, GLFW must be initialized, and before an application terminates GLFW should be
	 * terminated in order to free any resources allocated during or after initialization.
	 * 
	 * <p>If this function fails, it calls {@link #glfwTerminate Terminate} before returning. If it succeeds, you should call {@link #glfwTerminate Terminate} before the application exits.</p>
	 * 
	 * <p>Additional calls to this function after successful initialization but before termination will return {@link #GLFW_TRUE TRUE} immediately.</p>
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li><b>Mac OS X</b>: This function will change the current directory of the application to the `Contents/Resources` subdirectory of the application's
	 * bundle, if present.</li>
	 * </ul>
	 *
	 * @return {@link #GLFW_TRUE TRUE} if successful, or {@link #GLFW_FALSE FALSE} if an error occured.
	 *
	 * @since GLFW 1.0
	 */
	public static int glfwInit() {
		long __functionAddress = getInstance().Init;
		return invokeI(__functionAddress);
	}

	// --- [ glfwTerminate ] ---

	/**
	 * Destroys all remaining windows and cursors, restores any modified gamma ramps and frees any other allocated resources. Once this function is called, you
	 * must again call {@link #glfwInit Init} successfully before you will be able to use most GLFW functions.
	 * 
	 * <p>If GLFW has been successfully initialized, this function should be called before the application exits. If initialization fails, there is no need to
	 * call this function, as it is called by {@link #glfwInit Init} before it returns failure.</p>
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function may be called before {@link #glfwInit Init}.</li>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>This function may not be called from a callback.</li>
	 * <li>No window's context may be current on another thread when this function is called.</li>
	 * </ul>
	 */
	public static void glfwTerminate() {
		long __functionAddress = getInstance().Terminate;
		invokeV(__functionAddress);
	}

	// --- [ glfwGetVersion ] ---

	/** Unsafe version of {@link #glfwGetVersion GetVersion} */
	@JavadocExclude
	public static void nglfwGetVersion(long major, long minor, long rev) {
		long __functionAddress = getInstance().GetVersion;
		invokePPPV(__functionAddress, major, minor, rev);
	}

	/**
	 * Retrieves the major, minor and revision numbers of the GLFW library. It is intended for when you are using GLFW as a shared library and want to ensure
	 * that you are using the minimum required version.
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>Any or all of the version arguments may be {@code NULL}.</li>
	 * <li>This function always succeeds.</li>
	 * <li>This function may be called before {@link #glfwInit Init}.</li>
	 * <li>This function may be called from any thread.</li>
	 * </ul>
	 *
	 * @param major where to store the major version number, or {@code NULL}
	 * @param minor where to store the minor version number, or {@code NULL}
	 * @param rev   where to store the revision number, or {@code NULL}
	 *
	 * @since GLFW 1.0
	 */
	public static void glfwGetVersion(ByteBuffer major, ByteBuffer minor, ByteBuffer rev) {
		if ( CHECKS ) {
			if ( major != null ) checkBuffer(major, 1 << 2);
			if ( minor != null ) checkBuffer(minor, 1 << 2);
			if ( rev != null ) checkBuffer(rev, 1 << 2);
		}
		nglfwGetVersion(memAddressSafe(major), memAddressSafe(minor), memAddressSafe(rev));
	}

	/** Alternative version of: {@link #glfwGetVersion GetVersion} */
	public static void glfwGetVersion(IntBuffer major, IntBuffer minor, IntBuffer rev) {
		if ( CHECKS ) {
			if ( major != null ) checkBuffer(major, 1);
			if ( minor != null ) checkBuffer(minor, 1);
			if ( rev != null ) checkBuffer(rev, 1);
		}
		nglfwGetVersion(memAddressSafe(major), memAddressSafe(minor), memAddressSafe(rev));
	}

	// --- [ glfwGetVersionString ] ---

	/** Unsafe version of {@link #glfwGetVersionString GetVersionString} */
	@JavadocExclude
	public static long nglfwGetVersionString() {
		long __functionAddress = getInstance().GetVersionString;
		return invokeP(__functionAddress);
	}

	/**
	 * Returns the compile-time generated version string of the GLFW library binary. It describes the version, platform, compiler and any platform-specific
	 * compile-time options.
	 * 
	 * <p><b>Do not use the version string</b> to parse the GLFW library version. The {@link #glfwGetVersion GetVersion} function already provides the version of the
	 * running library binary.</p>
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function always succeeds.</li>
	 * <li>This function may be called before {@link #glfwInit Init}.</li>
	 * <li>This function may be called from any thread.</li>
	 * <li>The returned string is static and compile-time generated.</li>
	 * </ul>
	 *
	 * @return the GLFW version string
	 *
	 * @since GLFW 3.0
	 */
	public static String glfwGetVersionString() {
		long __result = nglfwGetVersionString();
		return memDecodeUTF8(__result);
	}

	// --- [ glfwSetErrorCallback ] ---

	/**
	 * Sets the error callback, which is called with an error code and a human-readable description each time a GLFW error occurs.
	 * 
	 * <p>The error callback is called on the thread where the error occurred. If you are using GLFW from multiple threads, your error callback needs to be
	 * written accordingly.</p>
	 * 
	 * <p>Because the description string may have been generated specifically for that error, it is not guaranteed to be valid after the callback has returned. If
	 * you wish to use it after the callback returns, you need to make a copy.</p>
	 * 
	 * <p>Once set, the error callback remains set even after the library has been terminated.</p>
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function may be called before {@link #glfwInit Init}.</li>
	 * <li>This function may only be called from the main thread.</li>
	 * </ul>
	 *
	 * @param cbfun the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since GLFW 3.0
	 */
	public static GLFWErrorCallback glfwSetErrorCallback(GLFWErrorCallback cbfun) {
		long __functionAddress = getInstance().SetErrorCallback;
		return GLFWErrorCallback.create(invokePP(__functionAddress, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwGetMonitors ] ---

	/** Unsafe version of {@link #glfwGetMonitors GetMonitors} */
	@JavadocExclude
	public static long nglfwGetMonitors(long count) {
		long __functionAddress = getInstance().GetMonitors;
		return invokePP(__functionAddress, count);
	}

	/**
	 * Returns an array of handles for all currently connected monitors. The primary monitor is always first in the returned array. If no monitors were found,
	 * this function returns {@code NULL}.
	 * 
	 * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is guaranteed to be valid only until the monitor configuration
	 * changes or the library is terminated.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @return an array of monitor handlers, or {@code NULL} if no monitors were found or if an error occured
	 *
	 * @since GLFW 3.0
	 */
	public static PointerBuffer glfwGetMonitors() {
		APIBuffer __buffer = apiBuffer();
		int count = __buffer.intParam();
		long __result = nglfwGetMonitors(__buffer.address(count));
		return memPointerBuffer(__result, __buffer.intValue(count));
	}

	// --- [ glfwGetPrimaryMonitor ] ---

	/**
	 * Returns the primary monitor. This is usually the monitor where elements like the task bar or global menu bar are located.
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 * 
	 * <p>The primary monitor is always first in the array returned by {@link #glfwGetMonitors GetMonitors}.</p>
	 *
	 * @return the primary monitor, or {@code NULL} if no monitors were found or if an error occured
	 *
	 * @since GLFW 3.0
	 */
	public static long glfwGetPrimaryMonitor() {
		long __functionAddress = getInstance().GetPrimaryMonitor;
		return invokeP(__functionAddress);
	}

	// --- [ glfwGetMonitorPos ] ---

	/** Unsafe version of {@link #glfwGetMonitorPos GetMonitorPos} */
	@JavadocExclude
	public static void nglfwGetMonitorPos(long monitor, long xpos, long ypos) {
		long __functionAddress = getInstance().GetMonitorPos;
		if ( CHECKS )
			checkPointer(monitor);
		invokePPPV(__functionAddress, monitor, xpos, ypos);
	}

	/**
	 * Returns the position, in screen coordinates, of the upper-left corner of the specified monitor.
	 * 
	 * <p>Any or all of the position arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} position arguments will be set to zero.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param monitor the monitor to query
	 * @param xpos    where to store the monitor x-coordinate, or {@code NULL}
	 * @param ypos    where to store the monitor y-coordinate, or {@code NULL}
	 *
	 * @since GLFW 3.0
	 */
	public static void glfwGetMonitorPos(long monitor, ByteBuffer xpos, ByteBuffer ypos) {
		if ( CHECKS ) {
			if ( xpos != null ) checkBuffer(xpos, 1 << 2);
			if ( ypos != null ) checkBuffer(ypos, 1 << 2);
		}
		nglfwGetMonitorPos(monitor, memAddressSafe(xpos), memAddressSafe(ypos));
	}

	/** Alternative version of: {@link #glfwGetMonitorPos GetMonitorPos} */
	public static void glfwGetMonitorPos(long monitor, IntBuffer xpos, IntBuffer ypos) {
		if ( CHECKS ) {
			if ( xpos != null ) checkBuffer(xpos, 1);
			if ( ypos != null ) checkBuffer(ypos, 1);
		}
		nglfwGetMonitorPos(monitor, memAddressSafe(xpos), memAddressSafe(ypos));
	}

	// --- [ glfwGetMonitorPhysicalSize ] ---

	/** Unsafe version of {@link #glfwGetMonitorPhysicalSize GetMonitorPhysicalSize} */
	@JavadocExclude
	public static void nglfwGetMonitorPhysicalSize(long monitor, long widthMM, long heightMM) {
		long __functionAddress = getInstance().GetMonitorPhysicalSize;
		if ( CHECKS )
			checkPointer(monitor);
		invokePPPV(__functionAddress, monitor, widthMM, heightMM);
	}

	/**
	 * Returns the size, in millimetres, of the display area of the specified monitor.
	 * 
	 * <p>Some systems do not provide accurate monitor size information, either because the monitor
	 * <a href="https://en.wikipedia.org/wiki/Extended_display_identification_data">EDID</a> data is incorrect or because the driver does not report it
	 * accurately.</p>
	 * 
	 * <p>Any or all of the size arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} size arguments will be set to zero.</p>
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li><b>Windows</b>: The OS calculates the returned physical size from the current resolution and system DPI instead of querying the monitor EDID data.</li>
	 * </ul>
	 *
	 * @param monitor  the monitor to query
	 * @param widthMM  where to store the width, in millimetres, of the monitor's display area, or {@code NULL}
	 * @param heightMM where to store the height, in millimetres, of the monitor's display area, or {@code NULL}
	 *
	 * @since GLFW 3.0
	 */
	public static void glfwGetMonitorPhysicalSize(long monitor, ByteBuffer widthMM, ByteBuffer heightMM) {
		if ( CHECKS ) {
			if ( widthMM != null ) checkBuffer(widthMM, 1 << 2);
			if ( heightMM != null ) checkBuffer(heightMM, 1 << 2);
		}
		nglfwGetMonitorPhysicalSize(monitor, memAddressSafe(widthMM), memAddressSafe(heightMM));
	}

	/** Alternative version of: {@link #glfwGetMonitorPhysicalSize GetMonitorPhysicalSize} */
	public static void glfwGetMonitorPhysicalSize(long monitor, IntBuffer widthMM, IntBuffer heightMM) {
		if ( CHECKS ) {
			if ( widthMM != null ) checkBuffer(widthMM, 1);
			if ( heightMM != null ) checkBuffer(heightMM, 1);
		}
		nglfwGetMonitorPhysicalSize(monitor, memAddressSafe(widthMM), memAddressSafe(heightMM));
	}

	// --- [ glfwGetMonitorName ] ---

	/** Unsafe version of {@link #glfwGetMonitorName GetMonitorName} */
	@JavadocExclude
	public static long nglfwGetMonitorName(long monitor) {
		long __functionAddress = getInstance().GetMonitorName;
		if ( CHECKS )
			checkPointer(monitor);
		return invokePP(__functionAddress, monitor);
	}

	/**
	 * Returns a human-readable name, encoded as UTF-8, of the specified monitor. The name typically reflects the make and model of the monitor and is not
	 * guaranteed to be unique among the connected monitors.
	 * 
	 * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected or the
	 * library is terminated.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param monitor the monitor to query
	 *
	 * @return the UTF-8 encoded name of the monitor, or {@code NULL} if an error occured
	 *
	 * @since GLFW 3.0
	 */
	public static String glfwGetMonitorName(long monitor) {
		long __result = nglfwGetMonitorName(monitor);
		return memDecodeUTF8(__result);
	}

	// --- [ glfwSetMonitorCallback ] ---

	/**
	 * Sets the monitor configuration callback, or removes the currently set callback. This is called when a monitor is connected to or disconnected from the
	 * system.
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param cbfun the new callback, or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been initialized
	 *
	 * @since GLFW 3.0
	 */
	public static GLFWMonitorCallback glfwSetMonitorCallback(GLFWMonitorCallback cbfun) {
		long __functionAddress = getInstance().SetMonitorCallback;
		return GLFWMonitorCallback.create(invokePP(__functionAddress, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwGetVideoModes ] ---

	/** Unsafe version of {@link #glfwGetVideoModes GetVideoModes} */
	@JavadocExclude
	public static long nglfwGetVideoModes(long monitor, long count) {
		long __functionAddress = getInstance().GetVideoModes;
		if ( CHECKS )
			checkPointer(monitor);
		return invokePPP(__functionAddress, monitor, count);
	}

	/**
	 * Returns an array of all video modes supported by the specified monitor. The returned array is sorted in ascending order, first by color bit depth (the
	 * sum of all channel depths) and then by resolution area (the product of width and height).
	 * 
	 * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected, this
	 * function is called again for that monitor or the library is terminated.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param monitor the monitor to query
	 * @param count   where to store the number of video modes in the returned array. This is set to zero if an error occurred.
	 *
	 * @return an array of video modes, or {@code NULL} if an error occured
	 *
	 * @since GLFW 1.0
	 */
	public static GLFWVidMode.Buffer glfwGetVideoModes(long monitor) {
		APIBuffer __buffer = apiBuffer();
		int count = __buffer.intParam();
		long __result = nglfwGetVideoModes(monitor, __buffer.address(count));
		return GLFWVidMode.create(__result, __buffer.intValue(count));
	}

	// --- [ glfwGetVideoMode ] ---

	/** Unsafe version of {@link #glfwGetVideoMode GetVideoMode} */
	@JavadocExclude
	public static long nglfwGetVideoMode(long monitor) {
		long __functionAddress = getInstance().GetVideoMode;
		if ( CHECKS )
			checkPointer(monitor);
		return invokePP(__functionAddress, monitor);
	}

	/**
	 * Returns the current video mode of the specified monitor. If you have created a full screen window for that monitor, the return value will depend on
	 * whether that window is iconified.
	 * 
	 * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected or the
	 * library is terminated.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param monitor the monitor to query
	 *
	 * @return the current mode of the monitor, or {@code NULL} if an error occurred
	 *
	 * @since GLFW 3.0
	 */
	public static GLFWVidMode glfwGetVideoMode(long monitor) {
		long __result = nglfwGetVideoMode(monitor);
		return GLFWVidMode.create(__result);
	}

	// --- [ glfwSetGamma ] ---

	/**
	 * Generates a 256-element gamma ramp from the specified exponent and then calls {@link #glfwSetGammaRamp SetGammaRamp} with it. The value must be a finite number greater than
	 * zero.
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param monitor the monitor whose gamma ramp to set
	 * @param gamma   the desired exponent
	 *
	 * @since GLFW 3.0
	 */
	public static void glfwSetGamma(long monitor, float gamma) {
		long __functionAddress = getInstance().SetGamma;
		if ( CHECKS )
			checkPointer(monitor);
		invokePFV(__functionAddress, monitor, gamma);
	}

	// --- [ glfwGetGammaRamp ] ---

	/** Unsafe version of {@link #glfwGetGammaRamp GetGammaRamp} */
	@JavadocExclude
	public static long nglfwGetGammaRamp(long monitor) {
		long __functionAddress = getInstance().GetGammaRamp;
		if ( CHECKS )
			checkPointer(monitor);
		return invokePP(__functionAddress, monitor);
	}

	/**
	 * Returns the current gamma ramp of the specified monitor.
	 * 
	 * <p>The returned structure and its arrays are allocated and freed by GLFW. You should not free them yourself. They are valid until the specified monitor is
	 * disconnected, this function is called again for that monitor or the library is terminated.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param monitor the monitor to query
	 *
	 * @return the current gamma ramp, or {@code NULL} if an error occurred
	 *
	 * @since GLFW 3.0
	 */
	public static GLFWGammaRamp glfwGetGammaRamp(long monitor) {
		long __result = nglfwGetGammaRamp(monitor);
		return GLFWGammaRamp.create(__result);
	}

	// --- [ glfwSetGammaRamp ] ---

	/** Unsafe version of {@link #glfwSetGammaRamp SetGammaRamp} */
	@JavadocExclude
	public static void nglfwSetGammaRamp(long monitor, long ramp) {
		long __functionAddress = getInstance().SetGammaRamp;
		if ( CHECKS )
			checkPointer(monitor);
		invokePPV(__functionAddress, monitor, ramp);
	}

	/**
	 * Sets the current gamma ramp for the specified monitor. The original gamma ramp for that monitor is saved by GLFW the first time this function is called
	 * and is restored by {@link #glfwTerminate Terminate}.
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>Gamma ramp sizes other than 256 are not supported by all hardware</li>
	 * <li><b>Windows</b>: The gamma ramp size must be 256.</li>
	 * <li>The specified gamma ramp is copied before this function returns.</li>
	 * </ul>
	 *
	 * @param monitor the monitor whose gamma ramp to set
	 * @param ramp    the gamma ramp to use
	 *
	 * @since GLFW 3.0
	 */
	public static void glfwSetGammaRamp(long monitor, GLFWGammaRamp ramp) {
		nglfwSetGammaRamp(monitor, ramp.address());
	}

	// --- [ glfwDefaultWindowHints ] ---

	/**
	 * Resets all window hints to their default values. See {@link #glfwWindowHint WindowHint} for details.
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 */
	public static void glfwDefaultWindowHints() {
		long __functionAddress = getInstance().DefaultWindowHints;
		invokeV(__functionAddress);
	}

	// --- [ glfwWindowHint ] ---

	/**
	 * Sets hints for the next call to {@link #glfwCreateWindow CreateWindow}. The hints, once set, retain their values until changed by a call to glfwWindowHint or
	 * {@link #glfwDefaultWindowHints DefaultWindowHints}, or until the library is terminated.
	 * 
	 * <h3>Supported and default values</h3>
	 * 
	 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
	 * <tr><th>Name</th><th>Default value</th><th>Supported values</th></tr>
	 * <tr><td>{@link #GLFW_RESIZABLE RESIZABLE}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_VISIBLE VISIBLE}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_DECORATED DECORATED}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_AUTO_ICONIFY AUTO_ICONIFY}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_FLOATING FLOATING}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_RED_BITS RED_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
	 * <tr><td>{@link #GLFW_GREEN_BITS GREEN_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
	 * <tr><td>{@link #GLFW_BLUE_BITS BLUE_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
	 * <tr><td>{@link #GLFW_ALPHA_BITS ALPHA_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
	 * <tr><td>{@link #GLFW_DEPTH_BITS DEPTH_BITS}</td><td>24</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
	 * <tr><td>{@link #GLFW_STENCIL_BITS STENCIL_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
	 * <tr><td>{@link #GLFW_ACCUM_RED_BITS ACCUM_RED_BITS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
	 * <tr><td>{@link #GLFW_ACCUM_GREEN_BITS ACCUM_GREEN_BITS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
	 * <tr><td>{@link #GLFW_ACCUM_BLUE_BITS ACCUM_BLUE_BITS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
	 * <tr><td>{@link #GLFW_ACCUM_ALPHA_BITS ACCUM_ALPHA_BITS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
	 * <tr><td>{@link #GLFW_AUX_BUFFERS AUX_BUFFERS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
	 * <tr><td>{@link #GLFW_SAMPLES SAMPLES}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
	 * <tr><td>{@link #GLFW_REFRESH_RATE REFRESH_RATE}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
	 * <tr><td>{@link #GLFW_STEREO STEREO}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_SRGB_CAPABLE SRGB_CAPABLE}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_CLIENT_API CLIENT_API}</td><td>{@link #GLFW_OPENGL_API OPENGL_API}</td><td>{@link #GLFW_NO_API NO_API} {@link #GLFW_OPENGL_API OPENGL_API} {@link #GLFW_OPENGL_ES_API OPENGL_ES_API}</td></tr>
	 * <tr><td>{@link #GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR}</td><td>1</td><td>Any valid major version number of the chosen client API</td></tr>
	 * <tr><td>{@link #GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR}</td><td>0</td><td>Any valid minor version number of the chosen client API</td></tr>
	 * <tr><td>{@link #GLFW_CONTEXT_ROBUSTNESS CONTEXT_ROBUSTNESS}</td><td>{@link #GLFW_NO_ROBUSTNESS NO_ROBUSTNESS}</td><td>{@link #GLFW_NO_ROBUSTNESS NO_ROBUSTNESS} {@link #GLFW_NO_RESET_NOTIFICATION NO_RESET_NOTIFICATION} {@link #GLFW_LOSE_CONTEXT_ON_RESET LOSE_CONTEXT_ON_RESET}</td></tr>
	 * <tr><td>{@link #GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR}</td><td>{@link #GLFW_ANY_RELEASE_BEHAVIOR ANY_RELEASE_BEHAVIOR}</td><td>{@link #GLFW_ANY_RELEASE_BEHAVIOR ANY_RELEASE_BEHAVIOR} {@link #GLFW_RELEASE_BEHAVIOR_FLUSH RELEASE_BEHAVIOR_FLUSH} {@link #GLFW_RELEASE_BEHAVIOR_NONE RELEASE_BEHAVIOR_NONE}</td></tr>
	 * <tr><td>{@link #GLFW_OPENGL_FORWARD_COMPAT OPENGL_FORWARD_COMPAT}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_OPENGL_DEBUG_CONTEXT OPENGL_DEBUG_CONTEXT}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_OPENGL_PROFILE OPENGL_PROFILE}</td><td>{@link #GLFW_OPENGL_ANY_PROFILE OPENGL_ANY_PROFILE}</td><td>{@link #GLFW_OPENGL_ANY_PROFILE OPENGL_ANY_PROFILE} {@link #GLFW_OPENGL_CORE_PROFILE OPENGL_CORE_PROFILE} {@link #GLFW_OPENGL_COMPAT_PROFILE OPENGL_COMPAT_PROFILE}</td></tr>
	 * </table>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param target the window hint to set. One of:<br>{@link #GLFW_RESIZABLE RESIZABLE}, {@link #GLFW_VISIBLE VISIBLE}, {@link #GLFW_DECORATED DECORATED}, {@link #GLFW_CLIENT_API CLIENT_API}, {@link #GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR}, {@link #GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR}, {@link #GLFW_CONTEXT_REVISION CONTEXT_REVISION}, {@link #GLFW_CONTEXT_ROBUSTNESS CONTEXT_ROBUSTNESS}, {@link #GLFW_OPENGL_FORWARD_COMPAT OPENGL_FORWARD_COMPAT}, {@link #GLFW_OPENGL_DEBUG_CONTEXT OPENGL_DEBUG_CONTEXT}, {@link #GLFW_OPENGL_PROFILE OPENGL_PROFILE}, {@link #GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR}, {@link #GLFW_CONTEXT_NO_ERROR CONTEXT_NO_ERROR}, {@link #GLFW_RED_BITS RED_BITS}, {@link #GLFW_GREEN_BITS GREEN_BITS}, {@link #GLFW_BLUE_BITS BLUE_BITS}, {@link #GLFW_ALPHA_BITS ALPHA_BITS}, {@link #GLFW_DEPTH_BITS DEPTH_BITS}, {@link #GLFW_STENCIL_BITS STENCIL_BITS}, {@link #GLFW_ACCUM_RED_BITS ACCUM_RED_BITS}, {@link #GLFW_ACCUM_GREEN_BITS ACCUM_GREEN_BITS}, {@link #GLFW_ACCUM_BLUE_BITS ACCUM_BLUE_BITS}, {@link #GLFW_ACCUM_ALPHA_BITS ACCUM_ALPHA_BITS}, {@link #GLFW_AUX_BUFFERS AUX_BUFFERS}, {@link #GLFW_STEREO STEREO}, {@link #GLFW_SAMPLES SAMPLES}, {@link #GLFW_SRGB_CAPABLE SRGB_CAPABLE}, {@link #GLFW_REFRESH_RATE REFRESH_RATE}, {@link #GLFW_DOUBLE_BUFFER DOUBLE_BUFFER}
	 * @param hint   the new value of the window hint
	 *
	 * @since GLFW 2.2
	 */
	public static void glfwWindowHint(int target, int hint) {
		long __functionAddress = getInstance().WindowHint;
		invokeIIV(__functionAddress, target, hint);
	}

	// --- [ glfwCreateWindow ] ---

	/** Unsafe version of {@link #glfwCreateWindow CreateWindow} */
	@JavadocExclude
	public static long nglfwCreateWindow(int width, int height, long title, long monitor, long share) {
		long __functionAddress = getInstance().CreateWindow;
		return invokeIIPPPP(__functionAddress, width, height, title, monitor, share);
	}

	/**
	 * Creates a window and its associated OpenGL or OpenGL ES context. Most of the options controlling how the window and its context should be created are
	 * specified with window hints.
	 * 
	 * <p>Successful creation does not change which context is current. Before you can use the newly created context, you need to make it current. For information
	 * about the {@code share} parameter, see <a href="http://www.glfw.org/docs/latest/context.html#context_sharing">context sharing</a>.</p>
	 * 
	 * <p>The created window, framebuffer and context may differ from what you requested, as not all parameters and hints are hard constraints. This includes the
	 * size of the window, especially for full screen windows. To query the actual attributes of the created window, framebuffer and context, use queries like
	 * {@link #glfwGetWindowAttrib GetWindowAttrib} and {@link #glfwGetWindowSize GetWindowSize} and {@link #glfwGetFramebufferSize GetFramebufferSize}.</p>
	 * 
	 * <p>To create a full screen window, you need to specify the monitor the window will cover. If no monitor is specified, windowed mode will be used. Unless
	 * you have a way for the user to choose a specific monitor, it is recommended that you pick the primary monitor. For more information on how to query
	 * connected monitors, see <a href="http://www.glfw.org/docs/latest/monitor.html#monitor_monitors">monitors</a>.</p>
	 * 
	 * <p>For full screen windows, the specified size becomes the resolution of the window's desired video mode. As long as a full screen window has input focus,
	 * the supported video mode most closely matching the desired video mode is set for the specified monitor. For more information about full screen windows,
	 * including the creation of so called <i>windowed full screen</i> or <i>borderless full screen windows</i>, see
	 * <a href="http://www.glfw.org/docs/latest/window.html#window_windowed_full_screen">full screen</a>.</p>
	 * 
	 * <p>By default, newly created windows use the placement recommended by the window system. To create the window at a specific position, make it initially
	 * invisible using the {@link #GLFW_VISIBLE VISIBLE} window hint, set its <a href="http://www.glfw.org/docs/latest/window.html#window_pos">position</a> and then
	 * <a href="http://www.glfw.org/docs/latest/window.html#window_hide">show</a> it.</p>
	 * 
	 * <p>If a full screen window has input focus, the screensaver is prohibited from starting.</p>
	 * 
	 * <p>Window systems put limits on window sizes. Very large or very small window dimensions may be overridden by the window system on creation. Check the
	 * actual <a href="http://www.glfw.org/docs/latest/window.html#window_size">size</a> after creation.</p>
	 * 
	 * <p>The <a href="http://www.glfw.org/docs/latest/window.html#buffer_swap">swap interval</a> is not set during window creation and the initial value may vary
	 * depending on driver settings and defaults.</p>
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>This function may not be called from a callback.</li>
	 * <li><b>Windows</b>: Window creation will fail if the Microsoft GDI software OpenGL implementation is the only one available.</li>
	 * <li><b>Windows</b>: If the executable has an icon resource named {@code GLFW_ICON}, it will be set as the icon for the window. If no such icon
	 * is present, the {@code IDI_WINLOGO} icon will be used instead.</li>
	 * <li><b>Windows</b>: The context to share resources with may not be current on any other thread.</li>
	 * <li><b>OS X</b>: The GLFW window has no icon, as it is not a document window, but the dock icon will be the same as the application bundle's
	 * icon. Also, the first time a window is opened the menu bar is populated with common commands like Hide, Quit and About. The (minimal) about dialog
	 * uses information from the application's bundle. For more information on bundles, see the
	 * <a href="https://developer.apple.com/library/mac/documentation/CoreFoundation/Conceptual/CFBundles/">Bundle Programming Guide</a> in the Mac
	 * Developer Library.</li>
	 * <li><b>OS X</b>: The first time a window is created the menu bar is populated with common commands like Hide, Quit and About. The About entry opens a
	 * minimal about dialog with information from the application's bundle. The menu bar can be disabled with a
	 * <a href="http://www.glfw.org/docs/latest/compile.html#compile_options_osx">compile-time option</a>.</li>
	 * <li><b>OS X</b>: On OS X 10.10 and later the window frame will not be rendered at full resolution on Retina displays unless the
	 * {@code NSHighResolutionCapable} key is enabled in the application bundle's {@code Info.plist}. For more information, see
	 * <a href="https://developer.apple.com/library/mac/documentation/GraphicsAnimation/Conceptual/HighResolutionOSX/Explained/Explained.html">High
	 * Resolution Guidelines for OS X</a> in the Mac Developer Library.</li>
	 * <li><b>X11</b>: There is no mechanism for setting the window icon yet.</li>
	 * <li><b>X11</b>: Some window managers will not respect the placement of initially hidden windows.</li>
	 * <li><b>X11</b>: Due to the asynchronous nature of X11, it may take a moment for a window to reach its requested state. This means you may not be able
	 * to query the final size, position or other attributes directly after window creation.</li>
	 * </ul>
	 *
	 * @param width   the desired width, in screen coordinates, of the window
	 * @param height  the desired height, in screen coordinates, of the window
	 * @param title   initial, UTF-8 encoded window title
	 * @param monitor the monitor to use for fullscreen mode, or {@code NULL} to use windowed mode
	 * @param share   the window whose context to share resources with, or {@code NULL} to not share resources
	 *
	 * @return the handle of the created window, or {@code NULL} if an error occurred
	 *
	 * @since GLFW 1.0
	 */
	public static long glfwCreateWindow(int width, int height, ByteBuffer title, long monitor, long share) {
		EventLoop.OffScreen.check();
		if ( CHECKS )
			checkNT1(title);
		return nglfwCreateWindow(width, height, memAddress(title), monitor, share);
	}

	/** CharSequence version of: {@link #glfwCreateWindow CreateWindow} */
	public static long glfwCreateWindow(int width, int height, CharSequence title, long monitor, long share) {
		EventLoop.OffScreen.check();
		APIBuffer __buffer = apiBuffer();
		int titleEncoded = __buffer.stringParamUTF8(title, true);
		return nglfwCreateWindow(width, height, __buffer.address(titleEncoded), monitor, share);
	}

	// --- [ glfwDestroyWindow ] ---

	/**
	 * Destroys the specified window and its context. On calling this function, no further callbacks will be called for that window.
	 * 
	 * <p>If the context of the specified window is current on the main thread, it is detached before being destroyed.</p>
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>This function may not be called from a callback.</li>
	 * <li>The context of the specified window must not be current on any other thread when this function is called.</li>
	 * </ul>
	 *
	 * @param window the window to destroy
	 *
	 * @since GLFW 1.0
	 */
	public static void glfwDestroyWindow(long window) {
		long __functionAddress = getInstance().DestroyWindow;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window);
	}

	// --- [ glfwWindowShouldClose ] ---

	/**
	 * Returns the value of the close flag of the specified window.
	 * 
	 * <p>This function may be called from any thread.</p>
	 *
	 * @param window the window to query
	 *
	 * @return the value of the close flag
	 *
	 * @since GLFW 3.0
	 */
	public static int glfwWindowShouldClose(long window) {
		long __functionAddress = getInstance().WindowShouldClose;
		if ( CHECKS )
			checkPointer(window);
		return invokePI(__functionAddress, window);
	}

	// --- [ glfwSetWindowShouldClose ] ---

	/**
	 * Sets the value of the close flag of the specified window. This can be used to override the user's attempt to close the window, or to signal that it
	 * should be closed.
	 * 
	 * <p>This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window the window whose flag to change
	 * @param value  the new value
	 *
	 * @since GLFW 3.0
	 */
	public static void glfwSetWindowShouldClose(long window, int value) {
		long __functionAddress = getInstance().SetWindowShouldClose;
		if ( CHECKS )
			checkPointer(window);
		invokePIV(__functionAddress, window, value);
	}

	// --- [ glfwSetWindowTitle ] ---

	/** Unsafe version of {@link #glfwSetWindowTitle SetWindowTitle} */
	@JavadocExclude
	public static void nglfwSetWindowTitle(long window, long title) {
		long __functionAddress = getInstance().SetWindowTitle;
		if ( CHECKS )
			checkPointer(window);
		invokePPV(__functionAddress, window, title);
	}

	/**
	 * Sets the window title, encoded as UTF-8, of the specified window.
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 * 
	 * <p><b>OS X</b>: The window title will not be updated until the next time you process events.</p>
	 *
	 * @param window the window whose title to change
	 * @param title  the UTF-8 encoded window title
	 *
	 * @since GLFW 1.0
	 */
	public static void glfwSetWindowTitle(long window, ByteBuffer title) {
		if ( CHECKS )
			checkNT1(title);
		nglfwSetWindowTitle(window, memAddress(title));
	}

	/** CharSequence version of: {@link #glfwSetWindowTitle SetWindowTitle} */
	public static void glfwSetWindowTitle(long window, CharSequence title) {
		APIBuffer __buffer = apiBuffer();
		int titleEncoded = __buffer.stringParamUTF8(title, true);
		nglfwSetWindowTitle(window, __buffer.address(titleEncoded));
	}

	// --- [ glfwGetWindowPos ] ---

	/** Unsafe version of {@link #glfwGetWindowPos GetWindowPos} */
	@JavadocExclude
	public static void nglfwGetWindowPos(long window, long xpos, long ypos) {
		long __functionAddress = getInstance().GetWindowPos;
		if ( CHECKS )
			checkPointer(window);
		invokePPPV(__functionAddress, window, xpos, ypos);
	}

	/**
	 * Retrieves the position, in screen coordinates, of the upper-left corner of the client area of the specified window.
	 * 
	 * <p>Any or all of the position arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} position arguments will be set to zero.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window to query
	 * @param xpos   where to store the x-coordinate of the upper-left corner of the client area, or {@code NULL}
	 * @param ypos   where to store the y-coordinate of the upper-left corner of the client area, or {@code NULL}
	 *
	 * @since GLFW 3.0
	 */
	public static void glfwGetWindowPos(long window, ByteBuffer xpos, ByteBuffer ypos) {
		if ( CHECKS ) {
			if ( xpos != null ) checkBuffer(xpos, 1 << 2);
			if ( ypos != null ) checkBuffer(ypos, 1 << 2);
		}
		nglfwGetWindowPos(window, memAddressSafe(xpos), memAddressSafe(ypos));
	}

	/** Alternative version of: {@link #glfwGetWindowPos GetWindowPos} */
	public static void glfwGetWindowPos(long window, IntBuffer xpos, IntBuffer ypos) {
		if ( CHECKS ) {
			if ( xpos != null ) checkBuffer(xpos, 1);
			if ( ypos != null ) checkBuffer(ypos, 1);
		}
		nglfwGetWindowPos(window, memAddressSafe(xpos), memAddressSafe(ypos));
	}

	// --- [ glfwSetWindowPos ] ---

	/**
	 * Sets the position, in screen coordinates, of the upper-left corner of the client area of the specified windowed mode window. If the window is a full
	 * screen window, this function does nothing.
	 * 
	 * <p><b>Do not use this function</b> to move an already visible window unless you have very good reasons for doing so, as it will confuse and annoy the
	 * user.</p>
	 * 
	 * <p>The window manager may put limits on what positions are allowed. GLFW cannot and should not override these limits.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window to query
	 * @param xpos   the x-coordinate of the upper-left corner of the client area
	 * @param ypos   the y-coordinate of the upper-left corner of the client area
	 *
	 * @since GLFW 1.0
	 */
	public static void glfwSetWindowPos(long window, int xpos, int ypos) {
		long __functionAddress = getInstance().SetWindowPos;
		if ( CHECKS )
			checkPointer(window);
		invokePIIV(__functionAddress, window, xpos, ypos);
	}

	// --- [ glfwGetWindowSize ] ---

	/** Unsafe version of {@link #glfwGetWindowSize GetWindowSize} */
	@JavadocExclude
	public static void nglfwGetWindowSize(long window, long width, long height) {
		long __functionAddress = getInstance().GetWindowSize;
		if ( CHECKS )
			checkPointer(window);
		invokePPPV(__functionAddress, window, width, height);
	}

	/**
	 * Retrieves the size, in screen coordinates, of the client area of the specified window. If you wish to retrieve the size of the framebuffer of the
	 * window in pixels, see {@link #glfwGetFramebufferSize GetFramebufferSize}.
	 * 
	 * <p>Any or all of the size arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} size arguments will be set to zero.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose size to retrieve
	 * @param width  where to store the width, in screen coordinates, of the client area, or {@code NULL}
	 * @param height where to store the height, in screen coordinates, of the client area, or {@code NULL}
	 *
	 * @since GLFW 1.0
	 */
	public static void glfwGetWindowSize(long window, ByteBuffer width, ByteBuffer height) {
		if ( CHECKS ) {
			if ( width != null ) checkBuffer(width, 1 << 2);
			if ( height != null ) checkBuffer(height, 1 << 2);
		}
		nglfwGetWindowSize(window, memAddressSafe(width), memAddressSafe(height));
	}

	/** Alternative version of: {@link #glfwGetWindowSize GetWindowSize} */
	public static void glfwGetWindowSize(long window, IntBuffer width, IntBuffer height) {
		if ( CHECKS ) {
			if ( width != null ) checkBuffer(width, 1);
			if ( height != null ) checkBuffer(height, 1);
		}
		nglfwGetWindowSize(window, memAddressSafe(width), memAddressSafe(height));
	}

	// --- [ glfwSetWindowSizeLimits ] ---

	/**
	 * Sets the size limits of the client area of the specified window. If the window is full screen or not resizable, this function does nothing.
	 * 
	 * <p>The size limits are applied immediately and may cause the window to be resized. If you set size limits and an aspect ratio that conflict, the results
	 * are undefined.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window    the window to set limits for
	 * @param minwidth  the minimum width, in screen coordinates, of the client area, or {@link #GLFW_DONT_CARE DONT_CARE}
	 * @param minheight the minimum height, in screen coordinates, of the client area, or {@link #GLFW_DONT_CARE DONT_CARE}
	 * @param maxwidth  the maximum width, in screen coordinates, of the client area, or {@link #GLFW_DONT_CARE DONT_CARE}
	 * @param maxheight the maximum height, in screen coordinates, of the client area, or {@link #GLFW_DONT_CARE DONT_CARE}
	 *
	 * @since GLFW 3.2
	 */
	public static void glfwSetWindowSizeLimits(long window, int minwidth, int minheight, int maxwidth, int maxheight) {
		long __functionAddress = getInstance().SetWindowSizeLimits;
		if ( CHECKS )
			checkPointer(window);
		invokePIIIIV(__functionAddress, window, minwidth, minheight, maxwidth, maxheight);
	}

	// --- [ glfwSetWindowAspectRatio ] ---

	/**
	 * Sets the required aspect ratio of the client area of the specified window. If the window is full screen or not resizable, this function does nothing.
	 * 
	 * <p>The aspect ratio is specified as a numerator and a denominator and both values must be greater than zero. For example, the common 16:9 aspect ratio is
	 * specified as 16 and 9, respectively.</p>
	 * 
	 * <p>If the numerator and denominator is set to {@link #GLFW_DONT_CARE DONT_CARE} then the aspect ratio limit is disabled.</p>
	 * 
	 * <p>The aspect ratio is applied immediately and may cause the window to be  resized. If you set size limits and an aspect ratio that conflict, the results
	 * are undefined.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window to set limits for
	 * @param numer  the numerator of the desired aspect ratio, or {@link #GLFW_DONT_CARE DONT_CARE}
	 * @param denom  the denominator of the desired aspect ratio, or {@link #GLFW_DONT_CARE DONT_CARE}
	 *
	 * @since GLFW 3.2
	 */
	public static void glfwSetWindowAspectRatio(long window, int numer, int denom) {
		long __functionAddress = getInstance().SetWindowAspectRatio;
		if ( CHECKS )
			checkPointer(window);
		invokePIIV(__functionAddress, window, numer, denom);
	}

	// --- [ glfwSetWindowSize ] ---

	/**
	 * Sets the size, in pixels, of the client area of the specified window.
	 * 
	 * <p>For full screen windows, this function selects and switches to the resolution closest to the specified size, without affecting the window's context. As
	 * the context is unaffected, the bit depths of the framebuffer remain unchanged.</p>
	 * 
	 * <p>The window manager may put limits on what sizes are allowed. GLFW cannot and should not override these limits.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window to resize
	 * @param width  the desired width of the specified window
	 * @param height the desired height of the specified window
	 *
	 * @since GLFW 1.0
	 */
	public static void glfwSetWindowSize(long window, int width, int height) {
		long __functionAddress = getInstance().SetWindowSize;
		if ( CHECKS )
			checkPointer(window);
		invokePIIV(__functionAddress, window, width, height);
	}

	// --- [ glfwGetFramebufferSize ] ---

	/** Unsafe version of {@link #glfwGetFramebufferSize GetFramebufferSize} */
	@JavadocExclude
	public static void nglfwGetFramebufferSize(long window, long width, long height) {
		long __functionAddress = getInstance().GetFramebufferSize;
		if ( CHECKS )
			checkPointer(window);
		invokePPPV(__functionAddress, window, width, height);
	}

	/**
	 * Retrieves the size, in pixels, of the framebuffer of the specified window. If you wish to retrieve the size of the window in screen coordinates, see
	 * {@link #glfwGetWindowSize GetWindowSize}.
	 * 
	 * <p>Any or all of the size arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} size arguments will be set to zero.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose framebuffer to query
	 * @param width  where to store the width, in pixels, of the framebuffer, or {@code NULL}
	 * @param height where to store the height, in pixels, of the framebuffer, or {@code NULL}
	 *
	 * @since GLFW 3.0
	 */
	public static void glfwGetFramebufferSize(long window, ByteBuffer width, ByteBuffer height) {
		if ( CHECKS ) {
			if ( width != null ) checkBuffer(width, 1 << 2);
			if ( height != null ) checkBuffer(height, 1 << 2);
		}
		nglfwGetFramebufferSize(window, memAddressSafe(width), memAddressSafe(height));
	}

	/** Alternative version of: {@link #glfwGetFramebufferSize GetFramebufferSize} */
	public static void glfwGetFramebufferSize(long window, IntBuffer width, IntBuffer height) {
		if ( CHECKS ) {
			if ( width != null ) checkBuffer(width, 1);
			if ( height != null ) checkBuffer(height, 1);
		}
		nglfwGetFramebufferSize(window, memAddressSafe(width), memAddressSafe(height));
	}

	// --- [ glfwGetWindowFrameSize ] ---

	/** Unsafe version of {@link #glfwGetWindowFrameSize GetWindowFrameSize} */
	@JavadocExclude
	public static void nglfwGetWindowFrameSize(long window, long left, long top, long right, long bottom) {
		long __functionAddress = getInstance().GetWindowFrameSize;
		if ( CHECKS )
			checkPointer(window);
		invokePPPPPV(__functionAddress, window, left, top, right, bottom);
	}

	/**
	 * Retrieves the size, in screen coordinates, of each edge of the frame of the specified window. This size includes the title bar, if the window has one.
	 * The size of the frame may vary depending on the <a href="http://www.glfw.org/docs/latest/window.html#window-hints_wnd">window-related hints</a> used to
	 * create it.
	 * 
	 * <p>Because this function retrieves the size of each window frame edge and not the offset along a particular coordinate axis, the retrieved values will
	 * always be zero or positive.</p>
	 * 
	 * <p>Any or all of the size arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} size arguments will be set to zero.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose frame size to query
	 * @param left   where to store the size, in screen coordinates, of the left edge of the window frame, or {@code NULL}
	 * @param top    where to store the size, in screen coordinates, of the top edge of the window frame, or {@code NULL}
	 * @param right  where to store the size, in screen coordinates, of the right edge of the window frame, or {@code NULL}
	 * @param bottom where to store the size, in screen coordinates, of the bottom edge of the window frame, or {@code NULL}
	 *
	 * @since GLFW 3.1
	 */
	public static void glfwGetWindowFrameSize(long window, ByteBuffer left, ByteBuffer top, ByteBuffer right, ByteBuffer bottom) {
		if ( CHECKS ) {
			if ( left != null ) checkBuffer(left, 1 << 2);
			if ( top != null ) checkBuffer(top, 1 << 2);
			if ( right != null ) checkBuffer(right, 1 << 2);
			if ( bottom != null ) checkBuffer(bottom, 1 << 2);
		}
		nglfwGetWindowFrameSize(window, memAddressSafe(left), memAddressSafe(top), memAddressSafe(right), memAddressSafe(bottom));
	}

	/** Alternative version of: {@link #glfwGetWindowFrameSize GetWindowFrameSize} */
	public static void glfwGetWindowFrameSize(long window, IntBuffer left, IntBuffer top, IntBuffer right, IntBuffer bottom) {
		if ( CHECKS ) {
			if ( left != null ) checkBuffer(left, 1);
			if ( top != null ) checkBuffer(top, 1);
			if ( right != null ) checkBuffer(right, 1);
			if ( bottom != null ) checkBuffer(bottom, 1);
		}
		nglfwGetWindowFrameSize(window, memAddressSafe(left), memAddressSafe(top), memAddressSafe(right), memAddressSafe(bottom));
	}

	// --- [ glfwIconifyWindow ] ---

	/**
	 * Iconifies (minimizes) the specified window if it was previously restored. If the window is already iconified, this function does nothing.
	 * 
	 * <p>If the specified window is a full screen window, the original monitor resolution is restored until the window is restored.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window to iconify
	 *
	 * @since GLFW 2.1
	 */
	public static void glfwIconifyWindow(long window) {
		long __functionAddress = getInstance().IconifyWindow;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window);
	}

	// --- [ glfwRestoreWindow ] ---

	/**
	 * Restores the specified window if it was previously iconified (minimized). If the window is already restored, this function does nothing.
	 * 
	 * <p>If the specified window is a full screen window, the resolution chosen for the window is restored on the selected monitor.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window to restore
	 *
	 * @since GLFW 2.1
	 */
	public static void glfwRestoreWindow(long window) {
		long __functionAddress = getInstance().RestoreWindow;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window);
	}

	// --- [ glfwShowWindow ] ---

	/**
	 * Makes the specified window visible if it was previously hidden. If the window is already visible or is in full screen mode, this function does nothing.
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window to make visible
	 *
	 * @since GLFW 3.0
	 */
	public static void glfwShowWindow(long window) {
		long __functionAddress = getInstance().ShowWindow;
		EventLoop.OnScreen.check();
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window);
	}

	// --- [ glfwHideWindow ] ---

	/**
	 * Hides the specified window, if it was previously visible. If the window is already hidden or is in full screen mode, this function does nothing.
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window to hide
	 *
	 * @since GLFW 3.0
	 */
	public static void glfwHideWindow(long window) {
		long __functionAddress = getInstance().HideWindow;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window);
	}

	// --- [ glfwGetWindowMonitor ] ---

	/**
	 * Returns the handle of the monitor that the specified window is in full screen on.
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window to query
	 *
	 * @return the monitor, or {@code NULL} if the window is in windowed mode or an error occurred
	 *
	 * @since GLFW 3.0
	 */
	public static long glfwGetWindowMonitor(long window) {
		long __functionAddress = getInstance().GetWindowMonitor;
		if ( CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

	// --- [ glfwGetWindowAttrib ] ---

	/**
	 * Returns the value of an attribute of the specified window or its OpenGL or OpenGL ES context.
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 * 
	 * <p>Framebuffer related hints are not window attributes.</p>
	 * 
	 * <p>Zero is a valid value for many window and context related attributes so you cannot use a return value of zero as an indication of errors. However, this
	 * function should not fail as long as it is passed valid arguments and the library has been initialized.</p>
	 *
	 * @param window the window to query
	 * @param attrib the <a href="http://www.glfw.org/docs/latest/window.html#window_attribs">window attribute</a> whose value to return. One of:<br>{@link #GLFW_FOCUSED FOCUSED}, {@link #GLFW_ICONIFIED ICONIFIED}, {@link #GLFW_RESIZABLE RESIZABLE}, {@link #GLFW_VISIBLE VISIBLE}, {@link #GLFW_DECORATED DECORATED}, {@link #GLFW_AUTO_ICONIFY AUTO_ICONIFY}, {@link #GLFW_FLOATING FLOATING}
	 *
	 * @return the value of the attribute, or zero if an error occured
	 *
	 * @since GLFW 3.0
	 */
	public static int glfwGetWindowAttrib(long window, int attrib) {
		long __functionAddress = getInstance().GetWindowAttrib;
		if ( CHECKS )
			checkPointer(window);
		return invokePII(__functionAddress, window, attrib);
	}

	// --- [ glfwSetWindowUserPointer ] ---

	/**
	 * Sets the user-defined pointer of the specified window. The current value is retained until the window is destroyed. The initial value is {@code NULL}.
	 * 
	 * <p>This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window  the window whose pointer to set
	 * @param pointer the new value
	 *
	 * @since GLFW 3.0
	 */
	public static void glfwSetWindowUserPointer(long window, long pointer) {
		long __functionAddress = getInstance().SetWindowUserPointer;
		if ( CHECKS )
			checkPointer(window);
		invokePPV(__functionAddress, window, pointer);
	}

	// --- [ glfwGetWindowUserPointer ] ---

	/**
	 * Returns the current value of the user-defined pointer of the specified window. The initial value is {@code NULL}.
	 * 
	 * <p>This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @param window the window whose pointer to return
	 *
	 * @since GLFW 3.0
	 */
	public static long glfwGetWindowUserPointer(long window) {
		long __functionAddress = getInstance().GetWindowUserPointer;
		if ( CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

	// --- [ glfwSetWindowPosCallback ] ---

	/**
	 * Sets the position callback of the specified window, which is called when the window is moved. The callback is provided with the screen position of the
	 * upper-left corner of the client area of the window.
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since GLFW 1.0
	 */
	public static GLFWWindowPosCallback glfwSetWindowPosCallback(long window, GLFWWindowPosCallback cbfun) {
		long __functionAddress = getInstance().SetWindowPosCallback;
		if ( CHECKS )
			checkPointer(window);
		return GLFWWindowPosCallback.create(invokePPP(__functionAddress, window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetWindowSizeCallback ] ---

	/**
	 * Sets the size callback of the specified window, which is called when the window is resized. The callback is provided with the size, in screen
	 * coordinates, of the client area of the window.
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since GLFW 1.0
	 */
	public static GLFWWindowSizeCallback glfwSetWindowSizeCallback(long window, GLFWWindowSizeCallback cbfun) {
		long __functionAddress = getInstance().SetWindowSizeCallback;
		if ( CHECKS )
			checkPointer(window);
		return GLFWWindowSizeCallback.create(invokePPP(__functionAddress, window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetWindowCloseCallback ] ---

	/**
	 * Sets the close callback of the specified window, which is called when the user attempts to close the window, for example by clicking the close widget in
	 * the title bar.
	 * 
	 * <p>The close flag is set before this callback is called, but you can modify it at any time with {@link #glfwSetWindowShouldClose SetWindowShouldClose}.</p>
	 * 
	 * <p>The close callback is not triggered by {@link #glfwDestroyWindow DestroyWindow}.</p>
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li><b>Mac OS X:</b> Selecting Quit from the application menu will trigger the close callback for all windows.</li>
	 * </ul>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since GLFW 2.5
	 */
	public static GLFWWindowCloseCallback glfwSetWindowCloseCallback(long window, GLFWWindowCloseCallback cbfun) {
		long __functionAddress = getInstance().SetWindowCloseCallback;
		if ( CHECKS )
			checkPointer(window);
		return GLFWWindowCloseCallback.create(invokePPP(__functionAddress, window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetWindowRefreshCallback ] ---

	/**
	 * Sets the refresh callback of the specified window, which is called when the client area of the window needs to be redrawn, for example if the window has
	 * been exposed after having been covered by another window.
	 * 
	 * <p>On compositing window systems such as Aero, Compiz or Aqua, where the window contents are saved off-screen, this callback may be called only very
	 * infrequently or never at all.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since GLFW 2.5
	 */
	public static GLFWWindowRefreshCallback glfwSetWindowRefreshCallback(long window, GLFWWindowRefreshCallback cbfun) {
		long __functionAddress = getInstance().SetWindowRefreshCallback;
		if ( CHECKS )
			checkPointer(window);
		return GLFWWindowRefreshCallback.create(invokePPP(__functionAddress, window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetWindowFocusCallback ] ---

	/**
	 * Sets the focus callback of the specified window, which is called when the window gains or loses input focus.
	 * 
	 * <p>After the focus callback is called for a window that lost input focus, synthetic key and mouse button release events will be generated for all such
	 * that had been pressed. For more information, see {@link #glfwSetKeyCallback SetKeyCallback} and {@link #glfwSetMouseButtonCallback SetMouseButtonCallback}.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since GLFW 3.0
	 */
	public static GLFWWindowFocusCallback glfwSetWindowFocusCallback(long window, GLFWWindowFocusCallback cbfun) {
		long __functionAddress = getInstance().SetWindowFocusCallback;
		if ( CHECKS )
			checkPointer(window);
		return GLFWWindowFocusCallback.create(invokePPP(__functionAddress, window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetWindowIconifyCallback ] ---

	/**
	 * Sets the iconification callback of the specified window, which is called when the window is iconified or restored.
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since GLFW 3.0
	 */
	public static GLFWWindowIconifyCallback glfwSetWindowIconifyCallback(long window, GLFWWindowIconifyCallback cbfun) {
		long __functionAddress = getInstance().SetWindowIconifyCallback;
		if ( CHECKS )
			checkPointer(window);
		return GLFWWindowIconifyCallback.create(invokePPP(__functionAddress, window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetFramebufferSizeCallback ] ---

	/**
	 * Sets the framebuffer resize callback of the specified window, which is called when the framebuffer of the specified window is resized.
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since GLFW 3.0
	 */
	public static GLFWFramebufferSizeCallback glfwSetFramebufferSizeCallback(long window, GLFWFramebufferSizeCallback cbfun) {
		long __functionAddress = getInstance().SetFramebufferSizeCallback;
		if ( CHECKS )
			checkPointer(window);
		return GLFWFramebufferSizeCallback.create(invokePPP(__functionAddress, window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwPollEvents ] ---

	/**
	 * Processes all pending events.
	 * 
	 * <p>This function processes only those events that are already in the event queue and then returns immediately. Processing events will cause the window and
	 * input callbacks associated with those events to be called.</p>
	 * 
	 * <p>On some platforms, a window move, resize or menu operation will cause event processing to block. This is due to how event processing is designed on
	 * those platforms. You can use the <a href="http://www.glfw.org/docs/latest/window.html#window_refresh">window refresh callback</a> to redraw the
	 * contents of your window when necessary during such operations.</p>
	 * 
	 * <p>On some platforms, certain events are sent directly to the application without going through the event queue, causing callbacks to be called outside of
	 * a call to one of the event processing functions.</p>
	 * 
	 * <p>Event processing is not required for joystick input to work.</p>
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>This function may not be called from a callback.</li>
	 * </ul>
	 */
	public static void glfwPollEvents() {
		long __functionAddress = getInstance().PollEvents;
		EventLoop.OnScreen.check();
		invokeV(__functionAddress);
	}

	// --- [ glfwWaitEvents ] ---

	/**
	 * Waits until events are queued and processes them.
	 * 
	 * <p>This function puts the calling thread to sleep until at least one event is available in the event queue. Once one or more events are available, it
	 * behaves exactly like {@link #glfwPollEvents PollEvents}, i.e. the events in the queue are processed and the function then returns immediately. Processing events will cause
	 * the window and input callbacks associated with those events to be called.</p>
	 * 
	 * <p>Since not all events are associated with callbacks, this function may return without a callback having been called even if you are monitoring all
	 * callbacks.</p>
	 * 
	 * <p>On some platforms, a window move, resize or menu operation will cause event processing to block. This is due to how event processing is designed on
	 * those platforms. You can use the <a href="http://www.glfw.org/docs/latest/window.html#window_refresh">window refresh callback</a> to redraw the
	 * contents of your window when necessary during such operations.</p>
	 * 
	 * <p>On some platforms, certain callbacks may be called outside of a call to one of the event processing functions.</p>
	 * 
	 * <p>If no windows exist, this function returns immediately. For synchronization of threads in applications that do not create windows, use your threading
	 * library of choice.</p>
	 * 
	 * <p>Event processing is not required for joystick input to work.</p>
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>This function may not be called from a callback.</li>
	 * <li>On some platforms, certain callbacks may be called outside of a call to one of the event processing functions.</li>
	 * </ul>
	 */
	public static void glfwWaitEvents() {
		long __functionAddress = getInstance().WaitEvents;
		EventLoop.OnScreen.check();
		invokeV(__functionAddress);
	}

	// --- [ glfwPostEmptyEvent ] ---

	/**
	 * Posts an empty event from the current thread to the main thread event queue, causing {@link #glfwWaitEvents WaitEvents} to return.
	 * 
	 * <p>If no windows exist, this function returns immediately. For synchronization of threads in applications that do not create windows, use your threading
	 * library of choice.</p>
	 * 
	 * <p>This function may be called from any thread.</p>
	 */
	public static void glfwPostEmptyEvent() {
		long __functionAddress = getInstance().PostEmptyEvent;
		invokeV(__functionAddress);
	}

	// --- [ glfwGetInputMode ] ---

	/**
	 * Returns the value of an input option for the specified window.
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window to query
	 * @param mode   the input mode whose value to return. One of:<br>{@link #GLFW_CURSOR CURSOR}, {@link #GLFW_STICKY_KEYS STICKY_KEYS}, {@link #GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS}
	 *
	 * @return the input mode value
	 *
	 * @since GLFW 3.0
	 */
	public static int glfwGetInputMode(long window, int mode) {
		long __functionAddress = getInstance().GetInputMode;
		if ( CHECKS )
			checkPointer(window);
		return invokePII(__functionAddress, window, mode);
	}

	// --- [ glfwSetInputMode ] ---

	/**
	 * Sets an input option for the specified window.
	 * 
	 * <p>If {@code mode} is {@link #GLFW_CURSOR CURSOR}, the value must be one of the following cursor modes:</p>
	 * 
	 * <ul>
	 * <li>{@link #GLFW_CURSOR_NORMAL CURSOR_NORMAL} makes the cursor visible and behaving normally.</li>
	 * <li>{@link #GLFW_CURSOR_HIDDEN CURSOR_HIDDEN} makes the cursor invisible when it is over the client area of the window but does not restrict the cursor from leaving.</li>
	 * <li>{@link #GLFW_CURSOR_DISABLED CURSOR_DISABLED} hides and grabs the cursor, providing virtual and unlimited cursor movement. This is useful for implementing for example 3D camera
	 * controls.</li>
	 * </ul>
	 * 
	 * <p>If {@code mode} is {@link #GLFW_STICKY_KEYS STICKY_KEYS}, the value must be either {@link #GLFW_TRUE TRUE} to enable sticky keys, or {@link #GLFW_FALSE FALSE} to disable it. If sticky keys are
	 * enabled, a key press will ensure that {@link #glfwGetKey GetKey} returns {@link #GLFW_PRESS PRESS} the next time it is called even if the key had been released before the call. This is
	 * useful when you are only interested in whether keys have been pressed but not when or in which order.</p>
	 * 
	 * <p>If {@code mode} is {@link #GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS}, the value must be either {@link #GLFW_TRUE TRUE} to enable sticky mouse buttons, or {@link #GLFW_FALSE FALSE} to
	 * disable it. If sticky mouse buttons are enabled, a mouse button press will ensure that {@link #glfwGetMouseButton GetMouseButton} returns {@link #GLFW_PRESS PRESS} the next
	 * time it is called even if the mouse button had been released before the call. This is useful when you are only interested in whether mouse buttons have
	 * been pressed but not when or in which order.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose input mode to set
	 * @param mode   the input mode to set. One of:<br>{@link #GLFW_CURSOR CURSOR}, {@link #GLFW_STICKY_KEYS STICKY_KEYS}, {@link #GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS}
	 * @param value  the new value of the specified input mode
	 *
	 * @since GFLW 3.0
	 */
	public static void glfwSetInputMode(long window, int mode, int value) {
		long __functionAddress = getInstance().SetInputMode;
		if ( CHECKS )
			checkPointer(window);
		invokePIIV(__functionAddress, window, mode, value);
	}

	// --- [ glfwGetKeyName ] ---

	/** Unsafe version of {@link #glfwGetKeyName GetKeyName} */
	@JavadocExclude
	public static long nglfwGetKeyName(int key, int scancode) {
		long __functionAddress = getInstance().GetKeyName;
		return invokeIIP(__functionAddress, key, scancode);
	}

	/**
	 * Returns the localized name of the specified printable key.
	 * 
	 * <p>If the key is {@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN}, the scancode is used, otherwise the scancode is ignored.</p>
	 * 
	 * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the next call to {@link #glfwGetKeyName GetKeyName}, or until the
	 * library is terminated.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param key      the key to query, or {@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN}
	 * @param scancode the scancode of the key to query
	 *
	 * @return the localized name of the key
	 *
	 * @since GLFW 3.2
	 */
	public static String glfwGetKeyName(int key, int scancode) {
		long __result = nglfwGetKeyName(key, scancode);
		return memDecodeUTF8(__result);
	}

	// --- [ glfwGetKey ] ---

	/**
	 * Returns the last state reported for the specified key to the specified window. The returned state is one of {@link #GLFW_PRESS PRESS} or {@link #GLFW_RELEASE RELEASE}. The higher-level action
	 * {@link #GLFW_REPEAT REPEAT} is only reported to the key callback.
	 * 
	 * <p>If the {@link #GLFW_STICKY_KEYS STICKY_KEYS} input mode is enabled, this function returns {@link #GLFW_PRESS PRESS} the first time you call it for a key that was pressed, even if that
	 * key has already been released.</p>
	 * 
	 * <p>The key functions deal with physical keys, with key tokens named after their use on the standard US keyboard layout. If you want to input text, use the
	 * Unicode character callback instead.</p>
	 * 
	 * <p>The modifier key bit masks are not key tokens and cannot be used with this function.</p>
	 * 
	 * <p><b>Do not use this function</b> to implement <a href="http://www.glfw.org/docs/latest/input.html#input_char">text input</a>.</p>
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>{@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN} is not a valid key for this function.</li>
	 * </ul>
	 *
	 * @param window the desired window
	 * @param key    the desired keyboard key
	 *
	 * @return one of {@link #GLFW_PRESS PRESS} or {@link #GLFW_RELEASE RELEASE}
	 *
	 * @since GLFW 1.0
	 */
	public static int glfwGetKey(long window, int key) {
		long __functionAddress = getInstance().GetKey;
		if ( CHECKS )
			checkPointer(window);
		return invokePII(__functionAddress, window, key);
	}

	// --- [ glfwGetMouseButton ] ---

	/**
	 * Returns the last state reported for the specified mouse button to the specified window. The returned state is one of {@link #GLFW_PRESS PRESS} or {@link #GLFW_RELEASE RELEASE}. The
	 * higher-level action {@link #GLFW_REPEAT REPEAT} is only reported to the mouse button callback.
	 * 
	 * <p>If the {@link #GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS} input mode is enabled, this function returns {@link #GLFW_PRESS PRESS} the first time you call it for a mouse button that has been pressed,
	 * even if that mouse button has already been released.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the desired window
	 * @param button the desired mouse button
	 *
	 * @return one of {@link #GLFW_PRESS PRESS} or {@link #GLFW_RELEASE RELEASE}
	 *
	 * @since GLFW 1.0
	 */
	public static int glfwGetMouseButton(long window, int button) {
		long __functionAddress = getInstance().GetMouseButton;
		if ( CHECKS )
			checkPointer(window);
		return invokePII(__functionAddress, window, button);
	}

	// --- [ glfwGetCursorPos ] ---

	/** Unsafe version of {@link #glfwGetCursorPos GetCursorPos} */
	@JavadocExclude
	public static void nglfwGetCursorPos(long window, long xpos, long ypos) {
		long __functionAddress = getInstance().GetCursorPos;
		if ( CHECKS )
			checkPointer(window);
		invokePPPV(__functionAddress, window, xpos, ypos);
	}

	/**
	 * Returns the position of the cursor, in screen coordinates, relative to the upper-left corner of the client area of the specified window.
	 * 
	 * <p>If the cursor is disabled (with {@link #GLFW_CURSOR_DISABLED CURSOR_DISABLED}) then the cursor position is unbounded and limited only by the minimum and maximum values of a
	 * <b>double</b>.</p>
	 * 
	 * <p>The coordinates can be converted to their integer equivalents with the {@link Math#floor} function. Casting directly to an integer type works for positive
	 * coordinates, but fails for negative ones.</p>
	 * 
	 * <p>Any or all of the position arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} position arguments will be set to zero.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the desired window
	 * @param xpos   where to store the cursor x-coordinate, relative to the left edge of the client area, or {@code NULL}
	 * @param ypos   where to store the cursor y-coordinate, relative to the to top edge of the client area, or {@code NULL}.
	 *
	 * @since GLFW 1.0
	 */
	public static void glfwGetCursorPos(long window, ByteBuffer xpos, ByteBuffer ypos) {
		if ( CHECKS ) {
			if ( xpos != null ) checkBuffer(xpos, 1 << 3);
			if ( ypos != null ) checkBuffer(ypos, 1 << 3);
		}
		nglfwGetCursorPos(window, memAddressSafe(xpos), memAddressSafe(ypos));
	}

	/** Alternative version of: {@link #glfwGetCursorPos GetCursorPos} */
	public static void glfwGetCursorPos(long window, DoubleBuffer xpos, DoubleBuffer ypos) {
		if ( CHECKS ) {
			if ( xpos != null ) checkBuffer(xpos, 1);
			if ( ypos != null ) checkBuffer(ypos, 1);
		}
		nglfwGetCursorPos(window, memAddressSafe(xpos), memAddressSafe(ypos));
	}

	// --- [ glfwSetCursorPos ] ---

	/**
	 * Sets the position, in screen coordinates, of the cursor relative to the upper-left corner of the client area of the specified window. The window must
	 * have input focus. If the window does not have input focus when this function is called, it fails silently.
	 * 
	 * <p><b>Do not use this function</b> to implement things like camera controls. GLFW already provides the {@link #GLFW_CURSOR_DISABLED CURSOR_DISABLED} cursor mode that hides the cursor,
	 * transparently re-centers it and provides unconstrained cursor motion. See {@link #glfwSetInputMode SetInputMode} for more information.</p>
	 * 
	 * <p>If the cursor mode is {@link #GLFW_CURSOR_DISABLED CURSOR_DISABLED} then the cursor position is unconstrained and limited only by the minimum and maximum values of <b>double</b>.</p>
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li><b>X11:</b> Due to the asynchronous nature of X11, it may take a moment for the window focus event to arrive. This means you may not be able to set
	 * the cursor position directly after window creation.</li>
	 * </ul>
	 *
	 * @param window the desired window
	 * @param xpos   the desired x-coordinate, relative to the left edge of the client area
	 * @param ypos   the desired y-coordinate, relative to the top edge of the client area
	 *
	 * @since GLFW 1.0
	 */
	public static void glfwSetCursorPos(long window, double xpos, double ypos) {
		long __functionAddress = getInstance().SetCursorPos;
		if ( CHECKS )
			checkPointer(window);
		invokePDDV(__functionAddress, window, xpos, ypos);
	}

	// --- [ glfwCreateCursor ] ---

	/** Unsafe version of {@link #glfwCreateCursor CreateCursor} */
	@JavadocExclude
	public static long nglfwCreateCursor(long image, int xhot, int yhot) {
		long __functionAddress = getInstance().CreateCursor;
		return invokePIIP(__functionAddress, image, xhot, yhot);
	}

	/**
	 * Creates a new custom cursor image that can be set for a window with {@link #glfwSetCursor SetCursor}. The cursor can be destroyed with {@link #glfwDestroyCursor DestroyCursor}. Any remaining
	 * cursors are destroyed by {@link #glfwTerminate Terminate}.
	 * 
	 * <p>The pixels are 32-bit, little-endian, non-premultiplied RGBA, i.e. eight bits per channel. They are arranged canonically as packed sequential rows,
	 * starting from the top-left corner.</p>
	 * 
	 * <p>The cursor hotspot is specified in pixels, relative to the upper-left corner of the cursor image. Like all other coordinate systems in GLFW, the X-axis
	 * points to the right and the Y-axis points down.</p>
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>This function may not be called from a callback.</li>
	 * <li>The specified image data is copied before this function returns.</li>
	 * </ul>
	 *
	 * @param image the desired cursor image
	 * @param xhot  the desired x-coordinate, in pixels, of the cursor hotspot
	 * @param yhot  the desired y-coordinate, in pixels, of the cursor hotspot
	 *
	 * @return the handle of the created cursor, or {@code NULL} if an error occurred
	 *
	 * @since GLFW 3.1
	 */
	public static long glfwCreateCursor(GLFWImage image, int xhot, int yhot) {
		return nglfwCreateCursor(image.address(), xhot, yhot);
	}

	// --- [ glfwCreateStandardCursor ] ---

	/**
	 * Returns a cursor with a standard shape, that can be set for a window with {@link #glfwSetCursor SetCursor}.
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>This function may not be called from a callback.</li>
	 * <li>The specified image data is copied before this function returns.</li>
	 * </ul>
	 *
	 * @param shape one of the standard shapes. One of:<br>{@link #GLFW_ARROW_CURSOR ARROW_CURSOR}, {@link #GLFW_IBEAM_CURSOR IBEAM_CURSOR}, {@link #GLFW_CROSSHAIR_CURSOR CROSSHAIR_CURSOR}, {@link #GLFW_HAND_CURSOR HAND_CURSOR}, {@link #GLFW_HRESIZE_CURSOR HRESIZE_CURSOR}, {@link #GLFW_VRESIZE_CURSOR VRESIZE_CURSOR}
	 *
	 * @return a new cursor ready to use or {@code NULL} if an error occurred
	 *
	 * @since GLFW 3.1
	 */
	public static long glfwCreateStandardCursor(int shape) {
		long __functionAddress = getInstance().CreateStandardCursor;
		return invokeIP(__functionAddress, shape);
	}

	// --- [ glfwDestroyCursor ] ---

	/**
	 * Destroys a cursor previously created with {@link #glfwCreateCursor CreateCursor}. Any remaining cursors will be destroyed by {@link #glfwTerminate Terminate}.
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>This function may not be called from a callback.</li>
	 * </ul>
	 *
	 * @param cursor the cursor object to destroy
	 *
	 * @since GLFW 3.1
	 */
	public static void glfwDestroyCursor(long cursor) {
		long __functionAddress = getInstance().DestroyCursor;
		if ( CHECKS )
			checkPointer(cursor);
		invokePV(__functionAddress, cursor);
	}

	// --- [ glfwSetCursor ] ---

	/**
	 * Sets the cursor image to be used when the cursor is over the client area of the specified window. The set cursor will only be visible when the
	 * <a href="http://www.glfw.org/docs/latest/input.html#cursor_mode">cursor mode</a> of the window is {@link #GLFW_CURSOR_NORMAL CURSOR_NORMAL}.
	 * 
	 * <p>On some platforms, the set cursor may not be visible unless the window also has input focus.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window to set the system cursor for
	 * @param cursor the cursor to set, or {@code NULL} to switch back to the default arrow cursor
	 *
	 * @since GLFW 3.1
	 */
	public static void glfwSetCursor(long window, long cursor) {
		long __functionAddress = getInstance().SetCursor;
		if ( CHECKS )
			checkPointer(window);
		invokePPV(__functionAddress, window, cursor);
	}

	// --- [ glfwSetKeyCallback ] ---

	/**
	 * Sets the key callback of the specified window, which is called when a key is pressed, repeated or released.
	 * 
	 * <p>The key functions deal with physical keys, with layout independent key tokens named after their values in the standard US keyboard layout. If you want
	 * to input text, use {@link #glfwSetCharCallback SetCharCallback} instead.</p>
	 * 
	 * <p>When a window loses input focus, it will generate synthetic key release events for all pressed keys. You can tell these events from user-generated
	 * events by the fact that the synthetic ones are generated after the focus loss event has been processed, i.e. after the window focus callback has been
	 * called.</p>
	 * 
	 * <p>The scancode of a key is specific to that platform or sometimes even to that machine. Scancodes are intended to allow users to bind keys that don't have
	 * a GLFW key token. Such keys have {@code key} set to {@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN}, their state is not saved and so it cannot be queried with {@link #glfwGetKey GetKey}.</p>
	 * 
	 * <p>Sometimes GLFW needs to generate synthetic key events, in which case the scancode may be zero.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since GLFW 1.0
	 */
	public static GLFWKeyCallback glfwSetKeyCallback(long window, GLFWKeyCallback cbfun) {
		long __functionAddress = getInstance().SetKeyCallback;
		if ( CHECKS )
			checkPointer(window);
		return GLFWKeyCallback.create(invokePPP(__functionAddress, window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetCharCallback ] ---

	/**
	 * Sets the character callback of the specified window, which is called when a Unicode character is input.
	 * 
	 * <p>The character callback is intended for Unicode text input. As it deals with characters, it is keyboard layout dependent, whereas {@link #glfwSetKeyCallback SetKeyCallback} is
	 * not. Characters do not map 1:1 to physical keys, as a key may produce zero, one or more characters. If you want to know whether a specific physical key
	 * was pressed or released, see the key callback instead.</p>
	 * 
	 * <p>The character callback behaves as system text input normally does and will not be called if modifier keys are held down that would prevent normal text
	 * input on that platform, for example a Super (Command) key on OS X or Alt key on Windows. There is {@link #glfwSetCharModsCallback SetCharModsCallback} that receives these events.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since GLFW 2.4
	 */
	public static GLFWCharCallback glfwSetCharCallback(long window, GLFWCharCallback cbfun) {
		long __functionAddress = getInstance().SetCharCallback;
		if ( CHECKS )
			checkPointer(window);
		return GLFWCharCallback.create(invokePPP(__functionAddress, window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetCharModsCallback ] ---

	/**
	 * Sets the character with modifiers callback of the specified window, which is called when a Unicode character is input regardless of what modifier keys
	 * are used.
	 * 
	 * <p>The character with modifiers callback is intended for implementing custom Unicode character input. For regular Unicode text input, see
	 * {@link #glfwSetCharCallback SetCharCallback}. Like the character callback, the character with modifiers callback deals with characters and is keyboard layout dependent.
	 * Characters do not map 1:1 to physical keys, as a key may produce zero, one or more characters. If you want to know whether a specific physical key was
	 * pressed or released, see {@link #glfwSetKeyCallback SetKeyCallback} instead.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since GLFW 3.1
	 */
	public static GLFWCharModsCallback glfwSetCharModsCallback(long window, GLFWCharModsCallback cbfun) {
		long __functionAddress = getInstance().SetCharModsCallback;
		if ( CHECKS )
			checkPointer(window);
		return GLFWCharModsCallback.create(invokePPP(__functionAddress, window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetMouseButtonCallback ] ---

	/**
	 * Sets the mouse button callback of the specified window, which is called when a mouse button is pressed or released.
	 * 
	 * <p>When a window loses input focus, it will generate synthetic mouse button release events for all pressed mouse buttons. You can tell these events from
	 * user-generated events by the fact that the synthetic ones are generated after the focus loss event has been processed, i.e. after the window focus
	 * callback has been called.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since GLFW 1.0
	 */
	public static GLFWMouseButtonCallback glfwSetMouseButtonCallback(long window, GLFWMouseButtonCallback cbfun) {
		long __functionAddress = getInstance().SetMouseButtonCallback;
		if ( CHECKS )
			checkPointer(window);
		return GLFWMouseButtonCallback.create(invokePPP(__functionAddress, window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetCursorPosCallback ] ---

	/**
	 * Sets the cursor position callback of the specified window, which is called when the cursor is moved. The callback is provided with the position, in
	 * screen coordinates, relative to the upper-left corner of the client area of the window.
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since GLFW 1.0
	 */
	public static GLFWCursorPosCallback glfwSetCursorPosCallback(long window, GLFWCursorPosCallback cbfun) {
		long __functionAddress = getInstance().SetCursorPosCallback;
		if ( CHECKS )
			checkPointer(window);
		return GLFWCursorPosCallback.create(invokePPP(__functionAddress, window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetCursorEnterCallback ] ---

	/**
	 * Sets the cursor boundary crossing callback of the specified window, which is called when the cursor enters or leaves the client area of the window.
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since GLFW 3.0
	 */
	public static GLFWCursorEnterCallback glfwSetCursorEnterCallback(long window, GLFWCursorEnterCallback cbfun) {
		long __functionAddress = getInstance().SetCursorEnterCallback;
		if ( CHECKS )
			checkPointer(window);
		return GLFWCursorEnterCallback.create(invokePPP(__functionAddress, window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetScrollCallback ] ---

	/**
	 * Sets the scroll callback of the specified window, which is called when a scrolling device is used.
	 * 
	 * <p>The scroll callback receives all scrolling input, like that from a mouse wheel or a touchpad scrolling area.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since GLFW 2.1
	 */
	public static GLFWScrollCallback glfwSetScrollCallback(long window, GLFWScrollCallback cbfun) {
		long __functionAddress = getInstance().SetScrollCallback;
		if ( CHECKS )
			checkPointer(window);
		return GLFWScrollCallback.create(invokePPP(__functionAddress, window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetDropCallback ] ---

	/**
	 * Sets the file drop callback of the specified window, which is called when one or more dragged files are dropped on the window.
	 * 
	 * <p>Because the path array and its strings may have been generated specifically for that event, they are not guaranteed to be valid after the callback has
	 * returned. If you wish to use them after the callback returns, you need to make a deep copy.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since GLFW 3.1
	 */
	public static GLFWDropCallback glfwSetDropCallback(long window, GLFWDropCallback cbfun) {
		long __functionAddress = getInstance().SetDropCallback;
		if ( CHECKS )
			checkPointer(window);
		return GLFWDropCallback.create(invokePPP(__functionAddress, window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwJoystickPresent ] ---

	/**
	 * Returns whether the specified joystick is present.
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param joy joystick to query
	 *
	 * @return {@link #GLFW_TRUE TRUE} if the joystick is present, or {@link #GLFW_FALSE FALSE} otherwise
	 *
	 * @since GLFW 3.0
	 */
	public static int glfwJoystickPresent(int joy) {
		long __functionAddress = getInstance().JoystickPresent;
		return invokeII(__functionAddress, joy);
	}

	// --- [ glfwGetJoystickAxes ] ---

	/** Unsafe version of {@link #glfwGetJoystickAxes GetJoystickAxes} */
	@JavadocExclude
	public static long nglfwGetJoystickAxes(int joy, long count) {
		long __functionAddress = getInstance().GetJoystickAxes;
		return invokeIPP(__functionAddress, joy, count);
	}

	/**
	 * Returns the values of all axes of the specified joystick. Each element in the array is a value between -1.0 and 1.0.
	 * 
	 * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
	 * function is called again for that joystick or the library is terminated.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param joy the joystick to query
	 *
	 * @return an array of axis values, or {@code NULL} if the joystick is not present
	 *
	 * @since GLFW 2.2
	 */
	public static FloatBuffer glfwGetJoystickAxes(int joy) {
		APIBuffer __buffer = apiBuffer();
		int count = __buffer.intParam();
		long __result = nglfwGetJoystickAxes(joy, __buffer.address(count));
		return memFloatBuffer(__result, __buffer.intValue(count));
	}

	// --- [ glfwGetJoystickButtons ] ---

	/** Unsafe version of {@link #glfwGetJoystickButtons GetJoystickButtons} */
	@JavadocExclude
	public static long nglfwGetJoystickButtons(int joy, long count) {
		long __functionAddress = getInstance().GetJoystickButtons;
		return invokeIPP(__functionAddress, joy, count);
	}

	/**
	 * Returns the state of all buttons of the specified joystick. Each element in the array is either {@link #GLFW_PRESS PRESS} or {@link #GLFW_RELEASE RELEASE}.
	 * 
	 * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
	 * function is called again for that joystick or the library is terminated.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param joy the joystick to query
	 *
	 * @return an array of button states, or {@code NULL} if the joystick is not present
	 *
	 * @since GLFW 2.2
	 */
	public static ByteBuffer glfwGetJoystickButtons(int joy) {
		APIBuffer __buffer = apiBuffer();
		int count = __buffer.intParam();
		long __result = nglfwGetJoystickButtons(joy, __buffer.address(count));
		return memByteBuffer(__result, __buffer.intValue(count));
	}

	// --- [ glfwGetJoystickName ] ---

	/** Unsafe version of {@link #glfwGetJoystickName GetJoystickName} */
	@JavadocExclude
	public static long nglfwGetJoystickName(int joy) {
		long __functionAddress = getInstance().GetJoystickName;
		return invokeIP(__functionAddress, joy);
	}

	/**
	 * Returns the name, encoded as UTF-8, of the specified joystick.
	 * 
	 * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
	 * function is called again for that joystick or the library is terminated.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param joy the joystick to query
	 *
	 * @return the UTF-8 encoded name of the joystick, or {@code NULL} if the joystick is not present
	 *
	 * @since GLFW 3.0
	 */
	public static String glfwGetJoystickName(int joy) {
		long __result = nglfwGetJoystickName(joy);
		return memDecodeUTF8(__result);
	}

	// --- [ glfwSetClipboardString ] ---

	/** Unsafe version of {@link #glfwSetClipboardString SetClipboardString} */
	@JavadocExclude
	public static void nglfwSetClipboardString(long window, long string) {
		long __functionAddress = getInstance().SetClipboardString;
		if ( CHECKS )
			checkPointer(window);
		invokePPV(__functionAddress, window, string);
	}

	/**
	 * Sets the system clipboard to the specified, UTF-8 encoded string.
	 * 
	 * <p>The specified string is copied before this function returns.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window that will own the clipboard contents
	 * @param string a UTF-8 encoded string
	 *
	 * @since GLFW 3.0
	 */
	public static void glfwSetClipboardString(long window, ByteBuffer string) {
		if ( CHECKS )
			checkNT1(string);
		nglfwSetClipboardString(window, memAddress(string));
	}

	/** CharSequence version of: {@link #glfwSetClipboardString SetClipboardString} */
	public static void glfwSetClipboardString(long window, CharSequence string) {
		APIBuffer __buffer = apiBuffer();
		int stringEncoded = __buffer.stringParamUTF8(string, true);
		nglfwSetClipboardString(window, __buffer.address(stringEncoded));
	}

	// --- [ glfwGetClipboardString ] ---

	/** Unsafe version of {@link #glfwGetClipboardString GetClipboardString} */
	@JavadocExclude
	public static long nglfwGetClipboardString(long window) {
		long __functionAddress = getInstance().GetClipboardString;
		if ( CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

	/**
	 * Returns the contents of the system clipboard, if it contains or is convertible to a UTF-8 encoded string. If the clipboard is empty or if its contents
	 * cannot be converted, {@code NULL} is returned and a {@link #GLFW_FORMAT_UNAVAILABLE FORMAT_UNAVAILABLE} error is generated.
	 * 
	 * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the next call to {@link #glfwGetClipboardString GetClipboardString} or
	 * {@link #glfwSetClipboardString SetClipboardString}, or until the library is terminated.</p>
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>The returned string is allocated and freed by GLFW.  You should not free it yourself.</li>
	 * <li>The returned string is valid only until the next call to {@link #glfwGetClipboardString GetClipboardString} or {@link #glfwSetClipboardString SetClipboardString}.</li>
	 * </ul>
	 *
	 * @param window the window that will request the clipboard contents
	 *
	 * @return the contents of the clipboard as a UTF-8 encoded string, or {@code NULL} if an error occurred
	 *
	 * @since GLFW 3.0
	 */
	public static String glfwGetClipboardString(long window) {
		long __result = nglfwGetClipboardString(window);
		return memDecodeUTF8(__result);
	}

	// --- [ glfwGetTime ] ---

	/**
	 * Returns the value of the GLFW timer. Unless the timer has been set using {@link #glfwSetTime SetTime}, the timer measures time elapsed since GLFW was initialized.
	 * 
	 * <p>The resolution of the timer is system dependent, but is usually on the order of a few micro- or nanoseconds. It uses the highest-resolution monotonic
	 * time source on each supported platform.</p>
	 * 
	 * <p>This function may be called from any thread. Access is not synchronized.</p>
	 *
	 * @return the current value, in seconds, or zero if an error occurred
	 *
	 * @since GLFW 1.0
	 */
	public static double glfwGetTime() {
		long __functionAddress = getInstance().GetTime;
		return invokeD(__functionAddress);
	}

	// --- [ glfwSetTime ] ---

	/**
	 * Sets the value of the GLFW timer. It then continues to count up from that value. The value must be a positive finite number less than or equal to
	 * 18446744073.0, which is approximately 584.5 years.
	 * 
	 * <p>The upper limit of the timer is calculated as <code style="font-family: monospace">floor((2<sup>64</sup> - 1) / 10<sup>9</sup>)</code> and is due to implementations storing nanoseconds
	 * in 64 bits. The limit may be increased in the future.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param time the new value, in seconds
	 *
	 * @since GLFW 2.2
	 */
	public static void glfwSetTime(double time) {
		long __functionAddress = getInstance().SetTime;
		invokeDV(__functionAddress, time);
	}

	// --- [ glfwMakeContextCurrent ] ---

	/**
	 * Makes the OpenGL or OpenGL ES context of the specified window current on the calling thread. A context can only be made current on a single thread at a
	 * time and each thread can have only a single current context at a time.
	 * 
	 * <p>By default, making a context non-current implicitly forces a pipeline flush. On machines that support
	 * <a href="https://www.opengl.org/registry/specs/KHR/context_flush_control.txt">GL_KHR_context_flush_control</a>, you can control whether a context
	 * performs this flush by setting the {@link #GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR} <a href="http://www.glfw.org/docs/latest/window.html#window_hints_ctx">window hint</a>.</p>
	 * 
	 * <p>The specified window must have an OpenGL or OpenGL ES context. Specifying a window without a context will generate a {@link #GLFW_NO_WINDOW_CONTEXT NO_WINDOW_CONTEXT} error.</p>
	 * 
	 * <p>This function may be called from any thread.</p>
	 *
	 * @param window the window whose context to make current, or {@code NULL} to detach the current context
	 *
	 * @since GLFW 3.0
	 */
	public static void glfwMakeContextCurrent(long window) {
		long __functionAddress = getInstance().MakeContextCurrent;
		invokePV(__functionAddress, window);
	}

	// --- [ glfwGetCurrentContext ] ---

	/**
	 * Returns the window whose OpenGL or OpenGL ES context is current on the calling thread.
	 * 
	 * <p>This function may be called from any thread.</p>
	 *
	 * @return the window whose context is current, or {@code NULL} if no window's context is current
	 *
	 * @since GLFW 3.0
	 */
	public static long glfwGetCurrentContext() {
		long __functionAddress = getInstance().GetCurrentContext;
		return invokeP(__functionAddress);
	}

	// --- [ glfwSwapBuffers ] ---

	/**
	 * Swaps the front and back buffers of the specified window. If the swap interval is greater than zero, the GPU driver waits the specified number of screen
	 * updates before swapping the buffers.
	 * 
	 * <p>The specified window must have an OpenGL or OpenGL ES context. Specifying a window without a context will generate a {@link #GLFW_NO_WINDOW_CONTEXT NO_WINDOW_CONTEXT} error.</p>
	 * 
	 * <p>This function may be called from any thread.</p>
	 *
	 * @param window the window whose buffers to swap
	 *
	 * @since GLFW 1.0
	 */
	public static void glfwSwapBuffers(long window) {
		long __functionAddress = getInstance().SwapBuffers;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window);
	}

	// --- [ glfwSwapInterval ] ---

	/**
	 * Sets the swap interval for the current context, i.e. the number of screen updates to wait from the time {@link #glfwSwapBuffers SwapBuffers} was called before swapping the
	 * buffers and returning. This is sometimes called <i>vertical synchronization</i>, <i>vertical retrace synchronization</i> or just <i>vsync</i>.
	 * 
	 * <p>Contexts that support either of the <a href="https://www.opengl.org/registry/specs/EXT/wgl_swap_control_tear.txt">WGL_EXT_swap_control_tear</a> and
	 * <a href="https://www.opengl.org/registry/specs/EXT/glx_swap_control_tear.txt">GLX_EXT_swap_control_tear</a> extensions also accept negative swap
	 * intervals, which allow the driver to swap even if a frame arrives a little bit late. You can check for the presence of these extensions using
	 * {@link #glfwExtensionSupported ExtensionSupported}. For more information about swap tearing, see the extension specifications.</p>
	 * 
	 * <p>A context must be current on the calling thread. Calling this function without a current context will cause a {@link #GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function may be called from any thread.</li>
	 * <li>This function is not called during window creation, leaving the swap interval set to whatever is the default on that platform. This is done because
	 * some swap interval extensions used by GLFW do not allow the swap interval to be reset to zero once it has been set to a non-zero value.</li>
	 * <li>Some GPU drivers do not honor the requested swap interval, either because of a user setting that overrides the application's request or due to bugs
	 * in the driver.</li>
	 * </ul>
	 *
	 * @param interval the minimum number of screen updates to wait for until the buffers are swapped by {@link #glfwSwapBuffers SwapBuffers}
	 *
	 * @since GLFW 1.0
	 */
	public static void glfwSwapInterval(int interval) {
		long __functionAddress = getInstance().SwapInterval;
		invokeIV(__functionAddress, interval);
	}

	// --- [ glfwExtensionSupported ] ---

	/** Unsafe version of {@link #glfwExtensionSupported ExtensionSupported} */
	@JavadocExclude
	public static int nglfwExtensionSupported(long extension) {
		long __functionAddress = getInstance().ExtensionSupported;
		return invokePI(__functionAddress, extension);
	}

	/**
	 * Returns whether the specified <a href="http://www.glfw.org/docs/latest/context.html#context_glext">API extension</a> is supported by the current
	 * OpenGL or OpenGL ES context. It searches both for OpenGL and OpenGL ES extension and platform-specific context creation API extensions.
	 * 
	 * <p>A context must be current on the calling thread. Calling this function without a current context will cause a {@link #GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
	 * 
	 * <p>As this functions retrieves and searches one or more extension strings each call, it is recommended that you cache its results if it is going to be used
	 * frequently. The extension strings will not change during the lifetime of a context, so there is no danger in doing this.</p>
	 * 
	 * <p>This function may be called from any thread.</p>
	 *
	 * @param extension the ASCII encoded name of the extension
	 *
	 * @return {@link #GLFW_TRUE TRUE} if the extension is available, or {@link #GLFW_FALSE FALSE} otherwise
	 *
	 * @since GLFW 1.0
	 */
	public static int glfwExtensionSupported(ByteBuffer extension) {
		if ( CHECKS )
			checkNT1(extension);
		return nglfwExtensionSupported(memAddress(extension));
	}

	/** CharSequence version of: {@link #glfwExtensionSupported ExtensionSupported} */
	public static int glfwExtensionSupported(CharSequence extension) {
		APIBuffer __buffer = apiBuffer();
		int extensionEncoded = __buffer.stringParamASCII(extension, true);
		return nglfwExtensionSupported(__buffer.address(extensionEncoded));
	}

	// --- [ glfwGetProcAddress ] ---

	/** Unsafe version of {@link #glfwGetProcAddress GetProcAddress} */
	@JavadocExclude
	public static long nglfwGetProcAddress(long procname) {
		long __functionAddress = getInstance().GetProcAddress;
		return invokePP(__functionAddress, procname);
	}

	/**
	 * Returns the address of the specified <a href="http://www.glfw.org/docs/latest/context.html#context_glext">core or extension function</a>, if it is
	 * supported by the current context.
	 * 
	 * <p>A context must be current on the calling thread.  Calling this function without a current context will cause a {@link #GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>The address of a given function is not guaranteed to be the same between contexts.</li>
	 * <li>This function may return a non-{@code NULL} address despite the associated version or extension not being available. Always check the context version or
	 * extension string first.</li>
	 * <li>The returned function pointer is valid until the context is destroyed or the library is terminated.</li>
	 * <li>This function may be called from any thread.</li>
	 * </ul>
	 *
	 * @param procname the ASCII encoded name of the function
	 *
	 * @return the address of the function, or {@code NULL} if an error occured
	 *
	 * @since GLFW 1.0
	 */
	public static long glfwGetProcAddress(ByteBuffer procname) {
		if ( CHECKS )
			checkNT1(procname);
		return nglfwGetProcAddress(memAddress(procname));
	}

	/** CharSequence version of: {@link #glfwGetProcAddress GetProcAddress} */
	public static long glfwGetProcAddress(CharSequence procname) {
		APIBuffer __buffer = apiBuffer();
		int procnameEncoded = __buffer.stringParamASCII(procname, true);
		return nglfwGetProcAddress(__buffer.address(procnameEncoded));
	}

}