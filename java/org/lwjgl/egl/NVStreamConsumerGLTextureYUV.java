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
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/NV/EGL_NV_stream_consumer_gltexture_yuv.txt">NV_stream_consumer_gltexture_yuv</a> extension.
 * 
 * <p>The EGL_KHR_stream_consumer_gltexture extension allows EGLStream frames to be latched to a GL texture for use in rendering. These frames are assumed to
 * be stored in RGB format and accessed as such by shader programs. If the producer uses a different color space, the stream implementation must perform
 * an implicit conversion.</p>
 * 
 * <p>In cases where the producer operates in a native YUV color space, it may be desirable for shaders to directly access the YUV components, without
 * conversion. This extension adds a new variant of the function to bind GL textures as stream consumers which allows attributes to specify the color
 * space.</p>
 * 
 * <p>Requires {@link KHRStreamConsumerGLTexture EGL R.S}.</p>
 */
public class NVStreamConsumerGLTextureYUV {

	/** Accepted as attribute name in {@code attrib_list} by {@link #eglStreamConsumerGLTextureExternalAttribsNV StreamConsumerGLTextureExternalAttribsNV}. */
	public static final int
		EGL_YUV_PLANE0_TEXTURE_UNIT_NV = 0x332C,
		EGL_YUV_PLANE1_TEXTURE_UNIT_NV = 0x332D,
		EGL_YUV_PLANE2_TEXTURE_UNIT_NV = 0x332E;

	/** Accepted as attribute name in {@code attrib_list} by {@link #eglStreamConsumerGLTextureExternalAttribsNV StreamConsumerGLTextureExternalAttribsNV}. */
	public static final int EGL_YUV_NUMBER_OF_PLANES_EXT = 0x3311;

	/** Accepted as value for {@link EGL12#EGL_COLOR_BUFFER_TYPE COLOR_BUFFER_TYPE} attribute in {@code attrib_list} by {@link #eglStreamConsumerGLTextureExternalAttribsNV StreamConsumerGLTextureExternalAttribsNV}. */
	public static final int EGL_YUV_BUFFER_EXT = 0x3300;

	/** Function address. */
	@JavadocExclude
	public final long StreamConsumerGLTextureExternalAttribsNV;

	@JavadocExclude
	protected NVStreamConsumerGLTextureYUV() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public NVStreamConsumerGLTextureYUV(FunctionProvider provider) {
		StreamConsumerGLTextureExternalAttribsNV = provider.getFunctionAddress("eglStreamConsumerGLTextureExternalAttribsNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVStreamConsumerGLTextureYUV} instance. */
	public static NVStreamConsumerGLTextureYUV getInstance() {
		return getInstance(EGL.getCapabilities());
	}

	/** Returns the {@link NVStreamConsumerGLTextureYUV} instance of the specified {@link EGLCapabilities}. */
	public static NVStreamConsumerGLTextureYUV getInstance(EGLCapabilities caps) {
		return checkFunctionality(caps.__NVStreamConsumerGLTextureYUV);
	}

	// --- [ eglStreamConsumerGLTextureExternalAttribsNV ] ---

	/** Unsafe version of {@link #eglStreamConsumerGLTextureExternalAttribsNV StreamConsumerGLTextureExternalAttribsNV} */
	@JavadocExclude
	public static boolean neglStreamConsumerGLTextureExternalAttribsNV(long dpy, long stream, long attrib_list) {
		long __functionAddress = getInstance().StreamConsumerGLTextureExternalAttribsNV;
		if ( CHECKS ) {
			checkPointer(dpy);
			checkPointer(stream);
		}
		return callPPPZ(__functionAddress, dpy, stream, attrib_list);
	}

	public static boolean eglStreamConsumerGLTextureExternalAttribsNV(long dpy, long stream, ByteBuffer attrib_list) {
		return neglStreamConsumerGLTextureExternalAttribsNV(dpy, stream, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #eglStreamConsumerGLTextureExternalAttribsNV StreamConsumerGLTextureExternalAttribsNV} */
	public static boolean eglStreamConsumerGLTextureExternalAttribsNV(long dpy, long stream, PointerBuffer attrib_list) {
		return neglStreamConsumerGLTextureExternalAttribsNV(dpy, stream, memAddressSafe(attrib_list));
	}

}