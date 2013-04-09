/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

import org.lwjgl.system.linux.X;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/SGIX/swap_group.txt">GLX_SGIX_swap_group</a> extension.
 * <p/>
 * This extension provides the capability to synchronize the buffer swaps of a group of GLX drawables.  A swap group is created, and drawables are added as
 * members to the swap group. Buffer swaps to members of the swap group will then take place concurrently.
 * <p/>
 * This extension extends the set of conditions that must be met before a buffer swap can take place.
 */
public final class GLXSGIXSwapGroup {

	private GLXSGIXSwapGroup() {}

	// --- [ glXJoinSwapGroupSGIX ] ---

	/** JNI method for {@link #glXJoinSwapGroupSGIX} */
	public static native void nglXJoinSwapGroupSGIX(long display, long drawable, long member, long __functionAddress);

	/**
	 * Adds {@code drawable} to the swap group containing {@code member} as a member. If {@code drawable} is already a member of a different group, it is
	 * implicitly removed from that group first. If {@code member} is {@link X#None}, {@code drawable} is removed from the swap group that it belongs to, if
	 * any.
	 *
	 * @param display  the connection to the X server
	 * @param drawable the GLXDrawable to add to the swap group
	 * @param member   a member of the swap group or {@link X#None}
	 */
	public static void glXJoinSwapGroupSGIX(long display, long drawable, long member) {
		long __functionAddress = getInstance().glXJoinSwapGroupSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(drawable);
		}
		nglXJoinSwapGroupSGIX(display, drawable, member, __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GLXSGIXSwapGroup;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_SGIX_swap_group") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported =  GL.isFunctionSupported(funcs.glXJoinSwapGroupSGIX);

		return GL.checkExtension("GLX_SGIX_swap_group", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GLXSGIXSwapGroup}. */
	public static final class Functions implements FunctionMap {

		public final long glXJoinSwapGroupSGIX;

		public Functions(FunctionProvider provider) {
			glXJoinSwapGroupSGIX = provider.getFunctionAddress("glXJoinSwapGroupSGIX");
		}

	}

}