/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/NV/EGL_NV_stream_metadata.txt">NV_stream_metadata</a> extension.
 * 
 * <p>Application suites which make use of streams to transmit images may need to communicate additional data between the producer and consumer, synchronized
 * with the frame updates. This data may change infrequently, such as a movie title and track number to be displayed to the user, or every frame, such as
 * a focal length and exposure time used to process the image. Transmitting this data outside the scope of the stream may be inconvenient, particularly in
 * the case of cross-process streams. But the nature of the data is highly application-dependent, so it is not feasible for an EGL implementation to
 * define specific extensions for a broad range of application data.</p>
 * 
 * <p>This extension provides a means for an application (or application suite in the cross-process case) to associate arbitrary metadata with a stream.
 * Multiple metadata fields are available, allowing them to be updated and used independently by separate subcomponents of producers and consumers,
 * respectively. The format of the data is determined by the application, which is responsible for writing and reading it correctly.</p>
 * 
 * <p>Requires {@link KHRStream KHR_stream}.</p>
 */
public class NVStreamMetadata {

	/** Accepted as {@code attribute} by {@link #eglQueryDisplayAttribNV QueryDisplayAttribNV}. */
	public static final int
		EGL_MAX_STREAM_METADATA_BLOCKS_NV     = 0x3250,
		EGL_MAX_STREAM_METADATA_BLOCK_SIZE_NV = 0x3251,
		EGL_MAX_STREAM_METADATA_TOTAL_SIZE_NV = 0x3252;

	/** Accepted as {@code name} by {@link #eglQueryStreamMetadataNV QueryStreamMetadataNV}. */
	public static final int
		EGL_PRODUCER_METADATA_NV = 0x3253,
		EGL_CONSUMER_METADATA_NV = 0x3254,
		EGL_PENDING_METADATA_NV  = 0x3328;

	/** Accepted in {@code attrib_list} by {@link KHRStream#eglCreateStreamKHR CreateStreamKHR} and as {@code attribute} by {@link KHRStream#eglQueryStreamKHR QueryStreamKHR}. */
	public static final int
		EGL_METADATA0_SIZE_NV = 0x3255,
		EGL_METADATA1_SIZE_NV = 0x3256,
		EGL_METADATA2_SIZE_NV = 0x3257,
		EGL_METADATA3_SIZE_NV = 0x3258,
		EGL_METADATA0_TYPE_NV = 0x3259,
		EGL_METADATA1_TYPE_NV = 0x325A,
		EGL_METADATA2_TYPE_NV = 0x325B,
		EGL_METADATA3_TYPE_NV = 0x325C;

	/** Function address. */
	@JavadocExclude
	public final long
		QueryDisplayAttribNV,
		SetStreamMetadataNV,
		QueryStreamMetadataNV;

	@JavadocExclude
	protected NVStreamMetadata() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public NVStreamMetadata(FunctionProvider provider) {
		QueryDisplayAttribNV = provider.getFunctionAddress("eglQueryDisplayAttribNV");
		SetStreamMetadataNV = provider.getFunctionAddress("eglSetStreamMetadataNV");
		QueryStreamMetadataNV = provider.getFunctionAddress("eglQueryStreamMetadataNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVStreamMetadata} instance. */
	public static NVStreamMetadata getInstance() {
		return getInstance(EGL.getCapabilities());
	}

	/** Returns the {@link NVStreamMetadata} instance of the specified {@link EGLCapabilities}. */
	public static NVStreamMetadata getInstance(EGLCapabilities caps) {
		return checkFunctionality(caps.__NVStreamMetadata);
	}

	// --- [ eglQueryDisplayAttribNV ] ---

	/** Unsafe version of {@link #eglQueryDisplayAttribNV QueryDisplayAttribNV} */
	@JavadocExclude
	public static boolean neglQueryDisplayAttribNV(long dpy, int attribute, long value) {
		long __functionAddress = getInstance().QueryDisplayAttribNV;
		if ( CHECKS )
			checkPointer(dpy);
		return callPIPZ(__functionAddress, dpy, attribute, value);
	}

	public static boolean eglQueryDisplayAttribNV(long dpy, int attribute, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1 << POINTER_SHIFT);
		return neglQueryDisplayAttribNV(dpy, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #eglQueryDisplayAttribNV QueryDisplayAttribNV} */
	public static boolean eglQueryDisplayAttribNV(long dpy, int attribute, PointerBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return neglQueryDisplayAttribNV(dpy, attribute, memAddress(value));
	}

	// --- [ eglSetStreamMetadataNV ] ---

	/** Unsafe version of {@link #eglSetStreamMetadataNV SetStreamMetadataNV} */
	@JavadocExclude
	public static boolean neglSetStreamMetadataNV(long dpy, long stream, int n, int offset, int size, long data) {
		long __functionAddress = getInstance().SetStreamMetadataNV;
		if ( CHECKS ) {
			checkPointer(dpy);
			checkPointer(stream);
		}
		return callPPIIIPZ(__functionAddress, dpy, stream, n, offset, size, data);
	}

	public static boolean eglSetStreamMetadataNV(long dpy, long stream, int n, int offset, int size, ByteBuffer data) {
		if ( CHECKS )
			checkBuffer(data, size);
		return neglSetStreamMetadataNV(dpy, stream, n, offset, size, memAddress(data));
	}

	/** Alternative version of: {@link #eglSetStreamMetadataNV SetStreamMetadataNV} */
	public static boolean eglSetStreamMetadataNV(long dpy, long stream, int n, int offset, ByteBuffer data) {
		return neglSetStreamMetadataNV(dpy, stream, n, offset, data.remaining(), memAddress(data));
	}

	// --- [ eglQueryStreamMetadataNV ] ---

	/** Unsafe version of {@link #eglQueryStreamMetadataNV QueryStreamMetadataNV} */
	@JavadocExclude
	public static boolean neglQueryStreamMetadataNV(long dpy, long stream, int name, int n, int offset, int size, long data) {
		long __functionAddress = getInstance().QueryStreamMetadataNV;
		if ( CHECKS ) {
			checkPointer(dpy);
			checkPointer(stream);
		}
		return callPPIIIIPZ(__functionAddress, dpy, stream, name, n, offset, size, data);
	}

	public static boolean eglQueryStreamMetadataNV(long dpy, long stream, int name, int n, int offset, int size, ByteBuffer data) {
		if ( CHECKS )
			checkBuffer(data, size);
		return neglQueryStreamMetadataNV(dpy, stream, name, n, offset, size, memAddress(data));
	}

	/** Alternative version of: {@link #eglQueryStreamMetadataNV QueryStreamMetadataNV} */
	public static boolean eglQueryStreamMetadataNV(long dpy, long stream, int name, int n, int offset, ByteBuffer data) {
		return neglQueryStreamMetadataNV(dpy, stream, name, n, offset, data.remaining(), memAddress(data));
	}

}