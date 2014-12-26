/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to &lt;X11/Xutil.h&gt;. */
public final class Xutil {

	/** Definition for flags of {@link XWMHints} */
	public static final int
		InputHint        = 1 << 0,
		StateHint        = 1 << 1,
		IconPixmapHint   = 1 << 2,
		IconWindowHint   = 1 << 3,
		IconPositionHint = 1 << 4,
		IconMaskHint     = 1 << 5,
		WindowGroupHint  = 1 << 6,
		AllHints         = InputHint|StateHint|IconPixmapHint|IconWindowHint|IconPositionHint|IconMaskHint|WindowGroupHint,
		XUrgencyHint     = 1 << 8;

	/** Definitions for initial window state */
	public static final int
		WithdrawnState = 0x0,
		NormalState    = 0x1,
		IconicState    = 0x3;

	/** flags argument in size hints */
	public static final int
		USPosition  = 1 << 0,
		USSize      = 1 << 1,
		PPosition   = 1 << 2,
		PSize       = 1 << 3,
		PMinSize    = 1 << 4,
		PMaxSize    = 1 << 5,
		PResizeInc  = 1 << 6,
		PAspect     = 1 << 7,
		PBaseSize   = 1 << 8,
		PWinGravity = 1 << 9;

	static { LWJGLUtil.initialize(); }

	private Xutil() {}

	// --- [ XLookupString ] ---

	/** JNI method for {@link #XLookupString} */
	@JavadocExclude
	public static native int nXLookupString(long event_struct, long buffer_return, int bytes_buffer, long keysym_return, long status_in_out);

	/**
	 * Translates a key event to a {@code KeySym} and a string. The {@code KeySym} is obtained by using the standard interpretation of the Shift, Lock, group,
	 * and numlock modifiers as defined in the X Protocol specification. If the {@code KeySym} has been rebound (see {@link Xlib#XRebindKeysym}), the bound
	 * string will be stored in the buffer. Otherwise, the {@code KeySym} is mapped, if possible, to an ISO Latin-1 character or (if the Control modifier is
	 * on) to an ASCII control character, and that character is stored in the buffer. {@code XLookupString} returns the number of characters that are stored
	 * in the buffer.
	 * 
	 * <p>If present (non-{@code NULL}), the {@link XComposeStatus} structure records the state, which is private to Xlib, that needs preservation across calls to
	 * {@code XLookupString} to implement compose processing. The creation of {@link XComposeStatus} structures is implementation dependent; a portable
	 * program must pass {@code NULL} for this argument.</p>
	 * 
	 * <p>{@code XLookupString} depends on the cached keyboard information mentioned in the previous section, so it is necessary to use
	 * {@link Xlib#XRefreshKeyboardMapping} to keep this information up-to-date.</p>
	 *
	 * @param event_struct  specifies the {@link XKeyEvent} structure to be used.
	 * @param buffer_return returns the translated characters
	 * @param bytes_buffer  specifies the length of the buffer. No more than {@code bytes_buffer} of translation are returned.
	 * @param keysym_return returns the {@code KeySym} computed from the event if this argument is not {@code NULL}
	 * @param status_in_out specifies or returns the {@link XComposeStatus} structure or {@code NULL}.
	 */
	public static int XLookupString(ByteBuffer event_struct, ByteBuffer buffer_return, int bytes_buffer, ByteBuffer keysym_return, ByteBuffer status_in_out) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(event_struct, XKeyEvent.SIZEOF);
			checkBuffer(buffer_return, bytes_buffer);
			checkBuffer(status_in_out, XComposeStatus.SIZEOF);
		}
		return nXLookupString(memAddress(event_struct), memAddress(buffer_return), bytes_buffer, memAddress(keysym_return), memAddress(status_in_out));
	}

	/** Alternative version of: {@link #XLookupString} */
	public static int XLookupString(ByteBuffer event_struct, ByteBuffer buffer_return, PointerBuffer keysym_return, ByteBuffer status_in_out) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(event_struct, XKeyEvent.SIZEOF);
			checkBuffer(status_in_out, XComposeStatus.SIZEOF);
		}
		return nXLookupString(memAddress(event_struct), memAddress(buffer_return), buffer_return.remaining(), memAddress(keysym_return), memAddress(status_in_out));
	}

	// --- [ XAllocWMHints ] ---

	/** JNI method for {@link #XAllocWMHints} */
	@JavadocExclude
	public static native long nXAllocWMHints();

	/**
	 * Allocates and returns a pointer to a {@link XWMHints} structure. Note that all fields in the {@link XWMHints} structure are initially set to zero. If
	 * insufficient memory is available, {@code XAllocWMHints} returns {@code NULL}. To free the memory allocated to this structure, use {@link Xlib#XFree}.
	 */
	public static ByteBuffer XAllocWMHints() {
		long __result = nXAllocWMHints();
		return memByteBuffer(__result, XWMHints.SIZEOF);
	}

	// --- [ XAllocSizeHints ] ---

	/** JNI method for {@link #XAllocSizeHints} */
	@JavadocExclude
	public static native long nXAllocSizeHints();

	/**
	 * Allocates and returns a pointer to a {@link XSizeHints} structure. Note that all fields in the {@link XSizeHints} structure are initially set to zero.
	 * If insufficient memory is available, {@code XAllocSizeHints} returns {@code NULL}. To free the memory allocated to this structure, use {@link Xlib#XFree}.
	 */
	public static ByteBuffer XAllocSizeHints() {
		long __result = nXAllocSizeHints();
		return memByteBuffer(__result, XSizeHints.SIZEOF);
	}

	// --- [ XUniqueContext ] ---

	/** Creates a unique context. */
	public static native int XUniqueContext();

	// --- [ XSaveContext ] ---

	/** JNI method for {@link #XSaveContext} */
	@JavadocExclude
	public static native int nXSaveContext(long display, long rid, int context, long data);

	/**
	 * Save a data value that corresponds to a resource ID and context type.
	 *
	 * @param display the connection to the X server
	 * @param rid     the resource ID with which the data is associated
	 * @param context the context type to which the data belongs
	 * @param data    the data to be associated with the window and type
	 */
	public static int XSaveContext(long display, long rid, int context, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXSaveContext(display, rid, context, memAddress(data));
	}

	// --- [ XFindContext ] ---

	/** JNI method for {@link #XFindContext} */
	@JavadocExclude
	public static native int nXFindContext(long display, long rid, int context, long data_return);

	/**
	 * Returns the data associated with a resource ID and type.
	 *
	 * @param display     the connection to the X server
	 * @param rid         the resource ID with which the data is associated
	 * @param context     the context type to which the data belongs
	 * @param data_return returns the data
	 */
	public static int XFindContext(long display, long rid, int context, ByteBuffer data_return) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXFindContext(display, rid, context, memAddress(data_return));
	}

	/** Alternative version of: {@link #XFindContext} */
	public static int XFindContext(long display, long rid, int context, PointerBuffer data_return) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXFindContext(display, rid, context, memAddress(data_return));
	}

	// --- [ XDeleteContext ] ---

	/** JNI method for {@link #XDeleteContext} */
	@JavadocExclude
	public static native int nXDeleteContext(long display, long rid, int context);

	/**
	 * Deletes an entry for the specified resource ID and type.
	 *
	 * @param display the connection to the X server
	 * @param rid     the resource ID with which the data is associated
	 * @param context the context type to which the data belongs
	 */
	public static int XDeleteContext(long display, long rid, int context) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXDeleteContext(display, rid, context);
	}

}