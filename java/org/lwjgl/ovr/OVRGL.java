/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to libOVR, using the <a href="https://developer.oculus.com/">Oculus SDK</a> C API.
 * 
 * <p>This class contains OpenGL specific functionality.</p>
 */
public class OVRGL {

	static { Library.initialize(); }

	protected OVRGL() {
		throw new UnsupportedOperationException();
	}

	// --- [ ovr_CreateTextureSwapChainGL ] ---

	/**
	 * Creates a TextureSwapChain suitable for use with OpenGL.
	 * 
	 * <p>The format provided should be thought of as the format the distortion compositor will use when reading the contents of the texture. To that end, it is
	 * highly recommended that the application requests texture swap chain formats that are in sRGB-space (e.g. {@link OVR#OVR_FORMAT_R8G8B8A8_UNORM_SRGB}) as the
	 * distortion compositor does sRGB-correct rendering. Furthermore, the app should then make sure "{@code glEnable(GL_FRAMEBUFFER_SRGB);}" is called before
	 * rendering into these textures. Even though it is not recommended, if the application would like to treat the texture as a linear format and do
	 * linear-to-gamma conversion in GLSL, then the application can avoid calling "{@code glEnable(GL_FRAMEBUFFER_SRGB);}", but should still pass in an sRGB
	 * variant for the format. Failure to do so will cause the distortion compositor to apply incorrect gamma conversions leading to gamma-curve artifacts.</p>
	 *
	 * @param session              an {@code ovrSession} previously returned by {@link OVR#ovr_Create Create}
	 * @param desc                 the requested texture properties. See notes for more info about texture format.
	 * @param out_TextureSwapChain returns the created {@code ovrTextureSwapChain}, which will be valid upon a successful return value, else it will be {@code NULL}. This texture swap chain must
	 *                             be eventually destroyed via {@link OVR#ovr_DestroyTextureSwapChain DestroyTextureSwapChain} before destroying the HMD with {@link OVR#ovr_Destroy Destroy}.
	 *
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr_GetLastErrorInfo GetLastErrorInfo} to get more information.
	 */
	public static native int novr_CreateTextureSwapChainGL(long session, long desc, long out_TextureSwapChain);

	/**
	 * Creates a TextureSwapChain suitable for use with OpenGL.
	 * 
	 * <p>The format provided should be thought of as the format the distortion compositor will use when reading the contents of the texture. To that end, it is
	 * highly recommended that the application requests texture swap chain formats that are in sRGB-space (e.g. {@link OVR#OVR_FORMAT_R8G8B8A8_UNORM_SRGB}) as the
	 * distortion compositor does sRGB-correct rendering. Furthermore, the app should then make sure "{@code glEnable(GL_FRAMEBUFFER_SRGB);}" is called before
	 * rendering into these textures. Even though it is not recommended, if the application would like to treat the texture as a linear format and do
	 * linear-to-gamma conversion in GLSL, then the application can avoid calling "{@code glEnable(GL_FRAMEBUFFER_SRGB);}", but should still pass in an sRGB
	 * variant for the format. Failure to do so will cause the distortion compositor to apply incorrect gamma conversions leading to gamma-curve artifacts.</p>
	 *
	 * @param session              an {@code ovrSession} previously returned by {@link OVR#ovr_Create Create}
	 * @param desc                 the requested texture properties. See notes for more info about texture format.
	 * @param out_TextureSwapChain returns the created {@code ovrTextureSwapChain}, which will be valid upon a successful return value, else it will be {@code NULL}. This texture swap chain must
	 *                             be eventually destroyed via {@link OVR#ovr_DestroyTextureSwapChain DestroyTextureSwapChain} before destroying the HMD with {@link OVR#ovr_Destroy Destroy}.
	 *
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr_GetLastErrorInfo GetLastErrorInfo} to get more information.
	 */
	public static int ovr_CreateTextureSwapChainGL(long session, OVRTextureSwapChainDesc desc, PointerBuffer out_TextureSwapChain) {
		if ( CHECKS ) {
			checkPointer(session);
			checkBuffer(out_TextureSwapChain, 1);
		}
		return novr_CreateTextureSwapChainGL(session, desc.address(), memAddress(out_TextureSwapChain));
	}

	// --- [ ovr_GetTextureSwapChainBufferGL ] ---

	/**
	 * Get a specific buffer within the chain as a GL texture name.
	 *
	 * @param session   an {@code ovrSession} previously returned by {@link OVR#ovr_Create Create}
	 * @param chain     an {@code ovrTextureSwapChain} previously returned by {@link #ovr_CreateTextureSwapChainGL CreateTextureSwapChainGL}
	 * @param index     the index within the chain to retrieve. Must be between 0 and length (see {@link OVR#ovr_GetTextureSwapChainLength GetTextureSwapChainLength}) or may pass -1 to get the buffer at the
	 *                  {@code CurrentIndex} location. (Saving a call to {@link OVR#ovr_GetTextureSwapChainCurrentIndex GetTextureSwapChainCurrentIndex})
	 * @param out_TexId returns the GL texture object name associated with the specific index requested
	 *
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr_GetLastErrorInfo GetLastErrorInfo} to get more information.
	 */
	public static native int novr_GetTextureSwapChainBufferGL(long session, long chain, int index, long out_TexId);

	/**
	 * Get a specific buffer within the chain as a GL texture name.
	 *
	 * @param session   an {@code ovrSession} previously returned by {@link OVR#ovr_Create Create}
	 * @param chain     an {@code ovrTextureSwapChain} previously returned by {@link #ovr_CreateTextureSwapChainGL CreateTextureSwapChainGL}
	 * @param index     the index within the chain to retrieve. Must be between 0 and length (see {@link OVR#ovr_GetTextureSwapChainLength GetTextureSwapChainLength}) or may pass -1 to get the buffer at the
	 *                  {@code CurrentIndex} location. (Saving a call to {@link OVR#ovr_GetTextureSwapChainCurrentIndex GetTextureSwapChainCurrentIndex})
	 * @param out_TexId returns the GL texture object name associated with the specific index requested
	 *
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr_GetLastErrorInfo GetLastErrorInfo} to get more information.
	 */
	public static int ovr_GetTextureSwapChainBufferGL(long session, long chain, int index, IntBuffer out_TexId) {
		if ( CHECKS ) {
			checkPointer(session);
			checkPointer(chain);
			checkBuffer(out_TexId, 1);
		}
		return novr_GetTextureSwapChainBufferGL(session, chain, index, memAddress(out_TexId));
	}

	// --- [ ovr_CreateMirrorTextureGL ] ---

	/**
	 * Creates a Mirror Texture which is auto-refreshed to mirror Rift contents produced by this application.
	 * 
	 * <p>The format provided should be thought of as the format the distortion compositor will use when writing into the mirror texture. It is highly
	 * recommended that mirror textures are requested as sRGB formats because the distortion compositor does sRGB-correct rendering. If the application
	 * requests a non-sRGB format (e.g. {@code R8G8B8A8_UNORM}) as the mirror texture, then the application might have to apply a manual linear-to-gamma
	 * conversion when reading from the mirror texture. Failure to do so can result in incorrect gamma conversions leading to gamma-curve artifacts and color
	 * banding.</p>
	 *
	 * @param session           an {@code ovrSession} previously returned by {@link OVR#ovr_Create Create}
	 * @param desc              the requested mirror texture description
	 * @param out_MirrorTexture returns the created {@code OVRMirrorTextur}e, which will be valid upon a successful return value, else it will be {@code NULL}. This texture must be
	 *                          eventually destroyed via {@link OVR#ovr_DestroyMirrorTexture DestroyMirrorTexture} before destroying the HMD with {@link OVR#ovr_Destroy Destroy}.
	 *
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr_GetLastErrorInfo GetLastErrorInfo} to get more information.
	 */
	public static native int novr_CreateMirrorTextureGL(long session, long desc, long out_MirrorTexture);

	/**
	 * Creates a Mirror Texture which is auto-refreshed to mirror Rift contents produced by this application.
	 * 
	 * <p>The format provided should be thought of as the format the distortion compositor will use when writing into the mirror texture. It is highly
	 * recommended that mirror textures are requested as sRGB formats because the distortion compositor does sRGB-correct rendering. If the application
	 * requests a non-sRGB format (e.g. {@code R8G8B8A8_UNORM}) as the mirror texture, then the application might have to apply a manual linear-to-gamma
	 * conversion when reading from the mirror texture. Failure to do so can result in incorrect gamma conversions leading to gamma-curve artifacts and color
	 * banding.</p>
	 *
	 * @param session           an {@code ovrSession} previously returned by {@link OVR#ovr_Create Create}
	 * @param desc              the requested mirror texture description
	 * @param out_MirrorTexture returns the created {@code OVRMirrorTextur}e, which will be valid upon a successful return value, else it will be {@code NULL}. This texture must be
	 *                          eventually destroyed via {@link OVR#ovr_DestroyMirrorTexture DestroyMirrorTexture} before destroying the HMD with {@link OVR#ovr_Destroy Destroy}.
	 *
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr_GetLastErrorInfo GetLastErrorInfo} to get more information.
	 */
	public static int ovr_CreateMirrorTextureGL(long session, OVRMirrorTextureDesc desc, PointerBuffer out_MirrorTexture) {
		if ( CHECKS ) {
			checkPointer(session);
			checkBuffer(out_MirrorTexture, 1);
		}
		return novr_CreateMirrorTextureGL(session, desc.address(), memAddress(out_MirrorTexture));
	}

	// --- [ ovr_GetMirrorTextureBufferGL ] ---

	/**
	 * Gets a the underlying buffer as a GL texture name.
	 *
	 * @param session       an {@code ovrSession} previously returned by {@link OVR#ovr_Create Create}
	 * @param mirrorTexture an {@code OVRMirrorTexture} previously returned by {@link #ovr_CreateMirrorTextureGL CreateMirrorTextureGL}
	 * @param out_TexId     returns the GL texture object name associated with the mirror texture
	 *
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr_GetLastErrorInfo GetLastErrorInfo} to get more information.
	 */
	public static native int novr_GetMirrorTextureBufferGL(long session, long mirrorTexture, long out_TexId);

	/**
	 * Gets a the underlying buffer as a GL texture name.
	 *
	 * @param session       an {@code ovrSession} previously returned by {@link OVR#ovr_Create Create}
	 * @param mirrorTexture an {@code OVRMirrorTexture} previously returned by {@link #ovr_CreateMirrorTextureGL CreateMirrorTextureGL}
	 * @param out_TexId     returns the GL texture object name associated with the mirror texture
	 *
	 * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr_GetLastErrorInfo GetLastErrorInfo} to get more information.
	 */
	public static int ovr_GetMirrorTextureBufferGL(long session, long mirrorTexture, IntBuffer out_TexId) {
		if ( CHECKS ) {
			checkPointer(session);
			checkPointer(mirrorTexture);
			checkBuffer(out_TexId, 1);
		}
		return novr_GetMirrorTextureBufferGL(session, mirrorTexture, memAddress(out_TexId));
	}

	/** Array version of: {@link #ovr_GetTextureSwapChainBufferGL GetTextureSwapChainBufferGL} */
	public static native int novr_GetTextureSwapChainBufferGL(long session, long chain, int index, int[] out_TexId);

	/** Array version of: {@link #ovr_GetTextureSwapChainBufferGL GetTextureSwapChainBufferGL} */
	public static int ovr_GetTextureSwapChainBufferGL(long session, long chain, int index, int[] out_TexId) {
		if ( CHECKS ) {
			checkPointer(session);
			checkPointer(chain);
			checkBuffer(out_TexId, 1);
		}
		return novr_GetTextureSwapChainBufferGL(session, chain, index, out_TexId);
	}

	/** Array version of: {@link #ovr_GetMirrorTextureBufferGL GetMirrorTextureBufferGL} */
	public static native int novr_GetMirrorTextureBufferGL(long session, long mirrorTexture, int[] out_TexId);

	/** Array version of: {@link #ovr_GetMirrorTextureBufferGL GetMirrorTextureBufferGL} */
	public static int ovr_GetMirrorTextureBufferGL(long session, long mirrorTexture, int[] out_TexId) {
		if ( CHECKS ) {
			checkPointer(session);
			checkPointer(mirrorTexture);
			checkBuffer(out_TexId, 1);
		}
		return novr_GetMirrorTextureBufferGL(session, mirrorTexture, out_TexId);
	}

}