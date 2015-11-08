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
	protected WGLNVSwapGroup() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public WGLNVSwapGroup(FunctionProvider provider) {
		JoinSwapGroupNV = provider.getFunctionAddress("wglJoinSwapGroupNV");
		BindSwapBarrierNV = provider.getFunctionAddress("wglBindSwapBarrierNV");
		QuerySwapGroupNV = provider.getFunctionAddress("wglQuerySwapGroupNV");
		QueryMaxSwapGroupsNV = provider.getFunctionAddress("wglQueryMaxSwapGroupsNV");
		QueryFrameCountNV = provider.getFunctionAddress("wglQueryFrameCountNV");
		ResetFrameCountNV = provider.getFunctionAddress("wglResetFrameCountNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link WGLNVSwapGroup} instance of the current context. */
	public static WGLNVSwapGroup getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link WGLNVSwapGroup} instance of the specified {@link GLCapabilities}. */
	public static WGLNVSwapGroup getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__WGLNVSwapGroup);
	}

	static WGLNVSwapGroup create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_NV_swap_group") ) return null;

		WGLNVSwapGroup funcs = new WGLNVSwapGroup(provider);

		boolean supported = checkFunctions(
			funcs.JoinSwapGroupNV, funcs.BindSwapBarrierNV, funcs.QuerySwapGroupNV, funcs.QueryMaxSwapGroupsNV, funcs.QueryFrameCountNV, 
			funcs.ResetFrameCountNV
		);

		return GL.checkExtension("WGL_NV_swap_group", funcs, supported);
	}

	// --- [ wglJoinSwapGroupNV ] ---

	public static int wglJoinSwapGroupNV(long hDC, int group) {
		long __functionAddress = getInstance().JoinSwapGroupNV;
		if ( CHECKS )
			checkPointer(hDC);
		return callPII(__functionAddress, hDC, group);
	}

	// --- [ wglBindSwapBarrierNV ] ---

	public static int wglBindSwapBarrierNV(int group, int barrier) {
		long __functionAddress = getInstance().BindSwapBarrierNV;
		return callIII(__functionAddress, group, barrier);
	}

	// --- [ wglQuerySwapGroupNV ] ---

	/** Unsafe version of {@link #wglQuerySwapGroupNV QuerySwapGroupNV} */
	@JavadocExclude
	public static int nwglQuerySwapGroupNV(long hDC, long group, long barrier) {
		long __functionAddress = getInstance().QuerySwapGroupNV;
		if ( CHECKS )
			checkPointer(hDC);
		return callPPPI(__functionAddress, hDC, group, barrier);
	}

	public static int wglQuerySwapGroupNV(long hDC, ByteBuffer group, ByteBuffer barrier) {
		if ( CHECKS ) {
			checkBuffer(group, 1 << 2);
			checkBuffer(barrier, 1 << 2);
		}
		return nwglQuerySwapGroupNV(hDC, memAddress(group), memAddress(barrier));
	}

	/** Alternative version of: {@link #wglQuerySwapGroupNV QuerySwapGroupNV} */
	public static int wglQuerySwapGroupNV(long hDC, IntBuffer group, IntBuffer barrier) {
		if ( CHECKS ) {
			checkBuffer(group, 1);
			checkBuffer(barrier, 1);
		}
		return nwglQuerySwapGroupNV(hDC, memAddress(group), memAddress(barrier));
	}

	// --- [ wglQueryMaxSwapGroupsNV ] ---

	/** Unsafe version of {@link #wglQueryMaxSwapGroupsNV QueryMaxSwapGroupsNV} */
	@JavadocExclude
	public static int nwglQueryMaxSwapGroupsNV(long hDC, long maxGroups, long maxBarriers) {
		long __functionAddress = getInstance().QueryMaxSwapGroupsNV;
		if ( CHECKS )
			checkPointer(hDC);
		return callPPPI(__functionAddress, hDC, maxGroups, maxBarriers);
	}

	public static int wglQueryMaxSwapGroupsNV(long hDC, ByteBuffer maxGroups, ByteBuffer maxBarriers) {
		if ( CHECKS ) {
			checkBuffer(maxGroups, 1 << 2);
			checkBuffer(maxBarriers, 1 << 2);
		}
		return nwglQueryMaxSwapGroupsNV(hDC, memAddress(maxGroups), memAddress(maxBarriers));
	}

	/** Alternative version of: {@link #wglQueryMaxSwapGroupsNV QueryMaxSwapGroupsNV} */
	public static int wglQueryMaxSwapGroupsNV(long hDC, IntBuffer maxGroups, IntBuffer maxBarriers) {
		if ( CHECKS ) {
			checkBuffer(maxGroups, 1);
			checkBuffer(maxBarriers, 1);
		}
		return nwglQueryMaxSwapGroupsNV(hDC, memAddress(maxGroups), memAddress(maxBarriers));
	}

	// --- [ wglQueryFrameCountNV ] ---

	/** Unsafe version of {@link #wglQueryFrameCountNV QueryFrameCountNV} */
	@JavadocExclude
	public static int nwglQueryFrameCountNV(long hDC, long count) {
		long __functionAddress = getInstance().QueryFrameCountNV;
		if ( CHECKS )
			checkPointer(hDC);
		return callPPI(__functionAddress, hDC, count);
	}

	public static int wglQueryFrameCountNV(long hDC, ByteBuffer count) {
		if ( CHECKS )
			checkBuffer(count, 1 << 2);
		return nwglQueryFrameCountNV(hDC, memAddress(count));
	}

	/** Alternative version of: {@link #wglQueryFrameCountNV QueryFrameCountNV} */
	public static int wglQueryFrameCountNV(long hDC, IntBuffer count) {
		if ( CHECKS )
			checkBuffer(count, 1);
		return nwglQueryFrameCountNV(hDC, memAddress(count));
	}

	// --- [ wglResetFrameCountNV ] ---

	public static int wglResetFrameCountNV(long hDC) {
		long __functionAddress = getInstance().ResetFrameCountNV;
		if ( CHECKS )
			checkPointer(hDC);
		return callPI(__functionAddress, hDC);
	}

}