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
import static org.lwjgl.system.MemoryStack.*;
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
		GLFW_TRUE  = 1,
		GLFW_FALSE = 0;

	/** The key or button was released. */
	public static final int GLFW_RELEASE = 0;

	/** The key or button was pressed. */
	public static final int GLFW_PRESS = 1;

	/** The key was held down until it repeated. */
	public static final int GLFW_REPEAT = 2;

	/** The unknown key. */
	public static final int GLFW_KEY_UNKNOWN = -1;

	/** Printable keys. */
	public static final int
		GLFW_KEY_SPACE         = 32,
		GLFW_KEY_APOSTROPHE    = 39,
		GLFW_KEY_COMMA         = 44,
		GLFW_KEY_MINUS         = 45,
		GLFW_KEY_PERIOD        = 46,
		GLFW_KEY_SLASH         = 47,
		GLFW_KEY_0             = 48,
		GLFW_KEY_1             = 49,
		GLFW_KEY_2             = 50,
		GLFW_KEY_3             = 51,
		GLFW_KEY_4             = 52,
		GLFW_KEY_5             = 53,
		GLFW_KEY_6             = 54,
		GLFW_KEY_7             = 55,
		GLFW_KEY_8             = 56,
		GLFW_KEY_9             = 57,
		GLFW_KEY_SEMICOLON     = 59,
		GLFW_KEY_EQUAL         = 61,
		GLFW_KEY_A             = 65,
		GLFW_KEY_B             = 66,
		GLFW_KEY_C             = 67,
		GLFW_KEY_D             = 68,
		GLFW_KEY_E             = 69,
		GLFW_KEY_F             = 70,
		GLFW_KEY_G             = 71,
		GLFW_KEY_H             = 72,
		GLFW_KEY_I             = 73,
		GLFW_KEY_J             = 74,
		GLFW_KEY_K             = 75,
		GLFW_KEY_L             = 76,
		GLFW_KEY_M             = 77,
		GLFW_KEY_N             = 78,
		GLFW_KEY_O             = 79,
		GLFW_KEY_P             = 80,
		GLFW_KEY_Q             = 81,
		GLFW_KEY_R             = 82,
		GLFW_KEY_S             = 83,
		GLFW_KEY_T             = 84,
		GLFW_KEY_U             = 85,
		GLFW_KEY_V             = 86,
		GLFW_KEY_W             = 87,
		GLFW_KEY_X             = 88,
		GLFW_KEY_Y             = 89,
		GLFW_KEY_Z             = 90,
		GLFW_KEY_LEFT_BRACKET  = 91,
		GLFW_KEY_BACKSLASH     = 92,
		GLFW_KEY_RIGHT_BRACKET = 93,
		GLFW_KEY_GRAVE_ACCENT  = 96,
		GLFW_KEY_WORLD_1       = 161,
		GLFW_KEY_WORLD_2       = 162;

	/** Function keys. */
	public static final int
		GLFW_KEY_ESCAPE        = 256,
		GLFW_KEY_ENTER         = 257,
		GLFW_KEY_TAB           = 258,
		GLFW_KEY_BACKSPACE     = 259,
		GLFW_KEY_INSERT        = 260,
		GLFW_KEY_DELETE        = 261,
		GLFW_KEY_RIGHT         = 262,
		GLFW_KEY_LEFT          = 263,
		GLFW_KEY_DOWN          = 264,
		GLFW_KEY_UP            = 265,
		GLFW_KEY_PAGE_UP       = 266,
		GLFW_KEY_PAGE_DOWN     = 267,
		GLFW_KEY_HOME          = 268,
		GLFW_KEY_END           = 269,
		GLFW_KEY_CAPS_LOCK     = 280,
		GLFW_KEY_SCROLL_LOCK   = 281,
		GLFW_KEY_NUM_LOCK      = 282,
		GLFW_KEY_PRINT_SCREEN  = 283,
		GLFW_KEY_PAUSE         = 284,
		GLFW_KEY_F1            = 290,
		GLFW_KEY_F2            = 291,
		GLFW_KEY_F3            = 292,
		GLFW_KEY_F4            = 293,
		GLFW_KEY_F5            = 294,
		GLFW_KEY_F6            = 295,
		GLFW_KEY_F7            = 296,
		GLFW_KEY_F8            = 297,
		GLFW_KEY_F9            = 298,
		GLFW_KEY_F10           = 299,
		GLFW_KEY_F11           = 300,
		GLFW_KEY_F12           = 301,
		GLFW_KEY_F13           = 302,
		GLFW_KEY_F14           = 303,
		GLFW_KEY_F15           = 304,
		GLFW_KEY_F16           = 305,
		GLFW_KEY_F17           = 306,
		GLFW_KEY_F18           = 307,
		GLFW_KEY_F19           = 308,
		GLFW_KEY_F20           = 309,
		GLFW_KEY_F21           = 310,
		GLFW_KEY_F22           = 311,
		GLFW_KEY_F23           = 312,
		GLFW_KEY_F24           = 313,
		GLFW_KEY_F25           = 314,
		GLFW_KEY_KP_0          = 320,
		GLFW_KEY_KP_1          = 321,
		GLFW_KEY_KP_2          = 322,
		GLFW_KEY_KP_3          = 323,
		GLFW_KEY_KP_4          = 324,
		GLFW_KEY_KP_5          = 325,
		GLFW_KEY_KP_6          = 326,
		GLFW_KEY_KP_7          = 327,
		GLFW_KEY_KP_8          = 328,
		GLFW_KEY_KP_9          = 329,
		GLFW_KEY_KP_DECIMAL    = 330,
		GLFW_KEY_KP_DIVIDE     = 331,
		GLFW_KEY_KP_MULTIPLY   = 332,
		GLFW_KEY_KP_SUBTRACT   = 333,
		GLFW_KEY_KP_ADD        = 334,
		GLFW_KEY_KP_ENTER      = 335,
		GLFW_KEY_KP_EQUAL      = 336,
		GLFW_KEY_LEFT_SHIFT    = 340,
		GLFW_KEY_LEFT_CONTROL  = 341,
		GLFW_KEY_LEFT_ALT      = 342,
		GLFW_KEY_LEFT_SUPER    = 343,
		GLFW_KEY_RIGHT_SHIFT   = 344,
		GLFW_KEY_RIGHT_CONTROL = 345,
		GLFW_KEY_RIGHT_ALT     = 346,
		GLFW_KEY_RIGHT_SUPER   = 347,
		GLFW_KEY_MENU          = 348,
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
		GLFW_MOUSE_BUTTON_1      = 0,
		GLFW_MOUSE_BUTTON_2      = 1,
		GLFW_MOUSE_BUTTON_3      = 2,
		GLFW_MOUSE_BUTTON_4      = 3,
		GLFW_MOUSE_BUTTON_5      = 4,
		GLFW_MOUSE_BUTTON_6      = 5,
		GLFW_MOUSE_BUTTON_7      = 6,
		GLFW_MOUSE_BUTTON_8      = 7,
		GLFW_MOUSE_BUTTON_LAST   = GLFW_MOUSE_BUTTON_8,
		GLFW_MOUSE_BUTTON_LEFT   = GLFW_MOUSE_BUTTON_1,
		GLFW_MOUSE_BUTTON_RIGHT  = GLFW_MOUSE_BUTTON_2,
		GLFW_MOUSE_BUTTON_MIDDLE = GLFW_MOUSE_BUTTON_3;

	/** Joysticks. See <a href="http://www.glfw.org/docs/latest/input.html#joystick">joystick input</a> for how these are used. */
	public static final int
		GLFW_JOYSTICK_1    = 0,
		GLFW_JOYSTICK_2    = 1,
		GLFW_JOYSTICK_3    = 2,
		GLFW_JOYSTICK_4    = 3,
		GLFW_JOYSTICK_5    = 4,
		GLFW_JOYSTICK_6    = 5,
		GLFW_JOYSTICK_7    = 6,
		GLFW_JOYSTICK_8    = 7,
		GLFW_JOYSTICK_9    = 8,
		GLFW_JOYSTICK_10   = 9,
		GLFW_JOYSTICK_11   = 10,
		GLFW_JOYSTICK_12   = 11,
		GLFW_JOYSTICK_13   = 12,
		GLFW_JOYSTICK_14   = 13,
		GLFW_JOYSTICK_15   = 14,
		GLFW_JOYSTICK_16   = 15,
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
	 * GLFW could not find support for the requested API on the system.
	 * 
	 * <p>The installed graphics driver does not support the requested API, or does not support it via the chosen context creation backend. Below are a few
	 * examples:</p>
	 * 
	 * <p>Some pre-installed Windows graphics drivers do not support OpenGL. AMD only supports OpenGL ES via EGL, while Nvidia and Intel only support it via a
	 * WGL or GLX extension. OS X does not provide OpenGL ES at all. The Mesa EGL, OpenGL and OpenGL ES libraries do not interface with the Nvidia binary
	 * driver. Older graphics drivers do not support Vulkan.</p>
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

	/**
	 * {@link #glfwWindowHint WindowHint}: Specifies whether the windowed mode window will be given input focus when created. This hint is ignored for full screen and
	 * initially hidden windows.
	 * 
	 * <p>{@link #glfwGetWindowAttrib GetWindowAttrib}: Indicates whether the specified window has input focus.</p>
	 */
	public static final int GLFW_FOCUSED = 0x20001;

	/** {@link #glfwGetWindowAttrib GetWindowAttrib}: Indicates whether the specified window is iconified, whether by the user or with {@link #glfwIconifyWindow IconifyWindow}. */
	public static final int GLFW_ICONIFIED = 0x20002;

	/**
	 * {@link #glfwWindowHint WindowHint}: Specifies whether the windowed mode window will be resizable <i>by the user</i>. The window will still be resizable using the
	 * {@link #glfwSetWindowSize SetWindowSize} function. This hint is ignored for full screen windows.
	 * 
	 * <p>{@link #glfwGetWindowAttrib GetWindowAttrib}: Indicates whether the specified window is resizable <i>by the user</i>.</p>
	 */
	public static final int GLFW_RESIZABLE = 0x20003;

	/**
	 * {@link #glfwWindowHint WindowHint}: Specifies whether the windowed mode window will be initially visible. This hint is ignored for full screen windows. Windows created
	 * hidden are completely invisible to the user until shown. This can be useful if you need to set up your window further before showing it, for
	 * example moving it to a specific location.
	 * 
	 * <p>{@link #glfwGetWindowAttrib GetWindowAttrib}: Indicates whether the specified window is visible. Window visibility can be controlled with {@link #glfwShowWindow ShowWindow} and {@link #glfwHideWindow HideWindow}.</p>
	 */
	public static final int GLFW_VISIBLE = 0x20004;

	/**
	 * {@link #glfwWindowHint WindowHint}: Specifies whether the windowed mode window will have window decorations such as a border, a close widget, etc. An undecorated window
	 * may still allow the user to generate close events on some platforms. This hint is ignored for full screen windows.
	 * 
	 * <p>{@link #glfwGetWindowAttrib GetWindowAttrib}: Indicates whether the specified window has decorations such as a border, a close widget, etc.</p>
	 */
	public static final int GLFW_DECORATED = 0x20005;

	/**
	 * {@link #glfwWindowHint WindowHint}: Specifies whether the full screen window will automatically iconify and restore the previous video mode on input focus loss. This
	 * hint is ignored for windowed mode windows.
	 */
	public static final int GLFW_AUTO_ICONIFY = 0x20006;

	/**
	 * {@link #glfwWindowHint WindowHint}: Specifies whether the windowed mode window will be floating above other regular windows, also called topmost or always-on-top. This
	 * is intended primarily for debugging purposes and cannot be used to implement proper full screen windows. This hint is ignored for full screen
	 * windows.
	 * 
	 * <p>{@link #glfwGetWindowAttrib GetWindowAttrib}: Indicates whether the specified window is floating, also called topmost or always-on-top.</p>
	 */
	public static final int GLFW_FLOATING = 0x20007;

	/**
	 * {@link #glfwWindowHint WindowHint}: Specifies whether the windowed mode window will be maximized when created. This hint is ignored for full screen windows.
	 * 
	 * <p>{@link #glfwGetWindowAttrib GetWindowAttrib}: Indicates whether the specified window is maximized, whether by the user or {@link #glfwMaximizeWindow MaximizeWindow}.</p>
	 */
	public static final int GLFW_MAXIMIZED = 0x20008;

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
	public static final int GLFW_DONT_CARE = -1;

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
		GLFW_DOUBLEBUFFER     = 0x21010;

	/**
	 * {@link #glfwWindowHint WindowHint}: Specifies which client API to create the context for. Possible values are {@link #GLFW_OPENGL_API OPENGL_API}, {@link #GLFW_OPENGL_ES_API OPENGL_ES_API} and {@link #GLFW_NO_API NO_API}. This is a hard
	 * constraint.
	 * 
	 * <p>{@link #glfwGetWindowAttrib GetWindowAttrib}: Indicates the client API provided by the window's context; either {@link #GLFW_OPENGL_API OPENGL_API}, {@link #GLFW_OPENGL_ES_API OPENGL_ES_API} or {@link #GLFW_NO_API NO_API}.</p>
	 */
	public static final int GLFW_CLIENT_API = 0x22001;

	/**
	 * {@link #glfwWindowHint WindowHint}: Specifies the client API major version that the created context must be compatible with. The exact behavior of this hint depends on
	 * the requested client API.
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>While there is no way to ask the driver for a context of the highest supported version, GLFW will attempt to provide this when you ask for a
	 * version 1.0 context, which is the default for these hints.</li>
	 * <li><b>OpenGL</b>: {@link #GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR} and {@link #GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR} are not hard constraints, but creation will fail if the OpenGL version of the
	 * created context is less than the one requested. It is therefore perfectly safe to use the default of version 1.0 for legacy code and you will
	 * still get backwards-compatible contexts of version 3.0 and above when available.</li>
	 * <li><b>OpenGL ES</b>: {@link #GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR} and {@link #GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR} are not hard constraints, but creation will fail if the OpenGL ES version
	 * of the created context is less than the one requested. Additionally, OpenGL ES 1.x cannot be returned if 2.0 or later was requested, and vice
	 * versa. This is because OpenGL ES 3.x is backward compatible with 2.0, but OpenGL ES 2.0 is not backward compatible with 1.x.</li>
	 * </ul>
	 * 
	 * <p>{@link #glfwGetWindowAttrib GetWindowAttrib}: Indicate the client API major version of the window's context.</p>
	 */
	public static final int GLFW_CONTEXT_VERSION_MAJOR = 0x22002;

	/**
	 * {@link #glfwWindowHint WindowHint}: Specifies the client API minor version that the created context must be compatible with. The exact behavior of this hint depends on
	 * the requested client API.
	 * 
	 * <p>{@link #glfwGetWindowAttrib GetWindowAttrib}: Indicate the client API minor version of the window's context.</p>
	 */
	public static final int GLFW_CONTEXT_VERSION_MINOR = 0x22003;

	/** {@link #glfwGetWindowAttrib GetWindowAttrib}: Indicates the client API version of the window's context. */
	public static final int GLFW_CONTEXT_REVISION = 0x22004;

	/**
	 * {@link #glfwWindowHint WindowHint}: Specifies the robustness strategy to be used by the context. This can be one of {@link #GLFW_NO_RESET_NOTIFICATION NO_RESET_NOTIFICATION} or {@link #GLFW_LOSE_CONTEXT_ON_RESET LOSE_CONTEXT_ON_RESET}, or
	 * {@link #GLFW_NO_ROBUSTNESS NO_ROBUSTNESS} to not request a robustness strategy.
	 * 
	 * <p>{@link #glfwGetWindowAttrib GetWindowAttrib}: Indicates the robustness strategy used by the context. This is {@link #GLFW_LOSE_CONTEXT_ON_RESET LOSE_CONTEXT_ON_RESET} or {@link #GLFW_NO_RESET_NOTIFICATION NO_RESET_NOTIFICATION} if the window's
	 * context supports robustness, or {@link #GLFW_NO_ROBUSTNESS NO_ROBUSTNESS} otherwise.</p>
	 */
	public static final int GLFW_CONTEXT_ROBUSTNESS = 0x22005;

	/**
	 * {@link #glfwWindowHint WindowHint}: Specifies whether the OpenGL context should be forward-compatible, i.e. one where all functionality deprecated in the requested
	 * version of OpenGL is removed. This must only be used if the requested OpenGL version is 3.0 or above. If OpenGL ES is requested, this hint is
	 * ignored.
	 * 
	 * <p>{@link #glfwGetWindowAttrib GetWindowAttrib}: Indicates if the window's context is an OpenGL forward-compatible one.</p>
	 */
	public static final int GLFW_OPENGL_FORWARD_COMPAT = 0x22006;

	/**
	 * {@link #glfwWindowHint WindowHint}: Specifies whether to create a debug OpenGL context, which may have additional error and performance issue reporting functionality.
	 * If OpenGL ES is requested, this hint is ignored.
	 * 
	 * <p>{@link #glfwGetWindowAttrib GetWindowAttrib}: Indicates if the window's context is an OpenGL debug context.</p>
	 */
	public static final int GLFW_OPENGL_DEBUG_CONTEXT = 0x22007;

	/**
	 * {@link #glfwWindowHint WindowHint}: Specifies which OpenGL profile to create the context for. Possible values are one of {@link #GLFW_OPENGL_CORE_PROFILE OPENGL_CORE_PROFILE} or {@link #GLFW_OPENGL_COMPAT_PROFILE OPENGL_COMPAT_PROFILE},
	 * or {@link #GLFW_OPENGL_ANY_PROFILE OPENGL_ANY_PROFILE} to not request a specific profile. If requesting an OpenGL version below 3.2, {@link #GLFW_OPENGL_ANY_PROFILE OPENGL_ANY_PROFILE} must be used. If OpenGL ES
	 * is requested, this hint is ignored.
	 * 
	 * <p>{@link #glfwGetWindowAttrib GetWindowAttrib}: Indicates the OpenGL profile used by the context. This is {@link #GLFW_OPENGL_CORE_PROFILE OPENGL_CORE_PROFILE} or {@link #GLFW_OPENGL_COMPAT_PROFILE OPENGL_COMPAT_PROFILE} if the context uses a
	 * known profile, or {@link #GLFW_OPENGL_ANY_PROFILE OPENGL_ANY_PROFILE} if the OpenGL profile is unknown or the context is an OpenGL ES context. Note that the returned profile may
	 * not match the profile bits of the context flags, as GLFW will try other means of detecting the profile when no bits are set.</p>
	 */
	public static final int GLFW_OPENGL_PROFILE = 0x22008;

	/**
	 * {@link #glfwWindowHint WindowHint}: Specifies the release behavior to be used by the context. If the behavior is {@link #GLFW_ANY_RELEASE_BEHAVIOR ANY_RELEASE_BEHAVIOR}, the default behavior of the
	 * context creation API will be used. If the behavior is {@link #GLFW_RELEASE_BEHAVIOR_FLUSH RELEASE_BEHAVIOR_FLUSH}, the pipeline will be flushed whenever the context is released from
	 * being the current one. If the behavior is {@link #GLFW_RELEASE_BEHAVIOR_NONE RELEASE_BEHAVIOR_NONE}, the pipeline will not be flushed on release.
	 */
	public static final int GLFW_CONTEXT_RELEASE_BEHAVIOR = 0x22009;

	/**
	 * {@link #glfwWindowHint WindowHint}: Specifies whether errors should be generated by the context. If enabled, situations that would have generated errors instead cause
	 * undefined behavior.
	 */
	public static final int GLFW_CONTEXT_NO_ERROR = 0x2200A;

	/**
	 * {@link #glfwWindowHint WindowHint}: Specifies which context creation API to use to create the context. Possible values are {@link #GLFW_NATIVE_CONTEXT_API NATIVE_CONTEXT_API} and {@link #GLFW_EGL_CONTEXT_API EGL_CONTEXT_API}.
	 * This is a hard constraint. If no client API is requested, this hint is ignored.
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li><b>Mac OS X</b>: The EGL API is not available on this platform and requests to use it will fail.</li>
	 * <li><b>Wayland, Mir</b>: The EGL API <i>is</i> the native context creation API, so this hint will have no effect.</li>
	 * <li>An OpenGL extension loader library that assumes it knows which context creation API is used on a given platform may fail if you change this
	 * hint. This can be resolved by having it load via {@link #glfwGetProcAddress GetProcAddress}, which always uses the selected API.</li>
	 * </ul>
	 * 
	 * <p>{@link #glfwGetWindowAttrib GetWindowAttrib}: Indicates the context creation API used to create the window's context; either {@link #GLFW_NATIVE_CONTEXT_API NATIVE_CONTEXT_API} or {@link #GLFW_EGL_CONTEXT_API EGL_CONTEXT_API}.</p>
	 */
	public static final int GLFW_CONTEXT_CREATION_API = 0x2200B;

	/** Values for the {@link #GLFW_CLIENT_API CLIENT_API} hint. */
	public static final int
		GLFW_NO_API        = 0,
		GLFW_OPENGL_API    = 0x30001,
		GLFW_OPENGL_ES_API = 0x30002;

	/** Values for the {@link #GLFW_CONTEXT_ROBUSTNESS CONTEXT_ROBUSTNESS} hint. */
	public static final int
		GLFW_NO_ROBUSTNESS         = 0,
		GLFW_NO_RESET_NOTIFICATION = 0x31001,
		GLFW_LOSE_CONTEXT_ON_RESET = 0x31002;

	/** Values for the {@link #GLFW_OPENGL_PROFILE OPENGL_PROFILE} hint. */
	public static final int
		GLFW_OPENGL_ANY_PROFILE    = 0,
		GLFW_OPENGL_CORE_PROFILE   = 0x32001,
		GLFW_OPENGL_COMPAT_PROFILE = 0x32002;

	/** Values for the {@link #GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR} hint. */
	public static final int
		GLFW_ANY_RELEASE_BEHAVIOR   = 0,
		GLFW_RELEASE_BEHAVIOR_FLUSH = 0x35001,
		GLFW_RELEASE_BEHAVIOR_NONE  = 0x35002;

	/** Values for the {@link #GLFW_CONTEXT_CREATION_API CONTEXT_CREATION_API} hint. */
	public static final int
		GLFW_NATIVE_CONTEXT_API = 0x36001,
		GLFW_EGL_CONTEXT_API    = 0x36002;

	protected GLFW() {
		throw new UnsupportedOperationException();
	}

	private static final SharedLibrary GLFW = Library.loadNative(Configuration.GLFW_LIBRARY_NAME.get(Pointer.BITS64 ? "glfw" : "glfw32"));

	/** Contains the function pointers loaded from the glfw {@link SharedLibrary}. */
	public static final class Functions {

		private Functions() {}

		/** Function address. */
		public static final long
			Init                       = apiGetFunctionAddress(GLFW, "glfwInit"),
			Terminate                  = apiGetFunctionAddress(GLFW, "glfwTerminate"),
			GetVersion                 = apiGetFunctionAddress(GLFW, "glfwGetVersion"),
			GetVersionString           = apiGetFunctionAddress(GLFW, "glfwGetVersionString"),
			SetErrorCallback           = apiGetFunctionAddress(GLFW, "glfwSetErrorCallback"),
			GetMonitors                = apiGetFunctionAddress(GLFW, "glfwGetMonitors"),
			GetPrimaryMonitor          = apiGetFunctionAddress(GLFW, "glfwGetPrimaryMonitor"),
			GetMonitorPos              = apiGetFunctionAddress(GLFW, "glfwGetMonitorPos"),
			GetMonitorPhysicalSize     = apiGetFunctionAddress(GLFW, "glfwGetMonitorPhysicalSize"),
			GetMonitorName             = apiGetFunctionAddress(GLFW, "glfwGetMonitorName"),
			SetMonitorCallback         = apiGetFunctionAddress(GLFW, "glfwSetMonitorCallback"),
			GetVideoModes              = apiGetFunctionAddress(GLFW, "glfwGetVideoModes"),
			GetVideoMode               = apiGetFunctionAddress(GLFW, "glfwGetVideoMode"),
			SetGamma                   = apiGetFunctionAddress(GLFW, "glfwSetGamma"),
			GetGammaRamp               = apiGetFunctionAddress(GLFW, "glfwGetGammaRamp"),
			SetGammaRamp               = apiGetFunctionAddress(GLFW, "glfwSetGammaRamp"),
			DefaultWindowHints         = apiGetFunctionAddress(GLFW, "glfwDefaultWindowHints"),
			WindowHint                 = apiGetFunctionAddress(GLFW, "glfwWindowHint"),
			CreateWindow               = apiGetFunctionAddress(GLFW, "glfwCreateWindow"),
			DestroyWindow              = apiGetFunctionAddress(GLFW, "glfwDestroyWindow"),
			WindowShouldClose          = apiGetFunctionAddress(GLFW, "glfwWindowShouldClose"),
			SetWindowShouldClose       = apiGetFunctionAddress(GLFW, "glfwSetWindowShouldClose"),
			SetWindowTitle             = apiGetFunctionAddress(GLFW, "glfwSetWindowTitle"),
			SetWindowIcon              = apiGetFunctionAddress(GLFW, "glfwSetWindowIcon"),
			GetWindowPos               = apiGetFunctionAddress(GLFW, "glfwGetWindowPos"),
			SetWindowPos               = apiGetFunctionAddress(GLFW, "glfwSetWindowPos"),
			GetWindowSize              = apiGetFunctionAddress(GLFW, "glfwGetWindowSize"),
			SetWindowSizeLimits        = apiGetFunctionAddress(GLFW, "glfwSetWindowSizeLimits"),
			SetWindowAspectRatio       = apiGetFunctionAddress(GLFW, "glfwSetWindowAspectRatio"),
			SetWindowSize              = apiGetFunctionAddress(GLFW, "glfwSetWindowSize"),
			GetFramebufferSize         = apiGetFunctionAddress(GLFW, "glfwGetFramebufferSize"),
			GetWindowFrameSize         = apiGetFunctionAddress(GLFW, "glfwGetWindowFrameSize"),
			IconifyWindow              = apiGetFunctionAddress(GLFW, "glfwIconifyWindow"),
			RestoreWindow              = apiGetFunctionAddress(GLFW, "glfwRestoreWindow"),
			MaximizeWindow             = apiGetFunctionAddress(GLFW, "glfwMaximizeWindow"),
			ShowWindow                 = apiGetFunctionAddress(GLFW, "glfwShowWindow"),
			HideWindow                 = apiGetFunctionAddress(GLFW, "glfwHideWindow"),
			FocusWindow                = apiGetFunctionAddress(GLFW, "glfwFocusWindow"),
			GetWindowMonitor           = apiGetFunctionAddress(GLFW, "glfwGetWindowMonitor"),
			SetWindowMonitor           = apiGetFunctionAddress(GLFW, "glfwSetWindowMonitor"),
			GetWindowAttrib            = apiGetFunctionAddress(GLFW, "glfwGetWindowAttrib"),
			SetWindowUserPointer       = apiGetFunctionAddress(GLFW, "glfwSetWindowUserPointer"),
			GetWindowUserPointer       = apiGetFunctionAddress(GLFW, "glfwGetWindowUserPointer"),
			SetWindowPosCallback       = apiGetFunctionAddress(GLFW, "glfwSetWindowPosCallback"),
			SetWindowSizeCallback      = apiGetFunctionAddress(GLFW, "glfwSetWindowSizeCallback"),
			SetWindowCloseCallback     = apiGetFunctionAddress(GLFW, "glfwSetWindowCloseCallback"),
			SetWindowRefreshCallback   = apiGetFunctionAddress(GLFW, "glfwSetWindowRefreshCallback"),
			SetWindowFocusCallback     = apiGetFunctionAddress(GLFW, "glfwSetWindowFocusCallback"),
			SetWindowIconifyCallback   = apiGetFunctionAddress(GLFW, "glfwSetWindowIconifyCallback"),
			SetFramebufferSizeCallback = apiGetFunctionAddress(GLFW, "glfwSetFramebufferSizeCallback"),
			PollEvents                 = apiGetFunctionAddress(GLFW, "glfwPollEvents"),
			WaitEvents                 = apiGetFunctionAddress(GLFW, "glfwWaitEvents"),
			WaitEventsTimeout          = apiGetFunctionAddress(GLFW, "glfwWaitEventsTimeout"),
			PostEmptyEvent             = apiGetFunctionAddress(GLFW, "glfwPostEmptyEvent"),
			GetInputMode               = apiGetFunctionAddress(GLFW, "glfwGetInputMode"),
			SetInputMode               = apiGetFunctionAddress(GLFW, "glfwSetInputMode"),
			GetKeyName                 = apiGetFunctionAddress(GLFW, "glfwGetKeyName"),
			GetKey                     = apiGetFunctionAddress(GLFW, "glfwGetKey"),
			GetMouseButton             = apiGetFunctionAddress(GLFW, "glfwGetMouseButton"),
			GetCursorPos               = apiGetFunctionAddress(GLFW, "glfwGetCursorPos"),
			SetCursorPos               = apiGetFunctionAddress(GLFW, "glfwSetCursorPos"),
			CreateCursor               = apiGetFunctionAddress(GLFW, "glfwCreateCursor"),
			CreateStandardCursor       = apiGetFunctionAddress(GLFW, "glfwCreateStandardCursor"),
			DestroyCursor              = apiGetFunctionAddress(GLFW, "glfwDestroyCursor"),
			SetCursor                  = apiGetFunctionAddress(GLFW, "glfwSetCursor"),
			SetKeyCallback             = apiGetFunctionAddress(GLFW, "glfwSetKeyCallback"),
			SetCharCallback            = apiGetFunctionAddress(GLFW, "glfwSetCharCallback"),
			SetCharModsCallback        = apiGetFunctionAddress(GLFW, "glfwSetCharModsCallback"),
			SetMouseButtonCallback     = apiGetFunctionAddress(GLFW, "glfwSetMouseButtonCallback"),
			SetCursorPosCallback       = apiGetFunctionAddress(GLFW, "glfwSetCursorPosCallback"),
			SetCursorEnterCallback     = apiGetFunctionAddress(GLFW, "glfwSetCursorEnterCallback"),
			SetScrollCallback          = apiGetFunctionAddress(GLFW, "glfwSetScrollCallback"),
			SetDropCallback            = apiGetFunctionAddress(GLFW, "glfwSetDropCallback"),
			JoystickPresent            = apiGetFunctionAddress(GLFW, "glfwJoystickPresent"),
			GetJoystickAxes            = apiGetFunctionAddress(GLFW, "glfwGetJoystickAxes"),
			GetJoystickButtons         = apiGetFunctionAddress(GLFW, "glfwGetJoystickButtons"),
			GetJoystickName            = apiGetFunctionAddress(GLFW, "glfwGetJoystickName"),
			SetJoystickCallback        = apiGetFunctionAddress(GLFW, "glfwSetJoystickCallback"),
			SetClipboardString         = apiGetFunctionAddress(GLFW, "glfwSetClipboardString"),
			GetClipboardString         = apiGetFunctionAddress(GLFW, "glfwGetClipboardString"),
			GetTime                    = apiGetFunctionAddress(GLFW, "glfwGetTime"),
			SetTime                    = apiGetFunctionAddress(GLFW, "glfwSetTime"),
			GetTimerValue              = apiGetFunctionAddress(GLFW, "glfwGetTimerValue"),
			GetTimerFrequency          = apiGetFunctionAddress(GLFW, "glfwGetTimerFrequency"),
			MakeContextCurrent         = apiGetFunctionAddress(GLFW, "glfwMakeContextCurrent"),
			GetCurrentContext          = apiGetFunctionAddress(GLFW, "glfwGetCurrentContext"),
			SwapBuffers                = apiGetFunctionAddress(GLFW, "glfwSwapBuffers"),
			SwapInterval               = apiGetFunctionAddress(GLFW, "glfwSwapInterval"),
			ExtensionSupported         = apiGetFunctionAddress(GLFW, "glfwExtensionSupported"),
			GetProcAddress             = apiGetFunctionAddress(GLFW, "glfwGetProcAddress");

	}

	/** Returns the glfw {@link SharedLibrary}. */
	public static SharedLibrary getLibrary() {
		return GLFW;
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
	 * <li>This function must only be called from the main thread.</li>
	 * <li><b>Mac OS X</b>: This function will change the current directory of the application to the `Contents/Resources` subdirectory of the application's
	 * bundle, if present.</li>
	 * </ul>
	 *
	 * @return {@link #GLFW_TRUE TRUE} if successful, or {@link #GLFW_FALSE FALSE} if an error occured.
	 *
	 * @since version 1.0
	 */
	public static boolean glfwInit() {
		long __functionAddress = Functions.Init;
		return invokeI(__functionAddress) != 0;
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
	 * <li>This function must only be called from the main thread.</li>
	 * <li>This function must not be called from a callback.</li>
	 * <li>No window's context may be current on another thread when this function is called.</li>
	 * </ul>
	 */
	public static void glfwTerminate() {
		long __functionAddress = Functions.Terminate;
		invokeV(__functionAddress);
	}

	// --- [ glfwGetVersion ] ---

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
	 * @since version 1.0
	 */
	public static void nglfwGetVersion(long major, long minor, long rev) {
		long __functionAddress = Functions.GetVersion;
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
	 * @since version 1.0
	 */
	public static void glfwGetVersion(IntBuffer major, IntBuffer minor, IntBuffer rev) {
		if ( CHECKS ) {
			if ( major != null ) checkBuffer(major, 1);
			if ( minor != null ) checkBuffer(minor, 1);
			if ( rev != null ) checkBuffer(rev, 1);
		}
		nglfwGetVersion(memAddressSafe(major), memAddressSafe(minor), memAddressSafe(rev));
	}

	// --- [ glfwGetVersionString ] ---

	/**
	 * Returns the compile-time generated version string of the GLFW library binary. It describes the version, platform, compiler and any platform-specific
	 * compile-time options. It should not be confused with the OpenGL or OpenGL ES version string, queried with {@code glGetString}.
	 * 
	 * <p><b>Do not use the version string</b> to parse the GLFW library version. The {@link #glfwGetVersion GetVersion} function already provides the version of the library binary
	 * in numerical format.</p>
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
	 * @return the ASCII encoded GLFW version string
	 *
	 * @since version 3.0
	 */
	public static long nglfwGetVersionString() {
		long __functionAddress = Functions.GetVersionString;
		return invokeP(__functionAddress);
	}

	/**
	 * Returns the compile-time generated version string of the GLFW library binary. It describes the version, platform, compiler and any platform-specific
	 * compile-time options. It should not be confused with the OpenGL or OpenGL ES version string, queried with {@code glGetString}.
	 * 
	 * <p><b>Do not use the version string</b> to parse the GLFW library version. The {@link #glfwGetVersion GetVersion} function already provides the version of the library binary
	 * in numerical format.</p>
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
	 * @return the ASCII encoded GLFW version string
	 *
	 * @since version 3.0
	 */
	public static String glfwGetVersionString() {
		long __result = nglfwGetVersionString();
		return memASCII(__result);
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
	 * <li>This function must only be called from the main thread.</li>
	 * </ul>
	 *
	 * @param cbfun the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 3.0
	 */
	public static long nglfwSetErrorCallback(long cbfun) {
		long __functionAddress = Functions.SetErrorCallback;
		return invokePP(__functionAddress, cbfun);
	}

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
	 * <li>This function must only be called from the main thread.</li>
	 * </ul>
	 *
	 * @param cbfun the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 3.0
	 */
	public static GLFWErrorCallback glfwSetErrorCallback(GLFWErrorCallbackI cbfun) {
		return GLFWErrorCallback.create(nglfwSetErrorCallback(cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwGetMonitors ] ---

	/**
	 * Returns an array of handles for all currently connected monitors. The primary monitor is always first in the returned array. If no monitors were found,
	 * this function returns {@code NULL}.
	 * 
	 * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is guaranteed to be valid only until the monitor configuration
	 * changes or the library is terminated.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param count where to store the number of monitors in the returned array. This is set to zero if an error occurred.
	 *
	 * @return an array of monitor handlers, or {@code NULL} if no monitors were found or if an error occured
	 *
	 * @since version 3.0
	 */
	public static long nglfwGetMonitors(long count) {
		long __functionAddress = Functions.GetMonitors;
		return invokePP(__functionAddress, count);
	}

	/**
	 * Returns an array of handles for all currently connected monitors. The primary monitor is always first in the returned array. If no monitors were found,
	 * this function returns {@code NULL}.
	 * 
	 * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is guaranteed to be valid only until the monitor configuration
	 * changes or the library is terminated.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @return an array of monitor handlers, or {@code NULL} if no monitors were found or if an error occured
	 *
	 * @since version 3.0
	 */
	public static PointerBuffer glfwGetMonitors() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		IntBuffer count = stack.callocInt(1);
		try {
			long __result = nglfwGetMonitors(memAddress(count));
			return memPointerBuffer(__result, count.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glfwGetPrimaryMonitor ] ---

	/**
	 * Returns the primary monitor. This is usually the monitor where elements like the task bar or global menu bar are located.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 * 
	 * <p>The primary monitor is always first in the array returned by {@link #glfwGetMonitors GetMonitors}.</p>
	 *
	 * @return the primary monitor, or {@code NULL} if no monitors were found or if an error occured
	 *
	 * @since version 3.0
	 */
	public static long glfwGetPrimaryMonitor() {
		long __functionAddress = Functions.GetPrimaryMonitor;
		return invokeP(__functionAddress);
	}

	// --- [ glfwGetMonitorPos ] ---

	/**
	 * Returns the position, in screen coordinates, of the upper-left corner of the specified monitor.
	 * 
	 * <p>Any or all of the position arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} position arguments will be set to zero.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param monitor the monitor to query
	 * @param xpos    where to store the monitor x-coordinate, or {@code NULL}
	 * @param ypos    where to store the monitor y-coordinate, or {@code NULL}
	 *
	 * @since version 3.0
	 */
	public static void nglfwGetMonitorPos(long monitor, long xpos, long ypos) {
		long __functionAddress = Functions.GetMonitorPos;
		if ( CHECKS )
			checkPointer(monitor);
		invokePPPV(__functionAddress, monitor, xpos, ypos);
	}

	/**
	 * Returns the position, in screen coordinates, of the upper-left corner of the specified monitor.
	 * 
	 * <p>Any or all of the position arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} position arguments will be set to zero.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param monitor the monitor to query
	 * @param xpos    where to store the monitor x-coordinate, or {@code NULL}
	 * @param ypos    where to store the monitor y-coordinate, or {@code NULL}
	 *
	 * @since version 3.0
	 */
	public static void glfwGetMonitorPos(long monitor, IntBuffer xpos, IntBuffer ypos) {
		if ( CHECKS ) {
			if ( xpos != null ) checkBuffer(xpos, 1);
			if ( ypos != null ) checkBuffer(ypos, 1);
		}
		nglfwGetMonitorPos(monitor, memAddressSafe(xpos), memAddressSafe(ypos));
	}

	// --- [ glfwGetMonitorPhysicalSize ] ---

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
	 * <li>This function must only be called from the main thread.</li>
	 * <li><b>Windows</b>: The OS calculates the returned physical size from the current resolution and system DPI instead of querying the monitor EDID data.</li>
	 * </ul>
	 *
	 * @param monitor  the monitor to query
	 * @param widthMM  where to store the width, in millimetres, of the monitor's display area, or {@code NULL}
	 * @param heightMM where to store the height, in millimetres, of the monitor's display area, or {@code NULL}
	 *
	 * @since version 3.0
	 */
	public static void nglfwGetMonitorPhysicalSize(long monitor, long widthMM, long heightMM) {
		long __functionAddress = Functions.GetMonitorPhysicalSize;
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
	 * <li>This function must only be called from the main thread.</li>
	 * <li><b>Windows</b>: The OS calculates the returned physical size from the current resolution and system DPI instead of querying the monitor EDID data.</li>
	 * </ul>
	 *
	 * @param monitor  the monitor to query
	 * @param widthMM  where to store the width, in millimetres, of the monitor's display area, or {@code NULL}
	 * @param heightMM where to store the height, in millimetres, of the monitor's display area, or {@code NULL}
	 *
	 * @since version 3.0
	 */
	public static void glfwGetMonitorPhysicalSize(long monitor, IntBuffer widthMM, IntBuffer heightMM) {
		if ( CHECKS ) {
			if ( widthMM != null ) checkBuffer(widthMM, 1);
			if ( heightMM != null ) checkBuffer(heightMM, 1);
		}
		nglfwGetMonitorPhysicalSize(monitor, memAddressSafe(widthMM), memAddressSafe(heightMM));
	}

	// --- [ glfwGetMonitorName ] ---

	/**
	 * Returns a human-readable name, encoded as UTF-8, of the specified monitor. The name typically reflects the make and model of the monitor and is not
	 * guaranteed to be unique among the connected monitors.
	 * 
	 * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected or the
	 * library is terminated.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param monitor the monitor to query
	 *
	 * @return the UTF-8 encoded name of the monitor, or {@code NULL} if an error occured
	 *
	 * @since version 3.0
	 */
	public static long nglfwGetMonitorName(long monitor) {
		long __functionAddress = Functions.GetMonitorName;
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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param monitor the monitor to query
	 *
	 * @return the UTF-8 encoded name of the monitor, or {@code NULL} if an error occured
	 *
	 * @since version 3.0
	 */
	public static String glfwGetMonitorName(long monitor) {
		long __result = nglfwGetMonitorName(monitor);
		return memUTF8(__result);
	}

	// --- [ glfwSetMonitorCallback ] ---

	/**
	 * Sets the monitor configuration callback, or removes the currently set callback. This is called when a monitor is connected to or disconnected from the
	 * system.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param cbfun the new callback, or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been initialized
	 *
	 * @since version 3.0
	 */
	public static long nglfwSetMonitorCallback(long cbfun) {
		long __functionAddress = Functions.SetMonitorCallback;
		return invokePP(__functionAddress, cbfun);
	}

	/**
	 * Sets the monitor configuration callback, or removes the currently set callback. This is called when a monitor is connected to or disconnected from the
	 * system.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param cbfun the new callback, or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been initialized
	 *
	 * @since version 3.0
	 */
	public static GLFWMonitorCallback glfwSetMonitorCallback(GLFWMonitorCallbackI cbfun) {
		return GLFWMonitorCallback.create(nglfwSetMonitorCallback(cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwGetVideoModes ] ---

	/**
	 * Returns an array of all video modes supported by the specified monitor. The returned array is sorted in ascending order, first by color bit depth (the
	 * sum of all channel depths) and then by resolution area (the product of width and height).
	 * 
	 * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected, this
	 * function is called again for that monitor or the library is terminated.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param monitor the monitor to query
	 * @param count   where to store the number of video modes in the returned array. This is set to zero if an error occurred.
	 *
	 * @return an array of video modes, or {@code NULL} if an error occured
	 *
	 * @since version 1.0
	 */
	public static long nglfwGetVideoModes(long monitor, long count) {
		long __functionAddress = Functions.GetVideoModes;
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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param monitor the monitor to query
	 *
	 * @return an array of video modes, or {@code NULL} if an error occured
	 *
	 * @since version 1.0
	 */
	public static GLFWVidMode.Buffer glfwGetVideoModes(long monitor) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		IntBuffer count = stack.callocInt(1);
		try {
			long __result = nglfwGetVideoModes(monitor, memAddress(count));
			return GLFWVidMode.create(__result, count.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glfwGetVideoMode ] ---

	/**
	 * Returns the current video mode of the specified monitor. If you have created a full screen window for that monitor, the return value will depend on
	 * whether that window is iconified.
	 * 
	 * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected or the
	 * library is terminated.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param monitor the monitor to query
	 *
	 * @return the current mode of the monitor, or {@code NULL} if an error occurred
	 *
	 * @since version 3.0
	 */
	public static long nglfwGetVideoMode(long monitor) {
		long __functionAddress = Functions.GetVideoMode;
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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param monitor the monitor to query
	 *
	 * @return the current mode of the monitor, or {@code NULL} if an error occurred
	 *
	 * @since version 3.0
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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param monitor the monitor whose gamma ramp to set
	 * @param gamma   the desired exponent
	 *
	 * @since version 3.0
	 */
	public static void glfwSetGamma(long monitor, float gamma) {
		long __functionAddress = Functions.SetGamma;
		if ( CHECKS )
			checkPointer(monitor);
		invokePV(__functionAddress, monitor, gamma);
	}

	// --- [ glfwGetGammaRamp ] ---

	/**
	 * Returns the current gamma ramp of the specified monitor.
	 * 
	 * <p>The returned structure and its arrays are allocated and freed by GLFW. You should not free them yourself. They are valid until the specified monitor is
	 * disconnected, this function is called again for that monitor or the library is terminated.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param monitor the monitor to query
	 *
	 * @return the current gamma ramp, or {@code NULL} if an error occurred
	 *
	 * @since version 3.0
	 */
	public static long nglfwGetGammaRamp(long monitor) {
		long __functionAddress = Functions.GetGammaRamp;
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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param monitor the monitor to query
	 *
	 * @return the current gamma ramp, or {@code NULL} if an error occurred
	 *
	 * @since version 3.0
	 */
	public static GLFWGammaRamp glfwGetGammaRamp(long monitor) {
		long __result = nglfwGetGammaRamp(monitor);
		return GLFWGammaRamp.create(__result);
	}

	// --- [ glfwSetGammaRamp ] ---

	/**
	 * Sets the current gamma ramp for the specified monitor. The original gamma ramp for that monitor is saved by GLFW the first time this function is called
	 * and is restored by {@link #glfwTerminate Terminate}.
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function must only be called from the main thread.</li>
	 * <li>Gamma ramp sizes other than 256 are not supported by all hardware</li>
	 * <li><b>Windows</b>: The gamma ramp size must be 256.</li>
	 * <li>The specified gamma ramp is copied before this function returns.</li>
	 * </ul>
	 *
	 * @param monitor the monitor whose gamma ramp to set
	 * @param ramp    the gamma ramp to use
	 *
	 * @since version 3.0
	 */
	public static void nglfwSetGammaRamp(long monitor, long ramp) {
		long __functionAddress = Functions.SetGammaRamp;
		if ( CHECKS ) {
			checkPointer(monitor);
			GLFWGammaRamp.validate(ramp);
		}
		invokePPV(__functionAddress, monitor, ramp);
	}

	/**
	 * Sets the current gamma ramp for the specified monitor. The original gamma ramp for that monitor is saved by GLFW the first time this function is called
	 * and is restored by {@link #glfwTerminate Terminate}.
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function must only be called from the main thread.</li>
	 * <li>Gamma ramp sizes other than 256 are not supported by all hardware</li>
	 * <li><b>Windows</b>: The gamma ramp size must be 256.</li>
	 * <li>The specified gamma ramp is copied before this function returns.</li>
	 * </ul>
	 *
	 * @param monitor the monitor whose gamma ramp to set
	 * @param ramp    the gamma ramp to use
	 *
	 * @since version 3.0
	 */
	public static void glfwSetGammaRamp(long monitor, GLFWGammaRamp ramp) {
		nglfwSetGammaRamp(monitor, ramp.address());
	}

	// --- [ glfwDefaultWindowHints ] ---

	/**
	 * Resets all window hints to their default values. See {@link #glfwWindowHint WindowHint} for details.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 */
	public static void glfwDefaultWindowHints() {
		long __functionAddress = Functions.DefaultWindowHints;
		invokeV(__functionAddress);
	}

	// --- [ glfwWindowHint ] ---

	/**
	 * Sets hints for the next call to {@link #glfwCreateWindow CreateWindow}. The hints, once set, retain their values until changed by a call to glfwWindowHint or
	 * {@link #glfwDefaultWindowHints DefaultWindowHints}, or until the library is terminated.
	 * 
	 * <p>This function does not check whether the specified hint values are valid. If you set hints to invalid values this will instead be reported by the next
	 * call to {@link #glfwCreateWindow CreateWindow}.</p>
	 * 
	 * <h5>Supported and default values</h5>
	 * 
	 * <table class=lwjgl>
	 * <tr><th>Name</th><th>Default value</th><th>Supported values</th></tr>
	 * <tr><td>{@link #GLFW_RESIZABLE RESIZABLE}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_VISIBLE VISIBLE}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_DECORATED DECORATED}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_FOCUSED FOCUSED}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_AUTO_ICONIFY AUTO_ICONIFY}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_FLOATING FLOATING}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_MAXIMIZED MAXIMIZED}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_RED_BITS RED_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
	 * <tr><td>{@link #GLFW_GREEN_BITS GREEN_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
	 * <tr><td>{@link #GLFW_BLUE_BITS BLUE_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
	 * <tr><td>{@link #GLFW_ALPHA_BITS ALPHA_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
	 * <tr><td>{@link #GLFW_DEPTH_BITS DEPTH_BITS}</td><td>24</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
	 * <tr><td>{@link #GLFW_STENCIL_BITS STENCIL_BITS}</td><td>8</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
	 * <tr><td>{@link #GLFW_ACCUM_RED_BITS ACCUM_RED_BITS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
	 * <tr><td>{@link #GLFW_ACCUM_GREEN_BITS ACCUM_GREEN_BITS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
	 * <tr><td>{@link #GLFW_ACCUM_BLUE_BITS ACCUM_BLUE_BITS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
	 * <tr><td>{@link #GLFW_ACCUM_ALPHA_BITS ACCUM_ALPHA_BITS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
	 * <tr><td>{@link #GLFW_AUX_BUFFERS AUX_BUFFERS}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
	 * <tr><td>{@link #GLFW_SAMPLES SAMPLES}</td><td>0</td><td>0 to {@link Integer#MAX_VALUE}</td></tr>
	 * <tr><td>{@link #GLFW_REFRESH_RATE REFRESH_RATE}</td><td>{@link #GLFW_DONT_CARE DONT_CARE}</td><td>0 to {@link Integer#MAX_VALUE} or {@link #GLFW_DONT_CARE DONT_CARE}</td></tr>
	 * <tr><td>{@link #GLFW_STEREO STEREO}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_SRGB_CAPABLE SRGB_CAPABLE}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_DOUBLEBUFFER DOUBLEBUFFER}</td><td>{@link #GLFW_TRUE TRUE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_CLIENT_API CLIENT_API}</td><td>{@link #GLFW_OPENGL_API OPENGL_API}</td><td>{@link #GLFW_NO_API NO_API} {@link #GLFW_OPENGL_API OPENGL_API} {@link #GLFW_OPENGL_ES_API OPENGL_ES_API}</td></tr>
	 * <tr><td>{@link #GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR}</td><td>1</td><td>Any valid major version number of the chosen client API</td></tr>
	 * <tr><td>{@link #GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR}</td><td>0</td><td>Any valid minor version number of the chosen client API</td></tr>
	 * <tr><td>{@link #GLFW_CONTEXT_ROBUSTNESS CONTEXT_ROBUSTNESS}</td><td>{@link #GLFW_NO_ROBUSTNESS NO_ROBUSTNESS}</td><td>{@link #GLFW_NO_ROBUSTNESS NO_ROBUSTNESS} {@link #GLFW_NO_RESET_NOTIFICATION NO_RESET_NOTIFICATION} {@link #GLFW_LOSE_CONTEXT_ON_RESET LOSE_CONTEXT_ON_RESET}</td></tr>
	 * <tr><td>{@link #GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR}</td><td>{@link #GLFW_ANY_RELEASE_BEHAVIOR ANY_RELEASE_BEHAVIOR}</td><td>{@link #GLFW_ANY_RELEASE_BEHAVIOR ANY_RELEASE_BEHAVIOR} {@link #GLFW_RELEASE_BEHAVIOR_FLUSH RELEASE_BEHAVIOR_FLUSH} {@link #GLFW_RELEASE_BEHAVIOR_NONE RELEASE_BEHAVIOR_NONE}</td></tr>
	 * <tr><td>{@link #GLFW_CONTEXT_NO_ERROR CONTEXT_NO_ERROR}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_CONTEXT_CREATION_API CONTEXT_CREATION_API}</td><td>{@link #GLFW_NATIVE_CONTEXT_API NATIVE_CONTEXT_API}</td><td>{@link #GLFW_NATIVE_CONTEXT_API NATIVE_CONTEXT_API} {@link #GLFW_EGL_CONTEXT_API EGL_CONTEXT_API}</td></tr>
	 * <tr><td>{@link #GLFW_OPENGL_FORWARD_COMPAT OPENGL_FORWARD_COMPAT}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_OPENGL_DEBUG_CONTEXT OPENGL_DEBUG_CONTEXT}</td><td>{@link #GLFW_FALSE FALSE}</td><td>{@link #GLFW_TRUE TRUE} or {@link #GLFW_FALSE FALSE}</td></tr>
	 * <tr><td>{@link #GLFW_OPENGL_PROFILE OPENGL_PROFILE}</td><td>{@link #GLFW_OPENGL_ANY_PROFILE OPENGL_ANY_PROFILE}</td><td>{@link #GLFW_OPENGL_ANY_PROFILE OPENGL_ANY_PROFILE} {@link #GLFW_OPENGL_CORE_PROFILE OPENGL_CORE_PROFILE} {@link #GLFW_OPENGL_COMPAT_PROFILE OPENGL_COMPAT_PROFILE}</td></tr>
	 * </table>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param hint  the window hint to set. One of:<br><table><tr><td>{@link #GLFW_FOCUSED FOCUSED}</td><td>{@link #GLFW_RESIZABLE RESIZABLE}</td><td>{@link #GLFW_VISIBLE VISIBLE}</td><td>{@link #GLFW_DECORATED DECORATED}</td><td>{@link #GLFW_AUTO_ICONIFY AUTO_ICONIFY}</td><td>{@link #GLFW_FLOATING FLOATING}</td></tr><tr><td>{@link #GLFW_MAXIMIZED MAXIMIZED}</td><td>{@link #GLFW_CLIENT_API CLIENT_API}</td><td>{@link #GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR}</td><td>{@link #GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR}</td><td>{@link #GLFW_CONTEXT_ROBUSTNESS CONTEXT_ROBUSTNESS}</td><td>{@link #GLFW_OPENGL_FORWARD_COMPAT OPENGL_FORWARD_COMPAT}</td></tr><tr><td>{@link #GLFW_OPENGL_DEBUG_CONTEXT OPENGL_DEBUG_CONTEXT}</td><td>{@link #GLFW_OPENGL_PROFILE OPENGL_PROFILE}</td><td>{@link #GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR}</td><td>{@link #GLFW_CONTEXT_NO_ERROR CONTEXT_NO_ERROR}</td><td>{@link #GLFW_CONTEXT_CREATION_API CONTEXT_CREATION_API}</td><td>{@link #GLFW_RED_BITS RED_BITS}</td></tr><tr><td>{@link #GLFW_GREEN_BITS GREEN_BITS}</td><td>{@link #GLFW_BLUE_BITS BLUE_BITS}</td><td>{@link #GLFW_ALPHA_BITS ALPHA_BITS}</td><td>{@link #GLFW_DEPTH_BITS DEPTH_BITS}</td><td>{@link #GLFW_STENCIL_BITS STENCIL_BITS}</td><td>{@link #GLFW_ACCUM_RED_BITS ACCUM_RED_BITS}</td></tr><tr><td>{@link #GLFW_ACCUM_GREEN_BITS ACCUM_GREEN_BITS}</td><td>{@link #GLFW_ACCUM_BLUE_BITS ACCUM_BLUE_BITS}</td><td>{@link #GLFW_ACCUM_ALPHA_BITS ACCUM_ALPHA_BITS}</td><td>{@link #GLFW_AUX_BUFFERS AUX_BUFFERS}</td><td>{@link #GLFW_STEREO STEREO}</td><td>{@link #GLFW_SAMPLES SAMPLES}</td></tr><tr><td>{@link #GLFW_SRGB_CAPABLE SRGB_CAPABLE}</td><td>{@link #GLFW_REFRESH_RATE REFRESH_RATE}</td><td>{@link #GLFW_DOUBLEBUFFER DOUBLEBUFFER}</td></tr></table>
	 * @param value the new value of the window hint
	 *
	 * @since version 2.2
	 */
	public static void glfwWindowHint(int hint, int value) {
		long __functionAddress = Functions.WindowHint;
		invokeV(__functionAddress, hint, value);
	}

	// --- [ glfwCreateWindow ] ---

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
	 * <p>To create a full screen window, you need to specify the monitor the window will cover. If no monitor is specified, the window will be windowed mode.
	 * Unless you have a way for the user to choose a specific monitor, it is recommended that you pick the primary monitor. For more information on how to
	 * query connected monitors, see <a href="http://www.glfw.org/docs/latest/monitor.html#monitor_monitors">monitors</a>.</p>
	 * 
	 * <p>For full screen windows, the specified size becomes the resolution of the window's <i>desired video mode</i>. As long as a full screen window is not
	 * iconified, the supported video mode most closely matching the desired video mode is set for the specified monitor. For more information about full
	 * screen windows, including the creation of so called <i>windowed full screen</i> or <i>borderless full screen</i> windows, see
	 * <a href="http://www.glfw.org/docs/latest/window.html#window_windowed_full_screen">full screen</a>.</p>
	 * 
	 * <p>By default, newly created windows use the placement recommended by the window system. To create the window at a specific position, make it initially
	 * invisible using the {@link #GLFW_VISIBLE VISIBLE} window hint, set its <a href="http://www.glfw.org/docs/latest/window.html#window_pos">position</a> and then
	 * <a href="http://www.glfw.org/docs/latest/window.html#window_hide">show</a> it.</p>
	 * 
	 * <p>As long as at least one full screen window is not iconified, the screensaver is prohibited from starting.</p>
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
	 * <li>This function must only be called from the main thread.</li>
	 * <li>This function must not be called from a callback.</li>
	 * <li><b>Windows</b>: Window creation will fail if the Microsoft GDI software OpenGL implementation is the only one available.</li>
	 * <li><b>Windows</b>: If the executable has an icon resource named {@code GLFW_ICON}, it will be set as the initial icon for the window. If no such icon
	 * is present, the {@code IDI_WINLOGO} icon will be used instead. To set a different icon, see {@link #glfwSetWindowIcon SetWindowIcon}.</li>
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
	 * @param monitor the monitor to use for fullscreen mode, or {@code NULL} for windowed mode
	 * @param share   the window whose context to share resources with, or {@code NULL} to not share resources
	 *
	 * @return the handle of the created window, or {@code NULL} if an error occurred
	 *
	 * @since version 1.0
	 */
	public static long nglfwCreateWindow(int width, int height, long title, long monitor, long share) {
		long __functionAddress = Functions.CreateWindow;
		return invokePPPP(__functionAddress, width, height, title, monitor, share);
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
	 * <p>To create a full screen window, you need to specify the monitor the window will cover. If no monitor is specified, the window will be windowed mode.
	 * Unless you have a way for the user to choose a specific monitor, it is recommended that you pick the primary monitor. For more information on how to
	 * query connected monitors, see <a href="http://www.glfw.org/docs/latest/monitor.html#monitor_monitors">monitors</a>.</p>
	 * 
	 * <p>For full screen windows, the specified size becomes the resolution of the window's <i>desired video mode</i>. As long as a full screen window is not
	 * iconified, the supported video mode most closely matching the desired video mode is set for the specified monitor. For more information about full
	 * screen windows, including the creation of so called <i>windowed full screen</i> or <i>borderless full screen</i> windows, see
	 * <a href="http://www.glfw.org/docs/latest/window.html#window_windowed_full_screen">full screen</a>.</p>
	 * 
	 * <p>By default, newly created windows use the placement recommended by the window system. To create the window at a specific position, make it initially
	 * invisible using the {@link #GLFW_VISIBLE VISIBLE} window hint, set its <a href="http://www.glfw.org/docs/latest/window.html#window_pos">position</a> and then
	 * <a href="http://www.glfw.org/docs/latest/window.html#window_hide">show</a> it.</p>
	 * 
	 * <p>As long as at least one full screen window is not iconified, the screensaver is prohibited from starting.</p>
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
	 * <li>This function must only be called from the main thread.</li>
	 * <li>This function must not be called from a callback.</li>
	 * <li><b>Windows</b>: Window creation will fail if the Microsoft GDI software OpenGL implementation is the only one available.</li>
	 * <li><b>Windows</b>: If the executable has an icon resource named {@code GLFW_ICON}, it will be set as the initial icon for the window. If no such icon
	 * is present, the {@code IDI_WINLOGO} icon will be used instead. To set a different icon, see {@link #glfwSetWindowIcon SetWindowIcon}.</li>
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
	 * @param monitor the monitor to use for fullscreen mode, or {@code NULL} for windowed mode
	 * @param share   the window whose context to share resources with, or {@code NULL} to not share resources
	 *
	 * @return the handle of the created window, or {@code NULL} if an error occurred
	 *
	 * @since version 1.0
	 */
	public static long glfwCreateWindow(int width, int height, ByteBuffer title, long monitor, long share) {
		EventLoop.OffScreen.check();
		if ( CHECKS )
			checkNT1(title);
		return nglfwCreateWindow(width, height, memAddress(title), monitor, share);
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
	 * <p>To create a full screen window, you need to specify the monitor the window will cover. If no monitor is specified, the window will be windowed mode.
	 * Unless you have a way for the user to choose a specific monitor, it is recommended that you pick the primary monitor. For more information on how to
	 * query connected monitors, see <a href="http://www.glfw.org/docs/latest/monitor.html#monitor_monitors">monitors</a>.</p>
	 * 
	 * <p>For full screen windows, the specified size becomes the resolution of the window's <i>desired video mode</i>. As long as a full screen window is not
	 * iconified, the supported video mode most closely matching the desired video mode is set for the specified monitor. For more information about full
	 * screen windows, including the creation of so called <i>windowed full screen</i> or <i>borderless full screen</i> windows, see
	 * <a href="http://www.glfw.org/docs/latest/window.html#window_windowed_full_screen">full screen</a>.</p>
	 * 
	 * <p>By default, newly created windows use the placement recommended by the window system. To create the window at a specific position, make it initially
	 * invisible using the {@link #GLFW_VISIBLE VISIBLE} window hint, set its <a href="http://www.glfw.org/docs/latest/window.html#window_pos">position</a> and then
	 * <a href="http://www.glfw.org/docs/latest/window.html#window_hide">show</a> it.</p>
	 * 
	 * <p>As long as at least one full screen window is not iconified, the screensaver is prohibited from starting.</p>
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
	 * <li>This function must only be called from the main thread.</li>
	 * <li>This function must not be called from a callback.</li>
	 * <li><b>Windows</b>: Window creation will fail if the Microsoft GDI software OpenGL implementation is the only one available.</li>
	 * <li><b>Windows</b>: If the executable has an icon resource named {@code GLFW_ICON}, it will be set as the initial icon for the window. If no such icon
	 * is present, the {@code IDI_WINLOGO} icon will be used instead. To set a different icon, see {@link #glfwSetWindowIcon SetWindowIcon}.</li>
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
	 * @param monitor the monitor to use for fullscreen mode, or {@code NULL} for windowed mode
	 * @param share   the window whose context to share resources with, or {@code NULL} to not share resources
	 *
	 * @return the handle of the created window, or {@code NULL} if an error occurred
	 *
	 * @since version 1.0
	 */
	public static long glfwCreateWindow(int width, int height, CharSequence title, long monitor, long share) {
		EventLoop.OffScreen.check();
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer titleEncoded = stack.UTF8(title);
			return nglfwCreateWindow(width, height, memAddress(titleEncoded), monitor, share);
		} finally {
			stack.setPointer(stackPointer);
		}
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
	 * <li>This function must only be called from the main thread.</li>
	 * <li>This function must not be called from a callback.</li>
	 * <li>The context of the specified window must not be current on any other thread when this function is called.</li>
	 * </ul>
	 *
	 * @param window the window to destroy
	 *
	 * @since version 1.0
	 */
	public static void glfwDestroyWindow(long window) {
		long __functionAddress = Functions.DestroyWindow;
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
	 * @since version 3.0
	 */
	public static boolean glfwWindowShouldClose(long window) {
		long __functionAddress = Functions.WindowShouldClose;
		if ( CHECKS )
			checkPointer(window);
		return invokePI(__functionAddress, window) != 0;
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
	 * @since version 3.0
	 */
	public static void glfwSetWindowShouldClose(long window, boolean value) {
		long __functionAddress = Functions.SetWindowShouldClose;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window, value ? 1 : 0);
	}

	// --- [ glfwSetWindowTitle ] ---

	/**
	 * Sets the window title, encoded as UTF-8, of the specified window.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 * 
	 * <p><b>OS X</b>: The window title will not be updated until the next time you process events.</p>
	 *
	 * @param window the window whose title to change
	 * @param title  the UTF-8 encoded window title
	 *
	 * @since version 1.0
	 */
	public static void nglfwSetWindowTitle(long window, long title) {
		long __functionAddress = Functions.SetWindowTitle;
		if ( CHECKS )
			checkPointer(window);
		invokePPV(__functionAddress, window, title);
	}

	/**
	 * Sets the window title, encoded as UTF-8, of the specified window.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 * 
	 * <p><b>OS X</b>: The window title will not be updated until the next time you process events.</p>
	 *
	 * @param window the window whose title to change
	 * @param title  the UTF-8 encoded window title
	 *
	 * @since version 1.0
	 */
	public static void glfwSetWindowTitle(long window, ByteBuffer title) {
		if ( CHECKS )
			checkNT1(title);
		nglfwSetWindowTitle(window, memAddress(title));
	}

	/**
	 * Sets the window title, encoded as UTF-8, of the specified window.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 * 
	 * <p><b>OS X</b>: The window title will not be updated until the next time you process events.</p>
	 *
	 * @param window the window whose title to change
	 * @param title  the UTF-8 encoded window title
	 *
	 * @since version 1.0
	 */
	public static void glfwSetWindowTitle(long window, CharSequence title) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer titleEncoded = stack.UTF8(title);
			nglfwSetWindowTitle(window, memAddress(titleEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glfwSetWindowIcon ] ---

	/**
	 * Sets the icon for the specified window.
	 * 
	 * <p>This function sets the icon of the specified window. If passed an array of candidate images, those of or closest to the sizes desired by the system are
	 * selected. If no images are specified, the window reverts to its default icon.</p>
	 * 
	 * <p>The desired image sizes varies depending on platform and system settings. The selected images will be rescaled as needed. Good sizes include 16x16,
	 * 32x32 and 48x48.</p>
	 * 
	 * <p>The specified image data is copied before this function returns.</p>
	 * 
	 * <p><b>OS X</b>: The GLFW window has no icon, as it is not a document window, so this function does nothing. The dock icon will be the same as the
	 * application bundle's icon. For more information on bundles, see the
	 * <a href="https://developer.apple.com/library/mac/documentation/CoreFoundation/Conceptual/CFBundles/">Bundle Programming Guide</a> in the Mac Developer
	 * Library.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose icon to set
	 * @param count  the number of images in the specified array, or zero to revert to the default window icon
	 * @param images the images to create the icon from. This is ignored if count is zero.
	 *
	 * @since version 3.2
	 */
	public static void nglfwSetWindowIcon(long window, int count, long images) {
		long __functionAddress = Functions.SetWindowIcon;
		if ( CHECKS ) {
			checkPointer(window);
			if ( images != NULL ) GLFWImage.validate(images, count);
		}
		invokePPV(__functionAddress, window, count, images);
	}

	/**
	 * Sets the icon for the specified window.
	 * 
	 * <p>This function sets the icon of the specified window. If passed an array of candidate images, those of or closest to the sizes desired by the system are
	 * selected. If no images are specified, the window reverts to its default icon.</p>
	 * 
	 * <p>The desired image sizes varies depending on platform and system settings. The selected images will be rescaled as needed. Good sizes include 16x16,
	 * 32x32 and 48x48.</p>
	 * 
	 * <p>The specified image data is copied before this function returns.</p>
	 * 
	 * <p><b>OS X</b>: The GLFW window has no icon, as it is not a document window, so this function does nothing. The dock icon will be the same as the
	 * application bundle's icon. For more information on bundles, see the
	 * <a href="https://developer.apple.com/library/mac/documentation/CoreFoundation/Conceptual/CFBundles/">Bundle Programming Guide</a> in the Mac Developer
	 * Library.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose icon to set
	 * @param images the images to create the icon from. This is ignored if count is zero.
	 *
	 * @since version 3.2
	 */
	public static void glfwSetWindowIcon(long window, GLFWImage.Buffer images) {
		nglfwSetWindowIcon(window, images == null ? 0 : images.remaining(), images == null ? NULL : images.address());
	}

	// --- [ glfwGetWindowPos ] ---

	/**
	 * Retrieves the position, in screen coordinates, of the upper-left corner of the client area of the specified window.
	 * 
	 * <p>Any or all of the position arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} position arguments will be set to zero.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window to query
	 * @param xpos   where to store the x-coordinate of the upper-left corner of the client area, or {@code NULL}
	 * @param ypos   where to store the y-coordinate of the upper-left corner of the client area, or {@code NULL}
	 *
	 * @since version 3.0
	 */
	public static void nglfwGetWindowPos(long window, long xpos, long ypos) {
		long __functionAddress = Functions.GetWindowPos;
		if ( CHECKS )
			checkPointer(window);
		invokePPPV(__functionAddress, window, xpos, ypos);
	}

	/**
	 * Retrieves the position, in screen coordinates, of the upper-left corner of the client area of the specified window.
	 * 
	 * <p>Any or all of the position arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} position arguments will be set to zero.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window to query
	 * @param xpos   where to store the x-coordinate of the upper-left corner of the client area, or {@code NULL}
	 * @param ypos   where to store the y-coordinate of the upper-left corner of the client area, or {@code NULL}
	 *
	 * @since version 3.0
	 */
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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window to query
	 * @param xpos   the x-coordinate of the upper-left corner of the client area
	 * @param ypos   the y-coordinate of the upper-left corner of the client area
	 *
	 * @since version 1.0
	 */
	public static void glfwSetWindowPos(long window, int xpos, int ypos) {
		long __functionAddress = Functions.SetWindowPos;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window, xpos, ypos);
	}

	// --- [ glfwGetWindowSize ] ---

	/**
	 * Retrieves the size, in screen coordinates, of the client area of the specified window. If you wish to retrieve the size of the framebuffer of the
	 * window in pixels, see {@link #glfwGetFramebufferSize GetFramebufferSize}.
	 * 
	 * <p>Any or all of the size arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} size arguments will be set to zero.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose size to retrieve
	 * @param width  where to store the width, in screen coordinates, of the client area, or {@code NULL}
	 * @param height where to store the height, in screen coordinates, of the client area, or {@code NULL}
	 *
	 * @since version 1.0
	 */
	public static void nglfwGetWindowSize(long window, long width, long height) {
		long __functionAddress = Functions.GetWindowSize;
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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose size to retrieve
	 * @param width  where to store the width, in screen coordinates, of the client area, or {@code NULL}
	 * @param height where to store the height, in screen coordinates, of the client area, or {@code NULL}
	 *
	 * @since version 1.0
	 */
	public static void glfwGetWindowSize(long window, IntBuffer width, IntBuffer height) {
		if ( CHECKS ) {
			if ( width != null ) checkBuffer(width, 1);
			if ( height != null ) checkBuffer(height, 1);
		}
		nglfwGetWindowSize(window, memAddressSafe(width), memAddressSafe(height));
	}

	// --- [ glfwSetWindowSizeLimits ] ---

	/**
	 * Sets the size limits of the client area of the specified window. If the window is full screen, the size limits only take effect if once it is made
	 * windowed. If the window is not resizable, this function does nothing.
	 * 
	 * <p>The size limits are applied immediately to a windowed mode window and may cause it to be resized.</p>
	 * 
	 * <p>The maximum dimensions must be greater than or equal to the minimum dimensions and all must be greater than or equal to zero.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window    the window to set limits for
	 * @param minwidth  the minimum width, in screen coordinates, of the client area, or {@link #GLFW_DONT_CARE DONT_CARE}
	 * @param minheight the minimum height, in screen coordinates, of the client area, or {@link #GLFW_DONT_CARE DONT_CARE}
	 * @param maxwidth  the maximum width, in screen coordinates, of the client area, or {@link #GLFW_DONT_CARE DONT_CARE}
	 * @param maxheight the maximum height, in screen coordinates, of the client area, or {@link #GLFW_DONT_CARE DONT_CARE}
	 *
	 * @since version 3.2
	 */
	public static void glfwSetWindowSizeLimits(long window, int minwidth, int minheight, int maxwidth, int maxheight) {
		long __functionAddress = Functions.SetWindowSizeLimits;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window, minwidth, minheight, maxwidth, maxheight);
	}

	// --- [ glfwSetWindowAspectRatio ] ---

	/**
	 * Sets the required aspect ratio of the client area of the specified window. If the window is full screen, the aspect ratio only takes effect once it is
	 * made windowed. If the window is not resizable, this function does nothing.
	 * 
	 * <p>The aspect ratio is specified as a numerator and a denominator and both values must be greater than zero. For example, the common 16:9 aspect ratio is
	 * specified as 16 and 9, respectively.</p>
	 * 
	 * <p>If the numerator and denominator is set to {@link #GLFW_DONT_CARE DONT_CARE} then the aspect ratio limit is disabled.</p>
	 * 
	 * <p>The aspect ratio is applied immediately to a windowed mode window and may cause it to be resized.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window to set limits for
	 * @param numer  the numerator of the desired aspect ratio, or {@link #GLFW_DONT_CARE DONT_CARE}
	 * @param denom  the denominator of the desired aspect ratio, or {@link #GLFW_DONT_CARE DONT_CARE}
	 *
	 * @since version 3.2
	 */
	public static void glfwSetWindowAspectRatio(long window, int numer, int denom) {
		long __functionAddress = Functions.SetWindowAspectRatio;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window, numer, denom);
	}

	// --- [ glfwSetWindowSize ] ---

	/**
	 * Sets the size, in pixels, of the client area of the specified window.
	 * 
	 * <p>For full screen windows, this function updates the resolution of its desired video mode and switches to the video mode closest to it, without affecting
	 * the window's context. As the context is unaffected, the bit depths of the framebuffer remain unchanged.</p>
	 * 
	 * <p>If you wish to update the refresh rate of the desired video mode in addition to its resolution, see {@link #glfwSetWindowMonitor SetWindowMonitor}.</p>
	 * 
	 * <p>The window manager may put limits on what sizes are allowed. GLFW cannot and should not override these limits.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window to resize
	 * @param width  the desired width, in screen coordinates, of the window client area
	 * @param height the desired height, in screen coordinates, of the window client area
	 *
	 * @since version 1.0
	 */
	public static void glfwSetWindowSize(long window, int width, int height) {
		long __functionAddress = Functions.SetWindowSize;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window, width, height);
	}

	// --- [ glfwGetFramebufferSize ] ---

	/**
	 * Retrieves the size, in pixels, of the framebuffer of the specified window. If you wish to retrieve the size of the window in screen coordinates, see
	 * {@link #glfwGetWindowSize GetWindowSize}.
	 * 
	 * <p>Any or all of the size arguments may be {@code NULL}. If an error occurs, all non-{@code NULL} size arguments will be set to zero.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose framebuffer to query
	 * @param width  where to store the width, in pixels, of the framebuffer, or {@code NULL}
	 * @param height where to store the height, in pixels, of the framebuffer, or {@code NULL}
	 *
	 * @since version 3.0
	 */
	public static void nglfwGetFramebufferSize(long window, long width, long height) {
		long __functionAddress = Functions.GetFramebufferSize;
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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose framebuffer to query
	 * @param width  where to store the width, in pixels, of the framebuffer, or {@code NULL}
	 * @param height where to store the height, in pixels, of the framebuffer, or {@code NULL}
	 *
	 * @since version 3.0
	 */
	public static void glfwGetFramebufferSize(long window, IntBuffer width, IntBuffer height) {
		if ( CHECKS ) {
			if ( width != null ) checkBuffer(width, 1);
			if ( height != null ) checkBuffer(height, 1);
		}
		nglfwGetFramebufferSize(window, memAddressSafe(width), memAddressSafe(height));
	}

	// --- [ glfwGetWindowFrameSize ] ---

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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose frame size to query
	 * @param left   where to store the size, in screen coordinates, of the left edge of the window frame, or {@code NULL}
	 * @param top    where to store the size, in screen coordinates, of the top edge of the window frame, or {@code NULL}
	 * @param right  where to store the size, in screen coordinates, of the right edge of the window frame, or {@code NULL}
	 * @param bottom where to store the size, in screen coordinates, of the bottom edge of the window frame, or {@code NULL}
	 *
	 * @since version 3.1
	 */
	public static void nglfwGetWindowFrameSize(long window, long left, long top, long right, long bottom) {
		long __functionAddress = Functions.GetWindowFrameSize;
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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose frame size to query
	 * @param left   where to store the size, in screen coordinates, of the left edge of the window frame, or {@code NULL}
	 * @param top    where to store the size, in screen coordinates, of the top edge of the window frame, or {@code NULL}
	 * @param right  where to store the size, in screen coordinates, of the right edge of the window frame, or {@code NULL}
	 * @param bottom where to store the size, in screen coordinates, of the bottom edge of the window frame, or {@code NULL}
	 *
	 * @since version 3.1
	 */
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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window to iconify
	 *
	 * @since version 2.1
	 */
	public static void glfwIconifyWindow(long window) {
		long __functionAddress = Functions.IconifyWindow;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window);
	}

	// --- [ glfwRestoreWindow ] ---

	/**
	 * Restores the specified window if it was previously iconified (minimized) or maximized. If the window is already restored, this function does nothing.
	 * 
	 * <p>If the specified window is a full screen window, the resolution chosen for the window is restored on the selected monitor.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window to restore
	 *
	 * @since version 2.1
	 */
	public static void glfwRestoreWindow(long window) {
		long __functionAddress = Functions.RestoreWindow;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window);
	}

	// --- [ glfwMaximizeWindow ] ---

	/**
	 * Maximizes the specified window if it was previously not maximized. If the window is already maximized, this function does nothing.
	 * 
	 * <p>If the specified window is a full screen window, this function does nothing.</p>
	 * 
	 * <p>This function may only be called from the main thread.</p>
	 *
	 * @param window the window to maximize
	 *
	 * @since version 3.2
	 */
	public static void glfwMaximizeWindow(long window) {
		long __functionAddress = Functions.MaximizeWindow;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window);
	}

	// --- [ glfwShowWindow ] ---

	/**
	 * Makes the specified window visible if it was previously hidden. If the window is already visible or is in full screen mode, this function does nothing.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window to make visible
	 *
	 * @since version 3.0
	 */
	public static void glfwShowWindow(long window) {
		long __functionAddress = Functions.ShowWindow;
		EventLoop.OnScreen.check();
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window);
	}

	// --- [ glfwHideWindow ] ---

	/**
	 * Hides the specified window, if it was previously visible. If the window is already hidden or is in full screen mode, this function does nothing.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window to hide
	 *
	 * @since version 3.0
	 */
	public static void glfwHideWindow(long window) {
		long __functionAddress = Functions.HideWindow;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window);
	}

	// --- [ glfwFocusWindow ] ---

	/**
	 * Brings the specified window to front and sets input focus. The window should already be visible and not iconified.
	 * 
	 * <p>By default, both windowed and full screen mode windows are focused when initially created. Set the {@link #GLFW_FOCUSED FOCUSED} hint to disable this behavior.</p>
	 * 
	 * <p><b>Do not use this function</b> to steal focus from other applications unless you are certain that is what the user wants. Focus stealing can be
	 * extremely disruptive.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window to give input focus
	 *
	 * @since version 3.2
	 */
	public static void glfwFocusWindow(long window) {
		long __functionAddress = Functions.FocusWindow;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window);
	}

	// --- [ glfwGetWindowMonitor ] ---

	/**
	 * Returns the handle of the monitor that the specified window is in full screen on.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window to query
	 *
	 * @return the monitor, or {@code NULL} if the window is in windowed mode or an error occurred
	 *
	 * @since version 3.0
	 */
	public static long glfwGetWindowMonitor(long window) {
		long __functionAddress = Functions.GetWindowMonitor;
		if ( CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

	// --- [ glfwSetWindowMonitor ] ---

	/**
	 * Sets the mode, monitor, video mode and placement of a window.
	 * 
	 * <p>This function sets the monitor that the window uses for full screen mode or, if the monitor is {@code NULL}, makes it windowed mode.</p>
	 * 
	 * <p>When setting a monitor, this function updates the width, height and refresh rate of the desired video mode and switches to the video mode closest to
	 * it. The window position is ignored when setting a monitor.</p>
	 * 
	 * <p>When the monitor is {@code NULL}, the position, width and height are used to place the window client area. The refresh rate is ignored when no monitor is
	 * specified.</p>
	 * 
	 * <p>If you only wish to update the resolution of a full screen window or the size of a windowed mode window, see {@link #glfwSetWindowSize SetWindowSize}.</p>
	 * 
	 * <p>When a window transitions from full screen to windowed mode, this function restores any previous window settings such as whether it is decorated,
	 * floating, resizable, has size or aspect ratio limits, etc.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window      the window whose monitor, size or video mode to set
	 * @param monitor     the desired monitor, or {@code NULL} to set windowed mode
	 * @param xpos        the desired x-coordinate of the upper-left corner of the client area
	 * @param ypos        the desired y-coordinate of the upper-left corner of the client area
	 * @param width       the desired with, in screen coordinates, of the client area or video mode
	 * @param height      the desired height, in screen coordinates, of the client area or video mode
	 * @param refreshRate the desired refresh rate, in Hz, of the video mode, or {@link #GLFW_DONT_CARE DONT_CARE}
	 *
	 * @since version 3.2
	 */
	public static void glfwSetWindowMonitor(long window, long monitor, int xpos, int ypos, int width, int height, int refreshRate) {
		long __functionAddress = Functions.SetWindowMonitor;
		if ( CHECKS )
			checkPointer(window);
		invokePPV(__functionAddress, window, monitor, xpos, ypos, width, height, refreshRate);
	}

	// --- [ glfwGetWindowAttrib ] ---

	/**
	 * Returns the value of an attribute of the specified window or its OpenGL or OpenGL ES context.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 * 
	 * <p>Framebuffer related hints are not window attributes.</p>
	 * 
	 * <p>Zero is a valid value for many window and context related attributes so you cannot use a return value of zero as an indication of errors. However, this
	 * function should not fail as long as it is passed valid arguments and the library has been initialized.</p>
	 *
	 * @param window the window to query
	 * @param attrib the <a href="http://www.glfw.org/docs/latest/window.html#window_attribs">window attribute</a> whose value to return. One of:<br><table><tr><td>{@link #GLFW_FOCUSED FOCUSED}</td><td>{@link #GLFW_ICONIFIED ICONIFIED}</td><td>{@link #GLFW_RESIZABLE RESIZABLE}</td><td>{@link #GLFW_VISIBLE VISIBLE}</td><td>{@link #GLFW_DECORATED DECORATED}</td></tr><tr><td>{@link #GLFW_FLOATING FLOATING}</td><td>{@link #GLFW_MAXIMIZED MAXIMIZED}</td><td>{@link #GLFW_CLIENT_API CLIENT_API}</td><td>{@link #GLFW_CONTEXT_VERSION_MAJOR CONTEXT_VERSION_MAJOR}</td><td>{@link #GLFW_CONTEXT_VERSION_MINOR CONTEXT_VERSION_MINOR}</td></tr><tr><td>{@link #GLFW_CONTEXT_REVISION CONTEXT_REVISION}</td><td>{@link #GLFW_CONTEXT_ROBUSTNESS CONTEXT_ROBUSTNESS}</td><td>{@link #GLFW_OPENGL_FORWARD_COMPAT OPENGL_FORWARD_COMPAT}</td><td>{@link #GLFW_OPENGL_DEBUG_CONTEXT OPENGL_DEBUG_CONTEXT}</td><td>{@link #GLFW_OPENGL_PROFILE OPENGL_PROFILE}</td></tr><tr><td>{@link #GLFW_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR}</td><td>{@link #GLFW_CONTEXT_NO_ERROR CONTEXT_NO_ERROR}</td><td>{@link #GLFW_CONTEXT_CREATION_API CONTEXT_CREATION_API}</td></tr></table>
	 *
	 * @return the value of the attribute, or zero if an error occured
	 *
	 * @since version 3.0
	 */
	public static int glfwGetWindowAttrib(long window, int attrib) {
		long __functionAddress = Functions.GetWindowAttrib;
		if ( CHECKS )
			checkPointer(window);
		return invokePI(__functionAddress, window, attrib);
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
	 * @since version 3.0
	 */
	public static void glfwSetWindowUserPointer(long window, long pointer) {
		long __functionAddress = Functions.SetWindowUserPointer;
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
	 * @since version 3.0
	 */
	public static long glfwGetWindowUserPointer(long window) {
		long __functionAddress = Functions.GetWindowUserPointer;
		if ( CHECKS )
			checkPointer(window);
		return invokePP(__functionAddress, window);
	}

	// --- [ glfwSetWindowPosCallback ] ---

	/**
	 * Sets the position callback of the specified window, which is called when the window is moved. The callback is provided with the screen position of the
	 * upper-left corner of the client area of the window.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since version 1.0
	 */
	public static long nglfwSetWindowPosCallback(long window, long cbfun) {
		long __functionAddress = Functions.SetWindowPosCallback;
		if ( CHECKS )
			checkPointer(window);
		return invokePPP(__functionAddress, window, cbfun);
	}

	/**
	 * Sets the position callback of the specified window, which is called when the window is moved. The callback is provided with the screen position of the
	 * upper-left corner of the client area of the window.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since version 1.0
	 */
	public static GLFWWindowPosCallback glfwSetWindowPosCallback(long window, GLFWWindowPosCallbackI cbfun) {
		return GLFWWindowPosCallback.create(nglfwSetWindowPosCallback(window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetWindowSizeCallback ] ---

	/**
	 * Sets the size callback of the specified window, which is called when the window is resized. The callback is provided with the size, in screen
	 * coordinates, of the client area of the window.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since version 1.0
	 */
	public static long nglfwSetWindowSizeCallback(long window, long cbfun) {
		long __functionAddress = Functions.SetWindowSizeCallback;
		if ( CHECKS )
			checkPointer(window);
		return invokePPP(__functionAddress, window, cbfun);
	}

	/**
	 * Sets the size callback of the specified window, which is called when the window is resized. The callback is provided with the size, in screen
	 * coordinates, of the client area of the window.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since version 1.0
	 */
	public static GLFWWindowSizeCallback glfwSetWindowSizeCallback(long window, GLFWWindowSizeCallbackI cbfun) {
		return GLFWWindowSizeCallback.create(nglfwSetWindowSizeCallback(window, cbfun == null ? NULL : cbfun.address()));
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
	 * <li>This function must only be called from the main thread.</li>
	 * <li><b>Mac OS X:</b> Selecting Quit from the application menu will trigger the close callback for all windows.</li>
	 * </ul>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since version 2.5
	 */
	public static long nglfwSetWindowCloseCallback(long window, long cbfun) {
		long __functionAddress = Functions.SetWindowCloseCallback;
		if ( CHECKS )
			checkPointer(window);
		return invokePPP(__functionAddress, window, cbfun);
	}

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
	 * <li>This function must only be called from the main thread.</li>
	 * <li><b>Mac OS X:</b> Selecting Quit from the application menu will trigger the close callback for all windows.</li>
	 * </ul>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since version 2.5
	 */
	public static GLFWWindowCloseCallback glfwSetWindowCloseCallback(long window, GLFWWindowCloseCallbackI cbfun) {
		return GLFWWindowCloseCallback.create(nglfwSetWindowCloseCallback(window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetWindowRefreshCallback ] ---

	/**
	 * Sets the refresh callback of the specified window, which is called when the client area of the window needs to be redrawn, for example if the window has
	 * been exposed after having been covered by another window.
	 * 
	 * <p>On compositing window systems such as Aero, Compiz or Aqua, where the window contents are saved off-screen, this callback may be called only very
	 * infrequently or never at all.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since version 2.5
	 */
	public static long nglfwSetWindowRefreshCallback(long window, long cbfun) {
		long __functionAddress = Functions.SetWindowRefreshCallback;
		if ( CHECKS )
			checkPointer(window);
		return invokePPP(__functionAddress, window, cbfun);
	}

	/**
	 * Sets the refresh callback of the specified window, which is called when the client area of the window needs to be redrawn, for example if the window has
	 * been exposed after having been covered by another window.
	 * 
	 * <p>On compositing window systems such as Aero, Compiz or Aqua, where the window contents are saved off-screen, this callback may be called only very
	 * infrequently or never at all.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since version 2.5
	 */
	public static GLFWWindowRefreshCallback glfwSetWindowRefreshCallback(long window, GLFWWindowRefreshCallbackI cbfun) {
		return GLFWWindowRefreshCallback.create(nglfwSetWindowRefreshCallback(window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetWindowFocusCallback ] ---

	/**
	 * Sets the focus callback of the specified window, which is called when the window gains or loses input focus.
	 * 
	 * <p>After the focus callback is called for a window that lost input focus, synthetic key and mouse button release events will be generated for all such
	 * that had been pressed. For more information, see {@link #glfwSetKeyCallback SetKeyCallback} and {@link #glfwSetMouseButtonCallback SetMouseButtonCallback}.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since version 3.0
	 */
	public static long nglfwSetWindowFocusCallback(long window, long cbfun) {
		long __functionAddress = Functions.SetWindowFocusCallback;
		if ( CHECKS )
			checkPointer(window);
		return invokePPP(__functionAddress, window, cbfun);
	}

	/**
	 * Sets the focus callback of the specified window, which is called when the window gains or loses input focus.
	 * 
	 * <p>After the focus callback is called for a window that lost input focus, synthetic key and mouse button release events will be generated for all such
	 * that had been pressed. For more information, see {@link #glfwSetKeyCallback SetKeyCallback} and {@link #glfwSetMouseButtonCallback SetMouseButtonCallback}.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since version 3.0
	 */
	public static GLFWWindowFocusCallback glfwSetWindowFocusCallback(long window, GLFWWindowFocusCallbackI cbfun) {
		return GLFWWindowFocusCallback.create(nglfwSetWindowFocusCallback(window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetWindowIconifyCallback ] ---

	/**
	 * Sets the iconification callback of the specified window, which is called when the window is iconified or restored.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since version 3.0
	 */
	public static long nglfwSetWindowIconifyCallback(long window, long cbfun) {
		long __functionAddress = Functions.SetWindowIconifyCallback;
		if ( CHECKS )
			checkPointer(window);
		return invokePPP(__functionAddress, window, cbfun);
	}

	/**
	 * Sets the iconification callback of the specified window, which is called when the window is iconified or restored.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since version 3.0
	 */
	public static GLFWWindowIconifyCallback glfwSetWindowIconifyCallback(long window, GLFWWindowIconifyCallbackI cbfun) {
		return GLFWWindowIconifyCallback.create(nglfwSetWindowIconifyCallback(window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetFramebufferSizeCallback ] ---

	/**
	 * Sets the framebuffer resize callback of the specified window, which is called when the framebuffer of the specified window is resized.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since version 3.0
	 */
	public static long nglfwSetFramebufferSizeCallback(long window, long cbfun) {
		long __functionAddress = Functions.SetFramebufferSizeCallback;
		if ( CHECKS )
			checkPointer(window);
		return invokePPP(__functionAddress, window, cbfun);
	}

	/**
	 * Sets the framebuffer resize callback of the specified window, which is called when the framebuffer of the specified window is resized.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been
	 *         <a href="http://www.glfw.org/docs/latest/intro.html#intro_init">initialized</a>
	 *
	 * @since version 3.0
	 */
	public static GLFWFramebufferSizeCallback glfwSetFramebufferSizeCallback(long window, GLFWFramebufferSizeCallbackI cbfun) {
		return GLFWFramebufferSizeCallback.create(nglfwSetFramebufferSizeCallback(window, cbfun == null ? NULL : cbfun.address()));
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
	 * <li>This function must only be called from the main thread.</li>
	 * <li>This function must not be called from a callback.</li>
	 * </ul>
	 */
	public static void glfwPollEvents() {
		long __functionAddress = Functions.PollEvents;
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
	 * <li>This function must only be called from the main thread.</li>
	 * <li>This function must not be called from a callback.</li>
	 * </ul>
	 */
	public static void glfwWaitEvents() {
		long __functionAddress = Functions.WaitEvents;
		EventLoop.OnScreen.check();
		invokeV(__functionAddress);
	}

	// --- [ glfwWaitEventsTimeout ] ---

	/**
	 * Waits with timeout until events are queued and processes them.
	 * 
	 * <p>This function puts the calling thread to sleep until at least one event is available in the event queue, or until the specified timeout is reached. If
	 * one or more events are available, it behaves exactly like {@link #glfwPollEvents PollEvents}, i.e. the events in the queue are processed and the function then returns
	 * immediately. Processing events will cause the window and input callbacks associated with those events to be called.</p>
	 * 
	 * <p>The timeout value must be a positive finite number.</p>
	 * 
	 * <p>Since not all events are associated with callbacks, this function may return without a callback having been called even if you are monitoring all
	 * callbacks.</p>
	 * 
	 * <p>On some platforms, a window move, resize or menu operation will cause event processing to block. This is due to how event processing is designed on
	 * those platforms. You can use the window refresh callback to redraw the contents of your window when necessary during such operations.</p>
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
	 * <li>This function must only be called from the main thread.</li>
	 * <li>This function must not be called from a callback.</li>
	 * </ul>
	 *
	 * @param timeout the maximum amount of time, in seconds, to wait
	 *
	 * @since version 3.2
	 */
	public static void glfwWaitEventsTimeout(double timeout) {
		long __functionAddress = Functions.WaitEventsTimeout;
		EventLoop.OnScreen.check();
		invokeV(__functionAddress, timeout);
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
		long __functionAddress = Functions.PostEmptyEvent;
		invokeV(__functionAddress);
	}

	// --- [ glfwGetInputMode ] ---

	/**
	 * Returns the value of an input option for the specified window.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window to query
	 * @param mode   the input mode whose value to return. One of:<br><table><tr><td>{@link #GLFW_CURSOR CURSOR}</td><td>{@link #GLFW_STICKY_KEYS STICKY_KEYS}</td><td>{@link #GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS}</td></tr></table>
	 *
	 * @return the input mode value
	 *
	 * @since version 3.0
	 */
	public static int glfwGetInputMode(long window, int mode) {
		long __functionAddress = Functions.GetInputMode;
		if ( CHECKS )
			checkPointer(window);
		return invokePI(__functionAddress, window, mode);
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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose input mode to set
	 * @param mode   the input mode to set. One of:<br><table><tr><td>{@link #GLFW_CURSOR CURSOR}</td><td>{@link #GLFW_STICKY_KEYS STICKY_KEYS}</td><td>{@link #GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS}</td></tr></table>
	 * @param value  the new value of the specified input mode
	 *
	 * @since GFLW 3.0
	 */
	public static void glfwSetInputMode(long window, int mode, int value) {
		long __functionAddress = Functions.SetInputMode;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window, mode, value);
	}

	// --- [ glfwGetKeyName ] ---

	/**
	 * Returns the localized name of the specified printable key. This is intended for displaying key bindings to the user.
	 * 
	 * <p>If the key is {@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN}, the scancode is used instead, otherwise the scancode is ignored. If a non-printable key or (if the key is {@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN}) a
	 * scancode that maps to a non-printable key is specified, this function returns {@code NULL}.</p>
	 * 
	 * <p>The printable keys are:</p>
	 * 
	 * <ul>
	 * <li>{@link #GLFW_KEY_APOSTROPHE KEY_APOSTROPHE}</li>
	 * <li>{@link #GLFW_KEY_COMMA KEY_COMMA}</li>
	 * <li>{@link #GLFW_KEY_MINUS KEY_MINUS}</li>
	 * <li>{@link #GLFW_KEY_PERIOD KEY_PERIOD}</li>
	 * <li>{@link #GLFW_KEY_SLASH KEY_SLASH}</li>
	 * <li>{@link #GLFW_KEY_SEMICOLON KEY_SEMICOLON}</li>
	 * <li>{@link #GLFW_KEY_EQUAL KEY_EQUAL}</li>
	 * <li>{@link #GLFW_KEY_LEFT_BRACKET KEY_LEFT_BRACKET}</li>
	 * <li>{@link #GLFW_KEY_RIGHT_BRACKET KEY_RIGHT_BRACKET}</li>
	 * <li>{@link #GLFW_KEY_BACKSLASH KEY_BACKSLASH}</li>
	 * <li>{@link #GLFW_KEY_WORLD_1 KEY_WORLD_1}</li>
	 * <li>{@link #GLFW_KEY_WORLD_2 KEY_WORLD_2}</li>
	 * <li>{@link #GLFW_KEY_0 KEY_0} to {@link #GLFW_KEY_9 KEY_9}</li>
	 * <li>{@link #GLFW_KEY_A KEY_A} to {@link #GLFW_KEY_Z KEY_Z}</li>
	 * <li>{@link #GLFW_KEY_KP_0 KEY_KP_0} to {@link #GLFW_KEY_KP_9 KEY_KP_9}</li>
	 * <li>{@link #GLFW_KEY_KP_DECIMAL KEY_KP_DECIMAL}</li>
	 * <li>{@link #GLFW_KEY_KP_DIVIDE KEY_KP_DIVIDE}</li>
	 * <li>{@link #GLFW_KEY_KP_MULTIPLY KEY_KP_MULTIPLY}</li>
	 * <li>{@link #GLFW_KEY_KP_SUBTRACT KEY_KP_SUBTRACT}</li>
	 * <li>{@link #GLFW_KEY_KP_ADD KEY_KP_ADD}</li>
	 * <li>{@link #GLFW_KEY_KP_EQUAL KEY_KP_EQUAL}</li>
	 * </ul>
	 * 
	 * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the next call to {@link #glfwGetKeyName GetKeyName}, or until the
	 * library is terminated.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param key      the key to query, or {@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN}
	 * @param scancode the scancode of the key to query
	 *
	 * @return the localized name of the key, or {@code NULL}
	 *
	 * @since version 3.2
	 */
	public static long nglfwGetKeyName(int key, int scancode) {
		long __functionAddress = Functions.GetKeyName;
		return invokeP(__functionAddress, key, scancode);
	}

	/**
	 * Returns the localized name of the specified printable key. This is intended for displaying key bindings to the user.
	 * 
	 * <p>If the key is {@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN}, the scancode is used instead, otherwise the scancode is ignored. If a non-printable key or (if the key is {@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN}) a
	 * scancode that maps to a non-printable key is specified, this function returns {@code NULL}.</p>
	 * 
	 * <p>The printable keys are:</p>
	 * 
	 * <ul>
	 * <li>{@link #GLFW_KEY_APOSTROPHE KEY_APOSTROPHE}</li>
	 * <li>{@link #GLFW_KEY_COMMA KEY_COMMA}</li>
	 * <li>{@link #GLFW_KEY_MINUS KEY_MINUS}</li>
	 * <li>{@link #GLFW_KEY_PERIOD KEY_PERIOD}</li>
	 * <li>{@link #GLFW_KEY_SLASH KEY_SLASH}</li>
	 * <li>{@link #GLFW_KEY_SEMICOLON KEY_SEMICOLON}</li>
	 * <li>{@link #GLFW_KEY_EQUAL KEY_EQUAL}</li>
	 * <li>{@link #GLFW_KEY_LEFT_BRACKET KEY_LEFT_BRACKET}</li>
	 * <li>{@link #GLFW_KEY_RIGHT_BRACKET KEY_RIGHT_BRACKET}</li>
	 * <li>{@link #GLFW_KEY_BACKSLASH KEY_BACKSLASH}</li>
	 * <li>{@link #GLFW_KEY_WORLD_1 KEY_WORLD_1}</li>
	 * <li>{@link #GLFW_KEY_WORLD_2 KEY_WORLD_2}</li>
	 * <li>{@link #GLFW_KEY_0 KEY_0} to {@link #GLFW_KEY_9 KEY_9}</li>
	 * <li>{@link #GLFW_KEY_A KEY_A} to {@link #GLFW_KEY_Z KEY_Z}</li>
	 * <li>{@link #GLFW_KEY_KP_0 KEY_KP_0} to {@link #GLFW_KEY_KP_9 KEY_KP_9}</li>
	 * <li>{@link #GLFW_KEY_KP_DECIMAL KEY_KP_DECIMAL}</li>
	 * <li>{@link #GLFW_KEY_KP_DIVIDE KEY_KP_DIVIDE}</li>
	 * <li>{@link #GLFW_KEY_KP_MULTIPLY KEY_KP_MULTIPLY}</li>
	 * <li>{@link #GLFW_KEY_KP_SUBTRACT KEY_KP_SUBTRACT}</li>
	 * <li>{@link #GLFW_KEY_KP_ADD KEY_KP_ADD}</li>
	 * <li>{@link #GLFW_KEY_KP_EQUAL KEY_KP_EQUAL}</li>
	 * </ul>
	 * 
	 * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the next call to {@link #glfwGetKeyName GetKeyName}, or until the
	 * library is terminated.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param key      the key to query, or {@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN}
	 * @param scancode the scancode of the key to query
	 *
	 * @return the localized name of the key, or {@code NULL}
	 *
	 * @since version 3.2
	 */
	public static String glfwGetKeyName(int key, int scancode) {
		long __result = nglfwGetKeyName(key, scancode);
		return memUTF8(__result);
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
	 * <li>This function must only be called from the main thread.</li>
	 * <li>{@link #GLFW_KEY_UNKNOWN KEY_UNKNOWN} is not a valid key for this function.</li>
	 * </ul>
	 *
	 * @param window the desired window
	 * @param key    the desired keyboard key
	 *
	 * @return one of {@link #GLFW_PRESS PRESS} or {@link #GLFW_RELEASE RELEASE}
	 *
	 * @since version 1.0
	 */
	public static int glfwGetKey(long window, int key) {
		long __functionAddress = Functions.GetKey;
		if ( CHECKS )
			checkPointer(window);
		return invokePI(__functionAddress, window, key);
	}

	// --- [ glfwGetMouseButton ] ---

	/**
	 * Returns the last state reported for the specified mouse button to the specified window. The returned state is one of {@link #GLFW_PRESS PRESS} or {@link #GLFW_RELEASE RELEASE}. The
	 * higher-level action {@link #GLFW_REPEAT REPEAT} is only reported to the mouse button callback.
	 * 
	 * <p>If the {@link #GLFW_STICKY_MOUSE_BUTTONS STICKY_MOUSE_BUTTONS} input mode is enabled, this function returns {@link #GLFW_PRESS PRESS} the first time you call it for a mouse button that has been pressed,
	 * even if that mouse button has already been released.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the desired window
	 * @param button the desired mouse button
	 *
	 * @return one of {@link #GLFW_PRESS PRESS} or {@link #GLFW_RELEASE RELEASE}
	 *
	 * @since version 1.0
	 */
	public static int glfwGetMouseButton(long window, int button) {
		long __functionAddress = Functions.GetMouseButton;
		if ( CHECKS )
			checkPointer(window);
		return invokePI(__functionAddress, window, button);
	}

	// --- [ glfwGetCursorPos ] ---

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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the desired window
	 * @param xpos   where to store the cursor x-coordinate, relative to the left edge of the client area, or {@code NULL}
	 * @param ypos   where to store the cursor y-coordinate, relative to the to top edge of the client area, or {@code NULL}.
	 *
	 * @since version 1.0
	 */
	public static void nglfwGetCursorPos(long window, long xpos, long ypos) {
		long __functionAddress = Functions.GetCursorPos;
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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the desired window
	 * @param xpos   where to store the cursor x-coordinate, relative to the left edge of the client area, or {@code NULL}
	 * @param ypos   where to store the cursor y-coordinate, relative to the to top edge of the client area, or {@code NULL}.
	 *
	 * @since version 1.0
	 */
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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the desired window
	 * @param xpos   the desired x-coordinate, relative to the left edge of the client area
	 * @param ypos   the desired y-coordinate, relative to the top edge of the client area
	 *
	 * @since version 1.0
	 */
	public static void glfwSetCursorPos(long window, double xpos, double ypos) {
		long __functionAddress = Functions.SetCursorPos;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window, xpos, ypos);
	}

	// --- [ glfwCreateCursor ] ---

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
	 * <li>This function must only be called from the main thread.</li>
	 * <li>This function must not be called from a callback.</li>
	 * <li>The specified image data is copied before this function returns.</li>
	 * </ul>
	 *
	 * @param image the desired cursor image
	 * @param xhot  the desired x-coordinate, in pixels, of the cursor hotspot
	 * @param yhot  the desired y-coordinate, in pixels, of the cursor hotspot
	 *
	 * @return the handle of the created cursor, or {@code NULL} if an error occurred
	 *
	 * @since version 3.1
	 */
	public static long nglfwCreateCursor(long image, int xhot, int yhot) {
		long __functionAddress = Functions.CreateCursor;
		if ( CHECKS )
			GLFWImage.validate(image);
		return invokePP(__functionAddress, image, xhot, yhot);
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
	 * <li>This function must only be called from the main thread.</li>
	 * <li>This function must not be called from a callback.</li>
	 * <li>The specified image data is copied before this function returns.</li>
	 * </ul>
	 *
	 * @param image the desired cursor image
	 * @param xhot  the desired x-coordinate, in pixels, of the cursor hotspot
	 * @param yhot  the desired y-coordinate, in pixels, of the cursor hotspot
	 *
	 * @return the handle of the created cursor, or {@code NULL} if an error occurred
	 *
	 * @since version 3.1
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
	 * <li>This function must only be called from the main thread.</li>
	 * <li>This function must not be called from a callback.</li>
	 * <li>The specified image data is copied before this function returns.</li>
	 * </ul>
	 *
	 * @param shape one of the standard shapes. One of:<br><table><tr><td>{@link #GLFW_ARROW_CURSOR ARROW_CURSOR}</td><td>{@link #GLFW_IBEAM_CURSOR IBEAM_CURSOR}</td><td>{@link #GLFW_CROSSHAIR_CURSOR CROSSHAIR_CURSOR}</td><td>{@link #GLFW_HAND_CURSOR HAND_CURSOR}</td><td>{@link #GLFW_HRESIZE_CURSOR HRESIZE_CURSOR}</td><td>{@link #GLFW_VRESIZE_CURSOR VRESIZE_CURSOR}</td></tr></table>
	 *
	 * @return a new cursor ready to use or {@code NULL} if an error occurred
	 *
	 * @since version 3.1
	 */
	public static long glfwCreateStandardCursor(int shape) {
		long __functionAddress = Functions.CreateStandardCursor;
		return invokeP(__functionAddress, shape);
	}

	// --- [ glfwDestroyCursor ] ---

	/**
	 * Destroys a cursor previously created with {@link #glfwCreateCursor CreateCursor}. Any remaining cursors will be destroyed by {@link #glfwTerminate Terminate}.
	 * 
	 * <p>Notes:</p>
	 * 
	 * <ul>
	 * <li>This function must only be called from the main thread.</li>
	 * <li>This function must not be called from a callback.</li>
	 * </ul>
	 *
	 * @param cursor the cursor object to destroy
	 *
	 * @since version 3.1
	 */
	public static void glfwDestroyCursor(long cursor) {
		long __functionAddress = Functions.DestroyCursor;
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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window to set the system cursor for
	 * @param cursor the cursor to set, or {@code NULL} to switch back to the default arrow cursor
	 *
	 * @since version 3.1
	 */
	public static void glfwSetCursor(long window, long cursor) {
		long __functionAddress = Functions.SetCursor;
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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 1.0
	 */
	public static long nglfwSetKeyCallback(long window, long cbfun) {
		long __functionAddress = Functions.SetKeyCallback;
		if ( CHECKS )
			checkPointer(window);
		return invokePPP(__functionAddress, window, cbfun);
	}

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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 1.0
	 */
	public static GLFWKeyCallback glfwSetKeyCallback(long window, GLFWKeyCallbackI cbfun) {
		return GLFWKeyCallback.create(nglfwSetKeyCallback(window, cbfun == null ? NULL : cbfun.address()));
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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 2.4
	 */
	public static long nglfwSetCharCallback(long window, long cbfun) {
		long __functionAddress = Functions.SetCharCallback;
		if ( CHECKS )
			checkPointer(window);
		return invokePPP(__functionAddress, window, cbfun);
	}

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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 2.4
	 */
	public static GLFWCharCallback glfwSetCharCallback(long window, GLFWCharCallbackI cbfun) {
		return GLFWCharCallback.create(nglfwSetCharCallback(window, cbfun == null ? NULL : cbfun.address()));
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
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 3.1
	 */
	public static long nglfwSetCharModsCallback(long window, long cbfun) {
		long __functionAddress = Functions.SetCharModsCallback;
		if ( CHECKS )
			checkPointer(window);
		return invokePPP(__functionAddress, window, cbfun);
	}

	/**
	 * Sets the character with modifiers callback of the specified window, which is called when a Unicode character is input regardless of what modifier keys
	 * are used.
	 * 
	 * <p>The character with modifiers callback is intended for implementing custom Unicode character input. For regular Unicode text input, see
	 * {@link #glfwSetCharCallback SetCharCallback}. Like the character callback, the character with modifiers callback deals with characters and is keyboard layout dependent.
	 * Characters do not map 1:1 to physical keys, as a key may produce zero, one or more characters. If you want to know whether a specific physical key was
	 * pressed or released, see {@link #glfwSetKeyCallback SetKeyCallback} instead.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 3.1
	 */
	public static GLFWCharModsCallback glfwSetCharModsCallback(long window, GLFWCharModsCallbackI cbfun) {
		return GLFWCharModsCallback.create(nglfwSetCharModsCallback(window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetMouseButtonCallback ] ---

	/**
	 * Sets the mouse button callback of the specified window, which is called when a mouse button is pressed or released.
	 * 
	 * <p>When a window loses input focus, it will generate synthetic mouse button release events for all pressed mouse buttons. You can tell these events from
	 * user-generated events by the fact that the synthetic ones are generated after the focus loss event has been processed, i.e. after the window focus
	 * callback has been called.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 1.0
	 */
	public static long nglfwSetMouseButtonCallback(long window, long cbfun) {
		long __functionAddress = Functions.SetMouseButtonCallback;
		if ( CHECKS )
			checkPointer(window);
		return invokePPP(__functionAddress, window, cbfun);
	}

	/**
	 * Sets the mouse button callback of the specified window, which is called when a mouse button is pressed or released.
	 * 
	 * <p>When a window loses input focus, it will generate synthetic mouse button release events for all pressed mouse buttons. You can tell these events from
	 * user-generated events by the fact that the synthetic ones are generated after the focus loss event has been processed, i.e. after the window focus
	 * callback has been called.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 1.0
	 */
	public static GLFWMouseButtonCallback glfwSetMouseButtonCallback(long window, GLFWMouseButtonCallbackI cbfun) {
		return GLFWMouseButtonCallback.create(nglfwSetMouseButtonCallback(window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetCursorPosCallback ] ---

	/**
	 * Sets the cursor position callback of the specified window, which is called when the cursor is moved. The callback is provided with the position, in
	 * screen coordinates, relative to the upper-left corner of the client area of the window.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 1.0
	 */
	public static long nglfwSetCursorPosCallback(long window, long cbfun) {
		long __functionAddress = Functions.SetCursorPosCallback;
		if ( CHECKS )
			checkPointer(window);
		return invokePPP(__functionAddress, window, cbfun);
	}

	/**
	 * Sets the cursor position callback of the specified window, which is called when the cursor is moved. The callback is provided with the position, in
	 * screen coordinates, relative to the upper-left corner of the client area of the window.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 1.0
	 */
	public static GLFWCursorPosCallback glfwSetCursorPosCallback(long window, GLFWCursorPosCallbackI cbfun) {
		return GLFWCursorPosCallback.create(nglfwSetCursorPosCallback(window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetCursorEnterCallback ] ---

	/**
	 * Sets the cursor boundary crossing callback of the specified window, which is called when the cursor enters or leaves the client area of the window.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 3.0
	 */
	public static long nglfwSetCursorEnterCallback(long window, long cbfun) {
		long __functionAddress = Functions.SetCursorEnterCallback;
		if ( CHECKS )
			checkPointer(window);
		return invokePPP(__functionAddress, window, cbfun);
	}

	/**
	 * Sets the cursor boundary crossing callback of the specified window, which is called when the cursor enters or leaves the client area of the window.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 3.0
	 */
	public static GLFWCursorEnterCallback glfwSetCursorEnterCallback(long window, GLFWCursorEnterCallbackI cbfun) {
		return GLFWCursorEnterCallback.create(nglfwSetCursorEnterCallback(window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetScrollCallback ] ---

	/**
	 * Sets the scroll callback of the specified window, which is called when a scrolling device is used.
	 * 
	 * <p>The scroll callback receives all scrolling input, like that from a mouse wheel or a touchpad scrolling area.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 2.1
	 */
	public static long nglfwSetScrollCallback(long window, long cbfun) {
		long __functionAddress = Functions.SetScrollCallback;
		if ( CHECKS )
			checkPointer(window);
		return invokePPP(__functionAddress, window, cbfun);
	}

	/**
	 * Sets the scroll callback of the specified window, which is called when a scrolling device is used.
	 * 
	 * <p>The scroll callback receives all scrolling input, like that from a mouse wheel or a touchpad scrolling area.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 2.1
	 */
	public static GLFWScrollCallback glfwSetScrollCallback(long window, GLFWScrollCallbackI cbfun) {
		return GLFWScrollCallback.create(nglfwSetScrollCallback(window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetDropCallback ] ---

	/**
	 * Sets the file drop callback of the specified window, which is called when one or more dragged files are dropped on the window.
	 * 
	 * <p>Because the path array and its strings may have been generated specifically for that event, they are not guaranteed to be valid after the callback has
	 * returned. If you wish to use them after the callback returns, you need to make a deep copy.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 3.1
	 */
	public static long nglfwSetDropCallback(long window, long cbfun) {
		long __functionAddress = Functions.SetDropCallback;
		if ( CHECKS )
			checkPointer(window);
		return invokePPP(__functionAddress, window, cbfun);
	}

	/**
	 * Sets the file drop callback of the specified window, which is called when one or more dragged files are dropped on the window.
	 * 
	 * <p>Because the path array and its strings may have been generated specifically for that event, they are not guaranteed to be valid after the callback has
	 * returned. If you wish to use them after the callback returns, you need to make a deep copy.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set
	 *
	 * @since version 3.1
	 */
	public static GLFWDropCallback glfwSetDropCallback(long window, GLFWDropCallbackI cbfun) {
		return GLFWDropCallback.create(nglfwSetDropCallback(window, cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwJoystickPresent ] ---

	/**
	 * Returns whether the specified joystick is present.
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param joy joystick to query
	 *
	 * @return {@link #GLFW_TRUE TRUE} if the joystick is present, or {@link #GLFW_FALSE FALSE} otherwise
	 *
	 * @since version 3.0
	 */
	public static boolean glfwJoystickPresent(int joy) {
		long __functionAddress = Functions.JoystickPresent;
		return invokeI(__functionAddress, joy) != 0;
	}

	// --- [ glfwGetJoystickAxes ] ---

	/**
	 * Returns the values of all axes of the specified joystick. Each element in the array is a value between -1.0 and 1.0.
	 * 
	 * <p>Querying a joystick slot with no device present is not an error, but will cause this function to return {@code NULL}. Call {@link #glfwJoystickPresent JoystickPresent} to check device
	 * presence.</p>
	 * 
	 * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
	 * function is called again for that joystick or the library is terminated.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param joy   the joystick to query
	 * @param count where to store the number of axis values in the returned array. This is set to zero if an error occurred.
	 *
	 * @return an array of axis values, or {@code NULL} if the joystick is not present
	 *
	 * @since version 2.2
	 */
	public static long nglfwGetJoystickAxes(int joy, long count) {
		long __functionAddress = Functions.GetJoystickAxes;
		return invokePP(__functionAddress, joy, count);
	}

	/**
	 * Returns the values of all axes of the specified joystick. Each element in the array is a value between -1.0 and 1.0.
	 * 
	 * <p>Querying a joystick slot with no device present is not an error, but will cause this function to return {@code NULL}. Call {@link #glfwJoystickPresent JoystickPresent} to check device
	 * presence.</p>
	 * 
	 * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
	 * function is called again for that joystick or the library is terminated.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param joy the joystick to query
	 *
	 * @return an array of axis values, or {@code NULL} if the joystick is not present
	 *
	 * @since version 2.2
	 */
	public static FloatBuffer glfwGetJoystickAxes(int joy) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		IntBuffer count = stack.callocInt(1);
		try {
			long __result = nglfwGetJoystickAxes(joy, memAddress(count));
			return memFloatBuffer(__result, count.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glfwGetJoystickButtons ] ---

	/**
	 * Returns the state of all buttons of the specified joystick. Each element in the array is either {@link #GLFW_PRESS PRESS} or {@link #GLFW_RELEASE RELEASE}.
	 * 
	 * <p>Querying a joystick slot with no device present is not an error, but will cause this function to return {@code NULL}. Call {@link #glfwJoystickPresent JoystickPresent} to check device
	 * presence.</p>
	 * 
	 * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
	 * function is called again for that joystick or the library is terminated.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param joy   the joystick to query
	 * @param count where to store the number of button states in the returned array. This is set to zero if an error occurred.
	 *
	 * @return an array of button states, or {@code NULL} if the joystick is not present
	 *
	 * @since version 2.2
	 */
	public static long nglfwGetJoystickButtons(int joy, long count) {
		long __functionAddress = Functions.GetJoystickButtons;
		return invokePP(__functionAddress, joy, count);
	}

	/**
	 * Returns the state of all buttons of the specified joystick. Each element in the array is either {@link #GLFW_PRESS PRESS} or {@link #GLFW_RELEASE RELEASE}.
	 * 
	 * <p>Querying a joystick slot with no device present is not an error, but will cause this function to return {@code NULL}. Call {@link #glfwJoystickPresent JoystickPresent} to check device
	 * presence.</p>
	 * 
	 * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
	 * function is called again for that joystick or the library is terminated.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param joy the joystick to query
	 *
	 * @return an array of button states, or {@code NULL} if the joystick is not present
	 *
	 * @since version 2.2
	 */
	public static ByteBuffer glfwGetJoystickButtons(int joy) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		IntBuffer count = stack.callocInt(1);
		try {
			long __result = nglfwGetJoystickButtons(joy, memAddress(count));
			return memByteBuffer(__result, count.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glfwGetJoystickName ] ---

	/**
	 * Returns the name, encoded as UTF-8, of the specified joystick.
	 * 
	 * <p>Querying a joystick slot with no device present is not an error, but will cause this function to return {@code NULL}. Call {@link #glfwJoystickPresent JoystickPresent} to check device
	 * presence.</p>
	 * 
	 * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
	 * function is called again for that joystick or the library is terminated.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param joy the joystick to query
	 *
	 * @return the UTF-8 encoded name of the joystick, or {@code NULL} if the joystick is not present
	 *
	 * @since version 3.0
	 */
	public static long nglfwGetJoystickName(int joy) {
		long __functionAddress = Functions.GetJoystickName;
		return invokeP(__functionAddress, joy);
	}

	/**
	 * Returns the name, encoded as UTF-8, of the specified joystick.
	 * 
	 * <p>Querying a joystick slot with no device present is not an error, but will cause this function to return {@code NULL}. Call {@link #glfwJoystickPresent JoystickPresent} to check device
	 * presence.</p>
	 * 
	 * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this
	 * function is called again for that joystick or the library is terminated.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param joy the joystick to query
	 *
	 * @return the UTF-8 encoded name of the joystick, or {@code NULL} if the joystick is not present
	 *
	 * @since version 3.0
	 */
	public static String glfwGetJoystickName(int joy) {
		long __result = nglfwGetJoystickName(joy);
		return memUTF8(__result);
	}

	// --- [ glfwSetJoystickCallback ] ---

	/**
	 * Sets the joystick configuration callback, or removes the currently set callback.
	 * 
	 * <p>This is called when a joystick is connected to or disconnected from the system.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param cbfun the new callback, or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been initialized
	 *
	 * @since version 3.2
	 */
	public static long nglfwSetJoystickCallback(long cbfun) {
		long __functionAddress = Functions.SetJoystickCallback;
		return invokePP(__functionAddress, cbfun);
	}

	/**
	 * Sets the joystick configuration callback, or removes the currently set callback.
	 * 
	 * <p>This is called when a joystick is connected to or disconnected from the system.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param cbfun the new callback, or {@code NULL} to remove the currently set callback
	 *
	 * @return the previously set callback, or {@code NULL} if no callback was set or the library had not been initialized
	 *
	 * @since version 3.2
	 */
	public static GLFWJoystickCallback glfwSetJoystickCallback(GLFWJoystickCallbackI cbfun) {
		return GLFWJoystickCallback.create(nglfwSetJoystickCallback(cbfun == null ? NULL : cbfun.address()));
	}

	// --- [ glfwSetClipboardString ] ---

	/**
	 * Sets the system clipboard to the specified, UTF-8 encoded string.
	 * 
	 * <p>The specified string is copied before this function returns.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window that will own the clipboard contents
	 * @param string a UTF-8 encoded string
	 *
	 * @since version 3.0
	 */
	public static void nglfwSetClipboardString(long window, long string) {
		long __functionAddress = Functions.SetClipboardString;
		if ( CHECKS )
			checkPointer(window);
		invokePPV(__functionAddress, window, string);
	}

	/**
	 * Sets the system clipboard to the specified, UTF-8 encoded string.
	 * 
	 * <p>The specified string is copied before this function returns.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window that will own the clipboard contents
	 * @param string a UTF-8 encoded string
	 *
	 * @since version 3.0
	 */
	public static void glfwSetClipboardString(long window, ByteBuffer string) {
		if ( CHECKS )
			checkNT1(string);
		nglfwSetClipboardString(window, memAddress(string));
	}

	/**
	 * Sets the system clipboard to the specified, UTF-8 encoded string.
	 * 
	 * <p>The specified string is copied before this function returns.</p>
	 * 
	 * <p>This function must only be called from the main thread.</p>
	 *
	 * @param window the window that will own the clipboard contents
	 * @param string a UTF-8 encoded string
	 *
	 * @since version 3.0
	 */
	public static void glfwSetClipboardString(long window, CharSequence string) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer stringEncoded = stack.UTF8(string);
			nglfwSetClipboardString(window, memAddress(stringEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glfwGetClipboardString ] ---

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
	 * <li>This function must only be called from the main thread.</li>
	 * <li>The returned string is allocated and freed by GLFW.  You should not free it yourself.</li>
	 * <li>The returned string is valid only until the next call to {@link #glfwGetClipboardString GetClipboardString} or {@link #glfwSetClipboardString SetClipboardString}.</li>
	 * </ul>
	 *
	 * @param window the window that will request the clipboard contents
	 *
	 * @return the contents of the clipboard as a UTF-8 encoded string, or {@code NULL} if an error occurred
	 *
	 * @since version 3.0
	 */
	public static long nglfwGetClipboardString(long window) {
		long __functionAddress = Functions.GetClipboardString;
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
	 * <li>This function must only be called from the main thread.</li>
	 * <li>The returned string is allocated and freed by GLFW.  You should not free it yourself.</li>
	 * <li>The returned string is valid only until the next call to {@link #glfwGetClipboardString GetClipboardString} or {@link #glfwSetClipboardString SetClipboardString}.</li>
	 * </ul>
	 *
	 * @param window the window that will request the clipboard contents
	 *
	 * @return the contents of the clipboard as a UTF-8 encoded string, or {@code NULL} if an error occurred
	 *
	 * @since version 3.0
	 */
	public static String glfwGetClipboardString(long window) {
		long __result = nglfwGetClipboardString(window);
		return memUTF8(__result);
	}

	// --- [ glfwGetTime ] ---

	/**
	 * Returns the value of the GLFW timer. Unless the timer has been set using {@link #glfwSetTime SetTime}, the timer measures time elapsed since GLFW was initialized.
	 * 
	 * <p>The resolution of the timer is system dependent, but is usually on the order of a few micro- or nanoseconds. It uses the highest-resolution monotonic
	 * time source on each supported platform.</p>
	 * 
	 * <p>This function may be called from any thread. Reading and writing of the internal timer offset is not atomic, so it needs to be externally synchronized
	 * with calls to {@link #glfwSetTime SetTime}.</p>
	 *
	 * @return the current value, in seconds, or zero if an error occurred
	 *
	 * @since version 1.0
	 */
	public static double glfwGetTime() {
		long __functionAddress = Functions.GetTime;
		return invokeD(__functionAddress);
	}

	// --- [ glfwSetTime ] ---

	/**
	 * Sets the value of the GLFW timer. It then continues to count up from that value. The value must be a positive finite number less than or equal to
	 * 18446744073.0, which is approximately 584.5 years.
	 * 
	 * <p>The upper limit of the timer is calculated as <code>floor((2<sup>64</sup> - 1) / 10<sup>9</sup>)</code> and is due to implementations storing nanoseconds
	 * in 64 bits. The limit may be increased in the future.</p>
	 * 
	 * <p>This function may be called from any thread. Reading and writing of the internal timer offset is not atomic, so it needs to be externally synchronized
	 * with calls to {@link #glfwGetTime GetTime}.</p>
	 *
	 * @param time the new value, in seconds
	 *
	 * @since version 2.2
	 */
	public static void glfwSetTime(double time) {
		long __functionAddress = Functions.SetTime;
		invokeV(__functionAddress, time);
	}

	// --- [ glfwGetTimerValue ] ---

	/**
	 * Returns the current value of the raw timer.
	 * 
	 * <p>This function returns the current value of the raw timer, measured in {@code 1 / frequency} seconds. To get the frequency, call {@link #glfwGetTimerFrequency GetTimerFrequency}.</p>
	 * 
	 * <p>This function may be called from any thread.</p>
	 *
	 * @return the value of the timer, or zero if an error occurred
	 *
	 * @since version 3.2
	 */
	public static long glfwGetTimerValue() {
		long __functionAddress = Functions.GetTimerValue;
		return invokeJ(__functionAddress);
	}

	// --- [ glfwGetTimerFrequency ] ---

	/**
	 * Returns the frequency, in Hz, of the raw timer.
	 * 
	 * <p>This function may be called from any thread.</p>
	 *
	 * @return the frequency of the timer, in Hz, or zero if an error occurred
	 *
	 * @since version 3.2
	 */
	public static long glfwGetTimerFrequency() {
		long __functionAddress = Functions.GetTimerFrequency;
		return invokeJ(__functionAddress);
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
	 * @since version 3.0
	 */
	public static void glfwMakeContextCurrent(long window) {
		long __functionAddress = Functions.MakeContextCurrent;
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
	 * @since version 3.0
	 */
	public static long glfwGetCurrentContext() {
		long __functionAddress = Functions.GetCurrentContext;
		return invokeP(__functionAddress);
	}

	// --- [ glfwSwapBuffers ] ---

	/**
	 * Swaps the front and back buffers of the specified window when rendering with OpenGL or OpenGL ES. If the swap interval is greater than zero, the GPU
	 * driver waits the specified number of screen updates before swapping the buffers.
	 * 
	 * <p>The specified window must have an OpenGL or OpenGL ES context. Specifying a window without a context will generate a {@link #GLFW_NO_WINDOW_CONTEXT NO_WINDOW_CONTEXT} error.</p>
	 * 
	 * <p>This function does not apply to Vulkan. If you are rendering with Vulkan, {@code vkQueuePresentKHR} instead.</p>
	 * 
	 * <p><b>EGL</b>: The context of the specified window must be current on the calling thread.</p>
	 * 
	 * <p>This function may be called from any thread.</p>
	 *
	 * @param window the window whose buffers to swap
	 *
	 * @since version 1.0
	 */
	public static void glfwSwapBuffers(long window) {
		long __functionAddress = Functions.SwapBuffers;
		if ( CHECKS )
			checkPointer(window);
		invokePV(__functionAddress, window);
	}

	// --- [ glfwSwapInterval ] ---

	/**
	 * Sets the swap interval for the current OpenGL or OpenGL ES context, i.e. the number of screen updates to wait from the time {@link #glfwSwapBuffers SwapBuffers} was called
	 * before swapping the buffers and returning. This is sometimes called <i>vertical synchronization</i>, <i>vertical retrace synchronization</i> or just
	 * <i>vsync</i>.
	 * 
	 * <p>Contexts that support either of the <a href="https://www.opengl.org/registry/specs/EXT/wgl_swap_control_tear.txt">WGL_EXT_swap_control_tear</a> and
	 * <a href="https://www.opengl.org/registry/specs/EXT/glx_swap_control_tear.txt">GLX_EXT_swap_control_tear</a> extensions also accept negative swap
	 * intervals, which allow the driver to swap even if a frame arrives a little bit late. You can check for the presence of these extensions using
	 * {@link #glfwExtensionSupported ExtensionSupported}. For more information about swap tearing, see the extension specifications.</p>
	 * 
	 * <p>A context must be current on the calling thread. Calling this function without a current context will cause a {@link #GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
	 * 
	 * <p>This function does not apply to Vulkan. If you are rendering with Vulkan, see the present mode of your swapchain instead.</p>
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
	 * @since version 1.0
	 */
	public static void glfwSwapInterval(int interval) {
		long __functionAddress = Functions.SwapInterval;
		invokeV(__functionAddress, interval);
	}

	// --- [ glfwExtensionSupported ] ---

	/**
	 * Returns whether the specified <a href="http://www.glfw.org/docs/latest/context.html#context_glext">API extension</a> is supported by the current
	 * OpenGL or OpenGL ES context. It searches both for client API extension and context creation API extensions.
	 * 
	 * <p>A context must be current on the calling thread. Calling this function without a current context will cause a {@link #GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
	 * 
	 * <p>As this functions retrieves and searches one or more extension strings each call, it is recommended that you cache its results if it is going to be used
	 * frequently. The extension strings will not change during the lifetime of a context, so there is no danger in doing this.</p>
	 * 
	 * <p>This function does not apply to Vulkan. If you are using Vulkan, see {@link GLFWVulkan#glfwGetRequiredInstanceExtensions GetRequiredInstanceExtensions},
	 * {@code vkEnumerateInstanceExtensionProperties} and {@code vkEnumerateDeviceExtensionProperties} instead.</p>
	 * 
	 * <p>This function may be called from any thread.</p>
	 *
	 * @param extension the ASCII encoded name of the extension
	 *
	 * @return {@link #GLFW_TRUE TRUE} if the extension is available, or {@link #GLFW_FALSE FALSE} otherwise
	 *
	 * @since version 1.0
	 */
	public static int nglfwExtensionSupported(long extension) {
		long __functionAddress = Functions.ExtensionSupported;
		return invokePI(__functionAddress, extension);
	}

	/**
	 * Returns whether the specified <a href="http://www.glfw.org/docs/latest/context.html#context_glext">API extension</a> is supported by the current
	 * OpenGL or OpenGL ES context. It searches both for client API extension and context creation API extensions.
	 * 
	 * <p>A context must be current on the calling thread. Calling this function without a current context will cause a {@link #GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
	 * 
	 * <p>As this functions retrieves and searches one or more extension strings each call, it is recommended that you cache its results if it is going to be used
	 * frequently. The extension strings will not change during the lifetime of a context, so there is no danger in doing this.</p>
	 * 
	 * <p>This function does not apply to Vulkan. If you are using Vulkan, see {@link GLFWVulkan#glfwGetRequiredInstanceExtensions GetRequiredInstanceExtensions},
	 * {@code vkEnumerateInstanceExtensionProperties} and {@code vkEnumerateDeviceExtensionProperties} instead.</p>
	 * 
	 * <p>This function may be called from any thread.</p>
	 *
	 * @param extension the ASCII encoded name of the extension
	 *
	 * @return {@link #GLFW_TRUE TRUE} if the extension is available, or {@link #GLFW_FALSE FALSE} otherwise
	 *
	 * @since version 1.0
	 */
	public static boolean glfwExtensionSupported(ByteBuffer extension) {
		if ( CHECKS )
			checkNT1(extension);
		return nglfwExtensionSupported(memAddress(extension)) != 0;
	}

	/**
	 * Returns whether the specified <a href="http://www.glfw.org/docs/latest/context.html#context_glext">API extension</a> is supported by the current
	 * OpenGL or OpenGL ES context. It searches both for client API extension and context creation API extensions.
	 * 
	 * <p>A context must be current on the calling thread. Calling this function without a current context will cause a {@link #GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
	 * 
	 * <p>As this functions retrieves and searches one or more extension strings each call, it is recommended that you cache its results if it is going to be used
	 * frequently. The extension strings will not change during the lifetime of a context, so there is no danger in doing this.</p>
	 * 
	 * <p>This function does not apply to Vulkan. If you are using Vulkan, see {@link GLFWVulkan#glfwGetRequiredInstanceExtensions GetRequiredInstanceExtensions},
	 * {@code vkEnumerateInstanceExtensionProperties} and {@code vkEnumerateDeviceExtensionProperties} instead.</p>
	 * 
	 * <p>This function may be called from any thread.</p>
	 *
	 * @param extension the ASCII encoded name of the extension
	 *
	 * @return {@link #GLFW_TRUE TRUE} if the extension is available, or {@link #GLFW_FALSE FALSE} otherwise
	 *
	 * @since version 1.0
	 */
	public static boolean glfwExtensionSupported(CharSequence extension) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer extensionEncoded = stack.ASCII(extension);
			return nglfwExtensionSupported(memAddress(extensionEncoded)) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glfwGetProcAddress ] ---

	/**
	 * Returns the address of the specified OpenGL or OpenGL ES <a href="http://www.glfw.org/docs/latest/context.html#context_glext">core or extension
	 * function</a>, if it is supported by the current context.
	 * 
	 * <p>A context must be current on the calling thread.  Calling this function without a current context will cause a {@link #GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
	 * 
	 * <p>This function does not apply to Vulkan. If you are rendering with Vulkan, {@link GLFWVulkan#glfwGetInstanceProcAddress GetInstanceProcAddress}, {@code vkGetInstanceProcAddr} and
	 * {@code vkGetDeviceProcAddr} instead.</p>
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
	 * @since version 1.0
	 */
	public static long nglfwGetProcAddress(long procname) {
		long __functionAddress = Functions.GetProcAddress;
		return invokePP(__functionAddress, procname);
	}

	/**
	 * Returns the address of the specified OpenGL or OpenGL ES <a href="http://www.glfw.org/docs/latest/context.html#context_glext">core or extension
	 * function</a>, if it is supported by the current context.
	 * 
	 * <p>A context must be current on the calling thread.  Calling this function without a current context will cause a {@link #GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
	 * 
	 * <p>This function does not apply to Vulkan. If you are rendering with Vulkan, {@link GLFWVulkan#glfwGetInstanceProcAddress GetInstanceProcAddress}, {@code vkGetInstanceProcAddr} and
	 * {@code vkGetDeviceProcAddr} instead.</p>
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
	 * @since version 1.0
	 */
	public static long glfwGetProcAddress(ByteBuffer procname) {
		if ( CHECKS )
			checkNT1(procname);
		return nglfwGetProcAddress(memAddress(procname));
	}

	/**
	 * Returns the address of the specified OpenGL or OpenGL ES <a href="http://www.glfw.org/docs/latest/context.html#context_glext">core or extension
	 * function</a>, if it is supported by the current context.
	 * 
	 * <p>A context must be current on the calling thread.  Calling this function without a current context will cause a {@link #GLFW_NO_CURRENT_CONTEXT NO_CURRENT_CONTEXT} error.</p>
	 * 
	 * <p>This function does not apply to Vulkan. If you are rendering with Vulkan, {@link GLFWVulkan#glfwGetInstanceProcAddress GetInstanceProcAddress}, {@code vkGetInstanceProcAddr} and
	 * {@code vkGetDeviceProcAddr} instead.</p>
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
	 * @since version 1.0
	 */
	public static long glfwGetProcAddress(CharSequence procname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer procnameEncoded = stack.ASCII(procname);
			return nglfwGetProcAddress(memAddress(procnameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glfwGetVersion GetVersion} */
	public static void glfwGetVersion(int[] major, int[] minor, int[] rev) {
		long __functionAddress = Functions.GetVersion;
		if ( CHECKS ) {
			if ( major != null ) checkBuffer(major, 1);
			if ( minor != null ) checkBuffer(minor, 1);
			if ( rev != null ) checkBuffer(rev, 1);
		}
		invokePPPV(__functionAddress, major, minor, rev);
	}

	/** Array version of: {@link #glfwGetMonitorPos GetMonitorPos} */
	public static void glfwGetMonitorPos(long monitor, int[] xpos, int[] ypos) {
		long __functionAddress = Functions.GetMonitorPos;
		if ( CHECKS ) {
			checkPointer(monitor);
			if ( xpos != null ) checkBuffer(xpos, 1);
			if ( ypos != null ) checkBuffer(ypos, 1);
		}
		invokePPPV(__functionAddress, monitor, xpos, ypos);
	}

	/** Array version of: {@link #glfwGetMonitorPhysicalSize GetMonitorPhysicalSize} */
	public static void glfwGetMonitorPhysicalSize(long monitor, int[] widthMM, int[] heightMM) {
		long __functionAddress = Functions.GetMonitorPhysicalSize;
		if ( CHECKS ) {
			checkPointer(monitor);
			if ( widthMM != null ) checkBuffer(widthMM, 1);
			if ( heightMM != null ) checkBuffer(heightMM, 1);
		}
		invokePPPV(__functionAddress, monitor, widthMM, heightMM);
	}

	/** Array version of: {@link #glfwGetWindowPos GetWindowPos} */
	public static void glfwGetWindowPos(long window, int[] xpos, int[] ypos) {
		long __functionAddress = Functions.GetWindowPos;
		if ( CHECKS ) {
			checkPointer(window);
			if ( xpos != null ) checkBuffer(xpos, 1);
			if ( ypos != null ) checkBuffer(ypos, 1);
		}
		invokePPPV(__functionAddress, window, xpos, ypos);
	}

	/** Array version of: {@link #glfwGetWindowSize GetWindowSize} */
	public static void glfwGetWindowSize(long window, int[] width, int[] height) {
		long __functionAddress = Functions.GetWindowSize;
		if ( CHECKS ) {
			checkPointer(window);
			if ( width != null ) checkBuffer(width, 1);
			if ( height != null ) checkBuffer(height, 1);
		}
		invokePPPV(__functionAddress, window, width, height);
	}

	/** Array version of: {@link #glfwGetFramebufferSize GetFramebufferSize} */
	public static void glfwGetFramebufferSize(long window, int[] width, int[] height) {
		long __functionAddress = Functions.GetFramebufferSize;
		if ( CHECKS ) {
			checkPointer(window);
			if ( width != null ) checkBuffer(width, 1);
			if ( height != null ) checkBuffer(height, 1);
		}
		invokePPPV(__functionAddress, window, width, height);
	}

	/** Array version of: {@link #glfwGetWindowFrameSize GetWindowFrameSize} */
	public static void glfwGetWindowFrameSize(long window, int[] left, int[] top, int[] right, int[] bottom) {
		long __functionAddress = Functions.GetWindowFrameSize;
		if ( CHECKS ) {
			checkPointer(window);
			if ( left != null ) checkBuffer(left, 1);
			if ( top != null ) checkBuffer(top, 1);
			if ( right != null ) checkBuffer(right, 1);
			if ( bottom != null ) checkBuffer(bottom, 1);
		}
		invokePPPPPV(__functionAddress, window, left, top, right, bottom);
	}

	/** Array version of: {@link #glfwGetCursorPos GetCursorPos} */
	public static void glfwGetCursorPos(long window, double[] xpos, double[] ypos) {
		long __functionAddress = Functions.GetCursorPos;
		if ( CHECKS ) {
			checkPointer(window);
			if ( xpos != null ) checkBuffer(xpos, 1);
			if ( ypos != null ) checkBuffer(ypos, 1);
		}
		invokePPPV(__functionAddress, window, xpos, ypos);
	}

}