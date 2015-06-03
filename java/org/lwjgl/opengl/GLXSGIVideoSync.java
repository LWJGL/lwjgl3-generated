/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/SGI/video_sync.txt">GLX_SGI_video_sync</a> extension.
 * 
 * <p>This extension provides a means for synchronization with the video frame rate of a monitor.</p>
 */
public final class GLXSGIVideoSync {

	/** Function address. */
	@JavadocExclude
	public final long
		GetVideoSyncSGI,
		WaitVideoSyncSGI;

	@JavadocExclude
	public GLXSGIVideoSync(FunctionProvider provider) {
		GetVideoSyncSGI = provider.getFunctionAddress("glXGetVideoSyncSGI");
		WaitVideoSyncSGI = provider.getFunctionAddress("glXWaitVideoSyncSGI");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLXSGIVideoSync} instance for the current context. */
	public static GLXSGIVideoSync getInstance() {
		return checkFunctionality(GL.getCapabilities().__GLXSGIVideoSync);
	}

	static GLXSGIVideoSync create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_SGI_video_sync") ) return null;

		GLXSGIVideoSync funcs = new GLXSGIVideoSync(provider);

		boolean supported = checkFunctions(
			funcs.GetVideoSyncSGI, funcs.WaitVideoSyncSGI
		);

		return GL.checkExtension("GLX_SGI_video_sync", funcs, supported);
	}

	// --- [ glXGetVideoSyncSGI ] ---

	/** JNI method for {@link #glXGetVideoSyncSGI GetVideoSyncSGI} */
	@JavadocExclude
	public static native int nglXGetVideoSyncSGI(long count, long __functionAddress);

	/** Unsafe version of {@link #glXGetVideoSyncSGI GetVideoSyncSGI} */
	@JavadocExclude
	public static int nglXGetVideoSyncSGI(long count) {
		long __functionAddress = getInstance().GetVideoSyncSGI;
		return nglXGetVideoSyncSGI(count, __functionAddress);
	}

	/**
	 * Returns the value of the video sync counter in {@code count}. Zero is returned if the call is successful.
	 *
	 * @param count the video sync counter value
	 */
	public static int glXGetVideoSyncSGI(ByteBuffer count) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(count, 1 << 2);
		return nglXGetVideoSyncSGI(memAddress(count));
	}

	/** Alternative version of: {@link #glXGetVideoSyncSGI GetVideoSyncSGI} */
	public static int glXGetVideoSyncSGI(IntBuffer count) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(count, 1);
		return nglXGetVideoSyncSGI(memAddress(count));
	}

	// --- [ glXWaitVideoSyncSGI ] ---

	/** JNI method for {@link #glXWaitVideoSyncSGI WaitVideoSyncSGI} */
	@JavadocExclude
	public static native int nglXWaitVideoSyncSGI(int divisor, int remainder, long count, long __functionAddress);

	/** Unsafe version of {@link #glXWaitVideoSyncSGI WaitVideoSyncSGI} */
	@JavadocExclude
	public static int nglXWaitVideoSyncSGI(int divisor, int remainder, long count) {
		long __functionAddress = getInstance().WaitVideoSyncSGI;
		return nglXWaitVideoSyncSGI(divisor, remainder, count, __functionAddress);
	}

	/**
	 * Puts the calling process to sleep until
	 * 
	 * <p><code style="font-family: monospace">(C mod D) = R</code></p>
	 * 
	 * <p>where {@code C} is the video sync counter, {@code D} is specified by the {@code divisor} parameter of {@code glXWaitVideoSyncSGI}, and {@code R} is
	 * specified by the {@code remainder} parameter of {@code glXWaitVideoSyncSGI}. {@code glXWaitVideoSyncSGI} returns the current video sync counter value in
	 * {@code count}. Zero is returned by {@code glXWaitVideoSyncSGI} if it is successful.</p>
	 *
	 * @param divisor   the divisor value
	 * @param remainder the remainder value
	 * @param count     the video sync counter value
	 */
	public static int glXWaitVideoSyncSGI(int divisor, int remainder, ByteBuffer count) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(count, 1 << 2);
		return nglXWaitVideoSyncSGI(divisor, remainder, memAddress(count));
	}

	/** Alternative version of: {@link #glXWaitVideoSyncSGI WaitVideoSyncSGI} */
	public static int glXWaitVideoSyncSGI(int divisor, int remainder, IntBuffer count) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(count, 1);
		return nglXWaitVideoSyncSGI(divisor, remainder, memAddress(count));
	}

}