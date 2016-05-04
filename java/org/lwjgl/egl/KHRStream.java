/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/KHR/EGL_KHR_stream.txt">KHR_stream</a> extension.
 * 
 * <p>This extension defines a new object, the EGLStream, that can be used to efficiently transfer a sequence of image frames from one API to another. The
 * EGLStream has mechanisms that can help keep audio data synchronized to video data.</p>
 * 
 * <p>Each EGLStream is associated with a "producer" that generates image frames and inserts them into the EGLStream. The producer is responsible for
 * inserting each image frame into the EGLStream at the correct time so that the consumer can display the image frame for the appropriate period of time.</p>
 * 
 * <p>Each EGLStream is also associated with a "consumer" that retrieves image frames from the EGLStream. The consumer is responsible for noticing that an
 * image frame is available and displaying it (or otherwise consuming it). The consumer is also responsible for indicating the latency when that is
 * possible (the latency is the time that elapses between the time it is retrieved from the EGLStream until the time it is displayed to the user).</p>
 * 
 * <p>Some APIs are stream oriented (examples: OpenMAX IL, OpenMAX AL). These APIs may be connected directly to an EGLStream as a producer or consumer. Once
 * a stream oriented producer is "connected" to an EGLStream and "started" it may insert image frames into the EGLStream automatically with no further
 * interaction from the application. Likewise, once a stream oriented consumer is "connected" to an EGLStream and "started" it may retrieve image frames
 * from the EGLStream automatically with no further interaction from the application.</p>
 * 
 * <p>Some APIs are rendering oriented and require interaction with the application during the rendering of each frame (examples: OpenGL, OpenGL ES, OpenVG).
 * These APIs will not automatically insert or retrieve image frames into/from the EGLStream. Instead the application must take explicit action to cause a
 * rendering oriented producer to insert an image frame or to cause a rendering oriented consumer to retrieve an image frame.</p>
 * 
 * <p>The EGLStream conceptually operates as a mailbox. When the producer has a new image frame it empties the mailbox (discards the old contents) and
 * inserts the new image frame into the mailbox. The consumer retrieves the image frame from the mailbox and examines it. When the consumer is finished
 * examining the image frame it is either placed back in the mailbox (if the mailbox is empty) or discarded (if the mailbox is not empty).</p>
 * 
 * <p>Timing is mainly controlled by the producer. The consumer operated with a fixed latency that it indicates to the producer through the
 * EGL_CONSUMER_LATENCY_USEC_KHR attribute. The consumer is expected to notice when a new image frame is available in the EGLStream, retrieve it, and
 * display it to the user in the time indicated by EGL_CONSUMER_LATENCY_USEC_KHR. The producer controls when the image frame will be displayed by
 * inserting it into the stream at time T - EGL_CONSUMER_LATENCY_USEC_KHR where T is the time that the image frame is intended to appear to the user.</p>
 * 
 * <p>This extension does not cover the details of how a producer or a consumer works or is "connected" to an EGLStream. Different kinds of producers and
 * consumers work differently and are described in additional extension specifications.</p>
 */
public class KHRStream {

	/**  */
	public static final long EGL_NO_STREAM_KHR = 0x0L;

	/**  */
	public static final int
		EGL_CONSUMER_LATENCY_USEC_KHR            = 0x3210,
		EGL_PRODUCER_FRAME_KHR                   = 0x3212,
		EGL_CONSUMER_FRAME_KHR                   = 0x3213,
		EGL_STREAM_STATE_KHR                     = 0x3214,
		EGL_STREAM_STATE_CREATED_KHR             = 0x3215,
		EGL_STREAM_STATE_CONNECTING_KHR          = 0x3216,
		EGL_STREAM_STATE_EMPTY_KHR               = 0x3217,
		EGL_STREAM_STATE_NEW_FRAME_AVAILABLE_KHR = 0x3218,
		EGL_STREAM_STATE_OLD_FRAME_AVAILABLE_KHR = 0x3219,
		EGL_STREAM_STATE_DISCONNECTED_KHR        = 0x321A,
		EGL_BAD_STREAM_KHR                       = 0x321B,
		EGL_BAD_STATE_KHR                        = 0x321C;

	protected KHRStream() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(EGLCapabilities caps) {
		return checkFunctions(
			caps.eglCreateStreamKHR, caps.eglDestroyStreamKHR, caps.eglStreamAttribKHR, caps.eglQueryStreamKHR, caps.eglQueryStreamu64KHR
		);
	}

	// --- [ eglCreateStreamKHR ] ---

	public static long neglCreateStreamKHR(long dpy, long attrib_list) {
		long __functionAddress = EGL.getCapabilities().eglCreateStreamKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
		}
		return callPPP(__functionAddress, dpy, attrib_list);
	}

	public static long eglCreateStreamKHR(long dpy, IntBuffer attrib_list) {
		if ( CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreateStreamKHR(dpy, memAddressSafe(attrib_list));
	}

	// --- [ eglDestroyStreamKHR ] ---

	public static boolean eglDestroyStreamKHR(long dpy, long stream) {
		long __functionAddress = EGL.getCapabilities().eglDestroyStreamKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(stream);
		}
		return callPPI(__functionAddress, dpy, stream) != 0;
	}

	// --- [ eglStreamAttribKHR ] ---

	public static boolean eglStreamAttribKHR(long dpy, long stream, int attribute, int value) {
		long __functionAddress = EGL.getCapabilities().eglStreamAttribKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(stream);
		}
		return callPPI(__functionAddress, dpy, stream, attribute, value) != 0;
	}

	// --- [ eglQueryStreamKHR ] ---

	public static int neglQueryStreamKHR(long dpy, long stream, int attribute, long value) {
		long __functionAddress = EGL.getCapabilities().eglQueryStreamKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(stream);
		}
		return callPPPI(__functionAddress, dpy, stream, attribute, value);
	}

	public static boolean eglQueryStreamKHR(long dpy, long stream, int attribute, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return neglQueryStreamKHR(dpy, stream, attribute, memAddress(value)) != 0;
	}

	// --- [ eglQueryStreamu64KHR ] ---

	public static int neglQueryStreamu64KHR(long dpy, long stream, int attribute, long value) {
		long __functionAddress = EGL.getCapabilities().eglQueryStreamu64KHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(stream);
		}
		return callPPPI(__functionAddress, dpy, stream, attribute, value);
	}

	public static boolean eglQueryStreamu64KHR(long dpy, long stream, int attribute, LongBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return neglQueryStreamu64KHR(dpy, stream, attribute, memAddress(value)) != 0;
	}

	/** Array version of: {@link #eglCreateStreamKHR CreateStreamKHR} */
	public static long eglCreateStreamKHR(long dpy, int[] attrib_list) {
		long __functionAddress = EGL.getCapabilities().eglCreateStreamKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		}
		return callPPP(__functionAddress, dpy, attrib_list);
	}

	/** Array version of: {@link #eglQueryStreamKHR QueryStreamKHR} */
	public static boolean eglQueryStreamKHR(long dpy, long stream, int attribute, int[] value) {
		long __functionAddress = EGL.getCapabilities().eglQueryStreamKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(stream);
			checkBuffer(value, 1);
		}
		return callPPPI(__functionAddress, dpy, stream, attribute, value) != 0;
	}

	/** Array version of: {@link #eglQueryStreamu64KHR QueryStreamu64KHR} */
	public static boolean eglQueryStreamu64KHR(long dpy, long stream, int attribute, long[] value) {
		long __functionAddress = EGL.getCapabilities().eglQueryStreamu64KHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(stream);
			checkBuffer(value, 1);
		}
		return callPPPI(__functionAddress, dpy, stream, attribute, value) != 0;
	}

}