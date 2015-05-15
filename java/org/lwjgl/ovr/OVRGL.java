/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to libOVR, using the <a href="https://developer.oculus.com/">Oculus SDK</a> C API.
 * 
 * <p>This class contains OpenGL specific functionality.</p>
 */
public final class OVRGL {

	static { LWJGLUtil.initialize(); }

	private OVRGL() {}

	// --- [ ovrHmd_CreateSwapTextureSetGL ] ---

	/** JNI method for {@link #ovrHmd_CreateSwapTextureSetGL Hmd_CreateSwapTextureSetGL} */
	@JavadocExclude
	public static native int novrHmd_CreateSwapTextureSetGL(long hmd, int format, int width, int height, long outTextureSet);

	/**
	 * Creates a Texture Set suitable for use with OpenGL.
	 *
	 * @param hmd           an {@code ovrHmd} previously returned by {@link OVR#ovrHmd_Create Hmd_Create}.
	 * @param format        the texture format
	 * @param width         the requested texture width
	 * @param height        the requested texture height
	 * @param outTextureSet the created {@link OVRSwapTextureSet}, which will be valid only upon a successful return value. This texture set must be eventually destroyed via
	 *                      {@link OVR#ovrHmd_DestroySwapTextureSet Hmd_DestroySwapTextureSet} before destroying the HMD with {@link OVR#ovrHmd_Destroy Hmd_Destroy}.
	 *
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr_GetLastErrorInfo _GetLastErrorInfo} to get more information.
	 */
	public static int ovrHmd_CreateSwapTextureSetGL(long hmd, int format, int width, int height, ByteBuffer outTextureSet) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novrHmd_CreateSwapTextureSetGL(hmd, format, width, height, memAddress(outTextureSet));
	}

	/** Alternative version of: {@link #ovrHmd_CreateSwapTextureSetGL Hmd_CreateSwapTextureSetGL} */
	public static int ovrHmd_CreateSwapTextureSetGL(long hmd, int format, int width, int height, PointerBuffer outTextureSet) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novrHmd_CreateSwapTextureSetGL(hmd, format, width, height, memAddress(outTextureSet));
	}

	// --- [ ovrHmd_CreateMirrorTextureGL ] ---

	/** JNI method for {@link #ovrHmd_CreateMirrorTextureGL Hmd_CreateMirrorTextureGL} */
	@JavadocExclude
	public static native int novrHmd_CreateMirrorTextureGL(long hmd, int format, int width, int height, long outTextureSet);

	/**
	 * Creates a Mirror Texture which is auto-refreshed to mirror Rift contents produced by this application.
	 *
	 * @param hmd           an {@code ovrHmd} previously returned by {@link OVR#ovrHmd_Create Hmd_Create}.
	 * @param format        the texture format
	 * @param width         the requested texture width
	 * @param height        the requested texture height
	 * @param outTextureSet the created {@link OVRTexture}, which will be valid only upon a successful return value. This texture must be eventually destroyed via
	 *                      {@link OVR#ovrHmd_DestroyMirrorTexture Hmd_DestroyMirrorTexture} before destroying the HMD with {@link OVR#ovrHmd_Destroy Hmd_Destroy}.
	 *
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr_GetLastErrorInfo _GetLastErrorInfo} to get more information.
	 */
	public static int ovrHmd_CreateMirrorTextureGL(long hmd, int format, int width, int height, ByteBuffer outTextureSet) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novrHmd_CreateMirrorTextureGL(hmd, format, width, height, memAddress(outTextureSet));
	}

	/** Alternative version of: {@link #ovrHmd_CreateMirrorTextureGL Hmd_CreateMirrorTextureGL} */
	public static int ovrHmd_CreateMirrorTextureGL(long hmd, int format, int width, int height, PointerBuffer outTextureSet) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(hmd);
		return novrHmd_CreateMirrorTextureGL(hmd, format, width, height, memAddress(outTextureSet));
	}

}