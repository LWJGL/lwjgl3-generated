/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

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
public class GLXNVSwapGroup {

	protected GLXNVSwapGroup() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLXCapabilities caps) {
		return checkFunctions(
			caps.glXJoinSwapGroupNV, caps.glXBindSwapBarrierNV, caps.glXQuerySwapGroupNV, caps.glXQueryMaxSwapGroupsNV, caps.glXQueryFrameCountNV, 
			caps.glXResetFrameCountNV
		);
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
		long __functionAddress = GL.getCapabilitiesGLXClient().glXJoinSwapGroupNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(drawable);
		}
		return callPPI(__functionAddress, display, drawable, group);
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
		long __functionAddress = GL.getCapabilitiesGLXClient().glXBindSwapBarrierNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		return callPI(__functionAddress, display, group, barrier);
	}

	// --- [ glXQuerySwapGroupNV ] ---

	/**
	 * 
	 *
	 * @param display  the connection to the X server
	 * @param drawable 
	 * @param group    
	 * @param barrier  
	 */
	public static int nglXQuerySwapGroupNV(long display, long drawable, long group, long barrier) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXQuerySwapGroupNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
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
	public static int glXQuerySwapGroupNV(long display, long drawable, IntBuffer group, IntBuffer barrier) {
		if ( CHECKS ) {
			checkBuffer(group, 1);
			checkBuffer(barrier, 1);
		}
		return nglXQuerySwapGroupNV(display, drawable, memAddress(group), memAddress(barrier));
	}

	// --- [ glXQueryMaxSwapGroupsNV ] ---

	/**
	 * 
	 *
	 * @param display     the connection to the X server
	 * @param screen      
	 * @param maxGroups   
	 * @param maxBarriers 
	 */
	public static int nglXQueryMaxSwapGroupsNV(long display, int screen, long maxGroups, long maxBarriers) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryMaxSwapGroupsNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		return callPPPI(__functionAddress, display, screen, maxGroups, maxBarriers);
	}

	/**
	 * 
	 *
	 * @param display     the connection to the X server
	 * @param screen      
	 * @param maxGroups   
	 * @param maxBarriers 
	 */
	public static int glXQueryMaxSwapGroupsNV(long display, int screen, IntBuffer maxGroups, IntBuffer maxBarriers) {
		if ( CHECKS ) {
			checkBuffer(maxGroups, 1);
			checkBuffer(maxBarriers, 1);
		}
		return nglXQueryMaxSwapGroupsNV(display, screen, memAddress(maxGroups), memAddress(maxBarriers));
	}

	// --- [ glXQueryFrameCountNV ] ---

	/**
	 * 
	 *
	 * @param display the connection to the X server
	 * @param screen  
	 * @param count   
	 */
	public static int nglXQueryFrameCountNV(long display, int screen, long count) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryFrameCountNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		return callPPI(__functionAddress, display, screen, count);
	}

	/**
	 * 
	 *
	 * @param display the connection to the X server
	 * @param screen  
	 * @param count   
	 */
	public static int glXQueryFrameCountNV(long display, int screen, IntBuffer count) {
		if ( CHECKS )
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
		long __functionAddress = GL.getCapabilitiesGLXClient().glXResetFrameCountNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		return callPI(__functionAddress, display, screen);
	}

	/** Array version of: {@link #glXQuerySwapGroupNV QuerySwapGroupNV} */
	public static int glXQuerySwapGroupNV(long display, long drawable, int[] group, int[] barrier) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXQuerySwapGroupNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(drawable);
			checkBuffer(group, 1);
			checkBuffer(barrier, 1);
		}
		return callPPPPI(__functionAddress, display, drawable, group, barrier);
	}

	/** Array version of: {@link #glXQueryMaxSwapGroupsNV QueryMaxSwapGroupsNV} */
	public static int glXQueryMaxSwapGroupsNV(long display, int screen, int[] maxGroups, int[] maxBarriers) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryMaxSwapGroupsNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkBuffer(maxGroups, 1);
			checkBuffer(maxBarriers, 1);
		}
		return callPPPI(__functionAddress, display, screen, maxGroups, maxBarriers);
	}

	/** Array version of: {@link #glXQueryFrameCountNV QueryFrameCountNV} */
	public static int glXQueryFrameCountNV(long display, int screen, int[] count) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryFrameCountNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkBuffer(count, 1);
		}
		return callPPI(__functionAddress, display, screen, count);
	}

}