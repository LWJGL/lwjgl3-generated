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
 * <p/>
 * This extension provides a means for synchronization with the video frame rate of a monitor.
 */
public final class GLXSGIVideoSync {

	private GLXSGIVideoSync() {}

	// --- [ glXGetVideoSyncSGI ] ---

	/** JNI method for {@link #glXGetVideoSyncSGI} */
	public static native int nglXGetVideoSyncSGI(long count, long __functionAddress);

	/**
	 * Returns the value of the video sync counter in {@code count}. Zero is returned if the call is successful.
	 *
	 * @param count the video sync counter value
	 */
	public static int glXGetVideoSyncSGI(ByteBuffer count) {
		long __functionAddress = getInstance().glXGetVideoSyncSGI;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(count, 1 << 2);
		}
		return nglXGetVideoSyncSGI(memAddress(count), __functionAddress);
	}

	/** Alternative version of: {@link #glXGetVideoSyncSGI} */
	public static int glXGetVideoSyncSGI(IntBuffer count) {
		long __functionAddress = getInstance().glXGetVideoSyncSGI;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(count, 1);
		}
		return nglXGetVideoSyncSGI(memAddress(count), __functionAddress);
	}

	// --- [ glXWaitVideoSyncSGI ] ---

	/** JNI method for {@link #glXWaitVideoSyncSGI} */
	public static native int nglXWaitVideoSyncSGI(int divisor, int remainder, long count, long __functionAddress);

	/**
	 * Puts the calling process to sleep until
	 * <p/>
	 * <code>(C mod D) = R</code>
	 * <p/>
	 * where {@code C} is the video sync counter, {@code D} is specified by the {@code divisor} parameter of {@code glXWaitVideoSyncSGI}, and {@code R} is
	 * specified by the {@code remainder} parameter of {@code glXWaitVideoSyncSGI}. {@code glXWaitVideoSyncSGI} returns the current video sync counter value in
	 * {@code count}. Zero is returned by {@code glXWaitVideoSyncSGI} if it is successful.
	 *
	 * @param divisor   the divisor value
	 * @param remainder the remainder value
	 * @param count     the video sync counter value
	 */
	public static int glXWaitVideoSyncSGI(int divisor, int remainder, ByteBuffer count) {
		long __functionAddress = getInstance().glXWaitVideoSyncSGI;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(count, 1 << 2);
		}
		return nglXWaitVideoSyncSGI(divisor, remainder, memAddress(count), __functionAddress);
	}

	/** Alternative version of: {@link #glXWaitVideoSyncSGI} */
	public static int glXWaitVideoSyncSGI(int divisor, int remainder, IntBuffer count) {
		long __functionAddress = getInstance().glXWaitVideoSyncSGI;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(count, 1);
		}
		return nglXWaitVideoSyncSGI(divisor, remainder, memAddress(count), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GLXSGIVideoSync;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_SGI_video_sync") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glXGetVideoSyncSGI) &&
			GL.isFunctionSupported(funcs.glXWaitVideoSyncSGI);

		return GL.checkExtension("GLX_SGI_video_sync", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GLXSGIVideoSync}. */
	public static final class Functions implements FunctionMap {

		public final long
			glXGetVideoSyncSGI,
			glXWaitVideoSyncSGI;

		public Functions(FunctionProvider provider) {
			glXGetVideoSyncSGI = provider.getFunctionAddress("glXGetVideoSyncSGI");
			glXWaitVideoSyncSGI = provider.getFunctionAddress("glXWaitVideoSyncSGI");
		}

	}

}