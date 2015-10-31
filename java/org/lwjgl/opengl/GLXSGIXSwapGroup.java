/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/SGIX/swap_group.txt">GLX_SGIX_swap_group</a> extension.
 * 
 * <p>This extension provides the capability to synchronize the buffer swaps of a group of GLX drawables.  A swap group is created, and drawables are added as
 * members to the swap group. Buffer swaps to members of the swap group will then take place concurrently.</p>
 * 
 * <p>This extension extends the set of conditions that must be met before a buffer swap can take place.</p>
 */
public class GLXSGIXSwapGroup {

	/** Function address. */
	@JavadocExclude
	public final long JoinSwapGroupSGIX;

	@JavadocExclude
	protected GLXSGIXSwapGroup() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public GLXSGIXSwapGroup(FunctionProvider provider) {
		JoinSwapGroupSGIX = provider.getFunctionAddress("glXJoinSwapGroupSGIX");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLXSGIXSwapGroup} instance of the current context. */
	public static GLXSGIXSwapGroup getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link GLXSGIXSwapGroup} instance of the specified {@link GLCapabilities}. */
	public static GLXSGIXSwapGroup getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__GLXSGIXSwapGroup);
	}

	static GLXSGIXSwapGroup create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_SGIX_swap_group") ) return null;

		GLXSGIXSwapGroup funcs = new GLXSGIXSwapGroup(provider);

		boolean supported = checkFunctions(
			funcs.JoinSwapGroupSGIX
		);

		return GL.checkExtension("GLX_SGIX_swap_group", funcs, supported);
	}

	// --- [ glXJoinSwapGroupSGIX ] ---

	/**
	 * Adds {@code drawable} to the swap group containing {@code member} as a member. If {@code drawable} is already a member of a different group, it is
	 * implicitly removed from that group first. If {@code member} is {@code None}, {@code drawable} is removed from the swap group that it belongs to, if
	 * any.
	 *
	 * @param display  the connection to the X server
	 * @param drawable the GLXDrawable to add to the swap group
	 * @param member   a member of the swap group or {@code None}
	 */
	public static void glXJoinSwapGroupSGIX(long display, long drawable, long member) {
		long __functionAddress = getInstance().JoinSwapGroupSGIX;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(drawable);
		}
		callPPPV(__functionAddress, display, drawable, member);
	}

}