/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to user32.dll */
public class User32 {

	/** Window Styles */
	public static final int
		WS_OVERLAPPED       = 0x0,
		WS_POPUP            = 0x80000000,
		WS_CHILD            = 0x40000000,
		WS_MINIMIZE         = 0x20000000,
		WS_VISIBLE          = 0x10000000,
		WS_DISABLED         = 0x8000000,
		WS_CLIPSIBLINGS     = 0x4000000,
		WS_CLIPCHILDREN     = 0x2000000,
		WS_MAXIMIZE         = 0x1000000,
		WS_CAPTION          = 0xC00000,
		WS_BORDER           = 0x800000,
		WS_DLGFRAME         = 0x400000,
		WS_VSCROLL          = 0x200000,
		WS_HSCROLL          = 0x100000,
		WS_SYSMENU          = 0x80000,
		WS_THICKFRAME       = 0x40000,
		WS_GROUP            = 0x20000,
		WS_TABSTOP          = 0x10000,
		WS_MINIMIZEBOX      = 0x20000,
		WS_MAXIMIZEBOX      = 0x10000,
		WS_OVERLAPPEDWINDOW = WS_OVERLAPPED | WS_CAPTION | WS_SYSMENU | WS_THICKFRAME | WS_MINIMIZEBOX | WS_MAXIMIZEBOX,
		WS_POPUPWINDOW      = WS_POPUP | WS_BORDER | WS_SYSMENU,
		WS_CHILDWINDOW      = WS_CHILD,
		WS_TILED            = WS_OVERLAPPED,
		WS_ICONIC           = WS_MINIMIZE,
		WS_SIZEBOX          = WS_THICKFRAME,
		WS_TILEDWINDOW      = WS_OVERLAPPEDWINDOW;

	/** Extended Window Styles */
	public static final int
		WS_EX_DLGMODALFRAME    = 0x1,
		WS_EX_NOPARENTNOTIFY   = 0x4,
		WS_EX_TOPMOST          = 0x8,
		WS_EX_ACCEPTFILES      = 0x10,
		WS_EX_TRANSPARENT      = 0x20,
		WS_EX_MDICHILD         = 0x40,
		WS_EX_TOOLWINDOW       = 0x80,
		WS_EX_WINDOWEDGE       = 0x100,
		WS_EX_CLIENTEDGE       = 0x200,
		WS_EX_CONTEXTHELP      = 0x400,
		WS_EX_RIGHT            = 0x1000,
		WS_EX_LEFT             = 0x0,
		WS_EX_RTLREADING       = 0x2000,
		WS_EX_LTRREADING       = 0x0,
		WS_EX_LEFTSCROLLBAR    = 0x4000,
		WS_EX_RIGHTSCROLLBAR   = 0x0,
		WS_EX_CONTROLPARENT    = 0x10000,
		WS_EX_STATICEDGE       = 0x20000,
		WS_EX_APPWINDOW        = 0x40000,
		WS_EX_OVERLAPPEDWINDOW = WS_EX_WINDOWEDGE | WS_EX_CLIENTEDGE,
		WS_EX_PALETTEWINDOW    = WS_EX_WINDOWEDGE | WS_EX_TOOLWINDOW | WS_EX_TOPMOST,
		WS_EX_LAYERED          = 0x80000,
		WS_EX_NOINHERITLAYOUT  = 0x100000,
		WS_EX_LAYOUTRTL        = 0x400000,
		WS_EX_COMPOSITED       = 0x2000000,
		WS_EX_NOACTIVATE       = 0x8000000;

	/** May be used in {@link #CreateWindowEx} for the x, y, width, height parameters. */
	public static final int CW_USEDEFAULT = 0x80000000;

	/** Class styles */
	public static final int
		CS_VREDRAW         = 0x1,
		CS_HREDRAW         = 0x2,
		CS_DBLCLKS         = 0x8,
		CS_OWNDC           = 0x20,
		CS_CLASSDC         = 0x40,
		CS_PARENTDC        = 0x80,
		CS_NOCLOSE         = 0x200,
		CS_SAVEBITS        = 0x800,
		CS_BYTEALIGNCLIENT = 0x1000,
		CS_BYTEALIGNWINDOW = 0x2000,
		CS_GLOBALCLASS     = 0x4000,
		CS_IME             = 0x10000,
		CS_DROPSHADOW      = 0x20000;

	static { Library.initialize(); }

	/** Function address. */
	@JavadocExclude
	public final long
		RegisterClassEx,
		UnregisterClass,
		CreateWindowEx,
		DestroyWindow,
		DefWindowProc,
		GetDC,
		ReleaseDC;

	@JavadocExclude
	protected User32() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public User32(FunctionProvider provider) {
		RegisterClassEx = checkFunctionAddress(provider.getFunctionAddress("RegisterClassExW"));
		UnregisterClass = checkFunctionAddress(provider.getFunctionAddress("UnregisterClassW"));
		CreateWindowEx = checkFunctionAddress(provider.getFunctionAddress("CreateWindowExW"));
		DestroyWindow = checkFunctionAddress(provider.getFunctionAddress("DestroyWindow"));
		DefWindowProc = checkFunctionAddress(provider.getFunctionAddress("DefWindowProcW"));
		GetDC = checkFunctionAddress(provider.getFunctionAddress("GetDC"));
		ReleaseDC = checkFunctionAddress(provider.getFunctionAddress("ReleaseDC"));
	}

	// --- [ Function Addresses ] ---

	private static final SharedLibrary USER32;

	private static final User32 instance;

	static {
		USER32 = Library.loadNative("user32");
		instance = new User32(USER32);
	}

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return USER32;
	}

	/** Returns the {@link User32} instance. */
	public static User32 getInstance() {
		return instance;
	}

	// --- [ RegisterClassEx ] ---

	/** JNI method for {@link #RegisterClassEx} */
	@JavadocExclude
	public static native short nRegisterClassEx(long __functionAddress, long wndClassEx);

	/** Unsafe version of {@link #RegisterClassEx} */
	@JavadocExclude
	public static short nRegisterClassEx(long wndClassEx) {
		long __functionAddress = getInstance().RegisterClassEx;
		return nRegisterClassEx(__functionAddress, wndClassEx);
	}

	/**
	 * Registers a window class for subsequent use in calls to the {@link #CreateWindowEx} function.
	 *
	 * @param wndClassEx a {@link WNDCLASSEX} structure. You must fill the structure with the appropriate class attributes before passing it to the function.
	 */
	public static short RegisterClassEx(WNDCLASSEX wndClassEx) {
		return nRegisterClassEx(wndClassEx.address());
	}

	// --- [ UnregisterClass ] ---

	/** JNI method for {@link #UnregisterClass} */
	@JavadocExclude
	public static native int nUnregisterClass(long __functionAddress, long className, long instance);

	/** Unsafe version of {@link #UnregisterClass} */
	@JavadocExclude
	public static int nUnregisterClass(long className, long instance) {
		long __functionAddress = getInstance().UnregisterClass;
		return nUnregisterClass(__functionAddress, className, instance);
	}

	/**
	 * Unregisters a window class, freeing the memory required for the class.
	 *
	 * @param className a null-terminated string or a class atom. If {@code className} is a string, it specifies the window class name. This class name must have been
	 *                  registered by a previous call to the {@link #RegisterClassEx} function. System classes, such as dialog box controls, cannot be unregistered. If this
	 *                  parameter is an atom, it must be a class atom created by a previous call to the {@link #RegisterClassEx} function. The atom must be in the low-order
	 *                  word of {@code className}; the high-order word must be zero.
	 * @param instance  a handle to the instance of the module that created the class
	 */
	public static int UnregisterClass(ByteBuffer className, long instance) {
		if ( CHECKS )
			checkNT2(className);
		return nUnregisterClass(memAddress(className), instance);
	}

	/** CharSequence version of: {@link #UnregisterClass} */
	public static int UnregisterClass(CharSequence className, long instance) {
		APIBuffer __buffer = apiBuffer();
		int classNameEncoded = __buffer.stringParamUTF16(className, true);
		return nUnregisterClass(__buffer.address(classNameEncoded), instance);
	}

	// --- [ CreateWindowEx ] ---

	/** JNI method for {@link #CreateWindowEx} */
	@JavadocExclude
	public static native long nCreateWindowEx(long __functionAddress, int exStyle, long className, long windowName, int style, int x, int y, int width, int height, long parent, long menu, long instance, long param);

	/** Unsafe version of {@link #CreateWindowEx} */
	@JavadocExclude
	public static long nCreateWindowEx(int exStyle, long className, long windowName, int style, int x, int y, int width, int height, long parent, long menu, long instance, long param) {
		long __functionAddress = getInstance().CreateWindowEx;
		return nCreateWindowEx(__functionAddress, exStyle, className, windowName, style, x, y, width, height, parent, menu, instance, param);
	}

	/**
	 * Creates an overlapped, pop-up, or child window with an extended window style; otherwise, this function is identical to the CreateWindow function.
	 *
	 * @param exStyle    the extended window style of the window being created
	 * @param className  a null-terminated string or a class atom created by a previous call to the {@link #RegisterClassEx} function.
	 * @param windowName the window name. If the window style specifies a title bar, the window title pointed to by {@code windowName} is displayed in the title bar.
	 * @param style      the style of the window being created
	 * @param x          the initial horizontal position of the window
	 * @param y          the initial vertical position of the window
	 * @param width      the width, in device units, of the window
	 * @param height     the height, in device units, of the window
	 * @param parent     a handle to the parent or owner window of the window being created. To create a child window or an owned window, supply a valid window handle.
	 * @param menu       a handle to a menu, or specifies a child-window identifier, depending on the window style
	 * @param instance   a handle to the instance of the module to be associated with the window
	 * @param param      a value to be passed to the window through the {@link CREATESTRUCT} structure ({@code createParams} member) pointed to by the {@code lParam} param of the WM_CREATE message.
	 */
	public static long CreateWindowEx(int exStyle, ByteBuffer className, ByteBuffer windowName, int style, int x, int y, int width, int height, long parent, long menu, long instance, long param) {
		if ( CHECKS ) {
			checkNT2(className);
			checkNT2(windowName);
		}
		return nCreateWindowEx(exStyle, memAddress(className), memAddress(windowName), style, x, y, width, height, parent, menu, instance, param);
	}

	/** CharSequence version of: {@link #CreateWindowEx} */
	public static long CreateWindowEx(int exStyle, CharSequence className, CharSequence windowName, int style, int x, int y, int width, int height, long parent, long menu, long instance, long param) {
		APIBuffer __buffer = apiBuffer();
		int classNameEncoded = __buffer.stringParamUTF16(className, true);
		int windowNameEncoded = __buffer.stringParamUTF16(windowName, true);
		return nCreateWindowEx(exStyle, __buffer.address(classNameEncoded), __buffer.address(windowNameEncoded), style, x, y, width, height, parent, menu, instance, param);
	}

	// --- [ DestroyWindow ] ---

	/** JNI method for {@link #DestroyWindow} */
	@JavadocExclude
	public static native int nDestroyWindow(long __functionAddress, long window);

	/**
	 * Destroys the specified window. The function sends WM_DESTROY and WM_NCDESTROY messages to the window to deactivate it and remove the keyboard focus from
	 * it. The function also destroys the window's menu, flushes the thread message queue, destroys timers, removes clipboard ownership, and breaks the
	 * clipboard viewer chain (if the window is at the top of the viewer chain).
	 * 
	 * <p>If the specified window is a parent or owner window, DestroyWindow automatically destroys the associated child or owned windows when it destroys the
	 * parent or owner window. The function first destroys child or owned windows, and then it destroys the parent or owner window.</p>
	 *
	 * @param window a handle to the window to be destroyed
	 */
	public static int DestroyWindow(long window) {
		long __functionAddress = getInstance().DestroyWindow;
		if ( CHECKS )
			checkPointer(window);
		return nDestroyWindow(__functionAddress, window);
	}

	// --- [ DefWindowProc ] ---

	/**
	 * Calls the default window procedure to provide default processing for any window messages that an application does not process. This function ensures
	 * that every message is processed. DefWindowProc is called with the same parameters received by the window procedure.
	 *
	 * @param window a handle to the window that received the message
	 * @param msg    the message
	 * @param wParam additional message information. The content of this parameter depends on the value of the {@code msg} parameter.
	 * @param lParam additional message information. The content of this parameter depends on the value of the {@code msg} parameter.
	 */
	public static long DefWindowProc(long window, int msg, long wParam, long lParam) {
		long __functionAddress = getInstance().DefWindowProc;
		if ( CHECKS )
			checkPointer(window);
		return callPIPPP(__functionAddress, window, msg, wParam, lParam);
	}

	// --- [ GetDC ] ---

	/**
	 * Retrieves a handle to a device context (DC) for the client area of a specified window or for the entire screen. You can use the returned handle in
	 * subsequent GDI functions to draw in the DC. The device context is an opaque data structure, whose values are used internally by GDI.
	 *
	 * @param hWnd a handle to the window whose DC is to be retrieved. If this value is {@code NULL}, GetDC retrieves the DC for the entire screen.
	 */
	public static long GetDC(long hWnd) {
		long __functionAddress = getInstance().GetDC;
		return callPP(__functionAddress, hWnd);
	}

	// --- [ ReleaseDC ] ---

	/**
	 * Releases a device context (DC), freeing it for use by other applications. The effect of the ReleaseDC function depends on the type of DC. It frees only
	 * common and window DCs. It has no effect on class or private DCs.
	 *
	 * @param hWnd a handle to the window whose DC is to be released
	 * @param hDC  a handle to the DC to be released
	 */
	public static int ReleaseDC(long hWnd, long hDC) {
		long __functionAddress = getInstance().ReleaseDC;
		if ( CHECKS ) {
			checkPointer(hWnd);
			checkPointer(hDC);
		}
		return callPPI(__functionAddress, hWnd, hDC);
	}

}