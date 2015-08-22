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
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/glx_swap_group.txt">GLX_NV_swap_group</a> extension.
 * 
 * <p>This extension provides the capability to synchronize the buffer swaps of a group of OpenGL windows. A swap group is created, and windows are added as
 * members to the swap group. Buffer swaps to members of the swap group will then take place concurrently.</p>
 * 
 * <p>This extension also provides the capability to sychronize the buffer swaps of different swap groups, which may reside on distributed systems on a
 * network. For this purpose swap groups can be bound to a swap barrier.</p>
 * 
 * <p>This extension extends the set of conditions that must be met before a buffer swap can take place.</p>
 */
public final class GLXNVSwapGroup {

	/** Function address. */
	@JavadocExclude
	public final long
		JoinSwapGroupNV,
		BindSwapBarrierNV,
		QuerySwapGroupNV,
		QueryMaxSwapGroupsNV,
		QueryFrameCountNV,
		ResetFrameCountNV;

	@JavadocExclude
	public GLXNVSwapGroup(FunctionProvider provider) {
		JoinSwapGroupNV = provider.getFunctionAddress("glXJoinSwapGroupNV");
		BindSwapBarrierNV = provider.getFunctionAddress("glXBindSwapBarrierNV");
		QuerySwapGroupNV = provider.getFunctionAddress("glXQuerySwapGroupNV");
		QueryMaxSwapGroupsNV = provider.getFunctionAddress("glXQueryMaxSwapGroupsNV");
		QueryFrameCountNV = provider.getFunctionAddress("glXQueryFrameCountNV");
		ResetFrameCountNV = provider.getFunctionAddress("glXResetFrameCountNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLXNVSwapGroup} instance for the current context. */
	public static GLXNVSwapGroup getInstance() {
		return checkFunctionality(GL.getCapabilities().__GLXNVSwapGroup);
	}

	static GLXNVSwapGroup create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_NV_swap_group") ) return null;

		GLXNVSwapGroup funcs = new GLXNVSwapGroup(provider);

		boolean supported = checkFunctions(
			funcs.JoinSwapGroupNV, funcs.BindSwapBarrierNV, funcs.QuerySwapGroupNV, funcs.QueryMaxSwapGroupsNV, funcs.QueryFrameCountNV, 
			funcs.ResetFrameCountNV
		);

		return GL.checkExtension("GLX_NV_swap_group", funcs, supported);
	}

	// --- [ glXJoinSwapGroupNV ] ---

	/**
	 * 
	 *
	 * @param display  the connection to the X server
	 * @param drawable 
	 * @param group    
	 */
	public static int glXJoinSwapGroupNV(long display, long drawable, int group) {
		long __functionAddress = getInstance().JoinSwapGroupNV;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(drawable);
		}
		return callPPII(__functionAddress, display, drawable, group);
	}

	// --- [ glXBindSwapBarrierNV ] ---

	/**
	 * 
	 *
	 * @param display the connection to the X server
	 * @param group   
	 * @param barrier 
	 */
	public static int glXBindSwapBarrierNV(long display, int group, int barrier) {
		long __functionAddress = getInstance().BindSwapBarrierNV;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return callPIII(__functionAddress, display, group, barrier);
	}

	// --- [ glXQuerySwapGroupNV ] ---

	/** Unsafe version of {@link #glXQuerySwapGroupNV QuerySwapGroupNV} */
	@JavadocExclude
	public static int nglXQuerySwapGroupNV(long display, long drawable, long group, long barrier) {
		long __functionAddress = getInstance().QuerySwapGroupNV;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(drawable);
		}
		return callPPPPI(__functionAddress, display, drawable, group, barrier);
	}

	/**
	 * 
	 *
	 * @param display  the connection to the X server
	 * @param drawable 
	 * @param group    
	 * @param barrier  
	 */
	public static int glXQuerySwapGroupNV(long display, long drawable, ByteBuffer group, ByteBuffer barrier) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(group, 1 << 2);
			checkBuffer(barrier, 1 << 2);
		}
		return nglXQuerySwapGroupNV(display, drawable, memAddress(group), memAddress(barrier));
	}

	/** Alternative version of: {@link #glXQuerySwapGroupNV QuerySwapGroupNV} */
	public static int glXQuerySwapGroupNV(long display, long drawable, IntBuffer group, IntBuffer barrier) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(group, 1);
			checkBuffer(barrier, 1);
		}
		return nglXQuerySwapGroupNV(display, drawable, memAddress(group), memAddress(barrier));
	}

	// --- [ glXQueryMaxSwapGroupsNV ] ---

	/** Unsafe version of {@link #glXQueryMaxSwapGroupsNV QueryMaxSwapGroupsNV} */
	@JavadocExclude
	public static int nglXQueryMaxSwapGroupsNV(long display, int screen, long maxGroups, long maxBarriers) {
		long __functionAddress = getInstance().QueryMaxSwapGroupsNV;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return callPIPPI(__functionAddress, display, screen, maxGroups, maxBarriers);
	}

	/**
	 * 
	 *
	 * @param display     the connection to the X server
	 * @param screen      
	 * @param maxGroups   
	 * @param maxBarriers 
	 */
	public static int glXQueryMaxSwapGroupsNV(long display, int screen, ByteBuffer maxGroups, ByteBuffer maxBarriers) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(maxGroups, 1 << 2);
			checkBuffer(maxBarriers, 1 << 2);
		}
		return nglXQueryMaxSwapGroupsNV(display, screen, memAddress(maxGroups), memAddress(maxBarriers));
	}

	/** Alternative version of: {@link #glXQueryMaxSwapGroupsNV QueryMaxSwapGroupsNV} */
	public static int glXQueryMaxSwapGroupsNV(long display, int screen, IntBuffer maxGroups, IntBuffer maxBarriers) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(maxGroups, 1);
			checkBuffer(maxBarriers, 1);
		}
		return nglXQueryMaxSwapGroupsNV(display, screen, memAddress(maxGroups), memAddress(maxBarriers));
	}

	// --- [ glXQueryFrameCountNV ] ---

	/** Unsafe version of {@link #glXQueryFrameCountNV QueryFrameCountNV} */
	@JavadocExclude
	public static int nglXQueryFrameCountNV(long display, int screen, long count) {
		long __functionAddress = getInstance().QueryFrameCountNV;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return callPIPI(__functionAddress, display, screen, count);
	}

	/**
	 * 
	 *
	 * @param display the connection to the X server
	 * @param screen  
	 * @param count   
	 */
	public static int glXQueryFrameCountNV(long display, int screen, ByteBuffer count) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(count, 1 << 2);
		return nglXQueryFrameCountNV(display, screen, memAddress(count));
	}

	/** Alternative version of: {@link #glXQueryFrameCountNV QueryFrameCountNV} */
	public static int glXQueryFrameCountNV(long display, int screen, IntBuffer count) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(count, 1);
		return nglXQueryFrameCountNV(display, screen, memAddress(count));
	}

	// --- [ glXResetFrameCountNV ] ---

	/**
	 * 
	 *
	 * @param display the connection to the X server
	 * @param screen  
	 */
	public static int glXResetFrameCountNV(long display, int screen) {
		long __functionAddress = getInstance().ResetFrameCountNV;
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return callPII(__functionAddress, display, screen);
	}

}