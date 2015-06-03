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

import org.lwjgl.system.linux.*;

/** Native bindings to GLX 1.4. */
public final class GLX14 {

	/** Added in GLX 1.4. */
	public static final int
		GLX_SAMPLE_BUFFERS = 0x186A0,
		GLX_SAMPLES        = 0x186A1;

	/** Function address. */
	@JavadocExclude
	public final long GetProcAddress;

	@JavadocExclude
	public GLX14(FunctionProvider provider) {
		GetProcAddress = provider.getFunctionAddress("glXGetProcAddress");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLX14} instance for the current context. */
	public static GLX14 getInstance() {
		return checkFunctionality(GL.getCapabilities().__GLX14);
	}

	static GLX14 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_14") ) return null;

		GLX14 funcs = new GLX14(provider);

		boolean supported = checkFunctions(
			funcs.GetProcAddress
		);

		return GL.checkExtension("GLX_14", funcs, supported);
	}

	// --- [ glXGetProcAddress ] ---

	/** JNI method for {@link #glXGetProcAddress GetProcAddress} */
	@JavadocExclude
	public static native long nglXGetProcAddress(long procName, long __functionAddress);

	/** Unsafe version of {@link #glXGetProcAddress GetProcAddress} */
	@JavadocExclude
	public static long nglXGetProcAddress(long procName) {
		long __functionAddress = getInstance().GetProcAddress;
		return nglXGetProcAddress(procName, __functionAddress);
	}

	/**
	 * Returns the address of the extension function named by {@code procName}. The pointer returned should be cast to a function pointer type matching the
	 * extension function's definition in that extension specification. A return value of {@code NULL} indicates that the specified function does not exist for the
	 * implementation.
	 * 
	 * <p>A non-{@code NULL} return value for {@code glXGetProcAddress} does not guarantee that an extension function is actually supported at runtime. The client must
	 * also query {@link GL11#glGetString}({@link GL11#GL_EXTENSIONS}) or {@link GLX11#glXQueryExtensionsString QueryExtensionsString} to determine if an extension is supported
	 * by a particular context.</p>
	 * 
	 * <p>GL function pointers returned by {@code glXGetProcAddress} are independent of the currently bound context and may be used by any context which
	 * supports the extension.</p>
	 * 
	 * <p>{@code glXGetProcAddress} may be queried for all of the following functions:
	 * <ul>
	 * <li>All GL and GLX extension functions supported by the implementation (whether those extensions are supported by the current context or not).</li>
	 * <li>All core (non-extension) functions in GL and GLX from version 1.0 up to and including the versions of those specifications supported by the
	 * implementation, as determined by {@link GL11#glGetString}({@link GL11#GL_VERSION}) and {@link GLX#glXQueryVersion QueryVersion} queries.</li>
	 * </ul></p>
	 *
	 * @param procName the function name to query
	 */
	public static long glXGetProcAddress(ByteBuffer procName) {
		return nglXGetProcAddress(memAddress(procName));
	}

}