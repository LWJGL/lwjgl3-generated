/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/WGL/NV_swap_group.txt">WGL_NV_swap_group</a> extension.
 * 
 * <p>This extension provides the capability to synchronize the buffer swaps of a group of OpenGL windows. A swap group is created, and windows are added as
 * members to the swap group. Buffer swaps to members of the swap group will then take place concurrently.</p>
 * 
 * <p>This extension also provides the capability to sychronize the buffer swaps of different swap groups, which may reside on distributed systems on a
 * network. For this purpose swap groups can be bound to a swap barrier.</p>
 * 
 * <p>This extension extends the set of conditions that must be met before a buffer swap can take place.</p>
 */
public class WGLNVSwapGroup {

	protected WGLNVSwapGroup() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(WGLCapabilities caps) {
		return checkFunctions(
			caps.wglJoinSwapGroupNV, caps.wglBindSwapBarrierNV, caps.wglQuerySwapGroupNV, caps.wglQueryMaxSwapGroupsNV, caps.wglQueryFrameCountNV, 
			caps.wglResetFrameCountNV
		);
	}

	// --- [ wglJoinSwapGroupNV ] ---

	public static int wglJoinSwapGroupNV(long hDC, int group) {
		long __functionAddress = GL.getCapabilitiesWGL().wglJoinSwapGroupNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hDC);
		}
		return callPII(__functionAddress, hDC, group);
	}

	// --- [ wglBindSwapBarrierNV ] ---

	public static int wglBindSwapBarrierNV(int group, int barrier) {
		long __functionAddress = GL.getCapabilitiesWGL().wglBindSwapBarrierNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callIII(__functionAddress, group, barrier);
	}

	// --- [ wglQuerySwapGroupNV ] ---

	public static int nwglQuerySwapGroupNV(long hDC, long group, long barrier) {
		long __functionAddress = GL.getCapabilitiesWGL().wglQuerySwapGroupNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hDC);
		}
		return callPPPI(__functionAddress, hDC, group, barrier);
	}

	public static int wglQuerySwapGroupNV(long hDC, IntBuffer group, IntBuffer barrier) {
		if ( CHECKS ) {
			checkBuffer(group, 1);
			checkBuffer(barrier, 1);
		}
		return nwglQuerySwapGroupNV(hDC, memAddress(group), memAddress(barrier));
	}

	// --- [ wglQueryMaxSwapGroupsNV ] ---

	public static int nwglQueryMaxSwapGroupsNV(long hDC, long maxGroups, long maxBarriers) {
		long __functionAddress = GL.getCapabilitiesWGL().wglQueryMaxSwapGroupsNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hDC);
		}
		return callPPPI(__functionAddress, hDC, maxGroups, maxBarriers);
	}

	public static int wglQueryMaxSwapGroupsNV(long hDC, IntBuffer maxGroups, IntBuffer maxBarriers) {
		if ( CHECKS ) {
			checkBuffer(maxGroups, 1);
			checkBuffer(maxBarriers, 1);
		}
		return nwglQueryMaxSwapGroupsNV(hDC, memAddress(maxGroups), memAddress(maxBarriers));
	}

	// --- [ wglQueryFrameCountNV ] ---

	public static int nwglQueryFrameCountNV(long hDC, long count) {
		long __functionAddress = GL.getCapabilitiesWGL().wglQueryFrameCountNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hDC);
		}
		return callPPI(__functionAddress, hDC, count);
	}

	public static int wglQueryFrameCountNV(long hDC, IntBuffer count) {
		if ( CHECKS )
			checkBuffer(count, 1);
		return nwglQueryFrameCountNV(hDC, memAddress(count));
	}

	// --- [ wglResetFrameCountNV ] ---

	public static int wglResetFrameCountNV(long hDC) {
		long __functionAddress = GL.getCapabilitiesWGL().wglResetFrameCountNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hDC);
		}
		return callPI(__functionAddress, hDC);
	}

}