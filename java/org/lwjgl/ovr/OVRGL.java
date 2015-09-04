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

	// --- [ ovr_CreateSwapTextureSetGL ] ---

	/** JNI method for {@link #ovr_CreateSwapTextureSetGL CreateSwapTextureSetGL} */
	@JavadocExclude
	public static native int novr_CreateSwapTextureSetGL(long hmd, int format, int width, int height, long outTextureSet);

	/**
	 * Creates a Texture Set suitable for use with OpenGL.
	 * 
	 * <p>Multiple calls to ovr_CreateSwapTextureSetGL for the same {@code ovrHmd} is supported, but applications cannot rely on switching between
	 * {@code ovrSwapTextureSets} at runtime without a performance penalty.</p>
	 * 
	 * <p>The {@code format} provided should be thought of as the format the distortion compositor will use when reading the contents of the texture. To that
	 * end, it is highly recommended that the application requests swap-texture-set formats that are in sRGB-space (e.g. {@code GL_SRGB_ALPHA8}) as the
	 * distortion compositor does sRGB-correct rendering. Furthermore, the app should then make sure "{@code glEnable(GL_FRAMEBUFFER_SRGB);}" is called before
	 * rendering into these textures. Even though it is not recommended, if the application would like to treat the texture as a linear format and do
	 * linear-to-gamma conversion in GLSL, then the application can avoid calling "{@code glEnable(GL_FRAMEBUFFER_SRGB);}", but should still pass in
	 * {@code GL_SRGB_ALPHA8} (not {@code GL_RGBA}) for the {@code format}. Failure to do so will cause the distortion compositor to apply incorrect gamma
	 * conversions leading to gamma-curve artifacts.</p>
	 *
	 * @param hmd           an {@code ovrHmd} previously returned by {@link OVR#ovr__Create _Create}.
	 * @param format        the texture format
	 * @param width         the requested texture width
	 * @param height        the requested texture height
	 * @param outTextureSet the created {@link OVRSwapTextureSet}, which will be valid only upon a successful return value. This texture set must be eventually destroyed via
	 *                      {@link OVR#ovr__DestroySwapTextureSet _DestroySwapTextureSet} before destroying the HMD with {@link OVR#ovr__Destroy _Destroy}.
	 *
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr__GetLastErrorInfo _GetLastErrorInfo} to get more information.
	 */
	public static int ovr_CreateSwapTextureSetGL(long hmd, int format, int width, int height, ByteBuffer outTextureSet) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(outTextureSet, 1 << POINTER_SHIFT);
		}
		return novr_CreateSwapTextureSetGL(hmd, format, width, height, memAddress(outTextureSet));
	}

	/** Alternative version of: {@link #ovr_CreateSwapTextureSetGL CreateSwapTextureSetGL} */
	public static int ovr_CreateSwapTextureSetGL(long hmd, int format, int width, int height, PointerBuffer outTextureSet) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(outTextureSet, 1);
		}
		return novr_CreateSwapTextureSetGL(hmd, format, width, height, memAddress(outTextureSet));
	}

	// --- [ ovr_CreateMirrorTextureGL ] ---

	/** JNI method for {@link #ovr_CreateMirrorTextureGL CreateMirrorTextureGL} */
	@JavadocExclude
	public static native int novr_CreateMirrorTextureGL(long hmd, int format, int width, int height, long outMirrorTexture);

	/**
	 * Creates a Mirror Texture which is auto-refreshed to mirror Rift contents produced by this application.
	 * 
	 * <p>A second call to ovr_CreateMirrorTextureGL for a given {@code ovrHmd} before destroying the first one is not supported and will result in an error
	 * return.</p>
	 * 
	 * <p>The {@code format} provided should be thought of as the format the distortion compositor will use when writing into the mirror texture. It is highly
	 * recommended that mirror textures are requested as {@code GL_SRGB_ALPHA8} because the distortion compositor does sRGB-correct rendering. If the
	 * application requests a non-sRGB format (e.g. {@code GL_RGBA}) as the mirror texture, then the application might have to apply a manual linear-to-gamma
	 * conversion when reading from the mirror texture. Failure to do so can result in incorrect gamma conversions leading to gamma-curve artifacts and color
	 * banding.</p>
	 *
	 * @param hmd              an {@code ovrHmd} previously returned by {@link OVR#ovr__Create _Create}.
	 * @param format           the texture format
	 * @param width            the requested texture width
	 * @param height           the requested texture height
	 * @param outMirrorTexture the created {@code ovrSwapTexture}, which will be valid upon a successful return value. This texture must be eventually destroyed via
	 *                         {@link OVR#ovr__DestroyMirrorTexture _DestroyMirrorTexture} before destroying the HMD with {@link OVR#ovr__Destroy _Destroy}.
	 *
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr__GetLastErrorInfo _GetLastErrorInfo} to get more information.
	 */
	public static int ovr_CreateMirrorTextureGL(long hmd, int format, int width, int height, ByteBuffer outMirrorTexture) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(outMirrorTexture, 1 << POINTER_SHIFT);
		}
		return novr_CreateMirrorTextureGL(hmd, format, width, height, memAddress(outMirrorTexture));
	}

	/** Alternative version of: {@link #ovr_CreateMirrorTextureGL CreateMirrorTextureGL} */
	public static int ovr_CreateMirrorTextureGL(long hmd, int format, int width, int height, PointerBuffer outMirrorTexture) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(hmd);
			checkBuffer(outMirrorTexture, 1);
		}
		return novr_CreateMirrorTextureGL(hmd, format, width, height, memAddress(outMirrorTexture));
	}

}