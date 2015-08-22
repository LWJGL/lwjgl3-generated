/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_mapbuffer.txt">OES_mapbuffer</a> extension.
 * 
 * <p>This extension adds to the vertex buffer object functionality supported by OpenGL ES 1.1 or ES 2.0 by allowing the entire data storage of a buffer
 * object to be mapped into the client's address space.</p>
 */
public final class OESMapbuffer {

	/** Accepted by the {@code access} parameter of MapBufferOES. */
	public static final int GL_WRITE_ONLY_OES = 0x88B9;

	/** Accepted by the {@code value} parameter of GetBufferParameteriv. */
	public static final int
		GL_BUFFER_ACCESS_OES = 0x88BB,
		GL_BUFFER_MAPPED_OES = 0x88BC;

	/** Accepted by the {@code pname} parameter of GetBufferPointervOES. */
	public static final int GL_BUFFER_MAP_POINTER_OES = 0x88BD;

	/** Function address. */
	@JavadocExclude
	public final long
		MapBufferOES,
		UnmapBufferOES,
		GetBufferPointervOES;

	@JavadocExclude
	public OESMapbuffer(FunctionProvider provider) {
		MapBufferOES = provider.getFunctionAddress("glMapBufferOES");
		UnmapBufferOES = provider.getFunctionAddress("glUnmapBufferOES");
		GetBufferPointervOES = provider.getFunctionAddress("glGetBufferPointervOES");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link OESMapbuffer} instance for the current context. */
	public static OESMapbuffer getInstance() {
		return checkFunctionality(GLES.getCapabilities().__OESMapbuffer);
	}

	static OESMapbuffer create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_OES_mapbuffer") ) return null;

		OESMapbuffer funcs = new OESMapbuffer(provider);
		boolean supported = checkFunctions(
			funcs.MapBufferOES, funcs.UnmapBufferOES, funcs.GetBufferPointervOES
		);

		return GLES.checkExtension("GL_OES_mapbuffer", funcs, supported);
	}

	// --- [ glMapBufferOES ] ---

	/** Unsafe version of {@link #glMapBufferOES MapBufferOES} */
	@JavadocExclude
	public static long nglMapBufferOES(int target, int access) {
		long __functionAddress = getInstance().MapBufferOES;
		return callIIP(__functionAddress, target, access);
	}

	public static ByteBuffer glMapBufferOES(int target, int access) {
		long __result = nglMapBufferOES(target, access);
		return memByteBuffer(__result, GLES20.glGetBufferParameteri(target, GLES20.GL_BUFFER_SIZE));
	}

	/** Alternative version of: {@link #glMapBufferOES MapBufferOES} */
	public static ByteBuffer glMapBufferOES(int target, int access, ByteBuffer old_buffer) {
		long __result = nglMapBufferOES(target, access);
		int length = GLES20.glGetBufferParameteri(target, GLES20.GL_BUFFER_SIZE);
		return old_buffer == null ? memByteBuffer(__result, length) : memSetupBuffer(old_buffer, __result, length);
	}

	/** Explicit size alternative version of: {@link #glMapBufferOES MapBufferOES} */
	public static ByteBuffer glMapBufferOES(int target, int access, long length, ByteBuffer old_buffer) {
		long __result = nglMapBufferOES(target, access);
		return old_buffer == null ? memByteBuffer(__result, (int)length) : memSetupBuffer(old_buffer, __result, (int)length);
	}

	// --- [ glUnmapBufferOES ] ---

	public static boolean glUnmapBufferOES(int target) {
		long __functionAddress = getInstance().UnmapBufferOES;
		return callIZ(__functionAddress, target);
	}

	// --- [ glGetBufferPointervOES ] ---

	/** Unsafe version of {@link #glGetBufferPointervOES GetBufferPointervOES} */
	@JavadocExclude
	public static void nglGetBufferPointervOES(int target, int pname, long params) {
		long __functionAddress = getInstance().GetBufferPointervOES;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glGetBufferPointervOES(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << POINTER_SHIFT);
		nglGetBufferPointervOES(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetBufferPointervOES GetBufferPointervOES} */
	public static void glGetBufferPointervOES(int target, int pname, PointerBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetBufferPointervOES(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetBufferPointervOES GetBufferPointervOES} */
	public static long glGetBufferPointerOES(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.pointerParam();
		nglGetBufferPointervOES(target, pname, __buffer.address(params));
		return __buffer.pointerValue(params);
	}

}