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

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/get_proc_address.txt">GLX_ARB_get_proc_address</a> extension.
 * 
 * <p>This extension adds a function to return the address of GLX and GL extension functions, given the function name. This is necessary with (for example)
 * heterogenous implementations where hardware drivers may implement extension functions not known to the link library; a similar situation on Windows
 * implementations resulted in the {@code wglGetProcAddress} function.</p>
 */
public final class GLXARBGetProcAddress {

	/** Function address. */
	@JavadocExclude
	public final long GetProcAddressARB;

	@JavadocExclude
	public GLXARBGetProcAddress(FunctionProvider provider) {
		GetProcAddressARB = provider.getFunctionAddress("glXGetProcAddressARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLXARBGetProcAddress} instance for the current context. */
	public static GLXARBGetProcAddress getInstance() {
		return checkFunctionality(GL.getCapabilities().__GLXARBGetProcAddress);
	}

	static GLXARBGetProcAddress create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_ARB_get_proc_address") ) return null;

		GLXARBGetProcAddress funcs = new GLXARBGetProcAddress(provider);

		boolean supported = checkFunctions(
			funcs.GetProcAddressARB
		);

		return GL.checkExtension("GLX_ARB_get_proc_address", funcs, supported);
	}

	// --- [ glXGetProcAddressARB ] ---

	/** JNI method for {@link #glXGetProcAddressARB GetProcAddressARB} */
	@JavadocExclude
	public static native long nglXGetProcAddressARB(long procName, long __functionAddress);

	/** Unsafe version of {@link #glXGetProcAddressARB GetProcAddressARB} */
	@JavadocExclude
	public static long nglXGetProcAddressARB(long procName) {
		long __functionAddress = getInstance().GetProcAddressARB;
		return nglXGetProcAddressARB(procName, __functionAddress);
	}

	/**
	 * Returns the address of the extension function named by procName. The pointer returned should be cast to a function pointer type matching the extension
	 * function's definition in that extension specification. A return value of {@code NULL} indicates that the specified function does not exist for the
	 * implementation.
	 * 
	 * <p>A non-{@code NULL} return value for {@code glXGetProcAddressARB} does not guarantee that an extension function is actually supported at runtime. The client
	 * must must also query {@link GL11#glGetString}({@link GL11#GL_EXTENSIONS}) or {@link GLX11#glXQueryExtensionsString QueryExtensionsString} to determine if an extension is
	 * supported by a particular context.</p>
	 * 
	 * <p>GL function pointers returned by {@code glXGetProcAddressARB} are independent of the currently bound context and may be used by any context which
	 * supports the extension.</p>
	 * 
	 * <p>{@code glXGetProcAddressARB} may be queried for all of the following functions:
	 * <ul>
	 * <li>All GL and GLX extension functions supported by the implementation (whether those extensions are supported by the current context or not).</li>
	 * <li>All core (non-extension) functions in GL and GLX from version 1.0 up to and including the versions of those specifications supported by the
	 * implementation, as determined by {@link GL11#glGetString}({@link GL11#GL_VERSION}) and {@link GLX#glXQueryVersion QueryVersion} queries.</li>
	 * </ul></p>
	 *
	 * @param procName the function name to query
	 */
	public static long glXGetProcAddressARB(ByteBuffer procName) {
		return nglXGetProcAddressARB(memAddress(procName));
	}

}