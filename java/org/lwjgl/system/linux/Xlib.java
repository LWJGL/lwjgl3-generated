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
import static org.lwjgl.system.APIUtil.*;

/** Native bindings to Xlib.h. */
public final class Xlib {

	/** Boolean values */
	public static final int
		True  = 0x1,
		False = 0x0;

	/** Event queue modes. */
	public static final int
		QueuedAlready      = 0x0,
		QueuedAfterReading = 0x1,
		QueuedAfterFlush   = 0x2;

	static { LWJGLUtil.initialize(); }

	private Xlib() {}

	// --- [ XInitThreads ] ---

	/**
	 * Initializes Xlib support for concurrent threads. This function must be the first Xlib function a multi-threaded program calls, and it must complete
	 * before any other Xlib call is made. This function returns a nonzero status if initialization was successful; otherwise, it returns zero. On systems that
	 * do not support threads, this function always returns zero.
	 * 
	 * <p>It is only necessary to call this function if multiple threads might use Xlib concurrently. If all calls to Xlib functions are protected by some other
	 * access mechanism (for example, a mutual exclusion lock in a toolkit or through explicit client programming), Xlib thread initialization is not required.
	 * It is recommended that single-threaded programs not call this function.</p>
	 */
	public static native int XInitThreads();

	// --- [ XSetErrorHandler ] ---

	/** JNI method for {@link #XSetErrorHandler} */
	@JavadocExclude
	public static native long nXSetErrorHandler(long handler);

	/**
	 * Sets the error handler that will be invoked when a X11 protocol error occurs. If {@code handler} is {@code NULL}, the default error handler is used. The action
	 * of the default handlers is to print an explanatory message and exit.
	 * 
	 * <p>If the returned value is non-{@code NULL}, the new error handler must pass the error down to the previous error handler. Use {@link #XErrorHandler} to do that.</p>
	 *
	 * @param handler the program's supplied error handler.
	 *
	 * @return the previous error handler
	 */
	public static XErrorHandler XSetErrorHandler(XErrorHandler handler) {
		return XErrorHandler.create(nXSetErrorHandler(handler == null ? NULL : handler.getPointer()));
	}

	// --- [ XGetErrorText ] ---

	/** JNI method for {@link #XGetErrorText} */
	@JavadocExclude
	public static native int nXGetErrorText(long display, int code, long buffer_return, int length);

	/**
	 * Copies a null-terminated string describing the specified error code into the specified buffer. The returned text is in the encoding of the current
	 * locale. It is recommended that you use this function to obtain an error description because extensions to Xlib may define their own error codes and
	 * error strings.
	 *
	 * @param display       the connection to the X server
	 * @param code          the error code for which you want to obtain a description
	 * @param buffer_return returns the error description
	 * @param length        the size of the buffer
	 */
	public static int XGetErrorText(long display, int code, ByteBuffer buffer_return, int length) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(buffer_return, length);
		}
		return nXGetErrorText(display, code, memAddress(buffer_return), length);
	}

	/** Alternative version of: {@link #XGetErrorText} */
	public static int XGetErrorText(long display, int code, ByteBuffer buffer_return) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXGetErrorText(display, code, memAddress(buffer_return), buffer_return.remaining());
	}

	// --- [ XFree ] ---

	/** JNI method for {@link #XFree} */
	@JavadocExclude
	public static native int nXFree(long data);

	/**
	 * Free in-memory data that was created by an Xlib function.
	 *
	 * @param data the data that is to be freed
	 */
	public static int XFree(ByteBuffer data) {
		return nXFree(memAddress(data));
	}

	/** PointerBuffer version of: {@link #XFree} */
	public static int XFree(PointerBuffer data) {
		return nXFree(memAddress(data));
	}

	// --- [ XOpenDisplay ] ---

	/** JNI method for {@link #XOpenDisplay} */
	@JavadocExclude
	public static native long nXOpenDisplay(long display_name);

	/**
	 * Returns a Display structure that serves as the connection to the X server and that contains all the information about that X server. {@code XOpenDisplay}
	 * connects your application to the X server through TCP or DECnet communications protocols, or through some local inter-process communication protocol.
	 * If the hostname is a host machine name and a single colon (:) separates the hostname and display number, {@code XOpenDisplay} connects using TCP streams.
	 * If the hostname is not specified, Xlib uses whatever it believes is the fastest transport. If the hostname is a host machine name and a double colon
	 * (::) separates the hostname and display number, {@code XOpenDisplay} connects using DECnet. A single X server can support any or all of these transport
	 * mechanisms simultaneously. A particular Xlib implementation can support many more of these transport mechanisms.
	 *
	 * @param display_name the hardware display name, which determines the display and communications domain to be used. On a POSIX-conformant system, if the
	 *                     {@code display_name} is {@code NULL}, it defaults to the value of the DISPLAY environment variable.
	 */
	public static long XOpenDisplay(ByteBuffer display_name) {
		if ( LWJGLUtil.CHECKS )
			if ( display_name != null ) checkNT1(display_name);
		return nXOpenDisplay(memAddressSafe(display_name));
	}

	/** CharSequence version of: {@link #XOpenDisplay} */
	public static long XOpenDisplay(CharSequence display_name) {
		APIBuffer __buffer = apiBuffer();
		int display_nameEncoded = __buffer.stringParamASCII(display_name, true);
		return nXOpenDisplay(__buffer.addressSafe(display_name, display_nameEncoded));
	}

	// --- [ XCloseDisplay ] ---

	/** JNI method for {@link #XCloseDisplay} */
	@JavadocExclude
	public static native int nXCloseDisplay(long display);

	/**
	 * Closes the connection to the X server for the display specified in the Display structure and destroys all windows, resource IDs (Window, Font, Pixmap,
	 * Colormap, Cursor, and GContext), or other resources that the client has created on this display, unless the close-down mode of the resource has been
	 * changed (see {@link #XSetCloseDownMode}). Therefore, these windows, resource IDs, and other resources should never be referenced again or an error will
	 * be generated. Before exiting, you should call {@code XCloseDisplay} explicitly so that any pending errors are reported as {@code XCloseDisplay} performs
	 * a final {@code XSync} operation.
	 *
	 * @param display the connection to the X server
	 */
	public static int XCloseDisplay(long display) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXCloseDisplay(display);
	}

	// --- [ XInternAtom ] ---

	/** JNI method for {@link #XInternAtom} */
	@JavadocExclude
	public static native long nXInternAtom(long display, long atom_name, int only_if_exists);

	/**
	 * Returns the atom identifier associated with the specified {@code atom_name} string.
	 *
	 * @param display        the connection to the X server
	 * @param atom_name      the name associated with the atom you want returned
	 * @param only_if_exists a Boolean value that indicates whether the atom must be created
	 */
	public static long XInternAtom(long display, ByteBuffer atom_name, int only_if_exists) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkNT1(atom_name);
		}
		return nXInternAtom(display, memAddress(atom_name), only_if_exists);
	}

	/** CharSequence version of: {@link #XInternAtom} */
	public static long XInternAtom(long display, CharSequence atom_name, int only_if_exists) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		APIBuffer __buffer = apiBuffer();
		int atom_nameEncoded = __buffer.stringParamASCII(atom_name, true);
		return nXInternAtom(display, __buffer.address(atom_nameEncoded), only_if_exists);
	}

	// --- [ XDefaultScreen ] ---

	/** JNI method for {@link #XDefaultScreen} */
	@JavadocExclude
	public static native int nXDefaultScreen(long display);

	/**
	 * Returns a pointer to the default screen.
	 *
	 * @param display the connection to the X server
	 */
	public static int XDefaultScreen(long display) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXDefaultScreen(display);
	}

	// --- [ XDefaultDepth ] ---

	/** JNI method for {@link #XDefaultDepth} */
	@JavadocExclude
	public static native int nXDefaultDepth(long display, int screen_number);

	/**
	 * Returns the depth (number of planes) of the default root window for the specified screen.
	 *
	 * @param display       the connection to the X server
	 * @param screen_number the appropriate screen number on the host server
	 */
	public static int XDefaultDepth(long display, int screen_number) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXDefaultDepth(display, screen_number);
	}

	// --- [ XDisplayWidth ] ---

	/** JNI method for {@link #XDisplayWidth} */
	@JavadocExclude
	public static native int nXDisplayWidth(long display, int screen_number);

	/**
	 * Returns an integer that describes the width of the screen in pixels.
	 *
	 * @param display       the connection to the X server
	 * @param screen_number the appropriate screen number on the host server
	 */
	public static int XDisplayWidth(long display, int screen_number) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXDisplayWidth(display, screen_number);
	}

	// --- [ XDisplayHeight ] ---

	/** JNI method for {@link #XDisplayHeight} */
	@JavadocExclude
	public static native int nXDisplayHeight(long display, int screen_number);

	/**
	 * Returns an integer that describes the height of the screen in pixels.
	 *
	 * @param display       the connection to the X server
	 * @param screen_number the appropriate screen number on the host server
	 */
	public static int XDisplayHeight(long display, int screen_number) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXDisplayHeight(display, screen_number);
	}

	// --- [ XDisplayWidthMM ] ---

	/** JNI method for {@link #XDisplayWidthMM} */
	@JavadocExclude
	public static native int nXDisplayWidthMM(long display, int screen_number);

	/**
	 * Returns an integer that describes the width of the screen in millimeters.
	 *
	 * @param display       the connection to the X server
	 * @param screen_number the appropriate screen number on the host server
	 */
	public static int XDisplayWidthMM(long display, int screen_number) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXDisplayWidthMM(display, screen_number);
	}

	// --- [ XDisplayHeightMM ] ---

	/** JNI method for {@link #XDisplayHeightMM} */
	@JavadocExclude
	public static native int nXDisplayHeightMM(long display, int screen_number);

	/**
	 * Returns an integer that describes the height of the screen in millimeters.
	 *
	 * @param display       the connection to the X server
	 * @param screen_number the appropriate screen number on the host server
	 */
	public static int XDisplayHeightMM(long display, int screen_number) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXDisplayHeightMM(display, screen_number);
	}

	// --- [ XSync ] ---

	/** JNI method for {@link #XSync} */
	@JavadocExclude
	public static native int nXSync(long display, int discard);

	/**
	 * Flushes the output buffer and then waits until all requests have been received and processed by the X server. Any errors generated must be handled by
	 * the error handler. For each protocol error received by Xlib, {@code XSync()} calls the client application's error handling routine. Any events generated
	 * by the server are enqueued into the library's event queue.
	 * 
	 * <p>Finally, if you passed {@link X#GrabSuccess}, {@code XSync()} does not discard the events in the queue. If you passed {@link X#GrabSuccess}, {@code XSync()} discards
	 * all events in the queue, including those events that were on the queue before {@code XSync()} was called. Client applications seldom need to call
	 * {@code XSync()}.</p>
	 *
	 * @param display the connection to the X server
	 * @param discard whether to discard events in the queue
	 */
	public static int XSync(long display, int discard) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXSync(display, discard);
	}

	// --- [ XRootWindow ] ---

	/** JNI method for {@link #XRootWindow} */
	@JavadocExclude
	public static native long nXRootWindow(long display, int screen_number);

	/**
	 * Returns the root window of the specified screen.
	 *
	 * @param display       the connection to the X server
	 * @param screen_number the appropriate screen number on the host server
	 */
	public static long XRootWindow(long display, int screen_number) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXRootWindow(display, screen_number);
	}

	// --- [ XQueryExtension ] ---

	/** JNI method for {@link #XQueryExtension} */
	@JavadocExclude
	public static native int nXQueryExtension(long display, long name, long major_opcode_return, long first_event_return, long first_error_return);

	/**
	 * Determines if the named extension is present. If the extension is not present, {@code XQueryExtension()} returns {@link #False}; otherwise, it returns
	 * {@link #True}. If the extension is present, {@code XQueryExtension()} returns the major opcode for the extension to {@code major_opcode_return};
	 * otherwise, it returns zero. Any minor opcode and the request formats are specific to the extension. If the extension involves additional event types,
	 * {@code XQueryExtension()} returns the base event type code to {@code first_event_return}; otherwise, it returns zero. The format of the events is
	 * specific to the extension. If the extension involves additional error codes, {@code XQueryExtension()} returns the base error code to
	 * {@code first_error_return}; otherwise, it returns zero. The format of additional data in the errors is specific to the extension.
	 *
	 * @param display             the connection to the X server
	 * @param name                the extension name
	 * @param major_opcode_return returns the major opcode
	 * @param first_event_return  returns the first event code, if any
	 * @param first_error_return  returns the first error code, if any
	 */
	public static int XQueryExtension(long display, ByteBuffer name, ByteBuffer major_opcode_return, ByteBuffer first_event_return, ByteBuffer first_error_return) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkNT1(name);
		}
		return nXQueryExtension(display, memAddress(name), memAddress(major_opcode_return), memAddress(first_event_return), memAddress(first_error_return));
	}

	/** Alternative version of: {@link #XQueryExtension} */
	public static int XQueryExtension(long display, ByteBuffer name, IntBuffer major_opcode_return, IntBuffer first_event_return, IntBuffer first_error_return) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXQueryExtension(display, memAddress(name), memAddress(major_opcode_return), memAddress(first_event_return), memAddress(first_error_return));
	}

	/** CharSequence version of: {@link #XQueryExtension} */
	public static int XQueryExtension(long display, CharSequence name, IntBuffer major_opcode_return, IntBuffer first_event_return, IntBuffer first_error_return) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nXQueryExtension(display, __buffer.address(nameEncoded), memAddress(major_opcode_return), memAddress(first_event_return), memAddress(first_error_return));
	}

	// --- [ XFlush ] ---

	/** JNI method for {@link #XFlush} */
	@JavadocExclude
	public static native int nXFlush(long display);

	/**
	 * Flushes the output buffer. Most client applications need not use this function because the output buffer is automatically flushed as needed by calls to
	 * {@link #XPending}, {@link #XNextEvent}, and {@link #XWindowEvent}. Events generated by the server may be enqueued into the library's event queue.
	 *
	 * @param display the connection to the X server
	 */
	public static int XFlush(long display) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXFlush(display);
	}

	// --- [ XPending ] ---

	/** JNI method for {@link #XPending} */
	@JavadocExclude
	public static native int nXPending(long display);

	/**
	 * Returns the number of events that have been received from the X server but have not been removed from the event queue. {@code XPending()} is identical
	 * to {@link #XEventsQueued} with the mode {@code QueuedAfterFlush} specified.
	 *
	 * @param display the connection to the X server
	 */
	public static int XPending(long display) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXPending(display);
	}

	// --- [ XNextEvent ] ---

	/** JNI method for {@link #XNextEvent} */
	@JavadocExclude
	public static native int nXNextEvent(long display, long event_return);

	/**
	 * Copies the first event from the event queue into the specified {@link XEvent} structure and then removes it from the queue. If the event queue is empty,
	 * {@code XNextEvent()} flushes the output buffer and blocks until an event is received.
	 *
	 * @param display      the connection to the X server
	 * @param event_return a pointer to a {@link XEvent} structure that will receive the next event in the queue
	 */
	public static int XNextEvent(long display, ByteBuffer event_return) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(event_return, XEvent.SIZEOF);
		}
		return nXNextEvent(display, memAddress(event_return));
	}

	// --- [ XCreateColormap ] ---

	/** JNI method for {@link #XCreateColormap} */
	@JavadocExclude
	public static native long nXCreateColormap(long display, long w, long visual, int alloc);

	/**
	 * Creates a colormap of the specified visual type for the screen on which the specified window resides and returns the colormap ID associated with it.
	 * Note that the specified window is only used to determine the screen.
	 *
	 * @param display the connection to the X server
	 * @param w       the window
	 * @param visual  a visual type supported on the screen. If the visual type is not one supported by the screen, a {@code BadMatch} error results.
	 * @param alloc   the colormap entries to be allocated. You can pass AllocNone or AllocAll.
	 */
	public static long XCreateColormap(long display, long w, ByteBuffer visual, int alloc) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(visual, Visual.SIZEOF);
		}
		return nXCreateColormap(display, w, memAddress(visual), alloc);
	}

	// --- [ XFreeColormap ] ---

	/** JNI method for {@link #XFreeColormap} */
	@JavadocExclude
	public static native int nXFreeColormap(long display, long colormap);

	/**
	 * Deletes the association between the {@code colormap} resource ID and the {@code colormap} and frees the {@code colormap} storage. However, this function
	 * has no effect on the default colormap for a screen. If the specified {@code colormap} is an installed map for a screen, it is uninstalled. If the
	 * specified {@code colormap} is defined as the {@code colormap} for a window, {@code XFreeColormap()} changes the colormap associated with the window to
	 * {@link X#GrabSuccess} and generates a {@code ColormapNotify} event. X does not define the colors displayed for a window with a colormap of {@link X#GrabSuccess}.
	 *
	 * @param display  the connection to the X server
	 * @param colormap the colormap to destroy
	 */
	public static int XFreeColormap(long display, long colormap) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXFreeColormap(display, colormap);
	}

	// --- [ XScreenOfDisplay ] ---

	/** JNI method for {@link #XScreenOfDisplay} */
	@JavadocExclude
	public static native long nXScreenOfDisplay(long display, int screen_number);

	/**
	 * Return a pointer to the indicated screen.
	 *
	 * @param display       the connection to the X server
	 * @param screen_number the appropriate screen number on the host server
	 */
	public static long XScreenOfDisplay(long display, int screen_number) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXScreenOfDisplay(display, screen_number);
	}

	// --- [ XBlackPixel ] ---

	/** JNI method for {@link #XBlackPixel} */
	@JavadocExclude
	public static native long nXBlackPixel(long display, int screen_number);

	/**
	 * Return the black pixel value for the specified screen.
	 *
	 * @param display       the connection to the X server
	 * @param screen_number the appropriate screen number on the host server
	 */
	public static long XBlackPixel(long display, int screen_number) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXBlackPixel(display, screen_number);
	}

	// --- [ XConnectionNumber ] ---

	/** JNI method for {@link #XConnectionNumber} */
	@JavadocExclude
	public static native int nXConnectionNumber(long display);

	/**
	 * Returns a connection number for the specified display. On a POSIX-conformant system, this is the file descriptor of the connection.
	 *
	 * @param display the connection to the X server
	 */
	public static int XConnectionNumber(long display) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXConnectionNumber(display);
	}

	// --- [ XCreateWindow ] ---

	/** JNI method for {@link #XCreateWindow} */
	@JavadocExclude
	public static native long nXCreateWindow(long display, long parent, int x, int y, int width, int height, int border_width, int depth, int windowClass, long visual, long valuemask, long attributes);

	/**
	 * Creates an unmapped subwindow for a specified parent window, returns the window ID of the created window, and causes the X server to generate a
	 * {@code CreateNotify }event. The created window is placed on top in the stacking order with respect to siblings.
	 * 
	 * <p>The coordinate system has the X axis horizontal and the Y axis vertical with the origin [0, 0] at the upper-left corner. Coordinates are integral, in
	 * terms of pixels, and coincide with pixel centers. Each window and pixmap has its own coordinate system. For a window, the origin is inside the border at
	 * the inside, upper-left corner.</p>
	 * 
	 * <p>The x and y coordinates are the top-left outside corner of the window's borders and are relative to the inside of the parent window's borders.</p>
	 * 
	 * <p>The width and height are the created window's inside dimensions and do not include the created window's borders.</p>
	 *
	 * @param display      the connection to the X server
	 * @param parent       the parent window
	 * @param x            the window x-coordinate
	 * @param y            the window y-coordinate
	 * @param width        the window width
	 * @param height       the window height
	 * @param border_width the border width
	 * @param depth        the window's depth. A depth of {@link X#GrabSuccess} means the depth is taken from the parent.
	 * @param windowClass  the created window's class. One of:<br>{@link X#InputOutput}, {@link X#InputOnly}, {@link X#CopyFromParent}
	 * @param visual       the visual type. A visual of {@link X#GrabSuccess} means the visual type is taken from the parent.
	 * @param valuemask    which window attributes are defined in the attributes argument. This mask is the bitwise inclusive OR of the valid attribute mask bits. If
	 *                     {@code valuemask} is zero, the attributes are ignored and are not referenced.
	 * @param attributes   the structure from which the values (as specified by the value mask) are to be taken
	 */
	public static long XCreateWindow(long display, long parent, int x, int y, int width, int height, int border_width, int depth, int windowClass, ByteBuffer visual, long valuemask, ByteBuffer attributes) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(visual, Visual.SIZEOF);
			checkBuffer(attributes, XSetWindowAttributes.SIZEOF);
		}
		return nXCreateWindow(display, parent, x, y, width, height, border_width, depth, windowClass, memAddress(visual), valuemask, memAddress(attributes));
	}

	// --- [ XChangeWindowAttributes ] ---

	/** JNI method for {@link #XChangeWindowAttributes} */
	@JavadocExclude
	public static native int nXChangeWindowAttributes(long display, long w, long valuemask, long attributes);

	/**
	 * Depending on the {@code valuemask}, uses the window attributes in the {@link #XSetWindowAttributes} structure to change the specified window attributes.
	 *
	 * @param display    the connection to the X server
	 * @param w          the window
	 * @param valuemask  specifies which window attributes are defined in the attributes argument. This mask is the bitwise inclusive OR of the valid attribute mask bits. If
	 *                   valuemask is zero, the attributes are ignored and are not referenced. The values and restrictions are the same as for {@link #XCreateWindow}.
	 * @param attributes the {@link #XSetWindowAttributes} structure from which the values (as specified by the value mask) are to be taken.
	 */
	public static int XChangeWindowAttributes(long display, long w, long valuemask, ByteBuffer attributes) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(attributes, XSetWindowAttributes.SIZEOF);
		}
		return nXChangeWindowAttributes(display, w, valuemask, memAddress(attributes));
	}

	// --- [ XSetWMProtocols ] ---

	/** JNI method for {@link #XSetWMProtocols} */
	@JavadocExclude
	public static native int nXSetWMProtocols(long display, long w, long protocols, int count);

	/**
	 * Replaces the {@code WM_PROTOCOLS} property on the specified window with the list of atoms specified by the protocols argument.
	 *
	 * @param display   the connection to the X server
	 * @param w         the window
	 * @param protocols the list of protocols
	 * @param count     the number of protocols in the list
	 */
	public static int XSetWMProtocols(long display, long w, ByteBuffer protocols, int count) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(protocols, count << POINTER_SHIFT);
		}
		return nXSetWMProtocols(display, w, memAddress(protocols), count);
	}

	/** Alternative version of: {@link #XSetWMProtocols} */
	public static int XSetWMProtocols(long display, long w, PointerBuffer protocols) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXSetWMProtocols(display, w, memAddress(protocols), protocols.remaining());
	}

	// --- [ XSetWMHints ] ---

	/** JNI method for {@link #XSetWMHints} */
	@JavadocExclude
	public static native int nXSetWMHints(long display, long w, long hints);

	/**
	 * Sets the window manager hints that include icon information and location, the initial state of the window, and whether the application relies on the
	 * window manager to get keyboard input.
	 *
	 * @param display the connection to the X server
	 * @param w       the window
	 * @param hints   the {@link XWMHints} structure to be used
	 */
	public static int XSetWMHints(long display, long w, ByteBuffer hints) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(hints, XWMHints.SIZEOF);
		}
		return nXSetWMHints(display, w, memAddress(hints));
	}

	// --- [ XSetSizeHints ] ---

	/** JNI method for {@link #XSetSizeHints} */
	@JavadocExclude
	public static native int nXSetSizeHints(long display, long w, long hints, long property);

	/**
	 * Sets the {@link XSizeHints} structure for the named property and the specified window.
	 *
	 * @param display  the connection to the X server
	 * @param w        the window
	 * @param hints    the {@link XSizeHints} structure to be used
	 * @param property the property name
	 */
	public static int XSetSizeHints(long display, long w, ByteBuffer hints, long property) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(hints, XSizeHints.SIZEOF);
		}
		return nXSetSizeHints(display, w, memAddress(hints), property);
	}

	// --- [ XSetWMNormalHints ] ---

	/** JNI method for {@link #XSetWMNormalHints} */
	@JavadocExclude
	public static native void nXSetWMNormalHints(long display, long w, long hints);

	/**
	 * Replaces the size hints for the {@code WM_NORMAL_HINTS} property on the specified window. If the property does not already exist,
	 * {@code XSetWMNormalHints()} sets the size hints for the {@code WM_NORMAL_HINTS} property on the specified window. The property is stored with a type of
	 * {@code WM_SIZE_HINTS} and a format of 32.
	 *
	 * @param display the connection to the X server
	 * @param w       the window
	 * @param hints   the {@link XSizeHints} for the window in its normal state
	 */
	public static void XSetWMNormalHints(long display, long w, ByteBuffer hints) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(hints, XSizeHints.SIZEOF);
		}
		nXSetWMNormalHints(display, w, memAddress(hints));
	}

	// --- [ XGrabPointer ] ---

	/** JNI method for {@link #XGrabPointer} */
	@JavadocExclude
	public static native int nXGrabPointer(long display, long grab_window, int owner_events, int event_mask, int pointer_mode, int keyboard_mode, long confine_to, long cursor, long time);

	/**
	 * Actively grabs control of the pointer and returns {@link X#GrabSuccess} if the grab was successful. Further pointer events are reported only to the
	 * grabbing client. {@code XGrabPointer} overrides any active pointer grab by this client. If {@code owner_events} is {@link #False}, all generated pointer
	 * events are reported with respect to {@code grab_window} and are reported only if selected by {@code event_mask}. If owner_events is True and if a generated pointer event would normally be
	 * reported to this client, it is reported as usual. Otherwise, the event is reported with respect to the grab_window and is reported only if selected by event_mask. For either value of owner_events, unreported events are discarded.
	 *
	 * @param display       the connection to the X server
	 * @param grab_window   the grab window
	 * @param owner_events  a Boolean value that indicates whether the pointer events are to be reported as usual or reported with respect to the grab window if selected by the
	 *                      event mask
	 * @param event_mask    which pointer events are reported to the client. The mask is the bitwise inclusive OR of the valid pointer event mask bits.
	 * @param pointer_mode  further processing of pointer events. One of:<br>{@link X#GrabModeSync}, {@link X#GrabModeAsync}
	 * @param keyboard_mode further processing of keyboard events. One of:<br>{@link X#GrabModeSync}, {@link X#GrabModeAsync}
	 * @param confine_to    the window to confine the pointer in or {@link X#None}
	 * @param cursor        the cursor that is to be displayed during the grab or {@link X#None}
	 * @param time          the time. You can pass either a timestamp or {@link X#CurrentTime}
	 */
	public static int XGrabPointer(long display, long grab_window, int owner_events, int event_mask, int pointer_mode, int keyboard_mode, long confine_to, long cursor, long time) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXGrabPointer(display, grab_window, owner_events, event_mask, pointer_mode, keyboard_mode, confine_to, cursor, time);
	}

	// --- [ XUngrabPointer ] ---

	/** JNI method for {@link #XUngrabPointer} */
	@JavadocExclude
	public static native int nXUngrabPointer(long display, long time);

	/**
	 * Releases the pointer and any queued events if this client has actively grabbed the pointer from {@link #XGrabPointer}, {@link #XGrabButton}, or from
	 * a normal button press. {@code XUngrabPointer} does not release the pointer if the specified time is earlier than the last-pointer-grab time or is later
	 * than the current X server time. It also generates {@code EnterNotify} and {@code LeaveNotify} events. The X server performs an {@code UngrabPointer}
	 * request automatically if the event window or {@code confine_to} window for an active pointer grab becomes not viewable or if window reconfiguration
	 * causes the {@code confine_to} window to lie completely outside the boundaries of the root window.
	 *
	 * @param display the connection to the X server
	 * @param time    specifies the time. You can pass either a timestamp or {@link X#CurrentTime}.
	 */
	public static int XUngrabPointer(long display, long time) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXUngrabPointer(display, time);
	}

	// --- [ XDefineCursor ] ---

	/** JNI method for {@link #XDefineCursor} */
	@JavadocExclude
	public static native int nXDefineCursor(long display, long w, long cursor);

	/**
	 * If a cursor is set, it will be used when the pointer is in the window. If the cursor is {@link X#None}, it is equivalent to {@link #XUndefineCursor}.
	 *
	 * @param display the connection to the X server
	 * @param w       the window
	 * @param cursor  the cursor that is to be displayed or {@link X#None}
	 */
	public static int XDefineCursor(long display, long w, long cursor) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXDefineCursor(display, w, cursor);
	}

	// --- [ XUndefineCursor ] ---

	/** JNI method for {@link #XUndefineCursor} */
	@JavadocExclude
	public static native int nXUndefineCursor(long display, long w);

	/**
	 * Undoes the effect of a previous {@link #XDefineCursor} for this window. When the pointer is in the window, the parent's cursor will now be used. On the
	 * root window, the default cursor is restored.
	 *
	 * @param display the connection to the X server
	 * @param w       the window
	 */
	public static int XUndefineCursor(long display, long w) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXUndefineCursor(display, w);
	}

	// --- [ XFreeCursor ] ---

	/** JNI method for {@link #XFreeCursor} */
	@JavadocExclude
	public static native int nXFreeCursor(long display, long cursor);

	/**
	 * Deletes the association between the cursor resource ID and the specified cursor. The cursor storage is freed when no other resource references it. The
	 * specified cursor ID should not be referred to again.
	 *
	 * @param display the connection to the X server
	 * @param cursor  the cursor to free
	 */
	public static int XFreeCursor(long display, long cursor) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXFreeCursor(display, cursor);
	}

	// --- [ XGetScreenSaver ] ---

	/** JNI method for {@link #XGetScreenSaver} */
	@JavadocExclude
	public static native int nXGetScreenSaver(long display, long timeout_return, long interval_return, long prefer_blanking_return, long allow_exposures_return);

	/**
	 * Gets the current screen saver values.
	 *
	 * @param display                the connection to the X server
	 * @param timeout_return         the timeout, in seconds, until the screen saver turns on
	 * @param interval_return        the interval between screen saver invocations
	 * @param prefer_blanking_return the current screen blanking preference
	 * @param allow_exposures_return the current screen save control value
	 */
	public static int XGetScreenSaver(long display, ByteBuffer timeout_return, ByteBuffer interval_return, ByteBuffer prefer_blanking_return, ByteBuffer allow_exposures_return) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(timeout_return, 1 << 2);
			checkBuffer(interval_return, 1 << 2);
			checkBuffer(prefer_blanking_return, 1 << 2);
			checkBuffer(allow_exposures_return, 1 << 2);
		}
		return nXGetScreenSaver(display, memAddress(timeout_return), memAddress(interval_return), memAddress(prefer_blanking_return), memAddress(allow_exposures_return));
	}

	/** Alternative version of: {@link #XGetScreenSaver} */
	public static int XGetScreenSaver(long display, IntBuffer timeout_return, IntBuffer interval_return, IntBuffer prefer_blanking_return, IntBuffer allow_exposures_return) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(timeout_return, 1);
			checkBuffer(interval_return, 1);
			checkBuffer(prefer_blanking_return, 1);
			checkBuffer(allow_exposures_return, 1);
		}
		return nXGetScreenSaver(display, memAddress(timeout_return), memAddress(interval_return), memAddress(prefer_blanking_return), memAddress(allow_exposures_return));
	}

	// --- [ XSetScreenSaver ] ---

	/** JNI method for {@link #XSetScreenSaver} */
	@JavadocExclude
	public static native int nXSetScreenSaver(long display, int timeout_return, int interval_return, int prefer_blanking_return, int allow_exposures_return);

	/**
	 * Sets the current screen saver values.
	 *
	 * @param display                the connection to the X server
	 * @param timeout_return         the timeout, in seconds, until the screen saver turns on
	 * @param interval_return        the interval between screen saver invocations
	 * @param prefer_blanking_return the current screen blanking preference
	 * @param allow_exposures_return the current screen save control value
	 */
	public static int XSetScreenSaver(long display, int timeout_return, int interval_return, int prefer_blanking_return, int allow_exposures_return) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXSetScreenSaver(display, timeout_return, interval_return, prefer_blanking_return, allow_exposures_return);
	}

	// --- [ XSendEvent ] ---

	/** JNI method for {@link #XSendEvent} */
	@JavadocExclude
	public static native int nXSendEvent(long display, long w, int propagate, long event_mask, long event_send);

	/**
	 * Identifies the destination window, determines which clients should receive the specified events, and ignores any active grabs. This function requires
	 * you to pass an event mask. This function uses the {@code w} argument to identify the destination window as follows:
	 * <ul>
	 * <li>If {@code w} is {@link X#PointerWindow}, the destination window is the window that contains the pointer.</li>
	 * <li>If {@code w} is {@link X#InputFocus} and if the focus window contains the pointer, the destination window is the window that contains the pointer;
	 * otherwise, the destination window is the focus window.</li>
	 * </ul>
	 * 
	 * <p>To determine which clients should receive the specified events, XSendEvent() uses the propagate argument as follows:
	 * <ul>
	 * <li>If {@code }event_mask is the empty set, the event is sent to the client that created the destination window. If that client no longer exists, no
	 * event is sent.</li>
	 * <li>If propagate is {@link #False}, the event is sent to every client selecting on destination any of the event types in the {@code event_mask} argument.</li>
	 * <li>If propagate is {@link #True} and no clients have selected on destination any of the event types in event-mask, the destination is replaced with the
	 * closest ancestor of destination for which some client has selected a type in event-mask and for which no intervening window has that type in its
	 * do-not-propagate-mask. If no such window exists or if the window is an ancestor of the focus window and {@link X#InputFocus} was originally
	 * specified as the destination, the event is not sent to any clients. Otherwise, the event is reported to every client selecting on the final
	 * destination any of the types specified in {@code event_mask}.</li>
	 * </ul></p>
	 * 
	 * <p>The event in the XEvent structure must be one of the core events or one of the events defined by an extension (or a BadValue error results) so that the X server can correctly byte-swap the contents as necessary. The contents of the event are otherwise unaltered and unchecked by the X server except to force send_event to True in the forwarded event and to set the serial number in the event correctly; therefore these fields and the display field are ignored by XSendEvent().</p>
	 *
	 * @param display    the connection to the X server
	 * @param w          the window the event is to be sent to, or {@link X#PointerWindow}, or {@link X#InputFocus}
	 * @param propagate  a Boolean value
	 * @param event_mask the event mask
	 * @param event_send the event that is to be sent
	 */
	public static int XSendEvent(long display, long w, int propagate, long event_mask, ByteBuffer event_send) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(event_send, XEvent.SIZEOF);
		}
		return nXSendEvent(display, w, propagate, event_mask, memAddress(event_send));
	}

	// --- [ XRaiseWindow ] ---

	/** JNI method for {@link #XRaiseWindow} */
	@JavadocExclude
	public static native int nXRaiseWindow(long display, long w);

	/**
	 * Raises the specified window to the top of the stack so that no sibling window obscures it. If the windows are regarded as overlapping sheets of paper
	 * stacked on a desk, then raising a window is analogous to moving the sheet to the top of the stack but leaving its x and y location on the desk constant.
	 * Raising a mapped window may generate Expose events for the window and any mapped subwindows that were formerly obscured.
	 *
	 * @param display the connection to the X server
	 * @param w       the window
	 */
	public static int XRaiseWindow(long display, long w) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXRaiseWindow(display, w);
	}

	// --- [ XSetInputFocus ] ---

	/** JNI method for {@link #XSetInputFocus} */
	@JavadocExclude
	public static native int nXSetInputFocus(long display, long focus, int revert_to, long time);

	/**
	 * Changes the input focus and the last-focus-change time. It has no effect if the specified time is earlier than the current last-focus-change time or is
	 * later than the current X server time. Otherwise, the last-focus-change time is set to the specified time ({@link X#CurrentTime} is replaced by the
	 * current X server time). {@code XSetInputFocus} causes the X server to generate {@code FocusIn} and {@code FocusOut} events.
	 * 
	 * <p>Depending on the focus argument, the following occurs:
	 * <ul>
	 * <li>If focus is {@link X#None}, all keyboard events are discarded until a new focus window is set, and the {@code revert_to} argument is ignored.</li>
	 * <li>If focus is a window, it becomes the keyboard's focus window. If a generated keyboard event would normally be reported to this window or one of its
	 * inferiors, the event is reported as usual. Otherwise, the event is reported relative to the focus window.</li>
	 * <li>If focus is {@link X#PointerRoot}, the focus window is dynamically taken to be the root window of whatever screen the pointer is on at each keyboard
	 * event. In this case, the {@code revert_to} argument is ignored. The specified focus window must be viewable at the time {@code XSetInputFocus} is
	 * called, or a {@link X#BadMatch} error results. If the focus window later becomes not viewable, the X server evaluates the revert_to argument to
	 * determine the new focus window as follows:</li>
	 * <li>If {@code revert_to} is {@link X#RevertToParent}, the focus reverts to the parent (or the closest viewable ancestor), and the new {@code revert_to}
	 * value is taken to be {@link X#RevertToNone}.</li>
	 * <li>If {@code revert_to} is {@link X#RevertToPointerRoot} or {@link X#RevertToNone}, the focus reverts to {@link X#PointerRoot} or {@link X#None},
	 * respectively. When the focus reverts, the X server generates {@code FocusIn} and {@code FocusOut} events, but the last-focus-change time is not
	 * affected.</li>
	 * </ul></p>
	 *
	 * @param display   the connection to the X server
	 * @param focus     the window, {@link X#PointerRoot} or {@link X#None}
	 * @param revert_to where the input focus reverts to if the window becomes not viewable. One of:<br>{@link X#RevertToParent}, {@link X#RevertToPointerRoot}, {@link X#RevertToNone}
	 * @param time      the time. You can pass either a timestamp or {@link X#CurrentTime}.
	 */
	public static int XSetInputFocus(long display, long focus, int revert_to, long time) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXSetInputFocus(display, focus, revert_to, time);
	}

	// --- [ XGetInputFocus ] ---

	/** JNI method for {@link #XGetInputFocus} */
	@JavadocExclude
	public static native int nXGetInputFocus(long display, long focus_return, long revert_to_return);

	/**
	 * Returns the focus window and the current focus state.
	 *
	 * @param display          the connection to the X server
	 * @param focus_return     returns the focus window, {@link X#PointerRoot} or {@link X#None}
	 * @param revert_to_return returns the current focus state
	 */
	public static int XGetInputFocus(long display, ByteBuffer focus_return, ByteBuffer revert_to_return) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXGetInputFocus(display, memAddress(focus_return), memAddress(revert_to_return));
	}

	/** Alternative version of: {@link #XGetInputFocus} */
	public static int XGetInputFocus(long display, PointerBuffer focus_return, IntBuffer revert_to_return) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXGetInputFocus(display, memAddress(focus_return), memAddress(revert_to_return));
	}

	// --- [ XMoveWindow ] ---

	/** JNI method for {@link #XMoveWindow} */
	@JavadocExclude
	public static native int nXMoveWindow(long display, long w, int x, int y);

	/**
	 * Moves the specified window to the specified {@code x} and {@code y} coordinates, but it does not change the window's size, raise the window, or change
	 * the mapping state of the window. Moving a mapped window may or may not lose the window's contents depending on if the window is obscured by nonchildren
	 * and if no backing store exists. If the contents of the window are lost, the X server generates Expose events. Moving a mapped window generates
	 * {@code Expose} events on any formerly obscured windows.
	 * 
	 * <p>The {@code x} and {@code y} coordinates define the new location of the top-left pixel of the window's border or the window itself if it has no border.</p>
	 *
	 * @param display the connection to the X server
	 * @param w       the window
	 * @param x       the window x-coordinate
	 * @param y       the window y-coordinate
	 */
	public static int XMoveWindow(long display, long w, int x, int y) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXMoveWindow(display, w, x, y);
	}

	// --- [ XResizeWindow ] ---

	/** JNI method for {@link #XResizeWindow} */
	@JavadocExclude
	public static native int nXResizeWindow(long display, long w, int width, int height);

	/**
	 * Changes the inside dimensions of the specified window, not including its borders. This function does not change the window's upper-left coordinate or
	 * the origin and does not restack the window. Changing the size of a mapped window may lose its contents and generate Expose events. If a mapped window is
	 * made smaller, changing its size generates {@code Expose} events on windows that the mapped window formerly obscured.
	 *
	 * @param display the connection to the X server
	 * @param w       the window
	 * @param width   the window width
	 * @param height  the window height
	 */
	public static int XResizeWindow(long display, long w, int width, int height) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXResizeWindow(display, w, width, height);
	}

	// --- [ XGetEventData ] ---

	/** JNI method for {@link #XGetEventData} */
	@JavadocExclude
	public static native int nXGetEventData(long display, long cookie);

	/**
	 * Retrieves extra data from the specified cookie.
	 *
	 * @param display the connection to the X server
	 * @param cookie  a pointer to a {@link XGenericEventCookie} structure.
	 */
	public static int XGetEventData(long display, ByteBuffer cookie) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(cookie, XGenericEventCookie.SIZEOF);
		}
		return nXGetEventData(display, memAddress(cookie));
	}

	// --- [ XFreeEventData ] ---

	/** JNI method for {@link #XFreeEventData} */
	@JavadocExclude
	public static native void nXFreeEventData(long display, long cookie);

	/**
	 * Frees the data associated with a cookie.
	 *
	 * @param display the connection to the X server
	 * @param cookie  a pointer to a {@link XGenericEventCookie} structure.
	 */
	public static void XFreeEventData(long display, ByteBuffer cookie) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(cookie, XGenericEventCookie.SIZEOF);
		}
		nXFreeEventData(display, memAddress(cookie));
	}

	// --- [ XGetWindowProperty ] ---

	/** JNI method for {@link #XGetWindowProperty} */
	@JavadocExclude
	public static native int nXGetWindowProperty(long display, long w, long property, long long_offset, long long_length, int delete, long req_type, long actual_type_return, long actual_format_return, long nitems_return, long bytes_after_return, long prop_return);

	/**
	 * Retrieves a window property.
	 *
	 * @param display              the connection to the X server
	 * @param w                    the window
	 * @param property             the property name
	 * @param long_offset          the offset in the specified property (in 32-bit quantities) where the data is to be retrieved
	 * @param long_length          the length in 32-bit multiples of the data to be retrieved
	 * @param delete               a Boolean value that determines whether the property is deleted
	 * @param req_type             the atom identifier associated with the property type or {@link X#AnyPropertyType}.
	 * @param actual_type_return   the atom identifier that defines the actual type of the property
	 * @param actual_format_return the actual format of the property
	 * @param nitems_return        the actual number of 8-bit, 16-bit, or 32-bit items stored in the {@code prop_return} data
	 * @param bytes_after_return   the number of bytes remaining to be read in the property if a partial read was performed
	 * @param prop_return          the data in the specified format
	 */
	public static int XGetWindowProperty(long display, long w, long property, long long_offset, long long_length, int delete, long req_type, ByteBuffer actual_type_return, ByteBuffer actual_format_return, ByteBuffer nitems_return, ByteBuffer bytes_after_return, ByteBuffer prop_return) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXGetWindowProperty(display, w, property, long_offset, long_length, delete, req_type, memAddress(actual_type_return), memAddress(actual_format_return), memAddress(nitems_return), memAddress(bytes_after_return), memAddress(prop_return));
	}

	/** Alternative version of: {@link #XGetWindowProperty} */
	public static int XGetWindowProperty(long display, long w, long property, long long_offset, long long_length, int delete, long req_type, PointerBuffer actual_type_return, IntBuffer actual_format_return, PointerBuffer nitems_return, PointerBuffer bytes_after_return, PointerBuffer prop_return) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXGetWindowProperty(display, w, property, long_offset, long_length, delete, req_type, memAddress(actual_type_return), memAddress(actual_format_return), memAddress(nitems_return), memAddress(bytes_after_return), memAddress(prop_return));
	}

	// --- [ XDeleteProperty ] ---

	/** JNI method for {@link #XDeleteProperty} */
	@JavadocExclude
	public static native int nXDeleteProperty(long display, long w, long property);

	/**
	 * Deletes the specified property only if the property was defined on the specified window and causes the X server to generate a {@code PropertyNotify}
	 * event on the window unless the property does not exist.
	 *
	 * @param display  the connection to the X server
	 * @param w        the window
	 * @param property the property atom
	 */
	public static int XDeleteProperty(long display, long w, long property) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXDeleteProperty(display, w, property);
	}

	// --- [ XQueryPointer ] ---

	/** JNI method for {@link #XQueryPointer} */
	@JavadocExclude
	public static native int nXQueryPointer(long display, long w, long root_return, long child_return, long root_x_return, long root_y_return, long win_x_return, long win_y_return, long mask_return);

	/**
	 * Returns the root window the pointer is logically on and the pointer coordinates relative to the root window's origin. If {@code XQueryPointer} returns
	 * {@link #False}, the pointer is not on the same screen as the specified window, and {@code XQueryPointer} returns {@link X#None} to {@code child_return}
	 * and zero to {@code win_x_return} and {@code win_y_return}. If {@code XQueryPointer} returns {@link #True}, the pointer coordinates returned to
	 * {@code win_x_return} and {@code win_y_return} are relative to the origin of the specified window. In this case, {@code XQueryPointer} returns the child
	 * that contains the pointer, if any, or else {@link X#None} to {@code child_return}.
	 * 
	 * <p>Returns the current logical state of the keyboard buttons and the modifier keys in {@code mask_return}. It sets {@code mask_return} to the bitwise
	 * inclusive OR of one or more of the button or modifier key bitmasks to match the current state of the mouse buttons and the modifier keys.</p>
	 *
	 * @param display       the connection to the X server
	 * @param w             the window
	 * @param root_return   the root window that the pointer is in
	 * @param child_return  the child window that the pointer is located in, if any
	 * @param root_x_return the pointer x-coordinate relative to the root window's origin
	 * @param root_y_return the pointer y-coordinate relative to the root window's origin
	 * @param win_x_return  the pointer x-coordinate relative to the specified window
	 * @param win_y_return  the pointer y-coordinate relative to the specified window
	 * @param mask_return   the current state of the modifier keys and pointer buttons
	 */
	public static int XQueryPointer(long display, long w, ByteBuffer root_return, ByteBuffer child_return, ByteBuffer root_x_return, ByteBuffer root_y_return, ByteBuffer win_x_return, ByteBuffer win_y_return, ByteBuffer mask_return) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXQueryPointer(display, w, memAddress(root_return), memAddress(child_return), memAddress(root_x_return), memAddress(root_y_return), memAddress(win_x_return), memAddress(win_y_return), memAddress(mask_return));
	}

	/** Alternative version of: {@link #XQueryPointer} */
	public static int XQueryPointer(long display, long w, PointerBuffer root_return, PointerBuffer child_return, IntBuffer root_x_return, IntBuffer root_y_return, IntBuffer win_x_return, IntBuffer win_y_return, IntBuffer mask_return) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXQueryPointer(display, w, memAddress(root_return), memAddress(child_return), memAddress(root_x_return), memAddress(root_y_return), memAddress(win_x_return), memAddress(win_y_return), memAddress(mask_return));
	}

	// --- [ XUnmapWindow ] ---

	/** JNI method for {@link #XUnmapWindow} */
	@JavadocExclude
	public static native int nXUnmapWindow(long display, long w);

	/**
	 * Unmaps the specified window and causes the X server to generate an {@code UnmapNotify} event. If the specified window is already unmapped,
	 * {@code XUnmapWindow()} has no effect. Normal exposure processing on formerly obscured windows is performed. Any child window will no longer be visible
	 * until another map call is made on the parent. In other words, the subwindows are still mapped but are not visible until the parent is mapped. Unmapping
	 * a window will generate {@code Expose} events on windows that were formerly obscured by it.
	 *
	 * @param display the connection to the X server
	 * @param w       the window
	 */
	public static int XUnmapWindow(long display, long w) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXUnmapWindow(display, w);
	}

	// --- [ XDestroyWindow ] ---

	/** JNI method for {@link #XDestroyWindow} */
	@JavadocExclude
	public static native int nXDestroyWindow(long display, long w);

	/**
	 * Destroys the specified window as well as all of its subwindows and causes the X server to generate a {@code DestroyNotify} event for each window. The
	 * window should never be referenced again. If the window specified by the {@code w} argument is mapped, it is unmapped automatically. The ordering of the
	 * {@code DestroyNotify} events is such that for any given window being destroyed, {@code DestroyNotify} is generated on any inferiors of the window before
	 * being generated on the window itself. The ordering among siblings and across subhierarchies is not otherwise constrained. If the window you specified is
	 * a root window, no windows are destroyed. Destroying a mapped window will generate {@code Expose} events on other windows that were obscured by the
	 * window being destroyed.
	 *
	 * @param display the connection to the X server
	 * @param w       the window
	 */
	public static int XDestroyWindow(long display, long w) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXDestroyWindow(display, w);
	}

	// --- [ Xutf8SetWMProperties ] ---

	/** JNI method for {@link #Xutf8SetWMProperties} */
	@JavadocExclude
	public static native void nXutf8SetWMProperties(long display, long w, long window_name, long icon_name, long argv, int argc, long normal_hints, long wm_hints, long class_hints);

	/**
	 * Sets window properties.
	 *
	 * @param display      the connection to the X server
	 * @param w            the window
	 * @param window_name  the window name, which should be a null-terminated string
	 * @param icon_name    the icon name, which should be a null-terminated string
	 * @param argv         the application's argument list
	 * @param argc         the number of arguments
	 * @param normal_hints the size hints for the window in its normal state
	 * @param wm_hints     the XWMHints structure to be used
	 * @param class_hints  the {@link XClassHint} structure to be used
	 */
	public static void Xutf8SetWMProperties(long display, long w, ByteBuffer window_name, ByteBuffer icon_name, ByteBuffer argv, int argc, ByteBuffer normal_hints, ByteBuffer wm_hints, ByteBuffer class_hints) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkNT1(window_name);
			checkNT1(icon_name);
			if ( argv != null ) checkBuffer(argv, argc << POINTER_SHIFT);
			if ( normal_hints != null ) checkBuffer(normal_hints, XSizeHints.SIZEOF);
			if ( wm_hints != null ) checkBuffer(wm_hints, XWMHints.SIZEOF);
			if ( class_hints != null ) checkBuffer(class_hints, XClassHint.SIZEOF);
		}
		nXutf8SetWMProperties(display, w, memAddress(window_name), memAddress(icon_name), memAddressSafe(argv), argc, memAddressSafe(normal_hints), memAddressSafe(wm_hints), memAddressSafe(class_hints));
	}

	/** Alternative version of: {@link #Xutf8SetWMProperties} */
	public static void Xutf8SetWMProperties(long display, long w, ByteBuffer window_name, ByteBuffer icon_name, PointerBuffer argv, ByteBuffer normal_hints, ByteBuffer wm_hints, ByteBuffer class_hints) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			if ( normal_hints != null ) checkBuffer(normal_hints, XSizeHints.SIZEOF);
			if ( wm_hints != null ) checkBuffer(wm_hints, XWMHints.SIZEOF);
			if ( class_hints != null ) checkBuffer(class_hints, XClassHint.SIZEOF);
		}
		nXutf8SetWMProperties(display, w, memAddress(window_name), memAddress(icon_name), memAddressSafe(argv), argv == null ? 0 : argv.remaining(), memAddressSafe(normal_hints), memAddressSafe(wm_hints), memAddressSafe(class_hints));
	}

	/** CharSequence version of: {@link #Xutf8SetWMProperties} */
	public static void Xutf8SetWMProperties(long display, long w, CharSequence window_name, CharSequence icon_name, PointerBuffer argv, ByteBuffer normal_hints, ByteBuffer wm_hints, ByteBuffer class_hints) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			if ( normal_hints != null ) checkBuffer(normal_hints, XSizeHints.SIZEOF);
			if ( wm_hints != null ) checkBuffer(wm_hints, XWMHints.SIZEOF);
			if ( class_hints != null ) checkBuffer(class_hints, XClassHint.SIZEOF);
		}
		APIBuffer __buffer = apiBuffer();
		int window_nameEncoded = __buffer.stringParamUTF8(window_name, true);
		int icon_nameEncoded = __buffer.stringParamUTF8(icon_name, true);
		nXutf8SetWMProperties(display, w, __buffer.address(window_nameEncoded), __buffer.address(icon_nameEncoded), memAddressSafe(argv), argv == null ? 0 : argv.remaining(), memAddressSafe(normal_hints), memAddressSafe(wm_hints), memAddressSafe(class_hints));
	}

	// --- [ XChangeProperty ] ---

	/** JNI method for {@link #XChangeProperty} */
	@JavadocExclude
	public static native int nXChangeProperty(long display, long w, long property, long type, int format, int mode, long data, int nelements);

	/**
	 * Alters a property for the specified window and causes the X server to generate a {@code PropertyNotify} event on that window.
	 *
	 * @param display   the connection to the X server
	 * @param w         the window
	 * @param property  the property name
	 * @param type      the type of the property
	 * @param format    whether the data should be viewed as a list of 8-bit, 16-bit, or 32-bit quantities. One of:<br>8, 16, 32
	 * @param mode      the mode of the operation. One of:<br>{@link X#PropModeReplace}, {@link X#PropModePrepend}, {@link X#PropModeAppend}
	 * @param data      the property data
	 * @param nelements the number of elements of the specified data format
	 */
	public static int XChangeProperty(long display, long w, long property, long type, int format, int mode, ByteBuffer data, int nelements) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(data, nelements);
		}
		return nXChangeProperty(display, w, property, type, format, mode, memAddress(data), nelements);
	}

	/** ByteBuffer version of: {@link #XChangeProperty} */
	public static int XChangeProperty(long display, long w, long property, long type, int format, int mode, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXChangeProperty(display, w, property, type, format, mode, memAddress(data), data.remaining());
	}

	/** ShortBuffer version of: {@link #XChangeProperty} */
	public static int XChangeProperty(long display, long w, long property, long type, int format, int mode, ShortBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXChangeProperty(display, w, property, type, format, mode, memAddress(data), data.remaining());
	}

	/** IntBuffer version of: {@link #XChangeProperty} */
	public static int XChangeProperty(long display, long w, long property, long type, int format, int mode, IntBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXChangeProperty(display, w, property, type, format, mode, memAddress(data), data.remaining());
	}

	// --- [ XTranslateCoordinates ] ---

	/** JNI method for {@link #XTranslateCoordinates} */
	@JavadocExclude
	public static native int nXTranslateCoordinates(long display, long src_w, long dest_w, int src_x, int src_y, long dest_x_return, long dest_y_return, long child_return);

	/**
	 * Translates a coordinate in one window to the coordinate space of another window.
	 *
	 * @param display       the connection to the X server
	 * @param src_w         the source window
	 * @param dest_w        the destination window
	 * @param src_x         the x-coordinate within the source window
	 * @param src_y         the y-coordinate within the source window
	 * @param dest_x_return the x-coordinate within the destination window
	 * @param dest_y_return the x-coordinate within the destination window
	 * @param child_return  the child if the coordinates are contained in a mapped child of the destination window
	 */
	public static int XTranslateCoordinates(long display, long src_w, long dest_w, int src_x, int src_y, ByteBuffer dest_x_return, ByteBuffer dest_y_return, ByteBuffer child_return) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(dest_x_return, 1 << 2);
			checkBuffer(dest_y_return, 1 << 2);
		}
		return nXTranslateCoordinates(display, src_w, dest_w, src_x, src_y, memAddress(dest_x_return), memAddress(dest_y_return), memAddress(child_return));
	}

	/** Alternative version of: {@link #XTranslateCoordinates} */
	public static int XTranslateCoordinates(long display, long src_w, long dest_w, int src_x, int src_y, IntBuffer dest_x_return, IntBuffer dest_y_return, PointerBuffer child_return) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(dest_x_return, 1);
			checkBuffer(dest_y_return, 1);
		}
		return nXTranslateCoordinates(display, src_w, dest_w, src_x, src_y, memAddress(dest_x_return), memAddress(dest_y_return), memAddress(child_return));
	}

	// --- [ XGetWindowAttributes ] ---

	/** JNI method for {@link #XGetWindowAttributes} */
	@JavadocExclude
	public static native int nXGetWindowAttributes(long display, long w, long window_attributes_return);

	/**
	 * Returns the current attributes for the specified window to an {@link XWindowAttributes} structure.
	 *
	 * @param display                  the connection to the X server
	 * @param w                        the window
	 * @param window_attributes_return a pointer to a {@link XWindowAttributes} structure
	 */
	public static int XGetWindowAttributes(long display, long w, ByteBuffer window_attributes_return) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(window_attributes_return, XWindowAttributes.SIZEOF);
		}
		return nXGetWindowAttributes(display, w, memAddress(window_attributes_return));
	}

	// --- [ XIconifyWindow ] ---

	/** JNI method for {@link #XIconifyWindow} */
	@JavadocExclude
	public static native int nXIconifyWindow(long display, long w, int screen_number);

	/**
	 * Sends a {@code WM_CHANGE_STATE} {@code ClientMessage} event with a format of 32 and a first data element of {@code IconicState} and a window of {@code w}
	 * to the root window of the specified screen with an event mask set to {@code SubstructureNotifyMask} | {@code SubstructureRedirectMask}. Window managers
	 * may elect to receive this message and if the window is in its normal state, may treat it as a request to change the window's state from normal to
	 * iconic. If the {@code WM_CHANGE_STATE} property cannot be interned, {@code XIconifyWindow()} does not send a message and returns a zero status. It
	 * returns a nonzero status if the client message is sent successfully; otherwise, it returns a zero status.
	 *
	 * @param display       the connection to the X server
	 * @param w             the window
	 * @param screen_number the appropriate screen number on the host server
	 */
	public static int XIconifyWindow(long display, long w, int screen_number) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXIconifyWindow(display, w, screen_number);
	}

	// --- [ XMapWindow ] ---

	/** JNI method for {@link #XMapWindow} */
	@JavadocExclude
	public static native int nXMapWindow(long display, long w);

	/**
	 * Maps the window and all of its subwindows that have had map requests. Mapping a window that has an unmapped ancestor does not display the window but
	 * marks it as eligible for display when the ancestor becomes mapped. Such a window is called unviewable. When all its ancestors are mapped, the window
	 * becomes viewable and will be visible on the screen if it is not obscured by another window. This function has no effect if the window is already mapped.
	 *
	 * @param display the connection to the X server
	 * @param w       the window
	 */
	public static int XMapWindow(long display, long w) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXMapWindow(display, w);
	}

	// --- [ XMapRaised ] ---

	/** JNI method for {@link #XMapRaised} */
	@JavadocExclude
	public static native int nXMapRaised(long display, long w);

	/**
	 * Essentially is similar to {@link #XMapWindow} in that it maps the window and all of its subwindows that have had map requests. However, it also raises
	 * the specified window to the top of the stack.
	 *
	 * @param display the connection to the X server
	 * @param w       the window
	 */
	public static int XMapRaised(long display, long w) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXMapRaised(display, w);
	}

	// --- [ XWarpPointer ] ---

	/** JNI method for {@link #XWarpPointer} */
	@JavadocExclude
	public static native int nXWarpPointer(long display, long src_w, long dest_w, int src_x, int src_y, int src_width, int src_height, int dest_x, int dest_y);

	/**
	 * If {@code dest_w} is None, {@code XWarpPointer()} moves the pointer by the offsets {@code (dest_x, dest_y)} relative to the current position of the
	 * pointer. If {@code dest_w} is a window, {@code XWarpPointer()} moves the pointer to the offsets {@code (dest_x, dest_y)} relative to the origin of
	 * {@code dest_w}. However, if {@code src_w} is a window, the move only takes place if the window {@code src_w} contains the pointer and if the specified
	 * rectangle of {@code src_w} contains the pointer.
	 * 
	 * <p>The {@code src_x} and {@code src_y} coordinates are relative to the origin of {@code src_w}. If {@code src_height} is zero, it is replaced with the
	 * current height of {@code src_w} minus {@code src_y}. If {@code src_width} is zero, it is replaced with the current width of {@code src_w} minus
	 * {@code src_x}.</p>
	 * 
	 * <p>There is seldom any reason for calling this function. The pointer should normally be left to the user. If you do use this function, however, it
	 * generates events just as if the user had instantaneously moved the pointer from one position to another. Note that you cannot use {@code XWarpPointer()}
	 * to move the pointer outside the {@code confine_to} window of an active pointer grab. An attempt to do so will only move the pointer as far as the
	 * closest edge of the {@code confine_to} window.</p>
	 *
	 * @param display    the connection to the X server
	 * @param src_w      the source window or {@link X#None}
	 * @param dest_w     the destination window or {@link X#None}
	 * @param src_x      the source rectangle x-coordinate
	 * @param src_y      the source rectangle y-coordinate
	 * @param src_width  the source rectangle width
	 * @param src_height the source rectangle height
	 * @param dest_x     the x-coordinate within the destination window
	 * @param dest_y     the y-coordinate within the destination window
	 */
	public static int XWarpPointer(long display, long src_w, long dest_w, int src_x, int src_y, int src_width, int src_height, int dest_x, int dest_y) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXWarpPointer(display, src_w, dest_w, src_x, src_y, src_width, src_height, dest_x, dest_y);
	}

	// --- [ XSetSelectionOwner ] ---

	/** JNI method for {@link #XSetSelectionOwner} */
	@JavadocExclude
	public static native int nXSetSelectionOwner(long display, long selection, long owner, long time);

	/**
	 * changes the owner and last-change time for the specified selection and has no effect if the specified time is earlier than the current last-change time
	 * of the specified selection or is later than the current X server time. Otherwise, the last-change time is set to the specified time, with {@link X#CurrentTime}
	 * replaced by the current server time. If the owner window is specified as {@link X#None}, then the owner of the selection becomes {@link X#None} (that
	 * is, no owner). Otherwise, the owner of the selection becomes the client executing the request.
	 * 
	 * <p>If the new owner (whether a client or {@link X#None}) is not the same as the current owner of the selection and the current owner is not {@link X#None},
	 * the current owner is sent a {@code SelectionClear} event. If the client that is the owner of a selection is later terminated (that is, its connection is
	 * closed) or if the owner window it has specified in the request is later destroyed, the owner of the selection automatically reverts to {@link X#None},
	 * but the last-change time is not affected. The selection atom is uninterpreted by the X server. {@link #XGetSelectionOwner} returns the owner window,
	 * which is reported in {@code SelectionRequest} and {@code SelectionClear} events. Selections are global to the X server.</p>
	 *
	 * @param display   the connection to the X server
	 * @param selection the selection atom
	 * @param owner     the owner of the specified selection atom. You can pass a window or {@link X#None}.
	 * @param time      the time. You can pass either a timestamp or {@link X#CurrentTime}
	 */
	public static int XSetSelectionOwner(long display, long selection, long owner, long time) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXSetSelectionOwner(display, selection, owner, time);
	}

	// --- [ XGetSelectionOwner ] ---

	/** JNI method for {@link #XGetSelectionOwner} */
	@JavadocExclude
	public static native long nXGetSelectionOwner(long display, long selection);

	/**
	 * Returns the window ID associated with the window that currently owns the specified selection. If no selection was specified, the function returns the
	 * constant {@link X#None}. If {@link X#None} is returned, there is no owner for the selection.
	 *
	 * @param display   the connection to the X server
	 * @param selection the selection atom whose owner you want returned
	 */
	public static long XGetSelectionOwner(long display, long selection) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXGetSelectionOwner(display, selection);
	}

	// --- [ XConvertSelection ] ---

	/** JNI method for {@link #XConvertSelection} */
	@JavadocExclude
	public static native int nXConvertSelection(long display, long selection, long target, long property, long requestor, long time);

	/**
	 * Requests that the specified selection be converted to the specified target type.
	 *
	 * @param display   the connection to the X server
	 * @param selection the selection atom
	 * @param target    the target atom
	 * @param property  the property name or {@link X#None}
	 * @param requestor the requestor window
	 * @param time      the time. You can pass either a timestamp or {@link X#CurrentTime}
	 */
	public static int XConvertSelection(long display, long selection, long target, long property, long requestor, long time) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXConvertSelection(display, selection, target, property, requestor, time);
	}

	// --- [ XCheckTypedEvent ] ---

	/** JNI method for {@link #XCheckTypedEvent} */
	@JavadocExclude
	public static native int nXCheckTypedEvent(long display, int event_type, long event_return);

	/**
	 * Searches the event queue and then any events available on the server connection for the first event that matches the specified type. If it finds a
	 * match, {@code XCheckTypedEvent()} removes that event, copies it into the specified {@link XEvent} structure, and returns {@link #True}. The other events
	 * in the queue are not discarded. If the event is not available, {@code XCheckTypedEvent()} returns {@link #False}, and the output buffer will have been
	 * flushed.
	 *
	 * @param display      the connection to the X server
	 * @param event_type   the event type to be compared
	 * @param event_return the matched event's associated {@link XEvent} structure
	 */
	public static int XCheckTypedEvent(long display, int event_type, ByteBuffer event_return) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(event_return, XEvent.SIZEOF);
		}
		return nXCheckTypedEvent(display, event_type, memAddress(event_return));
	}

	// --- [ XCreatePixmap ] ---

	/** JNI method for {@link #XCreatePixmap} */
	@JavadocExclude
	public static native long nXCreatePixmap(long display, long d, int width, int height, int depth);

	/**
	 * Creates a pixmap of the width, height, and depth you specified and returns a pixmap ID that identifies it. It is valid to pass an {@link X#InputOnly}
	 * window to the drawable argument. The width and height arguments must be nonzero, or a {@link X#BadValue} error results. The depth argument must be one
	 * of the depths supported by the screen of the specified drawable, or a {@link X#BadValue} error results.
	 *
	 * @param display the connection to the X server
	 * @param d       which screen the pixmap is created on
	 * @param width   the pixmap width
	 * @param height  the pixmap height
	 * @param depth   the pixmap depth
	 */
	public static long XCreatePixmap(long display, long d, int width, int height, int depth) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXCreatePixmap(display, d, width, height, depth);
	}

	// --- [ XCreateGC ] ---

	/** JNI method for {@link #XCreateGC} */
	@JavadocExclude
	public static native long nXCreateGC(long display, long d, long valuemask, long values);

	/**
	 * Creates a graphics context and returns a GC. The GC can be used with any destination drawable having the same root and depth as the specified drawable.
	 * Use with other drawables results in a {@link X#BadMatch} error.
	 *
	 * @param display   
	 * @param d         
	 * @param valuemask 
	 * @param values    
	 */
	public static long XCreateGC(long display, long d, long valuemask, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(values, XGCValues.SIZEOF);
		}
		return nXCreateGC(display, d, valuemask, memAddress(values));
	}

	// --- [ XFillRectangle ] ---

	/** JNI method for {@link #XFillRectangle} */
	@JavadocExclude
	public static native int nXFillRectangle(long display, long d, long gc, int x, int y, int width, int height);

	/**
	 * Fills the specified rectangle as if a four-point FillPolygon protocol request were specified for each rectangle.
	 *
	 * @param display the connection to the X server
	 * @param d       the drawable
	 * @param gc      the GC
	 * @param x       the x-coordinate
	 * @param y       the y-coordinate
	 * @param width   the rectangle width
	 * @param height  the rectangle height
	 */
	public static int XFillRectangle(long display, long d, long gc, int x, int y, int width, int height) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(gc);
		}
		return nXFillRectangle(display, d, gc, x, y, width, height);
	}

	// --- [ XCreatePixmapCursor ] ---

	/** JNI method for {@link #XCreatePixmapCursor} */
	@JavadocExclude
	public static native long nXCreatePixmapCursor(long display, long source, long mask, long foreground_color, long background_color, int x, int y);

	/**
	 * Creates a cursor and returns the cursor ID associated with it.
	 *
	 * @param display          the connection to the X server
	 * @param source           the shape of the source cursor
	 * @param mask             the cursor's source bits to be displayed or {@link X#None}
	 * @param foreground_color the RGB values for the foreground of the source
	 * @param background_color the RGB values for the background of the source
	 * @param x                the hotspot x-coordinate relative to the source's origin
	 * @param y                the hotspot y-coordinate relative to the source's origin
	 */
	public static long XCreatePixmapCursor(long display, long source, long mask, ByteBuffer foreground_color, ByteBuffer background_color, int x, int y) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(foreground_color, XColor.SIZEOF);
			checkBuffer(background_color, XColor.SIZEOF);
		}
		return nXCreatePixmapCursor(display, source, mask, memAddress(foreground_color), memAddress(background_color), x, y);
	}

	// --- [ XFreePixmap ] ---

	/** JNI method for {@link #XFreePixmap} */
	@JavadocExclude
	public static native int nXFreePixmap(long display, long pixmap);

	/**
	 * First deletes the association between the pixmap ID and the pixmap. Then, the X server frees the pixmap storage when there are no references to it. The
	 * pixmap should never be referenced again.
	 *
	 * @param display the connection to the X server
	 * @param pixmap  the pixmap to free
	 */
	public static int XFreePixmap(long display, long pixmap) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXFreePixmap(display, pixmap);
	}

	// --- [ XFreeGC ] ---

	/** JNI method for {@link #XFreeGC} */
	@JavadocExclude
	public static native int nXFreeGC(long display, long gc);

	/**
	 * Destroys the specified GC as well as all the associated storage.
	 *
	 * @param display the connection to the X server
	 * @param gc      the GC to free
	 */
	public static int XFreeGC(long display, long gc) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(gc);
		}
		return nXFreeGC(display, gc);
	}

}